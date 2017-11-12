package com.example.marce.hoteles;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.example.marce.hoteles.models.Alojamiento;

import java.util.List;

/**
 * Created by marce on 26/10/2017.
 */

public class AlojamientoAdaptador extends RecyclerView.Adapter<AlojamientoAdaptador.AlojamientoViewHolder>{

    private List<Alojamiento> hoteles;

    public AlojamientoAdaptador(List<Alojamiento> hoteles){
        this.hoteles = hoteles;
    }
    @Override
    public AlojamientoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.items, parent, false);
        return new AlojamientoViewHolder(v);
    }

    @Override
    public void onBindViewHolder(AlojamientoViewHolder holder, int position) {
        Alojamiento h =   hoteles.get(position);
        holder.name.setText(h.getNombreComercial());
        holder.direccion.setText(h.getDireccion());
        holder.zona.setText(h.getZona());
        holder.costo.setText(h.getRangoTarifa());
    }

    @Override
    public int getItemCount() {
        return hoteles.size();
    }

    public class AlojamientoViewHolder extends RecyclerView.ViewHolder{
        private TextView name;
        private TextView direccion;
        private TextView zona;
        private TextView costo;

        public AlojamientoViewHolder(View itemView) {
            super(itemView);
            name =  (TextView) itemView.findViewById(R.id.nombre);
            direccion =  (TextView) itemView.findViewById(R.id.direccion);
            zona = (TextView) itemView.findViewById(R.id.zone);
            costo = (TextView) itemView.findViewById(R.id.costo);

        }
    }
}
