package com.programacionandroid.hoteru;

import android.app.SearchManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class activity_intents_joselafferte_class extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_joselafferte);
    }

    public void cambiarIntentMenu(View view){

        Intent intentObj = new Intent(this, activity_menu_cliente.class);
        startActivity(intentObj);

    }

    public void abrirContactos(View view){
        Intent intentObj = new Intent (Intent.ACTION_VIEW);
        intentObj.setData(Uri.parse("content://contacts/people/"));
        startActivity(intentObj);
    }


    public void busquedaGoogle(View view){
        Intent intentObj = new Intent(Intent.ACTION_WEB_SEARCH);
        intentObj.putExtra(SearchManager.QUERY, "Intents y Activity");
        startActivity(intentObj);
    }

    public void abrirChrome(View view){
        Intent intentObj;
        PackageManager manager = getPackageManager();
        intentObj = manager.getLaunchIntentForPackage("com.android.chrome");
        intentObj.addCategory(Intent.CATEGORY_LAUNCHER);
        startActivity(intentObj);
    }


}
