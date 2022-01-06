package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ViereckUmfang extends AppCompatActivity {

    Button btZurueckVU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viereck_umfang);

        btZurueckVU = findViewById(R.id.btZurueckVU);

        btZurueckVU.setOnClickListener(View -> clickedZVU());
    }

    private void clickedZVU() {
        Intent iZVU = new Intent(this,ViereckAuswahl.class);
        startActivity(iZVU);
    }
}