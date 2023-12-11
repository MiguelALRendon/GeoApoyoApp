package com.example.geoapoyo.Models.ResponseServer.Usuario;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import com.example.geoapoyo.Models.C_usuarios;

public class R_usuarios{
    public C_usuarios[] lista;

    public R_usuarios(C_usuarios[] lista) {
        this.lista = lista;
    }
}
