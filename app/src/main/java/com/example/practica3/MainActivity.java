package com.example.practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    EditText cNum1, cNum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cNum1 = findViewById(R.id.gNum1);
        cNum2 = findViewById(R.id.gNum2);
        //metodo1();
    }//Fin onCreate

    public void Aceptar(View ver){
        Toast.makeText(this, "NUM1+ NUM2 = " +operacion(), Toast.LENGTH_LONG).show();
    }

    private float operacion(){
        int numero1, numero2;
        float resultado;
        numero1 = Integer.parseInt(cNum1.getText().toString());
        numero2 = Integer.parseInt(cNum2.getText().toString());
        resultado = numero1 + numero2;
        return resultado;
    }
/*
    private void metodo1(){
        Toast.makeText(this, "PRIMER MENSAJE :)", Toast.LENGTH_LONG).show();
    }//Fin método1

    public void sumar(View v){
        int num1 = Integer.parseInt(cNum1.getText().toString());
        int num2 = Integer.parseInt(cNum2.getText().toString());
        float suma = num1+num2;
        Toast.makeText(this, "LA SUMA ES: " +suma, Toast.LENGTH_LONG).show();
    }//Fin método Sumar

*/

}//Fin class MainActivity