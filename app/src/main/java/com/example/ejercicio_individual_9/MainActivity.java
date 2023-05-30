package com.example.ejercicio_individual_9;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.ejercicio_individual_9.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private Button btnEnviar;
    int selectedImageId = -1;
    String texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        //Asignar clickListener al boton enviar
        binding.btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (selectedImageId!=-1){
                    //Creamos el intent para iniciar la segunda actividad y enviar los id de las imagenes
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("imageId",selectedImageId);
                    intent.putExtra("text",texto);
                    startActivity(intent);
                }else {
                    Toast.makeText(MainActivity.this, "Seleccione una imagen primero", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //Agregar listener a las tarjetas
        binding.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Restablecemos el color del borde
                resetCardBorder();
                //Establecemos un color para el borde de la tarjeta seleccionada.
                binding.card.setStrokeColor(getResources().getColor(R.color.md_theme_dark_error));
                //Actualizamos el id de la imagen seleccionada
                selectedImageId = R.drawable.invierno;
                //Actualizamos el id del texto a enviar
                texto = binding.txtInvierno.getText().toString();
            }
        });

        binding.card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Restablecemos el color del borde
                resetCardBorder();
                //Establecemos un color para el borde de la tarjeta seleccionada.
                binding.card2.setStrokeColor(getResources().getColor(R.color.md_theme_dark_error));
                //Actualizamos el id de la imagen seleccionada
                selectedImageId = R.drawable.verano;
                //Actualizamos el id del texto a enviar
                texto = binding.txtVerano.getText().toString();
            }
        });

        binding.card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Restablecemos el color del borde
                resetCardBorder();
                //Establecemos un color para el borde de la tarjeta seleccionada.
                binding.card3.setStrokeColor(getResources().getColor(R.color.md_theme_dark_error));
                //Actualizamos el id de la imagen seleccionada
                selectedImageId = R.drawable.otono;
                //Actualizamos el id del texto a enviar
                texto = binding.txtOtono.getText().toString();
            }
        });

        binding.card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Restablecemos el color del borde
                resetCardBorder();
                //Establecemos un color para el borde de la tarjeta seleccionada.
                binding.card4.setStrokeColor(getResources().getColor(R.color.md_theme_dark_error));
                //Actualizamos el id de la imagen seleccionada
                selectedImageId = R.drawable.primavera;
                //Actualizamos el id del texto a enviar
                texto = binding.txtPrimavera.getText().toString();
            }
        });

        //boton salir
        binding.btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }

    private void resetCardBorder(){
        //Restablecer color de los bordes
        binding.card.setStrokeColor(getResources().getColor(R.color.md_theme_light_surfaceVariant));
        binding.card2.setStrokeColor(getResources().getColor(R.color.md_theme_light_surfaceVariant));
        binding.card3.setStrokeColor(getResources().getColor(R.color.md_theme_light_surfaceVariant));
        binding.card4.setStrokeColor(getResources().getColor(R.color.md_theme_light_surfaceVariant));
    }


}