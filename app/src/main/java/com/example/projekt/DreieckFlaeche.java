package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class DreieckFlaeche extends AppCompatActivity {
    //Test


    Button btZurueckDFI;
    EditText etDFa;
    EditText etDFh;
    Button btDFB;
    TextView tvDFE;

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

    }

    private void clickedDFB() {
        String dfastr = etDFa.getText().toString();
        String dfhstr = etDFh.getText().toString();
        //double dfa = Double.parseDouble(etDFa.getText().toString());
        //double dfh = Double.parseDouble(etDFh.getText().toString());




        if (dfastr.length()==0||dfhstr.length()==0){
            tvDFE.setText("Bitte alle geforderten Werte eintragen!");

        }
        else {
            double dfa = Double.parseDouble(dfastr);
            double dfh = Double.parseDouble(dfhstr);
            double dfe = 0.5 * dfa * dfh;
            tvDFE.setText("Flächeninhalt: " + dfe);
        }
    }

    private void clickedZurueckDU() {
        Intent iZDU = new Intent(this, DreieckAuswahl.class);
        startActivity(iZDU);
    }


}
