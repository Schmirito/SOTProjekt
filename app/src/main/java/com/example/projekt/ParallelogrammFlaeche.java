package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.material.datepicker.RangeDateSelector;

public class ParallelogrammFlaeche extends AppCompatActivity {

    Button btParaFB;
    Button btZurueckParaF;
    EditText etParaFa;
    EditText etParaFha;
    TextView tvParaFe;
    TextView tvParaFeG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parallelogramm_flaeche);

        btZurueckParaF = findViewById(R.id.btZurueckParaF);
        btParaFB = findViewById(R.id.btParaFB);
        etParaFa = findViewById(R.id.etParaFa);
        etParaFha = findViewById(R.id.etParaFha);
        tvParaFe = findViewById(R.id.tvParaFe);
        tvParaFeG = findViewById(R.id.tvParaFeG);

        btZurueckParaF.setOnClickListener(View -> clickedZParaF());
        btParaFB.setOnClickListener(View -> clickedParaFB());
    }

    private void clickedParaFB() {
        String parafastr = etParaFa.getText().toString();
        String parafhastr = etParaFha.getText().toString();

        if (parafastr.length()==0||parafhastr.length()==0){
            tvParaFe.setText("Bitte alle geforderten Werte eintragen!");
        }
        else{
            double parafa = Double.parseDouble(parafastr);
            double parafha = Double.parseDouble(parafhastr);
            double parafe = parafa * parafha;

            tvParaFe.setText("Flächeninhalt: " + parafe + " cm²");

            double parafeg = parafe * 100;
            parafeg = parafeg +0.5;
            parafeg = (int) parafeg;
            parafeg = (double) parafeg / 100;
            tvParaFeG.setText("Ergebnis gerundet: "+ parafeg + " cm²");


        }
    }

    private void clickedZParaF() {
        Intent iZParaF = new Intent(this,ParallelogrammAuswahl.class);
        startActivity(iZParaF);
    }
}