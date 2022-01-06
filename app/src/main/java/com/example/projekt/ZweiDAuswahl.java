package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ZweiDAuswahl extends AppCompatActivity {

    Button btDreieck;
    Button btZurueck;
    Button btViereck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zwei_d_auswahl);
        
        btDreieck = findViewById(R.id.btDreieck);
        btZurueck = findViewById(R.id.btZurueck2DA);
        btViereck = findViewById(R.id.btViereck);

        btDreieck.setOnClickListener(View -> clickedDreieck());
        btZurueck.setOnClickListener(View -> clickedZurueck2D());
        btViereck.setOnClickListener(View -> clickedViereck());
        
    }

    private void clickedViereck() {
        Intent iViereck = new Intent(this, ViereckAuswahl.class);
        startActivity(iViereck);
    }

    private void clickedZurueck2D() {
        Intent iZ2D = new Intent(this, ErsteActivity.class);
        startActivity(iZ2D);
    }

    private void clickedDreieck() {
        Intent iDreieck = new Intent(this, DreieckAuswahl.class);
        startActivity(iDreieck);
    }
}