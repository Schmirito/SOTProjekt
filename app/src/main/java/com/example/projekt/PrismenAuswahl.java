package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class PrismenAuswahl extends AppCompatActivity {

    Button btZurueckPriA;
    Button btPriDreieck;
    Button btPriFuenfeck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prismen_auswahl);

        btZurueckPriA = findViewById(R.id.btZurueckPriA);
        btPriDreieck = findViewById(R.id.btPriDreieck);
        btPriFuenfeck = findViewById(R.id.btPriFuenfeck);

        btZurueckPriA.setOnClickListener(View -> clickedZPriA());
        btPriDreieck.setOnClickListener(View -> clickedPriD());
        btPriFuenfeck.setOnClickListener(View -> clickedPriF());
    }

    private void clickedPriF() {
        Intent iPriF = new Intent(this,PrismenFuenfeckAuswahl.class);
        startActivity(iPriF);
    }

    private void clickedPriD() {
        Intent iPriAD = new Intent(this,PrismenDreieckAuswahl.class);
        startActivity(iPriAD);
    }

    private void clickedZPriA() {
        Intent iZPriA = new Intent(this,DreiDAuswahl.class);
        startActivity(iZPriA);
    }
}