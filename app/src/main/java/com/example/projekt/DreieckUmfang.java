package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class DreieckUmfang extends AppCompatActivity {

    Button btZurueckDU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dreieck_umfang);

        btZurueckDU = findViewById(R.id.btZurueckDU);

        btZurueckDU.setOnClickListener(View -> clickedZDU());

    }

    private void clickedZDU() {
        Intent iZDU = new Intent(this, DreieckAuswahl.class);
        startActivity(iZDU);
    }
}