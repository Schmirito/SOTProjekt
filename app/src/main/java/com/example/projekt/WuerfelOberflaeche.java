package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class WuerfelOberflaeche extends AppCompatActivity {

    Button btZurueckWO;
    Button btWOB;
    EditText etWOa;
    TextView tvWOe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wuerfel_oberflaeche);

        btZurueckWO = findViewById(R.id.btZurueckWO);
        btWOB = findViewById(R.id.btWOB);
        etWOa = findViewById(R.id.etWOa);
        tvWOe = findViewById(R.id.tvWOe);

        btZurueckWO.setOnClickListener(View -> clickedZWO());
        btWOB.setOnClickListener(View -> clickedWOB());
    }

    private void clickedWOB() {
        String woastr = etWOa.getText().toString();

        if (woastr.length()==0){
            tvWOe.setText("Bitte alle geforderten Werte eintragen!");
        }
        else{
            double woa = Double.parseDouble(woastr);
            double woe = 6 * (woa * woa);

            tvWOe.setText("Oberflächeninhalt:" + woe + "cm²");
        }
    }

    private void clickedZWO() {
        Intent iZWO = new Intent(this, WuerfelAuswahl.class);
        startActivity(iZWO);
    }
}