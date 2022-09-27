package org.iesch.practica1.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Inicializamos los objetos donde sacaremos los datos
        EditText n1 = findViewById(R.id.n1);
        EditText n2 = findViewById(R.id.n2);
        Button btnSuma = findViewById(R.id.suma);
        Button btnResta = findViewById(R.id.resta);
        Button btnMultiplicacion = findViewById(R.id.multi);
        Button btnDivision = findViewById(R.id.div);
        TextView resultado = findViewById(R.id.resultado);

        btnSuma.setOnClickListener(v -> {
            //Al hacer click queremos capturar el texto introducido
            double num1 = 0;
            double num2 = 0;
            try {
                String numero1 = n1.getText().toString();
                if (!numero1.isEmpty()){
                    num1 = Integer.parseInt(numero1);
                }else{
                    num1 = 0;
                }
                String numero2 = n2.getText().toString();
                if (!numero2.isEmpty()){
                    num2 = Integer.parseInt(numero2);
                }else{
                    num2 = 0;
                }

                double result = num1 + num2;
                resultado.setText(String.valueOf(result));

            }
            catch (Exception e)
            {
                Toast.makeText(this, "No introduzcas caracteres no numéricos", Toast.LENGTH_LONG).show();
            }


        });

        btnResta.setOnClickListener(v -> {
            //Al hacer click queremos capturar el texto introducido
            double num1 = 0;
            double num2 = 0;
            try {
                String numero1 = n1.getText().toString();
                if (!numero1.isEmpty()){
                    num1 = Integer.parseInt(numero1);
                }else{
                    num1 = 0;
                }
                String numero2 = n2.getText().toString();
                if (!numero2.isEmpty()){
                    num2 = Integer.parseInt(numero2);
                }else{
                    num2 = 0;
                }

                double result = num1 - num2;
                resultado.setText(String.valueOf(result));

            }
            catch (Exception e)
            {
                Toast.makeText(this, "No introduzcas caracteres no numéricos", Toast.LENGTH_LONG).show();
            }


        });

        btnMultiplicacion.setOnClickListener(v -> {
            //Al hacer click queremos capturar el texto introducido
            double num1 = 0;
            double num2 = 0;
            try {
                String numero1 = n1.getText().toString();
                if (!numero1.isEmpty()){
                    num1 = Integer.parseInt(numero1);
                }else{
                    num1 = 0;
                }
                String numero2 = n2.getText().toString();
                if (!numero2.isEmpty()){
                    num2 = Integer.parseInt(numero2);
                }else{
                    num2 = 0;
                }

                double result = num1 * num2;
                resultado.setText(String.valueOf(result));

            }
            catch (Exception e)
            {
                Toast.makeText(this, "No introduzcas caracteres no numéricos", Toast.LENGTH_LONG).show();
            }


        });

        btnDivision.setOnClickListener(v -> {
            //Al hacer click queremos capturar el texto introducido
            double num1 = 0;
            double num2 = 0;
            try {
                String numero1 = n1.getText().toString();
                if (!numero1.isEmpty()){
                    num1 = Integer.parseInt(numero1);
                }else{
                    num1 = 0;
                }
                String numero2 = n2.getText().toString();
                if (!numero2.isEmpty()){
                    num2 = Integer.parseInt(numero2);
                }else{
                    num2 = 0;
                }

                double result = num1 / num2;
                resultado.setText(String.valueOf(result));

            }
            catch (Exception e)
            {
                Toast.makeText(this, "No introduzcas caracteres no numéricos", Toast.LENGTH_LONG).show();
            }


        });
    }




}