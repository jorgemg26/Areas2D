package com.digitechfp.dam.pmpdp.p002.dampmpdmp003areas2d;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;



import com.digitechfp.dam.pmpdp.p002.dampmpdmp003areas2d.databinding.ActivityMainBinding;


import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private RadioGroup radioGroupFiguras;
    private Button btnCalcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroupFiguras = findViewById(R.id.radioGroupFiguras);
        btnCalcular = findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(v -> cargarActividadFigura());

    }

    private void cargarActividadFigura()
    {
        int selectedId = radioGroupFiguras.getCheckedRadioButtonId();
        if (selectedId == -1)
        {
            Toast.makeText(this, "Por favor, selecciona una figura",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Intent intent = null;
            if (selectedId == R.id.radioCirculo)
            {
                intent = new Intent(this, CirculoActivity.class);
            }
            else if (selectedId == R.id.radioTrapecio)
            {
                intent = new Intent(this, TrapecioActivity.class);
            }
            else if (selectedId == R.id.radioRombo)
            {
                intent = new Intent(this, RomboActivity.class);
            }
            else if (selectedId == R.id.radioTriangulo)
            {
                intent = new Intent(this, TrianguloActivity.class);
            }
            if (intent != null)
            {
                startActivity(intent);
            }
            else
            {
                Toast.makeText(this, "No se trata la figura seleccionada",Toast.LENGTH_SHORT).show();
            }


        }

    }


}