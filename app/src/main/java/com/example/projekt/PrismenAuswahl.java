package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class PrismenAuswahl extends AppCompatActivity {

    Button btZurueckPriA;
    Button btPriDreieck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prismen_auswahl);

        btZurueckPriA = findViewById(R.id.btZurueckPriA);
        btPriDreieck = findViewById(R.id,btPriDreieck);

        btZurueckPriA.setOnClickListener(View -> clickedZPriA());
        btPriDreieck.setOnClickListener(View -> clickedPriD());
    }

    private void clickedPriD() {
        Intent iPriD = new Intent(this, PrismenDreieckAuswahl.class);
        startActivity(iPriD);
    }

    private void clickedZPriA() {
        Intent iZPriA = new Intent(this,DreiDAuswahl.class);
        startActivity(iZPriA);
    }
}