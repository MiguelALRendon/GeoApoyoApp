package com.example.geoapoyo.Models;

import android.os.Parcel;
import android.os.Parcelable;

public class C_usuarios implements Parcelable {
    private int id_usuario;
    private String nombre;
    private String correo;
    private String password;
    private int id_rol;
    private int latitud;
    private int longitud;
    private String token;
    private int estatus;
    private String created_at;
    private String updated_at;

    public C_usuarios(int id_usuario, String nombre, String correo, String password, int id_rol, int latitud, int longitud, String token, int estatus, String created_at, String updated_at) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
        this.id_rol = id_rol;
        this.latitud = latitud;
        this.longitud = longitud;
        this.token = token;
        this.estatus = estatus;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    protected C_usuarios(Parcel in) {
        id_usuario = in.readInt();
        nombre = in.readString();
        correo = in.readString();
        password = in.readString();
        id_rol = in.readInt();
        latitud = in.readInt();
        longitud = in.readInt();
        token = in.readString();
        estatus = in.readInt();
        created_at = in.readString();
        updated_at = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id_usuario);
        dest.writeString(nombre);
        dest.writeString(correo);
        dest.writeString(password);
        dest.writeInt(id_rol);
        dest.writeInt(latitud);
        dest.writeInt(longitud);
        dest.writeString(token);
        dest.writeInt(estatus);
        dest.writeString(created_at);
        dest.writeString(updated_at);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<C_usuarios> CREATOR = new Creator<C_usuarios>() {
        @Override
        public C_usuarios createFromParcel(Parcel in) {
            return new C_usuarios(in);
        }

        @Override
        public C_usuarios[] newArray(int size) {
            return new C_usuarios[size];
        }
    };

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
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

    public int getLatitud() {
        return latitud;
    }

    public void setLatitud(int latitud) {
        this.latitud = latitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
}
