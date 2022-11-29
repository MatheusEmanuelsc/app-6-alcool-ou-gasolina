package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private  TextView resultado;
    private TextInputEditText gaso, alco ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = findViewById(R.id.resposta);
        gaso= findViewById(R.id.gaso);
        alco=findViewById(R.id.alco);
    }

    public  void  verifica(View view){
        Double gasolina= Double.parseDouble(gaso.getText().toString());
        Double alcool= Double.parseDouble(alco.getText().toString());

        if (alcool/gasolina>0.7){
            resultado.setText("Gasolina vale mais apena.");
        }else{
            resultado.setText("Álcool vale mais apena.");
        }
    }

}