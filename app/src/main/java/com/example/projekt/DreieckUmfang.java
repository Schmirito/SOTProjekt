package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class DreieckUmfang extends AppCompatActivity {


    Button btZurueckDU;
    EditText etDUa;
    EditText etDUb;
    EditText etDUc;
    Button btDUB;
    TextView tvDUE;
    TextView tvDUEG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dreieck_umfang);

        btZurueckDU = findViewById(R.id.btZurueckDU);

        btZurueckDU.setOnClickListener(View -> clickedZDU());

        btDUB = findViewById(R.id.btDUB);

        btDUB.setOnClickListener(View -> clickedDUB());

        etDUa = findViewById(R.id.etDUa);
        etDUb = findViewById(R.id.etDUb);
        etDUc = findViewById(R.id.etDUc);
        tvDUE = findViewById(R.id.tvDUE);
        tvDUEG = findViewById(R.id.tvDUEG);

    }

    private void clickedDUB() {


        String duastr = etDUa.getText().toString();
        String dubstr = etDUb.getText().toString();
        String ducstr = etDUc.getText().toString();

        if (duastr.length()==0||dubstr.length()==0||ducstr.length()==0){
            tvDUE.setText("Bitte alle geforderten Werte eintragen!");

        }
        else {
            double dua = Double.parseDouble(duastr);
            double dub = Double.parseDouble(dubstr);
            double duc = Double.parseDouble(ducstr);
            double due = dua + dub + duc;
            tvDUE.setText("Umfang: " + due + " cm");
            double dueg = due * 100;
            dueg = dueg +0.5;
            dueg = (int) dueg;
            dueg = (double) dueg / 100;
            tvDUEG.setText("Ergebnis gerundet: "+ dueg + " cm");
        }




    }

    private void clickedZDU() {
        Intent iZDU = new Intent(this, DreieckAuswahl.class);
        startActivity(iZDU);
    }
}