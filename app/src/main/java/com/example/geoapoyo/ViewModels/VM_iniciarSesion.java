package com.example.geoapoyo.ViewModels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class VM_iniciarSesion extends ViewModel {
    public final MutableLiveData<String> correo = new MutableLiveData<>();
    public final MutableLiveData<String> password = new MutableLiveData<>();

    public VM_iniciarSesion() {
        resetValues();
    }
//    ----------------------------------------------------------------
    public LiveData<String> getCorreo() {
        return  correo;
    }
    public void setCorreo(String _correo) {
        correo.setValue(_correo);
    }

    public LiveData<String> getPassword() {
        return password;
    }
    public void setPassword(String _password) {
        password.setValue(_password);
    }
//    ----------------------------------------------------------------
    void resetValues(){
        correo.setValue("");
        password.setValue("");
    };
}
