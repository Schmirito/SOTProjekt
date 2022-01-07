package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class PrismenDreieckAuswahl extends AppCompatActivity {

    Button btZurueckPriDA;
    Button btPriDVolumen;
    Button btPriDOberflaeche;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prismen_dreieck_auswahl);

        btZurueckPriDA = findViewById(R.id.btZurueckPriDA);
        btPriDVolumen = findViewById(R.id.btPriDVolumen);
        btPriDOberflaeche = findViewById(R.id.btPriDOberflaeche);

        btZurueckPriDA.setOnClickListener(View -> clickedZPriDA());
        btPriDVolumen.setOnClickListener(View -> clickedPriDV());
        btPriDOberflaeche.setOnClickListener(View -> clickedPriDO());
    }

    private void clickedPriDO() {
        Intent iPriDO = new Intent(this,PrismenDreieckOberflaeche.class);
        startActivity(iPriDO);
    }

    private void clickedPriDV() {
        Intent iPriDV = new Intent(this,PrismenDreieckVolumen.class);
        startActivity(iPriDV);
    }

    private void clickedZPriDA() {
        Intent iZPriDA = new Intent(this, PrismenAuswahl.class);
        startActivity(iZPriDA);
    }
}