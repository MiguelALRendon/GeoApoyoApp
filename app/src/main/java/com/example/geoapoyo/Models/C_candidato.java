package com.example.geoapoyo.Models;

import android.os.Parcel;
import android.os.Parcelable;

public class C_candidato implements Parcelable {
    public int id_candidato;
    public String nombre;
    public int edad;
    public String calle;
    public String colonia;
    public String municipio;
    public String estado;
    public String entre_calles;
    public String no_int;
    public String no_ext;
    public String institucion;
    public String grado_escolaridad;
    public int id_tipo_apoyo;
    public int id_estatus_apoyo;


        public String fotografia;
        public String created_at;
        public String updated_at;
        public String pregunta1;
        public String pregunta2;
        public String pregunta3;
        public String pregunta4;
        public String pregunta5;
        public String pregunta6;
        public String pregunta7;
        public String pregunta8;
        public String pregunta9;
        public Boolean[] pregunta10;
    //    ----------------------------------------------------------------
    protected C_candidato(Parcel in) {
        nombre = in.readString();
        edad = in.readInt();
        calle = in.readString();
        colonia = in.readString();
        municipio = in.readString();
        estado = in.readString();
        entre_calles = in.readString();
        no_int = in.readString();
        no_ext = in.readString();
        institucion = in.readString();
        grado_escolaridad = in.readString();
        id_tipo_apoyo = in.readInt();
        id_estatus_apoyo = in.readInt();
    }
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombre);
        dest.writeInt(edad);
        dest.writeString(calle);
        dest.writeString(colonia);
        dest.writeString(municipio);
        dest.writeString(estado);
        dest.writeString(entre_calles);
        dest.writeString(no_int);
        dest.writeString(no_ext);
        dest.writeString(institucion);
        dest.writeString(grado_escolaridad);
        dest.writeInt(id_tipo_apoyo);
        dest.writeInt(id_estatus_apoyo);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<C_candidato> CREATOR = new Creator<C_candidato>() {
        @Override
        public C_candidato createFromParcel(Parcel in) {
            return new C_candidato(in);
        }

        @Override
        public C_candidato[] newArray(int size) {
            return new C_candidato[size];
        }
    };
//    ----------------------------------------------------------------


    public C_candidato(int id_candidato, String nombre, int edad, String calle, String colonia, String municipio, String estado, String entre_calles, String no_int, String no_ext, String institucion, String grado_escolaridad, int id_tipo_apoyo, int id_estatus_apoyo, String fotografia, String created_at, String updated_at, String pregunta1, String pregunta2, String pregunta3, String pregunta4, String pregunta5, String pregunta6, String pregunta7, String pregunta8, String pregunta9, Boolean[] pregunta10) {
        this.id_candidato = id_candidato;
        this.nombre = nombre;
        this.edad = edad;
        this.calle = calle;
        this.colonia = colonia;
        this.municipio = municipio;
        this.estado = estado;
        this.entre_calles = entre_calles;
        this.no_int = no_int;
        this.no_ext = no_ext;
        this.institucion = institucion;
        this.grado_escolaridad = grado_escolaridad;
        this.id_tipo_apoyo = id_tipo_apoyo;
        this.id_estatus_apoyo = id_estatus_apoyo;
        this.fotografia = fotografia;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.pregunta1 = pregunta1;
        this.pregunta2 = pregunta2;
        this.pregunta3 = pregunta3;
        this.pregunta4 = pregunta4;
        this.pregunta5 = pregunta5;
        this.pregunta6 = pregunta6;
        this.pregunta7 = pregunta7;
        this.pregunta8 = pregunta8;
        this.pregunta9 = pregunta9;
        this.pregunta10 = pregunta10;
    }

    public void setId_candidato(int id_candidato) {
        this.id_candidato = id_candidato;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setEntre_calles(String entre_calles) {
        this.entre_calles = entre_calles;
    }

    public void setNo_int(String no_int) {
        this.no_int = no_int;
    }

    public void setNo_ext(String no_ext) {
        this.no_ext = no_ext;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public void setGrado_escolaridad(String grado_escolaridad) {
        this.grado_escolaridad = grado_escolaridad;
    }

    public void setId_tipo_apoyo(int id_tipo_apoyo) {
        this.id_tipo_apoyo = id_tipo_apoyo;
    }

    public void setId_estatus_apoyo(int id_estatus_apoyo) {
        this.id_estatus_apoyo = id_estatus_apoyo;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public void setPregunta1(String pregunta1) {
        this.pregunta1 = pregunta1;
    }

    public void setPregunta2(String pregunta2) {
        this.pregunta2 = pregunta2;
    }

    public void setPregunta3(String pregunta3) {
        this.pregunta3 = pregunta3;
    }

    public void setPregunta4(String pregunta4) {
        this.pregunta4 = pregunta4;
    }

    public void setPregunta5(String pregunta5) {
        this.pregunta5 = pregunta5;
    }

    public void setPregunta6(String pregunta6) {
        this.pregunta6 = pregunta6;
    }

    public void setPregunta7(String pregunta7) {
        this.pregunta7 = pregunta7;
    }

    public void setPregunta8(String pregunta8) {
        this.pregunta8 = pregunta8;
    }

    public void setPregunta9(String pregunta9) {
        this.pregunta9 = pregunta9;
    }

    public void setPregunta10(Boolean[] pregunta10) {
        this.pregunta10 = pregunta10;
    }
}
