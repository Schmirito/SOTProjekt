package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class KugelVolumen extends AppCompatActivity {

    Button btZurueckKV;
    Button btKVB;
    EditText etKVr;
    TextView tvKVe;

    double pi =Math.PI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kugel_volumen);

        btZurueckKV = findViewById(R.id.btZurueckKV);
        btKVB = findViewById(R.id.btKVB);
        etKVr = findViewById(R.id.etKVr);
        tvKVe = findViewById(R.id.tvKVe);

        btZurueckKV.setOnClickListener(View -> clickedZKV());
        btKVB.setOnClickListener(View -> clickedKVB());
    }

    private void clickedKVB() {
        String kvrstr = etKVr.getText().toString();

        if (kvrstr.length()==0){
            tvKVe.setText("Bitte alle geforderten Werte eingeben!");
        }
        else{
            double kvr = Double.parseDouble(kvrstr);
            double kve =  1.33335 * pi * (kvr * kvr * kvr);

            tvKVe.setText("Volumen: " + kve + "cm³");
        }
    }

    private void clickedZKV() {
        Intent iZKV = new Intent(this,KugelAuswahl.class);
        startActivity(iZKV);
    }
}