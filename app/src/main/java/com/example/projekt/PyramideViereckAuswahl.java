package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.io.BufferedReader;

public class PyramideViereckAuswahl extends AppCompatActivity {

    Button btZurueckPVA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pyramide_viereck_auswahl);

        btZurueckPVA = findViewById(R.id.btZurueckPVA);

        btZurueckPVA.setOnClickListener(View -> clickedZPVA());

    }

    private void clickedZPVA() {
        Intent iZPVA = new Intent(this, PyramideAuswahl.class);
        startActivity(iZPVA);
    }
}