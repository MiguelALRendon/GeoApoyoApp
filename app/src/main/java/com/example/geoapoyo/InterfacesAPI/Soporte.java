package com.example.geoapoyo.InterfacesAPI;

import com.example.geoapoyo.Models.C_mensaje;
import com.example.geoapoyo.Models.ResponseServer.Apoyos.R_Apoyos;
import com.example.geoapoyo.Models.ResponseServer.Apoyos.R_ApoyosStatus;
import com.example.geoapoyo.ViewModels.VM_agregarUsuarios;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;

public interface Soporte {
    @POST("api/soporte/correo/{correo}") Call<C_mensaje> CorreoRecuperacion(@Path("correo") String correo);
    @POST("api/soporte/contrasenia/{pass}") Call<C_mensaje> ContraseniaRecuperacion(@Path("pass") String pass);
}
