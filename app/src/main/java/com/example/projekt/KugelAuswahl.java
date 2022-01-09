package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class KugelAuswahl extends AppCompatActivity {

    Button btZurueckKugel;
    Button btKVolumen;
    Button btKOberflaeche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kugel_auswahl);

        btZurueckKugel = findViewById(R.id.btZurueckKugel);
        btKVolumen = findViewById(R.id.btKVolumen);
        btKOberflaeche = findViewById(R.id.btKOberflaeche);

        btZurueckKugel.setOnClickListener(View -> clickedZK());
        btKVolumen.setOnClickListener(View -> clickedKV());
        btKOberflaeche.setOnClickListener(View -> clickedKO());
    }

    private void clickedKO() {
        Intent iKO = new Intent(this,KugelOberflaeche.class);
        startActivity(iKO);
    }

    private void clickedKV() {
        Intent iKV = new Intent(this,KugelVolumen.class);
        startActivity(iKV);
    }

    private void clickedZK() {
        Intent iZK = new Intent(this,DreiDAuswahl.class);
        startActivity(iZK);
    }
}