package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class KugelOberflaeche extends AppCompatActivity {
    Button btZurueckKO;
    EditText etKOD;
    Button btKOB;
    TextView tvKOE;
    TextView tvKOEG;
    double pi = Math.PI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kugel_oberflaeche);

        btZurueckKO = findViewById(R.id.btZurueckKO);
        btKOB = findViewById(R.id.btKOB);
        etKOD = findViewById(R.id.etKOD);
        tvKOE = findViewById(R.id.tvKOE);
        tvKOEG = findViewById(R.id.tvKOEG);

        btZurueckKO.setOnClickListener(view -> clickedZKO());
        btKOB.setOnClickListener(view -> clickedKOB());
    }

    private void clickedKOB() {
        String kudstr = etKOD.getText().toString();

        if (kudstr.length()==0){
            tvKOE.setText("Bitte alle geforderten Werte eintragen!");
            tvKOEG.setText(" ");

        }
        else {
            double kod = Double.parseDouble(kudstr);
            double koe = kod*kod*pi;
            tvKOE.setText("Oberflächeninhalt: " + koe + " cm²");

            double koeg = koe * 100;
            koeg = koeg +0.5;
            koeg = (int) koeg;
            koeg = (double) koeg / 100;
            tvKOEG.setText("Ergebnis gerundet: "+ koeg + " cm²");
        }
    }

    private void clickedZKO() {
        Intent iZKO = new Intent(this, KugelAuswahl.class);
        startActivity(iZKO);
    }
}