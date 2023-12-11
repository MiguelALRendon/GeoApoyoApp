package com.example.geoapoyo.InterfacesAPI;

import com.example.geoapoyo.Models.ResponseServer.Usuario.R_usuarios;
import com.example.geoapoyo.Models.ResponseServer.Usuario.UsuarioDelete;
import com.example.geoapoyo.Models.ResponseServer.Usuario.UsuarioUpdatePassword;
import com.example.geoapoyo.ViewModels.VM_agregarUsuarios;
import com.example.geoapoyo.ViewModels.VM_editarUsuarios;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Path;
import retrofit2.http.Query;

import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.DELETE;

public interface CRUD_Usuarios {
    @GET("api/usuarios")
    Call<R_usuarios> GetUsuarios();
    @POST("api/usuarios")
    Call<String> InsertUsuario(@Body VM_agregarUsuarios U);
    @PUT("api/usuarios/{id}")
    Call<String>UpdateUsuario(
        @Path("id") int id,
        @Body VM_editarUsuarios U
    );
    @PUT("usuarios/cambiarPass/{id}")
    Call<String>UpdatePassword(@Body UsuarioUpdatePassword P);
    @DELETE("api/usuarios/{id}")
    Call<String>BORRAR(
        @Query("id") int Id,
        @Body UsuarioDelete U
    );
}
