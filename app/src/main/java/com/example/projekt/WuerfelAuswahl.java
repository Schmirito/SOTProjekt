package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class WuerfelAuswahl extends AppCompatActivity {

    Button btZurueckWA;
    Button btWVolumen;
    Button btWOberlaeche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wuerfel_auswahl);

        btZurueckWA = findViewById(R.id.btZurueckWA);
        btWVolumen = findViewById(R.id.btWVolumen);
        btWOberlaeche = findViewById(R.id.btWOberflaeche);

        btZurueckWA.setOnClickListener(View -> clickedZWA());
        btWVolumen.setOnClickListener(View -> clickedWV());
        btWOberlaeche.setOnClickListener(View -> clickedWO());
    }

    private void clickedWO() {
        Intent iWO = new Intent(this,WuerfelOberflaeche.class);
        startActivity(iWO);
    }

    private void clickedWV() {
        Intent iWV = new Intent(this,WuerfelVolumen.class);
        startActivity(iWV);
    }

    private void clickedZWA() {
        Intent iZWA = new Intent(this,DreiDAuswahl.class);
        startActivity(iZWA);
    }
}