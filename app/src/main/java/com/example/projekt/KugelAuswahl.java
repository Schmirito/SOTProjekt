package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class KugelAuswahl extends AppCompatActivity {
    Button btZurueckKugel;
    Button btKugelVolumen;
    Button btKugelOberflaeche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kugel_auswahl);

        btZurueckKugel = findViewById(R.id.btZurueckKugel);
        btKugelVolumen = findViewById(R.id.btKugelVolumen);
        btKugelOberflaeche = findViewById(R.id.btKugelOberflaeche);

        btKugelOberflaeche.setOnClickListener(View -> clickedKugelOberflaeche());
        btKugelVolumen.setOnClickListener(View -> clickedKugelVolumen());
        btZurueckKugel.setOnClickListener(View -> clickedKugelZurueck());

    }

    private void clickedKugelZurueck() {
        Intent iZKugel = new Intent(this, DreiDAuswahl.class);
        startActivity(iZKugel);
    }

    private void clickedKugelVolumen() {
        Intent iKugelV = new Intent(this, KugelVolumen.class);
        startActivity(iKugelV);
    }

    private void clickedKugelOberflaeche() {
        Intent iKugelO = new Intent(this, KugelOberflaeche.class);
        startActivity(iKugelO);
    }
}