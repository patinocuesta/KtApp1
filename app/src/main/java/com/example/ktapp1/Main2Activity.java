package com.example.ktapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String nom = intent.getStringExtra("nom");
        String prenom = intent.getStringExtra("prenom");
        TextView texteNom = findViewById(R.id.nom);
        TextView textePrenom = findViewById(R.id.prenom);
        texteNom.setText(nom);
        textePrenom.setText(prenom);
    }

    public void retour(View view) {
       // finish();
        Intent intent = new Intent(Main2Activity.this, MainActivity.class);
        intent.putExtra("nom", "");
        intent.putExtra("prenom", "");
        startActivity(intent);
    }
}
