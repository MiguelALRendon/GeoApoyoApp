package com.example.geoapoyo.InterfacesAPI;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class Connection {
    private static final String URL = "http://prototipo2023-d6240700184c.herokuapp.com/";
    private static Retrofit retro;
    public static Retrofit getClient(){
        if (retro == null){
            retro = new Retrofit.Builder()
                    .baseUrl(URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retro;
    }
}
