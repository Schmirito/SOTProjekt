package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class KreisUmfang extends AppCompatActivity {
    Button btZurueckKU;
    EditText etKUD;
    Button btKUB;
    TextView tvKUE;
    double pi = Math.PI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kreis_umfang);
        btZurueckKU = findViewById(R.id.btZurueckKU);
        btKUB = findViewById(R.id.btKUB);
        etKUD = findViewById(R.id.etKUD);
        tvKUE = findViewById(R.id.tvKUE);

        btZurueckKU.setOnClickListener(view -> clickedZKU());
        btKUB.setOnClickListener(view -> clickedKUB());
    }

    private void clickedKUB() {
        String kudstr = etKUD.getText().toString();

        if (kudstr.length()==0){
            tvKUE.setText("Bitte alle geforderten Werte eintragen!");

        }
        else {
            double kud = Double.parseDouble(kudstr);
            double kue = kud*pi;
            tvKUE.setText("Umfang: " + kue + " cm");
        }
    }

    private void clickedZKU() {
        Intent iZKU = new Intent(this, KreisAuswahl.class);
        startActivity(iZKU);
    }
}