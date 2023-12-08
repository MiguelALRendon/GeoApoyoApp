package com.example.geoapoyo.Models;

public class C_editarUsuarios {

    private int id_usuario;
    private String correo;
    private String password;
    private int id_rol;
    private String nombre;

    public C_editarUsuarios(int id_usuario, String correo, String password, int id_rol, String nombre) {
        this.id_usuario = id_usuario;
        this.correo = correo;
        this.password = password;
        this.id_rol = id_rol;
        this.nombre = nombre;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
