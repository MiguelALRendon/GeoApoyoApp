package com.example.geoapoyo.Models;

import android.os.Parcel;
import android.os.Parcelable;

import com.example.geoapoyo.Models.ResponseServer.Candidatos.Pregunta10;

import java.io.Serializable;

public class C_candidato implements Serializable {
    public int id_candidato;
    public String nombre;
    public int edad;
    public String calle;
    public String colonia;
    public String municipio;
    public String estado;
    public String entre_calles;
    public String no_int;
    public String no_ext;
    public String institucion;
    public String grado_escolaridad;
    public int id_tipo_apoyo;
    public int id_estatus_apoyo;
    public String fotografia;
    public String created_at;
    public String updated_at;

    public double latitud;
    public double longitud;

//    ----------------------------------------------------------------

    public int pregunta1;
    public String pregunta2;
    public String pregunta3;
    public String pregunta4;
    public String pregunta5;
    public String pregunta6;
    public String pregunta7;
    public String pregunta8;
    public String pregunta9;
    public Pregunta10 pregunta10;
    //    ----------------------------------------------------------------

}
