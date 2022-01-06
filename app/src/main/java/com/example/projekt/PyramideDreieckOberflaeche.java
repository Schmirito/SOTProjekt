package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class PyramideDreieckOberflaeche extends AppCompatActivity {

    Button btZurueckPDOI;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pyramide_dreieck_oberflaeche);

        btZurueckPDOI = findViewById(R.id.btZurueckPOI);

        btZurueckPDOI.setOnClickListener(View -> clickedZPDOI());

    }

    private void clickedZPDOI() {
        Intent iZPDOI = new Intent(this, PyramideDreieckAuswahl.class);
        startActivity(iZPDOI);
    }
}