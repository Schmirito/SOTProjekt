package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class RechteckFlaeche extends AppCompatActivity {

    Button btZurueckRFI;
    Button btRFB;
    EditText etRFa;
    EditText etRFb;
    TextView tvRFe;
    TextView tvRFeG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rechteck_flaeche);

        btZurueckRFI = findViewById(R.id.btZurueckRFI);
        btRFB = findViewById(R.id.btRFB);
        etRFa = findViewById(R.id.etRFa);
        etRFb = findViewById(R.id.etRFb);
        tvRFe = findViewById(R.id.tvRFe);
        tvRFeG = findViewById(R.id.tvRFeG);

        btZurueckRFI.setOnClickListener(View -> clickedZRFI());
        btRFB.setOnClickListener(View -> clickedRFB());
    }

    private void clickedRFB() {
        String rfastr = etRFa.getText().toString();
        String rfbstr = etRFb.getText().toString();

        if (rfastr.length()==0||rfbstr.length()==0){
            tvRFe.setText("Bitte alle geforderten Werte eingeben!");
        }
        else{
            double rfa = Double.parseDouble(rfastr);
            double rfb = Double.parseDouble(rfbstr);
            double rfe = rfa * rfb;

            tvRFe.setText("Flächeninhalt: " + rfe + " cm²");

            double rfeg = rfe * 100;
            rfeg = rfeg +0.5;
            rfeg = (int) rfeg;
            rfeg = (double) rfeg / 100;
            tvRFeG.setText("Ergebnis gerundet :"+ rfeg + " cm²");
        }
    }

    private void clickedZRFI() {
        Intent iZRFI =  new Intent(this, RechteckAuswahl.class);
        startActivity(iZRFI);
    }
}