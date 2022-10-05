package com.programacionandroid.hoteru;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class activity_sesion_class extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sesion);
    }
    public void cambiarActivityMenu(View view){
        Intent activityMenuCliente = new Intent(this,activity_menu_cliente.class);
        startActivity(activityMenuCliente);
    }

    public void cambiarActivityRegister(View view){
        Intent activity = new Intent(this,activity_register.class);
        startActivity(activity);
    }

}
