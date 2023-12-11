package com.example.geoapoyo.Models;

public class C_eliminarUsuario {
    private int id_usuario;
    private int estatus;

    public C_eliminarUsuario(int id_usuario, int estatus) {
        this.id_usuario = id_usuario;
        this.estatus = estatus;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }
}
