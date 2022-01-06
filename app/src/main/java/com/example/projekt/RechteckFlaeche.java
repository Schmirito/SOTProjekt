package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class RechteckFlaeche extends AppCompatActivity {

    Button btZurueckRFI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rechteck_flaeche);

        btZurueckRFI = findViewById(R.id.btZurueckRFI);

        btZurueckRFI.setOnClickListener(View -> clickedZRFI());

    }

    private void clickedZRFI() {
        Intent iZRFI =  new Intent(this, RechteckAuswahl.class);
        startActivity(iZRFI);
    }
}