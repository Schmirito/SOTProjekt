package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class PrismenFuenfeckAuswahl extends AppCompatActivity {

    Button btZurueckPriFA;
    Button btPriFVolumen;
    Button btPriFOberflaeche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prismen_fuenfeck_auswahl);

        btZurueckPriFA = findViewById(R.id.btZurueckPriFA);
        btPriFVolumen = findViewById(R.id.btPriFVolumen);
        btPriFOberflaeche = findViewById(R.id.btPriFOberflaeche);

        btZurueckPriFA.setOnClickListener(View -> clickedZPriFA());
        btPriFVolumen.setOnClickListener(View -> clickedPriFV());
        btPriFOberflaeche.setOnClickListener(View -> clickedPriFO());
    }

    private void clickedPriFO() {
        Intent iPriFO = new Intent(this,PrismenFuenfeckOberflaeche.class);
        startActivity(iPriFO);
    }

    private void clickedPriFV() {
        Intent iPriFV = new Intent(this,PrismenFuenfeckVolumen.class);
        startActivity(iPriFV);
    }

    private void clickedZPriFA() {
        Intent iZPriFA = new Intent(this,PrismenAuswahl.class);
        startActivity(iZPriFA);
    }
}