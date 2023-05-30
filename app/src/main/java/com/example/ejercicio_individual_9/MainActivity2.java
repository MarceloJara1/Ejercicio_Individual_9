package com.example.ejercicio_individual_9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.ejercicio_individual_9.databinding.ActivityMain2Binding;
import com.example.ejercicio_individual_9.databinding.ActivityMainBinding;

public class MainActivity2 extends AppCompatActivity {

    private ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //Obtener id de la imagen enviada del activity anterior
        int imageId = getIntent().getIntExtra("imageId",-1);
        String texto = getIntent().getStringExtra("text");
        if (imageId!=-1){
            //Mostramos la imagen
            binding.imgPrincipal.setImageResource(imageId);
            binding.txtTit.setText(texto);
        }
        //boton volver
        binding.btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        //boton Salir
        binding.btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
            }
        });
    }




}