package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class PyramideAuswahl extends AppCompatActivity {

    Button btPDreieck;
    Button btZurueckPA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pyramide_auswahl);

        btZurueckPA = findViewById(R.id.btZurueckPA);
        btPDreieck = findViewById(R.id.btPDreieck);

        btZurueckPA.setOnClickListener(View -> clickedZPA());
        btPDreieck.setOnClickListener(View -> clickedPD());

    }

    private void clickedPD() {
        Intent iPD = new Intent(this, PyramideDreieckAuswahl.class);
        startActivity(iPD);
    }

    private void clickedZPA() {
        Intent iZPA = new Intent(this, DreiDAuswahl.class);
        startActivity(iZPA);
    }
}