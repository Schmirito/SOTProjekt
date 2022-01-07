package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.io.BufferedReader;

public class PyramideViereckAuswahl extends AppCompatActivity {

    Button btZurueckPVA;
    Button btPVVolumen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pyramide_viereck_auswahl);

        btZurueckPVA = findViewById(R.id.btZurueckPVA);
        btPVVolumen = findViewById(R.id.btPVVolumen);

        btZurueckPVA.setOnClickListener(View -> clickedZPVA());
        btPVVolumen.setOnClickListener(View -> clickedPVV());
    }

    private void clickedPVV() {
        Intent iPVV = new Intent(this, PyramideViereckVolumen.class);
        startActivity(iPVV);
    }

    private void clickedZPVA() {
        Intent iZPVA = new Intent(this, PyramideAuswahl.class);
        startActivity(iZPVA);
    }
}