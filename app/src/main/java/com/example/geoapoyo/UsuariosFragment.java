package com.example.geoapoyo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import adapter.UsuarioAdapter;

public class UsuariosFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View thisView = inflater.inflate(R.layout.fragment_usuarios, container, false);
        RecyclerView recyclerView = (RecyclerView) thisView.findViewById(R.id.usManagerList);

        recyclerView.setLayoutManager(new LinearLayoutManager(thisView.getContext()));
        UsuarioAdapter usuarioAdapter = new UsuarioAdapter(thisView.getContext());
        recyclerView.setAdapter(usuarioAdapter);
        // Inflate the layout for this fragment
        return thisView;
    }
}