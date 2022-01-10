package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.io.DataOutput;

public class KegelOberflaeche extends AppCompatActivity {

    Button btZurueckKegelO;
    Button btKegelOB;
    EditText etKegelOr;
    EditText etKegelOs;
    TextView tvKegelOe;

    double pi = Math.PI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kegel_oberflaeche);

        btZurueckKegelO = findViewById(R.id.btZurueckKegelO);
        btKegelOB = findViewById(R.id.btKegelOB);
        etKegelOr = findViewById(R.id.etKegelOr);
        etKegelOs = findViewById(R.id.etKegelOs);
        tvKegelOe = findViewById(R.id.tvKegelOe);

        btZurueckKegelO.setOnClickListener(View -> clickedZKegelO());
        btKegelOB.setOnClickListener(View -> clickedKegelOB());
    }

    private void clickedKegelOB() {
        String kegelorstr = etKegelOr.getText().toString();
        String kegelosstr = etKegelOs.getText().toString();

        if (kegelorstr.length()==0||kegelosstr.length()==0){
            tvKegelOe.setText("Bitte alle geforderten Werte eintragen!");
        }
        else{
            double kegelor = Double.parseDouble(kegelorstr);
            double kegelos = Double.parseDouble(kegelosstr);
            double kegeloe = (kegelor * kegelor) * pi + kegelor * pi * kegelos;

            tvKegelOe.setText("Oberflächeninhalt: " + kegeloe + "cm²");
        }
    }

    private void clickedZKegelO() {
        Intent iZKegelO = new Intent(this,KegelAuswahl.class);
        startActivity(iZKegelO);
    }
}