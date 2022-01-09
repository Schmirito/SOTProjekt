package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class KugelOberflaeche extends AppCompatActivity {

    Button btZurueckKO;
    Button btKOB;
    EditText etKOr;
    TextView tvKOe;

    double pi = Math.PI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kugel_oberflaeche);

        btZurueckKO = findViewById(R.id.btZurueckKO);
        btKOB = findViewById(R.id.btKOB);
        etKOr = findViewById(R.id.etKOr);
        tvKOe = findViewById(R.id.tvKOe);

        btZurueckKO.setOnClickListener(View -> clickedZKO());
        btKOB.setOnClickListener(View -> clickedKOB());
    }

    private void clickedKOB() {
        String korstr = etKOr.getText().toString();

        if (korstr.length()==0) {
            tvKOe.setText("Bitte einen der geforderten Werte eintragen!");
        }
        else{
            double kor = Double.parseDouble(korstr);
            double koe = 4 * pi * (kor * kor);

            tvKOe.setText("Oberflächeninhalt: " + koe + "cm²");
        }

    }

    private void clickedZKO() {
        Intent iZKO = new Intent(this,KugelAuswahl.class);
        startActivity(iZKO);
    }
}