package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class FuenfeckAuswahl extends AppCompatActivity {

    Button btZurueckFuenfeck;
    Button btFU;
    Button btFF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fuenfeck_auswahl);

        btZurueckFuenfeck = findViewById(R.id.btZurueckFuenfeck);
        btFU = findViewById(R.id.btFU);
        btFF = findViewById(R.id.btFF);

        btZurueckFuenfeck.setOnClickListener(View -> clickedZF());
        btFU.setOnClickListener(View -> clickedFU());
        btFF.setOnClickListener(View -> clickedFF());
    }

    private void clickedFF() {
        Intent iFF = new Intent(this, FuenfeckFlaeche.class);
        startActivity(iFF);
    }

    private void clickedFU() {
        Intent iFU = new Intent(this,FuenfeckUmfang.class);
        startActivity(iFU);
    }

    private void clickedZF() {
        Intent iZF = new Intent(this,VieleckAuswahl.class);
        startActivity(iZF);
    }
}