package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ParallelogrammAuswahl extends AppCompatActivity {

    Button btZurueckParaA;
    Button btParaFlaeche;
    Button btParaUmfang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parallelogramm_auswahl);

        btZurueckParaA = findViewById(R.id.btZurueckParaA);
        btParaFlaeche = findViewById(R.id.btParaFlaeche);
        btParaUmfang = findViewById(R.id.btParaUmfang);

        btZurueckParaA.setOnClickListener(View -> clickedZParaA());
        btParaFlaeche.setOnClickListener(View -> clickedParaF());
        btParaUmfang.setOnClickListener(View -> clickedParaU());
    }

    private void clickedParaU() {
        Intent iParaU = new Intent(this, ParallelogrammUmfang.class);
        startActivity(iParaU);
    }

    private void clickedParaF() {
        Intent iParaF = new Intent(this, ParallelogrammFlaeche.class);
        startActivity(iParaF);
    }

    private void clickedZParaA() {
        Intent iZParaA = new Intent(this,ZweiDAuswahl.class);
        startActivity(iZParaA);
    }
}