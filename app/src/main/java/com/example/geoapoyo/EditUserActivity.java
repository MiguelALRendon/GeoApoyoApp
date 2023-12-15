package com.example.geoapoyo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.geoapoyo.verifier.Validator;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class EditUserActivity extends AppCompatActivity {
    TextInputLayout nombreVisitadorLayout;
    TextInputLayout fotografiaLayout;

    AutoCompleteTextView estatusText;
    AutoCompleteTextView razonText;
    TextInputEditText coordXText;
    TextInputEditText coordYText;
    TextInputEditText fechaText;
    TextInputEditText horaText;
    TextInputEditText nombreText;
    TextInputEditText fotografiaText;

    SwitchMaterial solicitanteSwitch;
    Button guardarButton;
    ImageButton galleryButton;
    ImageButton cameraButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_user);
        setInputs();

        //Funcion que abre la galeria


        //Funcion que abre la camara


        //Funcion de guardar
        guardarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isValidated()){

                }
            }
        });
    }

    private void setInputs() {
        nombreVisitadorLayout = findViewById(R.id.txtVisitadorLayout);
        fotografiaLayout = findViewById(R.id.txtPhotoLayout);

        estatusText = findViewById(R.id.autoCompleteEstatus);
        razonText = findViewById(R.id.autoCompleteRazon);
        coordXText = findViewById(R.id.txtXCord);
        coordYText = findViewById(R.id.txtYCord);
        fechaText = findViewById(R.id.txtFecha);
        horaText = findViewById(R.id.txtHora);
        nombreText = findViewById(R.id.txtVisitador);
        fotografiaText = findViewById(R.id.txtPhoto);

        solicitanteSwitch = findViewById(R.id.switchMaterial);
        guardarButton = findViewById(R.id.btnSave);
        galleryButton = findViewById(R.id.btnGallery);
        cameraButton = findViewById(R.id.btnPhoto);

    }

    private boolean isValidated() {
        Validator validator = new Validator();
        boolean rtrnVisitador = false;
        boolean rtrnFotografia = false;

        String vldVisitador = validator.validate(nombreText.getText().toString().trim(), "required|minLenght:10");
        String vldFotografia = validator.validate(fotografiaText.getText().toString().trim(), "required");

        if(vldVisitador.equals("")){nombreVisitadorLayout.setError(null); rtrnVisitador = true;}
        else{nombreVisitadorLayout.setError(vldVisitador);}

        if(vldFotografia.equals("")){fotografiaLayout.setError(null); rtrnFotografia = true;}
        else{fotografiaLayout.setError(vldFotografia);}

        return rtrnFotografia && rtrnVisitador;
    }
}