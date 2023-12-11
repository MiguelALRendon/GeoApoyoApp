package com.example.geoapoyo.InterfacesAPI;

import com.example.geoapoyo.Models.ResponseServer.Apoyos.R_Apoyos;
import com.example.geoapoyo.Models.ResponseServer.Apoyos.R_ApoyosStatus;
import com.example.geoapoyo.Models.ResponseServer.Usuario.R_usuarios;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Apoyos {
    @GET("api/apoyo") Call<R_Apoyos> GetApoyos();
    @GET("api/apoyo/estatus") Call<R_ApoyosStatus> GetApoyosStatus();
}
