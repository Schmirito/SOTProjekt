package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class PyramideViereckVolumen extends AppCompatActivity {

    Button btZurueckPVV;
    Button btPVVB;
    EditText etPVVa;
    EditText etPVVh;
    TextView tvPVVe;
    TextView tvPVVeG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pyramide_viereck_volumen);

        btZurueckPVV = findViewById(R.id.btZurueckPVV);
        btPVVB = findViewById(R.id.btPVVB);
        etPVVa = findViewById(R.id.etPVVa);
        etPVVh = findViewById(R.id.etPVVh);
        tvPVVe = findViewById(R.id.tvPVVe);
        tvPVVeG = findViewById(R.id.tvPVVeG);

        btZurueckPVV.setOnClickListener(View -> clickedZPVV());
        btPVVB.setOnClickListener(View -> clickedPVVB());
    }

    private void clickedPVVB() {
        String pvvastr = etPVVa.getText().toString();
        String pvvhstr = etPVVh.getText().toString();

        if (pvvastr.length()==0||pvvhstr.length()==0){
            tvPVVe.setText("Bitte alle geforderten Werte eingeben!");
        }
        else{
            double pvva = Double.parseDouble(pvvastr);
            double pvvh = Double.parseDouble(pvvhstr);
            double pvve = 0.33335 * (pvva * pvva) * pvvh;

            tvPVVe.setText("Volumen: " + pvve + " cm³");

            double pvveg = pvve * 100;
            pvveg = pvveg +0.5;
            pvveg = (int) pvveg;
            pvveg = (double) pvveg / 100;
            tvPVVeG.setText("Ergebnis gerundet: "+ pvveg + " cm³");
        }
    }

    private void clickedZPVV() {
        Intent iZPVV = new Intent(this,PyramideViereckAuswahl.class);
        startActivity(iZPVV);
    }
}