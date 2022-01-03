package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ZweiDAuswahl extends AppCompatActivity {

    Button btDreieck;
    Button btViereck;
    Button btZurueck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zwei_d_auswahl);
        
        btDreieck = findViewById(R.id.btDreieck);
        btViereck = findViewById(R.id.btViereck);
        btZurueck = findViewById(R.id.btZurueck2DA);
        
        btDreieck.setOnClickListener(View -> clickedDreieck());
        btZurueck.setOnClickListener(View -> clickedZurueck2D());
        
        
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