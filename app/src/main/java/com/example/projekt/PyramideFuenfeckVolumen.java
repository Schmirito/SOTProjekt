package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class PyramideFuenfeckVolumen extends AppCompatActivity {

    Button btZurueckPFV;
    Button btPFVB;
    EditText etPFVa;
    EditText etPFVha;
    EditText etPFVh;
    TextView tvPFVe;
    TextView tvPFVeG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pyramide_fuenfeck_volumen);

        btZurueckPFV = findViewById(R.id.btZurueckPFV);
        btPFVB = findViewById(R.id.btPFVB);
        etPFVa = findViewById(R.id.etPFVa);
        etPFVha = findViewById(R.id.etPFVha);
        etPFVh = findViewById(R.id.etPFVh);
        tvPFVe = findViewById(R.id.tvPFVe);
        tvPFVe = findViewById(R.id.tvPFVeG);

        btZurueckPFV.setOnClickListener(Viw -> clickedZPFV());
        btPFVB.setOnClickListener(View -> clickedPFVB());
    }

    private void clickedPFVB() {
        String pfvastr = etPFVa.getText().toString();
        String pfvhastr = etPFVha.getText().toString();
        String pfvhstr = etPFVh.getText().toString();

        if (pfvastr.length()==0||pfvhastr.length()==0||pfvhstr.length()==0){
            tvPFVe.setText("Bitte alle geforderten Werte eintragen!");
        }
        else{
            double pfva = Double.parseDouble(pfvastr);
            double pfvh = Double.parseDouble(pfvhstr);
            double pfvha = Double.parseDouble(pfvhastr);
            double pfve = 0.33335 * 5 *(0.5 * pfva * pfvha) * pfvh;

            tvPFVe.setText("Volumen: " + pfve + " cm³");

            double pfveg = pfve * 100;
            pfveg = pfveg +0.5;
            pfveg = (int) pfveg;
            pfveg = (double) pfveg / 100;
            tvPFVeG.setText("Ergebnis gerundet: "+ pfveg + " cm³");
        }
    }

    private void clickedZPFV() {
        Intent iZPFV = new Intent(this,PyramideFuenfeckAuswahl.class);
        startActivity(iZPFV);
    }
}