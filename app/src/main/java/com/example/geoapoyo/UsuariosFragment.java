package com.example.geoapoyo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.geoapoyo.ViewModels.VM_Candidato;
import com.example.geoapoyo.adapter.UsuarioAdapter;

public class UsuariosFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View thisView = inflater.inflate(R.layout.fragment_usuarios, container, false);
        RecyclerView recyclerView = (RecyclerView) thisView.findViewById(R.id.usManagerList);

        recyclerView.setLayoutManager(new LinearLayoutManager(thisView.getContext()));

        //Elementos api
        VM_Candidato vm_candidato = new ViewModelProvider(requireActivity()).get(VM_Candidato.class);

        vm_candidato.getCandidatos().observe(requireActivity(), candidatos -> {
            UsuarioAdapter usuarioAdapter = new UsuarioAdapter(thisView.getContext(), candidatos);
            recyclerView.setAdapter(usuarioAdapter);
        });
        // Inflate the layout for this fragment
        return thisView;
    }
}