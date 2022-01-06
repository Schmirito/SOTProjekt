package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class RechteckUmfang extends AppCompatActivity {

    Button btZurueckRU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rechteck_umfang);

        btZurueckRU = findViewById(R.id.btZurueckRU);

        btZurueckRU.setOnClickListener(View -> clickedZRU());
    }

    private void clickedZRU() {
        Intent iZRU = new Intent(this, RechteckAuswahl.class);
        startActivity(iZRU);
    }
}