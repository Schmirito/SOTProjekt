package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class PyramideDreieckVolumen extends AppCompatActivity {

    Button btZurueckPDV;
    Button btPDVB;
    EditText etPDVa;
    EditText etPDVd;
    EditText etPDVh;
    TextView tvPDVe;
    TextView tvPDVeG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pyramide_dreieck_volumen);

        btZurueckPDV = findViewById(R.id.btZurueckPDV);
        btPDVB = findViewById(R.id.btPDVB);
        etPDVa = findViewById(R.id.etPDVa);
        etPDVd = findViewById(R.id.etPDVd);
        etPDVh = findViewById(R.id.etPDVh);
        tvPDVe = findViewById(R.id.tvPDVe);
        tvPDVeG = findViewById(R.id.tvPDVeG);

        btZurueckPDV.setOnClickListener(View -> clickedZPDV());
        btPDVB.setOnClickListener(View -> clickedPDVB());
    }

    private void clickedPDVB() {
        String pdvastr = etPDVa.getText().toString();
        String pdvdstr = etPDVd.getText().toString();
        String pdvhstr = etPDVh.getText().toString();

        if (pdvastr.length()==0||pdvhstr.length()==0||pdvdstr.length()==0){
            tvPDVe.setText("Bitte alle geforderten Werte eintragen");
        }
        else{
            double pdva = Double.parseDouble(pdvastr);
            double pdvd = Double.parseDouble(pdvdstr);
            double pdvh = Double.parseDouble(pdvhstr);
            double pdve = 0.33335 * (0.5 * pdva * pdvd) * pdvh;

            tvPDVe.setText("Volumen: " + pdve + " cm³");

            double pdveg = pdve * 100;
            pdveg = pdveg +0.5;
            pdveg = (int) pdveg;
            pdveg = (double) pdveg / 100;
            tvPDVeG.setText("Ergebnis gerundet :"+ pdveg + " cm³");
        }

    }

    private void clickedZPDV() {
        Intent iZPDV = new Intent(this, PyramideDreieckAuswahl.class);
        startActivity(iZPDV);
    }
}