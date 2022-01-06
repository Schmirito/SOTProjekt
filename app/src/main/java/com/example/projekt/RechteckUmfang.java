package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class RechteckUmfang extends AppCompatActivity {

    Button btZurueckRU;
    Button btRUB;
    EditText etRUa;
    EditText etRUb;
    TextView tvRUe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rechteck_umfang);

        btZurueckRU = findViewById(R.id.btZurueckRU);
        btRUB = findViewById(R.id.btRUB);
        etRUa = findViewById(R.id.etRUa);
        etRUb = findViewById(R.id.etRUb);
        tvRUe = findViewById(R.id.tvRUe);

        btZurueckRU.setOnClickListener(View -> clickedZRU());
        btRUB.setOnClickListener(View -> clickedRUB());
    }

    private void clickedRUB() {
        String ruastr = etRUa.getText().toString();
        String rubstr = etRUb.getText().toString();

        if (ruastr.length()==0||rubstr.length()==0){
            tvRUe.setText("Bitte alle geforderten Werte eintragen!");
        }
        else {
            double rua = Double.parseDouble(ruastr);
            double rub = Double.parseDouble(rubstr);
            double rue = 2 * (rua + rub);
            tvRUe.setText("Umfang: " + rue + "cm");
        }
    }

    private void clickedZRU() {
        Intent iZRU = new Intent(this, RechteckAuswahl.class);
        startActivity(iZRU);
    }
}