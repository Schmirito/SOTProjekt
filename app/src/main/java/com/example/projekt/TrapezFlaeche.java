package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class TrapezFlaeche extends AppCompatActivity {

    Button btZurueckTFI;
    EditText etTFIa;
    EditText etTFIc;
    EditText etTFIh;
    Button btTFIB;
    TextView tvTFIE;
    TextView tvTFIEG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapez_flaeche);

        btZurueckTFI = findViewById(R.id.btZurueckTFI);
        btTFIB = findViewById(R.id.btTFIB);
        etTFIa = findViewById(R.id.etTFIa);
        etTFIc = findViewById(R.id.etTFIc);
        etTFIh = findViewById(R.id.etTFIh);
        tvTFIE = findViewById(R.id.tvTFIE);
        tvTFIEG = findViewById(R.id.tvTFIEG);

        btZurueckTFI.setOnClickListener(View -> clickedZTFI());
        btTFIB.setOnClickListener(View -> clickedTFIB());


    }

    private void clickedTFIB() {
        String tfiastr = etTFIa.getText().toString();
        String tficstr = etTFIc.getText().toString();
        String tfihstr = etTFIh.getText().toString();

        if (tfiastr.length()==0||tficstr.length()==0||tfihstr.length()==0){
            tvTFIE.setText("Bitte alle geforderten Werte eintragen!");

        }
        else{
            double tfia = Double.parseDouble(tfiastr);
            double tfic = Double.parseDouble(tficstr);
            double tfih = Double.parseDouble(tfihstr);
            double tfie = (tfia + tfic) * 0.5 * tfih;
            tvTFIE.setText("Flächeninhalt: " + tfie + " cm²");

            double tfieg = tfie * 100;
            tfieg = tfieg +0.5;
            tfieg = (int) tfieg;
            tfieg = (double) tfieg / 100;
            tvTFIEG.setText("Ergebnis gerundet :"+ tfieg + " cm²");
        }
    }

    private void clickedZTFI() {
        Intent iTZFI = new Intent(this,TrapezAuswahl.class);
        startActivity(iTZFI);
    }
}