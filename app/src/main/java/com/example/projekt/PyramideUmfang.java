package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class PyramideUmfang extends AppCompatActivity {

    Button btZurueckPU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pyramide_umfang);

        btZurueckPU = findViewById(R.id.btZurueckPU);

        btZurueckPU.setOnClickListener(View -> clickedZPU());
    }

    private void clickedZPU() {
        Intent iZPU = new Intent(this, PyramideAuswahl.class);
        startActivity(iZPU);
    }
}