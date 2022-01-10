package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class TrapezUmfang extends AppCompatActivity {

    Button btZurueckTU;
    Button btTUB;
    EditText etTUa;
    EditText etTUb;
    EditText etTUc;
    EditText etTUd;
    TextView tvTUe;
    TextView tvTUeG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapez_umfang);

        btZurueckTU = findViewById(R.id.btZurueckTU);
        btTUB = findViewById(R.id.btTUB);
        etTUa = findViewById(R.id.etTUa);
        etTUb = findViewById(R.id.etTUb);
        etTUc = findViewById(R.id.etTUc);
        etTUd = findViewById(R.id.etTUd);
        tvTUe = findViewById(R.id.tvTUe);
        tvTUeG = findViewById(R.id.tvTUeG);

        btZurueckTU.setOnClickListener(View -> clickedZTU());
        btTUB.setOnClickListener(View -> clickedTUB());

    }

    private void clickedTUB() {
        String tuastr = etTUa.getText().toString();
        String tubstr = etTUb.getText().toString();
        String tucstr = etTUc.getText().toString();
        String tudstr = etTUd.getText().toString();

        if (tuastr.length()==0||tubstr.length()==0||tucstr.length()==0||tudstr.length()==0){
            tvTUe.setText("Bitte alle geforderten Werte eintragen!");
        }
        else{
            double tua = Double.parseDouble(tuastr);
            double tub = Double.parseDouble(tubstr);
            double tuc = Double.parseDouble(tucstr);
            double tud = Double.parseDouble(tudstr);
            double tue = tua + tub + tuc + tud;
            tvTUe.setText("Umfang: " + tue + " cm");

            double tueg = tue * 100;
            tueg = tueg +0.5;
            tueg = (int) tueg;
            tueg = (double) tueg / 100;
            tvTUeG.setText("Ergebnis gerundet: "+ tueg + " cm");
        }

    }

    private void clickedZTU() {
        Intent iZTU = new Intent(this, TrapezAuswahl.class);
        startActivity(iZTU);
    }
}