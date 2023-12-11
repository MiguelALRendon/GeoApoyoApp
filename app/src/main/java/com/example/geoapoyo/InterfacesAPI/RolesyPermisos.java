package com.example.geoapoyo.InterfacesAPI;

import com.example.geoapoyo.Models.ResponseServer.RolesyPermisos.R_Permisos;
import com.example.geoapoyo.Models.ResponseServer.RolesyPermisos.R_Roles;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Part;

public interface RolesyPermisos {
    @GET("api/roles")
    Call<R_Roles> GetRoles();
    @GET("api/permisos/{index_permiso}")
    Call<R_Permisos> GetPermisos(@Part("index_permiso") int index_permiso);

}
