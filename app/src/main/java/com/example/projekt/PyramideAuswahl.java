package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class PyramideAuswahl extends AppCompatActivity {

    Button btPUmfang;
    Button btZurueckPA;
    Button btPOberflaeche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pyramide_auswahl);
        
        btPUmfang = findViewById(R.id.btPVolumen);
        btZurueckPA = findViewById(R.id.btZurueckPA);
        btPOberflaeche = findViewById(R.id.btPOberflaeche);

        btPUmfang.setOnClickListener(View -> clickedPU());
        btZurueckPA.setOnClickListener(View -> clickedZPA());
        btPOberflaeche.setOnClickListener(View -> clickedPOI());
    }

    private void clickedPOI() {
        Intent iPOI = new Intent(this, PyramideOberflaeche.class);
        startActivity(iPOI);
    }

    private void clickedZPA() {
        Intent iZPA = new Intent(this, DreiDAuswahl.class);
        startActivity(iZPA);
    }

    private void clickedPU() {
        Intent iPU = new Intent(this, PyramideVolumen.class);
        startActivity(iPU);
    }
}