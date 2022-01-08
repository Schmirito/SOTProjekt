package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class PyramideFuenfeckAuswahl extends AppCompatActivity {

    Button btZurueckPF;
    Button btPFVolumen;
    Button btPFOberflaeche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pyramide_fuenfeck_auswahl);

        btZurueckPF = findViewById(R.id.btZurueckPF);
        btPFVolumen = findViewById(R.id.btPFVolumen);
        btPFOberflaeche = findViewById(R.id.btPFOberflaeche);

        btZurueckPF.setOnClickListener(View -> clickedZPF());
        btPFVolumen.setOnClickListener(View -> clickedPFV());
        btPFOberflaeche.setOnClickListener(View -> clickedPFO());
    }

    private void clickedPFO() {
        Intent iPFO = new Intent(this,PyramideFuenfeckOberflaeche.class);
        startActivity(iPFO);
    }

    private void clickedPFV() {
        Intent iPFV = new Intent(this,PyramideFuenfeckVolumen.class);
       startActivity(iPFV);
    }

    private void clickedZPF() {
        Intent iZPF = new Intent(this,PyramideAuswahl.class);
        startActivity(iZPF);
    }
}