package com.example.ktapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText nom, prenom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nom = findViewById(R.id.nom);
        prenom = findViewById(R.id.prenom);

    }

    public void envoyer(View view) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        intent.putExtra("nom", nom.getText().toString()+" ");
        intent.putExtra("prenom", prenom.getText().toString()+" ");
        Log.d("testApp", "Bonjour "+prenom.getText().toString()+" "+nom.getText().toString()+"!");
        startActivity(intent);
    }
}
