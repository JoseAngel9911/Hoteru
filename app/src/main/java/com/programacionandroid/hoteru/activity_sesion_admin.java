package com.programacionandroid.hoteru;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class activity_sesion_admin extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sesion_admin);
    }
    public void cambiarActivityMenuAdmin(View view){
        Intent activityMenuAdmin = new Intent(this,activity_menu_admin.class);
        startActivity(activityMenuAdmin);
    }
}
