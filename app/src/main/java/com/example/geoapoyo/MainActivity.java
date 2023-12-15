package com.example.geoapoyo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.geoapoyo.verifier.Validator;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    TextInputLayout emailLayout;
    TextInputLayout passwordLayout;

    TextInputEditText emailText;
    TextInputEditText passwordText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.btnLogin);
        emailLayout = findViewById(R.id.txtEmailLayout);
        passwordLayout = findViewById(R.id.txtPasswordLayout);
        emailText = findViewById(R.id.txtEmail);
        passwordText = findViewById(R.id.txtPassword);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isValidated()) {
                    Intent intent = new Intent(MainActivity.this, home_activity.class);
                    startActivity(intent);
                }
            }
        });
    }

    private boolean isValidated() {
        Validator validator = new Validator();
        boolean rtEmail = false;
        boolean rtPass = false;
        String emValid = validator.validate(emailText.getText().toString().trim(), "required|email");
        String passValid = validator.validate(passwordText.getText().toString().trim(), "required|minLenght:4");

        if (emValid.equals("")) {emailLayout.setError(null); rtEmail = true;}
        else { emailLayout.setError(emValid);}

        if (passValid.equals("")) {passwordLayout.setError(null); rtPass = true;}
        else { passwordLayout.setError(passValid);}

        return rtEmail && rtPass;
    }
}