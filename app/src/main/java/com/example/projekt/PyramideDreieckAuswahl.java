package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class PyramideDreieckAuswahl extends AppCompatActivity {

    Button btPDUmfang;
    Button btZurueckPDA;
    Button btPDOberflaeche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pyramide_dreieck_auswahl);
        
        btPDUmfang = findViewById(R.id.btPDVolumen);
        btZurueckPDA = findViewById(R.id.btZurueckPDA);
        btPDOberflaeche = findViewById(R.id.btPDOberflaeche);

        btPDUmfang.setOnClickListener(View -> clickedPDV());
        btZurueckPDA.setOnClickListener(View -> clickedZPDA());
        btPDOberflaeche.setOnClickListener(View -> clickedPDOI());
    }

    private void clickedPDOI() {
        Intent iPDOI = new Intent(this, PyramideDreieckOberflaeche.class);
        startActivity(iPDOI);
    }

    private void clickedZPDA() {
        Intent iZPDA = new Intent(this, PyramideAuswahl.class);
        startActivity(iZPDA);
    }

    private void clickedPDV() {
        Intent iPDU = new Intent(this, PyramideDreieckVolumen.class);
        startActivity(iPDU);
    }
}