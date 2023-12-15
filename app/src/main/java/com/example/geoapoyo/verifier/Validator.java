package com.example.geoapoyo.verifier;

import android.annotation.SuppressLint;
import android.util.Log;

import java.util.Arrays;

public class Validator {
    public String validate(String text, String validations) {
        String[] validationList = validations.split("\\|");
        StringBuilder rtrn = new StringBuilder();
        for (String validation: validationList) {
            switch (validation) {
                case "required" :
                    rtrn.append(requiredValidation(text));
                    break;

                case "email" :
                    rtrn.append(emailValidation(text));
                    break;

                default:
                    if (validation.startsWith("minLenght:")){
                        try {
                            int len = Integer.parseInt(validation.substring("minLenght:".length()));
                            rtrn.append(minLenghtValidation(text, len));
                        } catch (Exception e){
                            System.out.println(e);
                        }
                    }

                    if (validation.startsWith("maxLenght:")){
                        try {
                            int ilen = Integer.parseInt(validation.substring("maxLenght:".length()));
                            rtrn.append(maxLenghtValidation(text, ilen));
                        } catch (Exception e){
                            System.out.println(e);
                        }
                    }
            }
        }
        return rtrn.toString();
    }

    public String requiredValidation(String text) {return text.equals("") ? "Campo requerido\n" : "";}
    @SuppressLint("DefaultLocale")
    public String minLenghtValidation(String text, int minLenght) {return text.length() < minLenght ? String.format("El campo debe tener minimo %d caracteres\n", minLenght) : "";}
    @SuppressLint("DefaultLocale")
    public String maxLenghtValidation(String text, int minLenght) {return text.length() > minLenght ? String.format("El campo puede tener un máximo de %d caracteres\n", minLenght) : "";}
    public String emailValidation(String text) {return text.contains("@") && text.contains(".com") ? "" : "El campo debe ser un Email\n";}
}
