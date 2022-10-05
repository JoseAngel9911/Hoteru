package com.programacionandroid.hoteru;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class activity_menu_serviciohabitacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_sevicioahabitacion);
    }

    public void cambiarActivityServicioComida(View view){
        Intent activity = new Intent(this,activity_servicio_comida.class);
        startActivity(activity);
    }


    public void cambiarActivityServicioLimpieza(View view){
        Intent activity = new Intent(this,activity_servicio_limpieza.class);
        startActivity(activity);
    }


}
