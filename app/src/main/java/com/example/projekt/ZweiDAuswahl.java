package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ZweiDAuswahl extends AppCompatActivity {

    Button btZurueck;
    Button btRechteck;
    Button btTrapez;
    Button btParallelogramm;
    Button btDreieck;
    Button btFuenfeck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zwei_d_auswahl);
        
        btZurueck = findViewById(R.id.btZurueck2DA);
        btRechteck = findViewById(R.id.btRechteck);
        btTrapez = findViewById(R.id.btTrapez);
        btParallelogramm = findViewById(R.id.btParallelogramm);
        btDreieck = findViewById(R.id.btDreieck);
        btFuenfeck = findViewById(R.id.btFuenfeck);

        btZurueck.setOnClickListener(View -> clickedZurueck2D());
        btRechteck.setOnClickListener(View -> clickedRechteck());
        btTrapez.setOnClickListener(View -> clickedTrapez());
        btParallelogramm.setOnClickListener(View -> clickedParallelogramm());
        btDreieck.setOnClickListener(View -> clickedDreieck());
        btFuenfeck.setOnClickListener(View -> clickedFuenfeck());
    }

    private void clickedFuenfeck() {
        Intent iFuenfeck = new Intent(this, FuenfeckAuswahl.class);
        startActivity(iFuenfeck);
    }

    private void clickedParallelogramm() {
        Intent iParallelogramm = new Intent(this, ParallelogrammAuswahl.class);
        startActivity(iParallelogramm);
    }

    private void clickedTrapez() {
        Intent iTrapez = new Intent(this,TrapezAuswahl.class);
        startActivity(iTrapez);
    }

    private void clickedRechteck() {
        Intent iRechteck = new Intent(this, RechteckAuswahl.class);
        startActivity(iRechteck);
    }

    private void clickedDreieck() {
        Intent iDreieck = new Intent(this, DreieckAuswahl.class);
        startActivity(iDreieck);
    }

    private void clickedZurueck2D() {
        Intent iZ2D = new Intent(this, ErsteActivity.class);
        startActivity(iZ2D);
    }
}