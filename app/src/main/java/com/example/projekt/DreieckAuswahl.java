package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class DreieckAuswahl extends AppCompatActivity {

    Button btUmfang;
    Button btZurueckDA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dreieck_auswahl);

        btUmfang = findViewById(R.id.btDFlaecheninhalt);
        btZurueckDA = findViewById(R.id.btZurueckDA);

        btUmfang.setOnClickListener(View -> clickedUmfang());
        btZurueckDA.setOnClickListener(View -> clickedZurueckDA());


    }

    private void clickedZurueckDA() {
        Intent iZDA = new Intent(this, ZweiDAuswahl.class);
        startActivity(iZDA);
    }

    private void clickedUmfang() {
        Intent iDU = new Intent(this, DreieckFlaeche.class);
        startActivity(iDU);
    }
}