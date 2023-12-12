package com.example.geoapoyo.InterfacesAPI;

import com.example.geoapoyo.Models.C_mensaje;
import com.example.geoapoyo.Models.ResponseServer.Auth.R_login;
import com.example.geoapoyo.Models.ResponseServer.ServiciosExtra.R_ServiciosExtra_Coordenadar;
import com.example.geoapoyo.Models.ResponseServer.ServiciosExtra.ServiciosExtra_Coordenadar;
import com.example.geoapoyo.ViewModels.VM_iniciarSesion;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface Auth {
    @POST("api/auth/login")
    Call<R_login> Login(
            @Body VM_iniciarSesion U
    );
    @POST("api/auth/logout/{id}")
    Call<C_mensaje> Logout(
            @Path("id") int id
    );


}
