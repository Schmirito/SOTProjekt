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
            double pdve = 0.33 * (0.5 * pdva * pdvd) * pdvh;

            tvPDVe.setText("Volumen: " + pdve + "cm³");
        }

    }

    private void clickedZPDV() {
        Intent iZPDV = new Intent(this, PyramideDreieckAuswahl.class);
        startActivity(iZPDV);
    }
}