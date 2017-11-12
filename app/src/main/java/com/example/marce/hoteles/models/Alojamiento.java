package com.example.marce.hoteles.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by marce on 25/10/2017.
 */

public class Alojamiento {

    @SerializedName("direccion")
    @Expose
    private String direccion;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("localidad")
    @Expose
    private String localidad;
    @SerializedName("nombre_comercial")
    @Expose
    private String nombreComercial;
    @SerializedName("nro")
    @Expose
    private String nro;
    @SerializedName("pagina_web")
    @Expose
    private String paginaWeb;
    @SerializedName("rango_tarifa")
    @Expose
    private String rangoTarifa;
    @SerializedName("rnt")
    @Expose
    private String rnt;
    @SerializedName("telefono")
    @Expose
    private String telefono;
    @SerializedName("tipo")
    @Expose
    private String tipo;
    @SerializedName("zona")
    @Expose
    private String zona;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public String getRangoTarifa() {
        return rangoTarifa;
    }

    public void setRangoTarifa(String rangoTarifa) {
        this.rangoTarifa = rangoTarifa;
    }

    public String getRnt() {
        return rnt;
    }

    public void setRnt(String rnt) {
        this.rnt = rnt;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
}
