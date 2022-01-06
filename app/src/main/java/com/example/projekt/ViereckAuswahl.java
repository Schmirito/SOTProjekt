package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ViereckAuswahl extends AppCompatActivity {

    Button btZurueckVA;
    Button btVU;
    Button btVFI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viereck_auswahl);

        btZurueckVA = findViewById(R.id.btZurueckVA);
        btVU = findViewById(R.id.btVU);
        btVFI = findViewById(R.id.btVFI);

        btZurueckVA.setOnClickListener(View -> clickedZVA());
        btVU.setOnClickListener(View -> clickedVU());
    }

    private void clickedVU() {
        Intent iVU = new Intent(this, )
    }

    private void clickedZVA() {
        Intent iZVA = new Intent(this,ZweiDAuswahl.class);
        startActivity(iZVA);
    }
}