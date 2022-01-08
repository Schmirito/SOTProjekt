package com.example.projekt;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class KreisAuswahl extends AppCompatActivity {

    Button btZurueckKreis;
    Button btKreisFlaeche;
    Button btKreisUmfang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kreis_auswahl);
        btZurueckKreis = findViewById(R.id.btZurueckKreis);
        btKreisFlaeche = findViewById(R.id.btKreisFlaeche);
        btKreisUmfang = findViewById(R.id.btKreisUmfang);
        
        btZurueckKreis.setOnClickListener(View -> clickedKreisZurueck());
        btKreisFlaeche.setOnClickListener(View -> clickedKreisFlaeche());
        btKreisUmfang.setOnClickListener(View -> clickedKreisUmfang());

    }

    private void clickedKreisFlaeche() {
        Intent iKreisF = new Intent(this, KreisFlaeche.class);
        startActivity(iKreisF);
    }

    private void clickedKreisUmfang() {
        Intent iKreisU = new Intent(this, KreisUmfang.class);
        startActivity(iKreisU);
    }

    private void clickedKreisZurueck() {
        Intent iZKreis = new Intent(this, ZweiDAuswahl.class);
        startActivity(iZKreis);
    }
}