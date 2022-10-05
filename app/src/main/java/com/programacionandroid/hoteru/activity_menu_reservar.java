package com.programacionandroid.hoteru;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class activity_menu_reservar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cambiarActivityInfoHabitacion(View view){
        Intent activityPrincipal  = new Intent(this, activity_info_habitacion.class);
        startActivity(activityPrincipal);
    }

    public void cambiarActivityCantidad(View view){
        Intent activityPrincipal  = new Intent(this, activity_cantidad.class);
        startActivity(activityPrincipal);
    }

}
