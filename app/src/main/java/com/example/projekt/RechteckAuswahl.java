package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class RechteckAuswahl extends AppCompatActivity {

    Button btZurueckRA;
    Button btRU;
    Button btRFI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_Rechteck_auswahl);

        btZurueckRA = findViewById(R.id.btZurueckRA);
        btRU = findViewById(R.id.btRU);
        btRFI = findViewById(R.id.btRFI);

        btZurueckRA.setOnClickListener(View -> clickedZRA());
        btRU.setOnClickListener(View -> clickedRU());
        btRFI.setOnClickListener(View -> clickedRFI());
    }

    private void clickedRFI() {
        Intent iRFI = new Intent(this, RechteckFlaeche.class);
        startActivity(iRFI);
    }

    private void clickedRU() {
        Intent iRU = new Intent(this, RechteckUmfang.class);
        startActivity(iRU);
    }

    private void clickedZRA() {
        Intent iZRA = new Intent(this,ZweiDAuswahl.class);
        startActivity(iZRA);
    }
}