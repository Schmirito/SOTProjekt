package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class PyramideAuswahl extends AppCompatActivity {

    Button btPUmfang;
    Button btZurueckPA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pyramide_auswahl);
        
        btPUmfang = findViewById(R.id.btPVolumen);
        btZurueckPA = findViewById(R.id.btZurueckPA);

        btPUmfang.setOnClickListener(View -> clickedPU());
        btZurueckPA.setOnClickListener(View -> clickedZPA());
    }

    private void clickedZPA() {
        Intent iZPA = new Intent(this, DreiDAuswahl.class);
        startActivity(iZPA);
    }

    private void clickedPU() {
        Intent iPU = new Intent(this,PyramideUmfang.class);
        startActivity(iPU);
    }
}