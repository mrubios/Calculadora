package org.iesch.practica1.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.iesch.practica1.calculadora.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //Inicializamos los objetos donde sacaremos los datos
        EditText n1 = binding.n1;
        EditText n2 = binding.n2;
        Button btnSuma = binding.suma;
        Button btnResta = binding.resta;
        Button btnMultiplicacion = binding.multi;
        Button btnDivision = binding.div;
        TextView resultado = binding.resultado;

        binding.suma.setOnClickListener(v -> {
            //Al hacer click queremos capturar el texto introducido
            int num1 = 0;
            int num2 = 0;
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

                int result = num1 + num2;
                binding.resultado.setText(String.valueOf(result));

            }
            catch (Exception e)
            {
                Toast.makeText(this, R.string.error, Toast.LENGTH_LONG).show();
            }


        });

        binding.resta.setOnClickListener(v -> {
            //Al hacer click queremos capturar el texto introducido
            int num1 = 0;
            int num2 = 0;
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

                int result = num1 - num2;
                binding.resultado.setText(String.valueOf(result));

            }
            catch (Exception e)
            {
                Toast.makeText(this, R.string.error, Toast.LENGTH_LONG).show();
            }


        });

        binding.multi.setOnClickListener(v -> {
            //Al hacer click queremos capturar el texto introducido
            int num1 = 0;
            int num2 = 0;
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

                int result = num1 * num2;
                binding.resultado.setText(String.valueOf(result));

            }
            catch (Exception e)
            {
                Toast.makeText(this, R.string.error, Toast.LENGTH_LONG).show();
            }


        });

        binding.div.setOnClickListener(v -> {
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
                binding.resultado.setText(String.valueOf(result));

            }
            catch (Exception e)
            {
                Toast.makeText(this, R.string.error, Toast.LENGTH_LONG).show();
            }


        });
    }




}