package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class PyramideDreieckVolumen extends AppCompatActivity {

    Button btZurueckPDV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pyramide_dreieck_volumen);

        btZurueckPDV = findViewById(R.id.btZurueckPDV);

        btZurueckPDV.setOnClickListener(View -> clickedZPDV());
    }

    private void clickedZPDV() {
        Intent iZPDV = new Intent(this, PyramideDreieckAuswahl.class);
        startActivity(iZPDV);
    }
}