package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class PyramideOberflaeche extends AppCompatActivity {

    Button btZurueckPOI;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pyramide_oberflaeche);

        btZurueckPOI = findViewById(R.id.btZurueckPOI);

        btZurueckPOI.setOnClickListener(View -> clickedZPOI());

    }

    private void clickedZPOI() {
        Intent iZPOI = new Intent(this, PyramideAuswahl.class);
        startActivity(iZPOI);
    }
}