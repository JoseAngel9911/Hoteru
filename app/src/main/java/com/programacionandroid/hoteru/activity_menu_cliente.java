package com.programacionandroid.hoteru;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class activity_menu_cliente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_cliente);
    }


    public void cambiarActivityReservar(View view){
        Intent activityPrincipal  = new Intent(this, activity_menu_reservar.class);
        startActivity(activityPrincipal);
    }

    public void cambiarActivityServicios(View view){
        Intent activityPrincipal  = new Intent(this, activity_menu_serviciohabitacion.class);
        startActivity(activityPrincipal);
    }


}
