package com.example.geoapoyo.ViewModels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.geoapoyo.Models.C_usuarios;
public class VM_editarUsuarios extends ViewModel {
//    public final MutableLiveData<Integer> id_usuario = new MutableLiveData<>();
    public final MutableLiveData<String> correo = new MutableLiveData<>();
    public final MutableLiveData<String> password = new MutableLiveData<>();
    public final MutableLiveData<Integer> id_rol = new MutableLiveData<>();
    public final MutableLiveData<String> nombre = new MutableLiveData<>();
    public final MutableLiveData<Double> latitud = new MutableLiveData<>();
    public final MutableLiveData<Double> longitud = new MutableLiveData<>();

    public VM_editarUsuarios(C_usuarios C) {
//        resetValues();
        start(C);
    }

//    ----------------------------------------------------------------
    public LiveData<String> getCorreo() {return  correo;}
    public void setCorreo(String _correo) {correo.setValue(_correo);}

    public LiveData<Integer> getId_rol() {return  id_rol;}
    public void setId_rol(int _id_rol) {id_rol.setValue(_id_rol);}

    public LiveData<String> getNombre() {return  nombre;}
    public void setNombre(String _nombre) {correo.setValue(_nombre);}

    public LiveData<String> getPassword() {return  password;}
    public void setPassword(String _password) {correo.setValue(_password);}

    public MutableLiveData<Double> getLatitud() {return latitud;}

    public void setLatitud(Double _latitud) { latitud.setValue(_latitud);}
    public MutableLiveData<Double> getLongitud() {return longitud;}
    public void setLongitud(Double _longitud) { longitud.setValue(_longitud);}

    //    ----------------------------------------------------------------

    public void resetValues(){
//        id_usuario.setValue("");
        correo.setValue("");
        password.setValue("");
//        id_rol.setValue("");
        nombre.setValue("");
        latitud.setValue(0.0);
        longitud.setValue(0.0);

    }
    public void start(C_usuarios U){
        correo.setValue(U.getCorreo());
        password.setValue(U.getPassword());
        id_rol.setValue(U.getId_rol());
        nombre.setValue(U.getNombre());
        latitud.setValue((double) U.getLatitud());
        longitud.setValue((double) U.getLongitud());

    }

}
