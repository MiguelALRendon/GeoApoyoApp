package com.example.geoapoyo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.provider.OpenableColumns;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.geoapoyo.Models.C_candidato;
import com.example.geoapoyo.databinding.ActivityEditUserBinding;
import com.example.geoapoyo.verifier.Validator;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;
import java.util.List;

public class EditUserActivity extends AppCompatActivity {

    public static final int REQUEST_CODE = 1000;
    public boolean fromCamera;
    ActivityEditUserBinding binding;
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
    ImageView userImageView;
    ImageView photoImageView;

    SwitchMaterial solicitanteSwitch;
    Button guardarButton;
    ImageButton galleryButton;
    ImageButton cameraButton;

    C_candidato candidato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEditUserBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = getIntent();
        candidato = (C_candidato) intent.getSerializableExtra("Candidato");
        setInputs();

        //Settea valores en los dropdowns
        List<String> opcionesEstatus = new ArrayList<>();
        opcionesEstatus.add("autorizado");
        opcionesEstatus.add("pendiente");

        //Funcion que abre la galeria
        cameraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCamera();
            }
        });

        //Funcion que abre la camara
        galleryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGallery();
            }
        });

        //Funcion de guardar
        guardarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isValidated()){

                }
            }
        });
    }

    private void openCamera() {
        Intent intent = new Intent(MediaStore.ACTION_PICK_IMAGES);
        fromCamera = false;
        startActivityForResult(intent, REQUEST_CODE);
    }

    private void openGallery(){
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        fromCamera = true;
        startActivityForResult(intent, REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode == Activity.RESULT_OK && requestCode == REQUEST_CODE) {
            String filename = "";
            if (fromCamera) {
                filename = "foto_001.jpg";
                photoImageView.setImageBitmap(data.getExtras().getParcelable("data"));
            } else {
                filename = getFileNameFromData(data.getData());
                photoImageView.setImageURI(data.getData());
            }
            photoImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            fotografiaText.setText(filename);
        }
    }

    private void setInputs() {
        nombreVisitadorLayout = binding.txtVisitadorLayout;
        fotografiaLayout = binding.txtPhotoLayout;

        estatusText = binding.autoCompleteEstatus;
        razonText = binding.autoCompleteRazon;
        coordXText = binding.txtXCord;
        coordYText = binding.txtYCord;
        fechaText = binding.txtFecha;
        horaText = binding.txtHora;
        nombreText = binding.txtVisitador;
        fotografiaText = binding.txtPhoto;

        solicitanteSwitch = binding.switchMaterial;
        guardarButton = binding.btnSave;
        galleryButton = binding.btnGallery;
        cameraButton = binding.btnPhoto;

        userImageView = binding.imgUsuarioLista;
        photoImageView = binding.photoImage;

    }

    private void setInputsInformation() {

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

    private String getFileNameFromData(Uri uri) {
        String result = null;
        if (uri.getScheme().equals("content")) {
            try (Cursor cursor = getContentResolver().query(uri, null, null, null, null)) {
                if (cursor != null && cursor.moveToFirst()) {
                    int index = cursor.getColumnIndex(OpenableColumns.DISPLAY_NAME);
                    if (index != -1) {
                        result = cursor.getString(index);
                    }
                }
            }
        }
        if (result == null) {
            result = uri.getLastPathSegment();
        }
        return result;
    }
}