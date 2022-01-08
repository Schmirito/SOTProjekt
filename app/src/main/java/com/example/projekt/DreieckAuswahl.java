package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class DreieckAuswahl extends AppCompatActivity {

    Button btDFI;
    Button btZurueckDA;
    Button btDU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dreieck_auswahl);

        btDFI = findViewById(R.id.btDFI);
        btZurueckDA = findViewById(R.id.btZurueckDA);
        btDU = findViewById(R.id.btDU);

        btDFI.setOnClickListener(View -> clickedDFI());
        btZurueckDA.setOnClickListener(View -> clickedZurueckDA());
        btDU.setOnClickListener(View -> clickedDU());

    }

    private void clickedDU() {
        Intent iDU = new Intent(this, DreieckUmfang.class);
        startActivity(iDU);
    }

    private void clickedZurueckDA() {
        Intent iZDA = new Intent(this, VieleckAuswahl.class);
        startActivity(iZDA);
    }

    private void clickedDFI() {
        Intent iDU = new Intent(this, DreieckFlaeche.class);
        startActivity(iDU);
    }
}