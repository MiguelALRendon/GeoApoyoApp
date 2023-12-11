package com.example.geoapoyo.InterfacesAPI;

import com.example.geoapoyo.Models.ResponseServer.ServiciosExtra.R_ServiciosExtra_Coordenadar;
import com.example.geoapoyo.Models.ResponseServer.ServiciosExtra.ServiciosExtra_Coordenadar;
import com.example.geoapoyo.ViewModels.VM_iniciarSesion;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface Auth {
    @POST("api/auth/login")
    Call<VM_iniciarSesion> Login(@Body VM_iniciarSesion U);
    @POST("api/auth/logout/3")
    Call<String> Logout();


}
