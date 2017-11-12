package com.example.marce.hoteles.datosAPI;

import com.example.marce.hoteles.models.Alojamiento;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by marce on 25/10/2017.
 */

public interface HotelService {
    @GET("qkbv-9khw.json")
    Call<List<Alojamiento>> obtenerListadeSitios();
}
