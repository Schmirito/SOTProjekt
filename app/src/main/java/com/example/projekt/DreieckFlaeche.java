package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class DreieckFlaeche extends AppCompatActivity {



    Button btZurueckDFI;
    EditText etDFa;
    EditText etDFh;
    Button btDFB;
    TextView tvDFE;
    TextView tvDFEG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dreieck_flaeche);

        btZurueckDFI =findViewById(R.id.btZurueckDFI);

        btZurueckDFI.setOnClickListener(View -> clickedZurueckDU());

        btDFB = findViewById(R.id.btDFB);

        btDFB.setOnClickListener(View -> clickedDFB());

        etDFa = findViewById(R.id.etDFa);
        etDFh = findViewById(R.id.etDFh);
        tvDFE = findViewById(R.id.tvDFE);
        tvDFEG = findViewById(R.id.tvDFEG);

    }

    private void clickedDFB() {
        String dfastr = etDFa.getText().toString();
        String dfhstr = etDFh.getText().toString();

        if (dfastr.length()==0||dfhstr.length()==0){
            tvDFE.setText("Bitte alle geforderten Werte eintragen!");
            tvDFEG.setText(" ");

        }
        else {
            double dfa = Double.parseDouble(dfastr);
            double dfh = Double.parseDouble(dfhstr);
            double dfe = 0.5 * dfa * dfh;
            tvDFE.setText("Flächeninhalt: " + dfe + " cm²");
            double dfeg = dfe * 100;
            dfeg = dfeg +0.5;
            dfeg = (int) dfeg;
            dfeg = (double) dfeg / 100;
            tvDFEG.setText("Ergebnis gerundet: "+ dfeg + " cm²");
        }
    }

    private void clickedZurueckDU() {
        Intent iZDU = new Intent(this, DreieckAuswahl.class);
        startActivity(iZDU);
    }


}
