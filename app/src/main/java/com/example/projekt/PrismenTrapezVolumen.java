package com.example.projekt;

import android.content.Intent;
import android.os.strictmode.IntentReceiverLeakedViolation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class PrismenTrapezVolumen extends AppCompatActivity {

    Button btZurueckPriTV;
    Button btPriTVB;
    EditText etPriTVa;
    EditText etPriTVc;
    EditText etPriTVh;
    EditText etPriTVhk;
    TextView tvPriTVe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prismen_trapez_volumen);

        btZurueckPriTV = findViewById(R.id.btZurueckPriTV);
        btPriTVB = findViewById(R.id.btPriTVB);
        etPriTVa = findViewById(R.id.etPriTVa);
        etPriTVc = findViewById(R.id.etPriTVc);
        etPriTVh = findViewById(R.id.etPriTVh);
        etPriTVhk = findViewById(R.id.etPriTVhk);
        tvPriTVe = findViewById(R.id.tvPriTVe);

        btZurueckPriTV.setOnClickListener(View -> clickedZPriTV());
        btPriTVB.setOnClickListener(View -> clickedPriTVB());
    }

    private void clickedPriTVB() {
        String pritvastr = etPriTVa.getText().toString();
        String pritvcstr = etPriTVc.getText().toString();
        String pritvhstr = etPriTVh.getText().toString();
        String pritvhkstr = etPriTVhk.getText().toString();

        if (pritvastr.length()==0||pritvcstr.length()==0||pritvhstr.length()==0||pritvhkstr.length()==0){
            tvPriTVe.setText("Bitte alle geforderten Werte eintragen!");
        }
        else{
            double pritva = Double.parseDouble(pritvastr);
            double pritvc = Double.parseDouble(pritvcstr);
            double pritvh = Double.parseDouble(pritvhstr);
            double pritvhk = Double.parseDouble(pritvhkstr);
            double pritve = 0.5 * (pritva + pritvc) * pritvh * pritvhk;

            tvPriTVe.setText("Volumen: " + pritve + "cm³");
        }
    }

    private void clickedZPriTV() {
        Intent iZPriTV = new Intent(this,PrismenTrapezAuswahl.class);
        startActivity(iZPriTV);
    }
}