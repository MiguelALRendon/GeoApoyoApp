package com.example.geoapoyo.InterfacesAPI;

import com.example.geoapoyo.Models.ResponseServer.ServiciosExtra.ServiciosExtra_Coordenadar;
import com.example.geoapoyo.Models.ResponseServer.ServiciosExtra.R_ServiciosExtra_Coordenadar;
import com.example.geoapoyo.Models.ResponseServer.ServiciosExtra.R_ServiciosExtras_Estados;
import com.example.geoapoyo.Models.ResponseServer.ServiciosExtra.R_ServiciosExtras_Muncipios;
import com.example.geoapoyo.Models.ResponseServer.ServiciosExtra.R_VerificarConexion;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ServiciosExtras {
    @GET("api/services")
    Call<R_ServiciosExtras_Estados> GetEstados();

    @GET("api/services/{estado}")
    Call<R_ServiciosExtras_Muncipios> GetMunicipios(@Path("estado") String estado);

    @GET("api/services/verificarConexion")
    Call<R_VerificarConexion> GetVerificarConexion();

    @POST("api/services/0")
    Call<R_ServiciosExtra_Coordenadar> GetCoordenadas(@Body ServiciosExtra_Coordenadar U);

}
