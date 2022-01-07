package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class PrismenTrapezAuswahl extends AppCompatActivity {

    Button btZurueckPriTA;
    Button btPriTVolumen;
    Button btPriTOberflaeche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prismen_trapez_auswahl);

        btZurueckPriTA = findViewById(R.id.btZurueckPriTA);
        btPriTVolumen = findViewById(R.id.btPriTVolumen);
        btPriTOberflaeche = findViewById(R.id.btPriTOberflaeche);

        btZurueckPriTA.setOnClickListener(View -> clickedZPriTA());
        btPriTVolumen.setOnClickListener(View -> clickedPriTV());
        btPriTOberflaeche.setOnClickListener(View -> clickedPriTO());
    }

    private void clickedPriTO() {
        Intent iPriTO = new Intent(this,PrismenTrapezOberflaeche.class);
        startActivity(iPriTO);
    }

    private void clickedPriTV() {
        Intent iPriTV = new Intent(this,PrismenTrapezVolumen.class);
        startActivity(iPriTV);
    }

    private void clickedZPriTA() {
        Intent iZPriTA = new Intent(this,PrismenAuswahl.class);
        startActivity(iZPriTA);
    }
}