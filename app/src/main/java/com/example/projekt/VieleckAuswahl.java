package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class VieleckAuswahl extends AppCompatActivity {

    Button btZurueckVieleck;
    Button btDreieck;
    Button btFuenfeck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vieleck_auswahl);

        btZurueckVieleck = findViewById(R.id.btZurueckVieleck);
        btDreieck = findViewById(R.id.btDreieck);
        btFuenfeck = findViewById(R.id.btFuenfeck);

        btZurueckVieleck.setOnClickListener(View -> clickedZVieleck());
        btDreieck.setOnClickListener(View -> clickedDreieck());
        btFuenfeck.setOnClickListener(View -> clickedFuenfeck());
    }
    private void clickedFuenfeck() {
        Intent iFuenfeck = new Intent(this, FuenfeckAuswahl.class);
        startActivity(iFuenfeck);
    }

    private void clickedDreieck() {
        Intent iDreieck = new Intent(this, DreieckAuswahl.class);
        startActivity(iDreieck);
    }

    private void clickedZVieleck() {
        Intent iZVieleck = new Intent(this,ZweiDAuswahl.class);
        startActivity(iZVieleck);
    }
}