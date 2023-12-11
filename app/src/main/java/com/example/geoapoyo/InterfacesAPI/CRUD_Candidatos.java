package com.example.geoapoyo.InterfacesAPI;

import com.example.geoapoyo.Models.C_visita;
import com.example.geoapoyo.Models.ResponseServer.Candidatos.R_CandidatoVisita;
import com.example.geoapoyo.Models.ResponseServer.Candidatos.R_Candidatos;
import com.example.geoapoyo.Models.ResponseServer.Candidatos.UpdateStatus;
import com.example.geoapoyo.Models.ResponseServer.Usuario.R_usuarios;
import com.example.geoapoyo.Models.ResponseServer.Usuario.UsuarioDelete;
import com.example.geoapoyo.Models.ResponseServer.Usuario.UsuarioUpdatePassword;
import com.example.geoapoyo.ViewModels.VM_agregarCandidato;
import com.example.geoapoyo.ViewModels.VM_agregarUsuarios;
import com.example.geoapoyo.ViewModels.VM_agregarVisita;
import com.example.geoapoyo.ViewModels.VM_editarUsuarios;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface CRUD_Candidatos {
    @GET("api/candidatos")
    Call<R_Candidatos> GetCandidatos();

    @GET("api/candidatos/visita/{id}")
    Call<R_CandidatoVisita> GetCandidatoVisita(
            @Path("id") int id
    );

    @PUT("api/candidatos/apoyo/{id}")
    Call<String>UpdateCandidatoStatus(
        @Path("id") int id,
        @Body UpdateStatus id_status
    );
    @POST("api/candidatos")
    Call<String> InsertCandidatos(@Body VM_agregarCandidato C);

    @POST("api/candidatos/visita/{id}")
    Call<String> InsertVisita(
        @Path("id") int id,
        @Body VM_agregarVisita U
    );

    @PUT("api/candidatos/{id}")
    Call<String>UpdateCandidato(
        @Path("id") int id,
        @Body VM_agregarCandidato C
    );
//-----------------------
//    @POST("api/usuarios")
//    Call<String> InsertUsuario(@Body VM_agregarUsuarios U);
//
//    @PUT("api/usuarios/{id}")
//    Call<String>UpdateUsuario(
//        @Path("id") int id,
//        @Body VM_editarUsuarios U
//    );
//    @PUT("usuarios/cambiarPass/{id}")
//    Call<String>UpdatePassword(@Body UsuarioUpdatePassword P);
//    @DELETE("api/usuarios/{id}")
//    Call<String>BORRAR(
//        @Query("id") int Id,
//        @Body UsuarioDelete U
//    );

}
