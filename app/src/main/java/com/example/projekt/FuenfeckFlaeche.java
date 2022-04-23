package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class FuenfeckFlaeche extends AppCompatActivity {

    Button btZurueckFF;
    Button btFB;
    EditText etFa;
    EditText etFh;
    TextView tvFe;
    TextView tvFeG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fuenfeck_flaeche);

        btZurueckFF = findViewById(R.id.btZurueckFF);
        btFB = findViewById(R.id.btFB);
        etFa = findViewById(R.id.etFFa);
        etFh = findViewById(R.id.etFFh);
        tvFe = findViewById(R.id.tvFFe);
        tvFeG = findViewById(R.id.tvFFeG);

        btZurueckFF.setOnClickListener(View -> clickedZFF());
        btFB.setOnClickListener(View -> clickedFB());
    }

    private void clickedFB() {
        String fastr = etFa.getText().toString();
        String fhstr = etFh.getText().toString();

        if (fastr.length()==0||fhstr.length()==0){
            tvFe.setText("Bitte alle geforderten Werte eintragen!");
            tvFeG.setText(" ");
        }
        else{
            double fa = Double.parseDouble(fastr);
            double fh = Double.parseDouble(fhstr);
            double ffe = 5 * (0.5 * fa * fh);

            tvFe.setText("Flächeninhalt: " + ffe + " cm²");

            double ffeg = ffe * 100;
            ffeg = ffeg +0.5;
            ffeg = (int) ffeg;
            ffeg = (double) ffeg / 100;
            tvFeG.setText("Ergebnis gerundet: "+ ffeg + " cm²");
        }
    }

    private void clickedZFF() {
        Intent iZFF = new Intent(this,FuenfeckAuswahl.class);
        startActivity(iZFF);
    }
}