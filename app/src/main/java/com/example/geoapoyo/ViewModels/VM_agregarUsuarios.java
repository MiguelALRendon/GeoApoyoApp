package com.example.geoapoyo.ViewModels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class VM_agregarUsuarios extends ViewModel {
    private final MutableLiveData<String> nombre = new MutableLiveData<>();
    private final MutableLiveData<Integer> id_rol = new MutableLiveData<>();
    private final MutableLiveData<String> correo = new MutableLiveData<>();
    private final MutableLiveData<String> password = new MutableLiveData<>();
    public VM_agregarUsuarios() {
        resetValues();
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
//    ----------------------------------------------------------------

    public void resetValues(){
        nombre.setValue("");
        id_rol.setValue(1);
        correo.setValue("");
        password.setValue("");
    }


}
