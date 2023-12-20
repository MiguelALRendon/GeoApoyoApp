package com.example.geoapoyo.ViewModels;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.geoapoyo.InterfacesAPI.CRUD_Candidatos;
import com.example.geoapoyo.InterfacesAPI.Connection;
import com.example.geoapoyo.Models.C_candidato;
import com.example.geoapoyo.Models.ResponseServer.Candidatos.Pregunta10;
import com.example.geoapoyo.repository.CandidatoRepository;

import java.util.List;

public class VM_Candidato extends ViewModel {
    private CandidatoRepository candidatoRepository;
    private MutableLiveData<List<C_candidato>> candidatos;
    private MutableLiveData<C_candidato> candidato;

    public VM_Candidato(){
        candidatoRepository = new CandidatoRepository(Connection.createService(CRUD_Candidatos.class));
    }

    public MutableLiveData<List<C_candidato>> getCandidatos(){
        System.out.println("GETCANDIDATOS WEEEEEEEEEEEEE");
        if(candidatos == null) {
            candidatos = candidatoRepository.getCandidatos();
        }
        return candidatos;
    }
}
