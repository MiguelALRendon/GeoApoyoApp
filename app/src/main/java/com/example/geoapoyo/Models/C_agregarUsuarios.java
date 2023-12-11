package com.example.geoapoyo.Models;

public class C_agregarUsuarios {
    private String correo;
    private String password;
    private int id_rol;
    private String nombre;

    public C_agregarUsuarios(String correo, String password, int id_rol, String nombre) {
        this.correo = correo;
        this.password = password;
        this.id_rol = id_rol;
        this.nombre = nombre;
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
