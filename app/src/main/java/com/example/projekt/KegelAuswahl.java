package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class KegelAuswahl extends AppCompatActivity {

    Button btZurueckKegel;
    Button btKegelV;
    Button btKegelO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kegel_auswahl);

        btZurueckKegel = findViewById(R.id.btZurueckKegel);
        btKegelV = findViewById(R.id.btKegelV);
        btKegelO = findViewById(R.id.btKegelO);

        btZurueckKegel.setOnClickListener(View -> clickedZKegel());
        btKegelV.setOnClickListener(View -> clickedKegelV());
        btKegelO.setOnClickListener(View -> clickedKegelO());
    }

    private void clickedKegelO() {
        Intent iKegelO = new Intent(this,KegelOberflaeche.class);
        startActivity(iKegelO);
    }

    private void clickedKegelV() {
        Intent iKegelV = new Intent(this,KegelVolumen.class);
        startActivity(iKegelV);
    }

    private void clickedZKegel() {
        Intent iZKegel = new Intent(this,DreiDAuswahl.class);
        startActivity(iZKegel);
    }
}