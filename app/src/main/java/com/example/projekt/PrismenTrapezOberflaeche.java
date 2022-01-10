package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class PrismenTrapezOberflaeche extends AppCompatActivity {

    Button btZurueckPriTO;
    Button btPriTOB;
    EditText etPriTOa;
    EditText etPriTOb;
    EditText etPriTOc;
    EditText etPriTOd;
    EditText etPriTOh;
    EditText etPriTOhk;
    TextView tvPriTOe;
    TextView tvPriTOeG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prismen_trapez_oberflaeche);

        btZurueckPriTO = findViewById(R.id.btZurueckPriTO);
        btPriTOB = findViewById(R.id.btPriTOB);
        etPriTOa = findViewById(R.id.etPriTOa);
        etPriTOb = findViewById(R.id.etPriTOb);
        etPriTOc = findViewById(R.id.etPriTOc);
        etPriTOd = findViewById(R.id.etPriTOd);
        etPriTOh = findViewById(R.id.etPriTOh);
        etPriTOhk = findViewById(R.id.etPriTOhk);
        tvPriTOe = findViewById(R.id.tvPriTOe);
        tvPriTOeG = findViewById(R.id.tvPriTOeG);

        btZurueckPriTO.setOnClickListener(View -> clickedZPriTO());
        btPriTOB.setOnClickListener(View -> clickedPriTOB());
    }

    private void clickedPriTOB() {
        String priTOastr = etPriTOa.getText().toString();
        String priTObstr = etPriTOb.getText().toString();
        String priTOcstr = etPriTOc.getText().toString();
        String priTOdstr = etPriTOd.getText().toString();
        String priTOhstr = etPriTOh.getText().toString();
        String priTOhkstr = etPriTOhk.getText().toString();

        if (priTOastr.length()==0||priTObstr.length()==0||priTOcstr.length()==0||priTOdstr.length()==0||priTOhstr.length()==0||priTOhkstr.length()==0){
            tvPriTOe.setText("Bitte alle geforderten Werte angeben!");
        }
        else{
            double pritoa = Double.parseDouble(priTOastr);
            double pritob = Double.parseDouble(priTObstr);
            double pritoc = Double.parseDouble(priTOcstr);
            double pritod = Double.parseDouble(priTOdstr);
            double pritoh = Double.parseDouble(priTOhstr);
            double pritohk = Double.parseDouble(priTOhkstr);
            double pritoe = 0.5 * (pritoa + pritoc) * pritoh + (pritoa + pritob + pritoc + pritod) * pritohk;

            tvPriTOe.setText("Oberflächeninhalt: " + pritoe + " cm²");
            double pritoeg = pritoe * 100;
            pritoeg = pritoeg +0.5;
            pritoeg = (int) pritoeg;
            pritoeg = (double) pritoeg / 100;
            tvPriTOeG.setText("Ergebnis gerundet :"+ pritoeg + " cm²");
        }
    }

    private void clickedZPriTO() {
        Intent iZPriTO = new Intent(this,PrismenTrapezAuswahl.class);
        startActivity(iZPriTO);
    }
}