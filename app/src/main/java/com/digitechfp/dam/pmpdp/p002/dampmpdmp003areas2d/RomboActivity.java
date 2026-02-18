package com.digitechfp.dam.pmpdp.p002.dampmpdmp003areas2d;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RomboActivity extends AppCompatActivity {

    private EditText etDiagonalMayor, etDiagonalMenor;
    private TextView tvResultado;
    private Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rombo);

        etDiagonalMayor = findViewById(R.id.etDiagonalMayor);
        etDiagonalMenor = findViewById(R.id.etDiagonalMenor);
        tvResultado = findViewById(R.id.tvResultado);
        btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularArea();
            }
        });
    }

    private void calcularArea() {
        String dMayorStr = etDiagonalMayor.getText().toString();
        String dMenorStr = etDiagonalMenor.getText().toString();

        if (dMayorStr.isEmpty() || dMenorStr.isEmpty()) {
            Toast.makeText(this, "Introduce ambas diagonales", Toast.LENGTH_SHORT).show();
            return;
        }

        double dMayor = Double.parseDouble(dMayorStr);
        double dMenor = Double.parseDouble(dMenorStr);

        double area = (dMayor * dMenor) / 2;
        tvResultado.setText("Área del rombo: " + area);
        tvResultado.postDelayed(() -> finish(), 2000);
        Toast.makeText(this, "El área del rombo es: " + area, Toast.LENGTH_SHORT).show();

    }
}