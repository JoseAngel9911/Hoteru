package com.programacionandroid.hoteru;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void cambiarActivitySesionCliente(View view){
        Intent activityCliente = new Intent(this,activity_sesion_class.class);
        startActivity(activityCliente);
    }
}