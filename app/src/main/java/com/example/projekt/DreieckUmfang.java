package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class DreieckUmfang extends AppCompatActivity {
    //Test

    Button btZurueckDU;
    EditText etDUa;
    EditText etDUb;
    EditText etDUc;
    Button btDUB;
    TextView tvDUE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dreieck_umfang);

        btZurueckDU = findViewById(R.id.btZurueckDU);

        btZurueckDU.setOnClickListener(View -> clickedZDU());

        btDUB = findViewById(R.id.btDUB);

        btDUB.setOnClickListener(View -> clickedDUB());

        etDUa = findViewById(R.id.etDUa);
        etDUb = findViewById(R.id.etDUb);
        etDUc = findViewById(R.id.etDUc);
        tvDUE = findViewById(R.id.tvDUE);

    }

    private void clickedDUB() {
       /* double dua = Double.parseDouble(etDUa.getText().toString());
        double dub = Double.parseDouble(etDUb.getText().toString());
        double duc = Double.parseDouble(etDUc.getText().toString());
        double due = dua+dub+duc;
        tvDUE.setText("Umfang: " + due);*/

        String duastr = etDUa.getText().toString();
        String dubstr = etDUb.getText().toString();
        String ducstr = etDUc.getText().toString();

        if (duastr.length()==0||dubstr.length()==0||ducstr.length()==0){
            tvDUE.setText("Bitte alle geforderten Werte eintragen!");

        }
        else {
            double dua = Double.parseDouble(duastr);
            double dub = Double.parseDouble(dubstr);
            double duc = Double.parseDouble(ducstr);
            double due = dua + dub + duc;
            tvDUE.setText("Umfang: " + due);
        }




    }

    private void clickedZDU() {
        Intent iZDU = new Intent(this, DreieckAuswahl.class);
        startActivity(iZDU);
    }
}