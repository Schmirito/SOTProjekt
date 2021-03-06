package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class PyramideAuswahl extends AppCompatActivity {

    Button btZurueckPA;
    Button btPDreieck;
    Button btPViereck;
    Button btPFuenfeck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pyramide_auswahl);

        btZurueckPA = findViewById(R.id.btZurueckPA);
        btPDreieck = findViewById(R.id.btPDreieck);
        btPViereck = findViewById(R.id.btPViereck);
        btPFuenfeck = findViewById(R.id.btPFuenfeck);

        btZurueckPA.setOnClickListener(View -> clickedZPA());
        btPDreieck.setOnClickListener(View -> clickedPD());
        btPViereck.setOnClickListener(View -> clickedPV());
        btPFuenfeck.setOnClickListener(View -> clickedPF());
    }

    private void clickedPF() {
        Intent iPF = new Intent(this,PyramideFuenfeckAuswahl.class);
        startActivity(iPF);
    }

    private void clickedPV() {
        Intent iPV = new Intent(this, PyramideViereckAuswahl.class);
        startActivity(iPV);
    }

    private void clickedPD() {
        Intent iPD = new Intent(this, PyramideDreieckAuswahl.class);
        startActivity(iPD);
    }

    private void clickedZPA() {
        Intent iZPA = new Intent(this, DreiDAuswahl.class);
        startActivity(iZPA);
    }
}