package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.io.DataOutput;

public class PrismenDreieckOberflaeche extends AppCompatActivity {

    Button btZurueckPriDO;
    Button btPriDOB;
    EditText etPriDOa;
    EditText etPriDOb;
    EditText etPriDOc;
    EditText etPriDOha;
    EditText etPriDOh;
    TextView tvPriDOe;
    TextView tvPriDOeG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prismen_dreieck_oberflaeche);

        btZurueckPriDO = findViewById(R.id.btZurueckPriDO);
        btPriDOB = findViewById(R.id.btPriDOB);
        etPriDOa = findViewById(R.id.etPriDOa);
        etPriDOb = findViewById(R.id.etPriDOb);
        etPriDOc = findViewById(R.id.etPriDOc);
        etPriDOh = findViewById(R.id.etPriDOh);
        etPriDOha = findViewById(R.id.etPriDOha);
        tvPriDOe = findViewById(R.id.tvPriDOe);
        tvPriDOeG = findViewById(R.id.tvPriDOeG);

        btZurueckPriDO.setOnClickListener(View -> clickedZPriDO());
        btPriDOB.setOnClickListener(View -> clickedPriDOB());
    }

    private void clickedPriDOB() {
        String pridoastr = etPriDOa.getText().toString();
        String pridobstr = etPriDOb.getText().toString();
        String pridocstr = etPriDOc.getText().toString();
        String pridohstr = etPriDOh.getText().toString();
        String pridohastr = etPriDOha.getText().toString();

        if (pridoastr.length()==0||pridobstr.length()==0||pridocstr.length()==0||pridohstr.length()==0||pridohastr.length()==0){
            tvPriDOe.setText("Bitte alle geforderten Werte angeben!");
        }
        else{
            double pridoa = Double.parseDouble(pridoastr);
            double pridob = Double.parseDouble(pridobstr);
            double pridoc = Double.parseDouble(pridocstr);
            double pridoh = Double.parseDouble(pridohstr);
            double pridoha = Double.parseDouble(pridohastr);
            double pridoe = 2 * (0.5 * pridoa * pridoha) + (pridoa + pridob + pridoc) * pridoh;

            tvPriDOe.setText("Oberflächeninhalt: " + pridoe + "cm²");


            double pridoeg = pridoe * 100;
            pridoeg = pridoeg +0.5;
            pridoeg = (int) pridoeg;
            pridoeg = (double) pridoeg / 100;
            tvPriDOeG.setText("Ergebnis gerundet: "+ pridoeg + " cm²");
        }
    }

    private void clickedZPriDO() {
        Intent iZPriDO = new Intent(this,PrismenDreieckAuswahl.class);
        startActivity(iZPriDO);
    }
}