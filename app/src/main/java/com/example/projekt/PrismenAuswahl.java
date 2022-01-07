package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class PrismenAuswahl extends AppCompatActivity {

    Button btZurueckPriA;
    Button btPriADreieck;
    Button btPriDOberflaeche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prismen_auswahl);

        btZurueckPriA = findViewById(R.id.btZurueckPriA);
        btPriADreieck = findViewById(R.id.btPriADreieck);
        btPriDOberflaeche = findViewById(R.id.btPriDOberflaeche);

        btZurueckPriA.setOnClickListener(View -> clickedZPriA());
        btPriADreieck.setOnClickListener(View -> clickedPriAD());

    }

    private void clickedPriAD() {
        Intent iPriAD = new Intent(this,PrismenDreieckAuswahl.class);
        startActivity(iPriAD);
    }

    private void clickedZPriA() {
        Intent iZPriA = new Intent(this,DreiDAuswahl.class);
        startActivity(iZPriA);
    }
}