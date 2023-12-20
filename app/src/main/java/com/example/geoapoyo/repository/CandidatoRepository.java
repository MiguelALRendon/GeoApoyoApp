package com.example.geoapoyo.repository;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.example.geoapoyo.InterfacesAPI.CRUD_Candidatos;
import com.example.geoapoyo.Models.C_candidato;
import com.example.geoapoyo.Models.ResponseServer.Candidatos.R_Candidatos;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CandidatoRepository {
    private final CRUD_Candidatos crud_candidatos;

    public CandidatoRepository(CRUD_Candidatos crud_candidatos) {
        this.crud_candidatos = crud_candidatos;
    }

    //TODO: Obtiene todos los candidatos
    public MutableLiveData<List<C_candidato>> getCandidatos() {
        MutableLiveData<List<C_candidato>> candidatos = new MutableLiveData<>();

        crud_candidatos.GetCandidatos().enqueue(new Callback<R_Candidatos>() {
            @Override
            public void onResponse(Call<R_Candidatos> call, Response<R_Candidatos> response) {
                candidatos.setValue(response.body().candidatos);
            }

            @Override
            public void onFailure(Call<R_Candidatos> call, Throwable t) {
                Log.e("SI ES ERROR PADRINO", t.getMessage());
            }
        });

        return candidatos;
    }
}
