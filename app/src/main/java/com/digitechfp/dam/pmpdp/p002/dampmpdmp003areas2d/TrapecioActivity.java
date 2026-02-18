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

public class TrapecioActivity extends AppCompatActivity {
    EditText etBaseMayor, etBaseMenor, etAltura;
    TextView tvResultado;
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapecio);

        etBaseMayor = findViewById(R.id.etBaseMayor);
        etBaseMenor = findViewById(R.id.etBaseMenor);
        etAltura = findViewById(R.id.etAltura);
        tvResultado = findViewById(R.id.tvResultado);
        btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularAreaTrapecio();
            }
        });
    }

    private void calcularAreaTrapecio() {
        double baseMayor = Double.parseDouble(etBaseMayor.getText().toString());
        double baseMenor = Double.parseDouble(etBaseMenor.getText().toString());
        double altura = Double.parseDouble(etAltura.getText().toString());

        double area = (baseMayor + baseMenor) * altura / 2;

        tvResultado.setText("Área del trapecio: " + area);
        tvResultado.postDelayed(() -> finish(), 2000);
        Toast.makeText(this, "El área del trapecio es: " + area, Toast.LENGTH_SHORT).show();
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

