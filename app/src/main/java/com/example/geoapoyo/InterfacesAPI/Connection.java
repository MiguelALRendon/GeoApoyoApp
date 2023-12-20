package com.example.geoapoyo.InterfacesAPI;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class Connection {
    private static final String URL = "https://prototipo2023-d6240700184c.herokuapp.com/";
    private static Retrofit retro;
    public static Retrofit.Builder builder = new Retrofit.Builder()
                    .baseUrl(URL)
                    .addConverterFactory(GsonConverterFactory.create());

    private static Retrofit retrofit = builder.build();
    public static <S> S createService(Class<S> serviceClass) {
        return retrofit.create(serviceClass);
    }
}
