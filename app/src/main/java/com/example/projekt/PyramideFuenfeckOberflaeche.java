package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class PyramideFuenfeckOberflaeche extends AppCompatActivity {

    Button btZurueckPFO;
    Button btPFOB;
    EditText etPFOa;
    EditText etPFOha;
    EditText etPFOhs;
    TextView tvPFOe;
    TextView tvPFOeG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pyramide_fuenfeck_oberflaeche);

        btZurueckPFO = findViewById(R.id.btZurueckPFO);
        btPFOB = findViewById(R.id.btPFOB);
        etPFOa = findViewById(R.id.etPFOa);
        etPFOha = findViewById(R.id.etPFOha);
        etPFOhs = findViewById(R.id.etPFOhs);
        tvPFOe = findViewById(R.id.tvPFOe);
        tvPFOeG = findViewById(R.id.tvPFOeG);

        btZurueckPFO.setOnClickListener(View -> clickedZPFO());
        btPFOB.setOnClickListener(View -> clickedPFOB());
    }

    private void clickedPFOB() {
        String pfoastr = etPFOa.getText().toString();
        String pfohastr = etPFOha.getText().toString();
        String pfohsstr = etPFOhs.getText().toString();

        if (pfoastr.length()==0||pfohastr.length()==0||pfohsstr.length()==0){
            tvPFOe.setText("Bitte alle geforderten Werte eingeben!");
        }
        else{
            double pfoa = Double.parseDouble(pfoastr);
            double pfoha = Double.parseDouble(pfohastr);
            double pfohs = Double.parseDouble(pfohsstr);
            double pfoe = 5 * (0.5 * pfoa * pfoha) + 5 *(0.5 * pfoa * pfohs);

            tvPFOe.setText("Oberflächeninhalt: " + pfoe + " cm²");

            double pfoeg = pfoe * 100;
            pfoeg = pfoeg +0.5;
            pfoeg = (int) pfoeg;
            pfoeg = (double) pfoeg / 100;
            tvPFOeG.setText("Ergebnis gerundet: "+ pfoeg + " cm²");


        }
    }

    private void clickedZPFO() {
        Intent iZPFO = new Intent(this,PyramideFuenfeckAuswahl.class);
        startActivity(iZPFO);
    }
}