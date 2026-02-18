package com.digitechfp.dam.pmpdp.p002.dampmpdmp003areas2d;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TrianguloActivity extends AppCompatActivity {
    EditText etBase, etAltura;
    TextView tvResultado;
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);

        etBase = findViewById(R.id.etBase);
        etAltura = findViewById(R.id.etAltura);
        tvResultado = findViewById(R.id.tvResultado);
        btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularAreaTriangulo();
            }
        });
    }

    private void calcularAreaTriangulo() {
        double base = Double.parseDouble(etBase.getText().toString());
        double altura = Double.parseDouble(etAltura.getText().toString());

        double area = (base * altura) / 2;

        tvResultado.setText("Área del triángulo: " + area);
        tvResultado.postDelayed(() -> finish(), 2000);
        Toast.makeText(this, "El área del triángulo es: " + area, Toast.LENGTH_SHORT).show();
        /*
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finish();

         */
    }

}