package com.example.marce.hoteles;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.marce.hoteles.datosAPI.HotelService;
import com.example.marce.hoteles.models.Alojamiento;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {


    private Retrofit retrofit;
    private RecyclerView recycler;
    private ViewPager viewPager;
    private AlojamientoAdaptador adaptador;

    public static final String TAG = "AlojamientoBogotá";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);

        retrofit = new Retrofit.Builder()
                .baseUrl("https://www.datos.gov.co/resource/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        viewPager = (ViewPager) findViewById(R.id.elemento);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(viewPagerAdapter);

        recycler =  (RecyclerView) findViewById(R.id.recycler);
        recycler.setLayoutManager(new LinearLayoutManager(this)); // si es vertical
        // Si queremos en modo horizontal recycler.setLayoutManager(new GridLayoutManager(recycler.getContext(), 1, GridLayoutManager.HORIZONTAL, false));
        obtenerDatos();
    }

    public void obtenerDatos(){
        HotelService service = retrofit.create(HotelService.class);
        Call<List<Alojamiento>> sitioRespuestaCall = service.obtenerListadeSitios();
        sitioRespuestaCall.enqueue(new Callback<List<Alojamiento>>() {
            @Override
            public void onResponse(Call<List<Alojamiento>> call, Response<List<Alojamiento>> response) {
                if(response.isSuccessful()) {  // Si llegaron los datos
                    List lista = response.body();
                    for (int i = 0; i < lista.size(); i++) {
                        Alojamiento m = (Alojamiento) lista.get(i);
                        adaptador = new AlojamientoAdaptador(lista);
                        recycler.setAdapter(adaptador);

                    }
                }
                else{
                    Log.e(TAG,"OnResponse: "+ response.errorBody());
                }
            }
            @Override
            public void onFailure(Call<List<Alojamiento>> call, Throwable t) {
                Log.e(TAG," OnFailure: "+ t.getMessage());
            }
        });

    }

    protected void about_us(View view){
        Intent i = new Intent(this, Acercade.class );
        startActivity(i);
        finish();
    }

    public void salir(View view){
        finish();
    }
}
