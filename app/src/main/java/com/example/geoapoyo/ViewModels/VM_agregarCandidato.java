package com.example.geoapoyo.ViewModels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.geoapoyo.Models.ResponseServer.Candidatos.Pregunta10;

public class VM_agregarCandidato extends ViewModel {

    public final MutableLiveData<String> nombre=new MutableLiveData<>();// ":"charly gomez",
    public final MutableLiveData<Integer> edad=new MutableLiveData<>();// ":23,
    public final MutableLiveData<String> estado=new MutableLiveData<>();// ":"Guanajuato",
    public final MutableLiveData<String> municipio=new MutableLiveData<>();// ":"Salamanca",
    public final MutableLiveData<String> colonia=new MutableLiveData<>();// ":"Jardines del Moral",
    public final MutableLiveData<String> calle=new MutableLiveData<>();// ":"Jardin del final",
    public final MutableLiveData<String> entre_calles=new MutableLiveData<>();// ":"paseo y el otro",
    public final MutableLiveData<Integer> no_int=new MutableLiveData<>();// ": "217",
    public final MutableLiveData<String> no_ext=new MutableLiveData<>();// ":"D",
    public final MutableLiveData<String> institucion=new MutableLiveData<>();// ":"Guadalupe Pedroza",
    public final MutableLiveData<String> grado_escolaridad=new MutableLiveData<>();// ":"Secundaria",
    public final MutableLiveData<String> fotografia=new MutableLiveData<>();// ":"www.google.com.mx",
    public final MutableLiveData<Integer> id_tipo_apoyo=new MutableLiveData<>();// ":1,
    public final MutableLiveData<Integer> id_estatus=new MutableLiveData<>();// ":1,
    public final MutableLiveData<Double> latitud=new MutableLiveData<>();// ":19.0,
    public final MutableLiveData<Double> longitud=new MutableLiveData<>();// ":-19.0

//  PREGUNTAS ----------------------------------------------------------------
    public final MutableLiveData<Boolean> pregunta1=new MutableLiveData<>();
    public final MutableLiveData<Boolean> pregunta2=new MutableLiveData<>();
    public final MutableLiveData<Boolean> pregunta3=new MutableLiveData<>();
    public final MutableLiveData<Boolean> pregunta4=new MutableLiveData<>();
    public final MutableLiveData<Boolean> pregunta5=new MutableLiveData<>();
    public final MutableLiveData<Boolean> pregunta6=new MutableLiveData<>();
    public final MutableLiveData<Boolean> pregunta7=new MutableLiveData<>();
    public final MutableLiveData<Boolean> pregunta8=new MutableLiveData<>();
    public final MutableLiveData<Boolean> pregunta9=new MutableLiveData<>();
    public final MutableLiveData<Pregunta10> pregunta10=new MutableLiveData<>();

    public VM_agregarCandidato() {
//        resetValues();
    }
//    ----------------------------------------------------------------


}
