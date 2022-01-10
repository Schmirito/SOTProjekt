package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class KugelVolumen extends AppCompatActivity {
    Button btZurueckKV;
    EditText etKVD;
    Button btKVB;
    TextView tvKVE;
    TextView tvKVEG;
    double pi = Math.PI;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kugel_volumen);
        btZurueckKV = findViewById(R.id.btZurueckKV);
        btKVB = findViewById(R.id.btKVB);
        etKVD = findViewById(R.id.etKVD);
        tvKVE = findViewById(R.id.tvKVE);
        tvKVEG = findViewById(R.id.tvKVEG);

        btZurueckKV.setOnClickListener(view -> clickedZKV());
        btKVB.setOnClickListener(view -> clickedKVB());
    }

    private void clickedZKV() {
        Intent iZKV = new Intent(this, KugelAuswahl.class);
        startActivity(iZKV);
    }

    private void clickedKVB() {
        String kvdstr = etKVD.getText().toString();

        if (kvdstr.length() == 0) {
            tvKVE.setText("Bitte alle geforderten Werte eintragen!");

        }
        else {
            double kvd = Double.parseDouble(kvdstr);
            double kve =pi * (kvd * kvd) * 0.33333333333333333333333333333333333333333;
            tvKVE.setText("Volumen: " + kve + " cm³");

            double kveg = kve * 100;
            kveg = kveg +0.5;
            kveg = (int) kveg;
            kveg = (double) kveg / 100;
            tvKVEG.setText("Ergebnis gerundet: "+ kveg + " cm³");
        }
    }

}