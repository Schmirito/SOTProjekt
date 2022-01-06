package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class TrapezUmfang extends AppCompatActivity {

    Button btZurueckTU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapez_umfang);

        btZurueckTU = findViewById(R.id.btZurueckTU);

        btZurueckTU.setOnClickListener(View -> clickedZTU());
    }

    private void clickedZTU() {
        Intent iZTU = new Intent(this, TrapezAuswahl.class);
        startActivity(iZTU);
    }
}