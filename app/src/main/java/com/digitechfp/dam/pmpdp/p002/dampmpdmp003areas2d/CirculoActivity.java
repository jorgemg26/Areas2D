package com.digitechfp.dam.pmpdp.p002.dampmpdmp003areas2d;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CirculoActivity extends AppCompatActivity {

    private EditText editTextRadio;
    private Button btnCalcularCirculo;

    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_circulo);

        editTextRadio = findViewById(R.id.editTextRadio);
        btnCalcularCirculo = findViewById(R.id.btnCalcularCirculo);
        tvResultado = findViewById(R.id.tvResultado);
        btnCalcularCirculo.setOnClickListener(v -> calcularAreaCirculo());


    }


    private void calcularAreaCirculo()
    {
        String radioStr = editTextRadio.getText().toString();

        if (radioStr.isEmpty())
        {
            Toast.makeText(this, "El radio debe ser mayor a 0", Toast.LENGTH_SHORT).show();
        }
        else
        {
            try {
                double radio = Double.parseDouble(radioStr);
                double area = Math.PI * radio * radio;
                //double area = Math.PI * Math.pow(radio, 2);

                tvResultado.setText("Área del círculo: " + area);
                tvResultado.postDelayed(() -> finish(), 2000);
                Toast.makeText(this, "El área del circulo es: " + area, Toast.LENGTH_SHORT).show();

                //finish();
            }
            catch(NumberFormatException e)
            {
                Toast.makeText(this, "El radio debe tener formato número", Toast.LENGTH_SHORT).show();
            }

        }

    }
}