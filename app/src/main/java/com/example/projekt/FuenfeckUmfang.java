package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class FuenfeckUmfang extends AppCompatActivity {

    Button btZurueckFU;
    Button btFUB;
    EditText etFUa;
    EditText etFUb;
    EditText etFUc;
    EditText etFUd;
    EditText etFUe;
    TextView tvFUErgebnis;
    TextView tvFUErgebnisG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fuenfeck_umfang);

        btZurueckFU = findViewById(R.id.btZurueckFU);
        btFUB = findViewById(R.id.btFUB);
        etFUa = findViewById(R.id.etFUa);
        etFUb = findViewById(R.id.etFUb);
        etFUc = findViewById(R.id.etFUc);
        etFUd = findViewById(R.id.etFUd);
        etFUe = findViewById(R.id.etFUe);
        tvFUErgebnis = findViewById(R.id.tvFUErgebniss);
        tvFUErgebnisG = findViewById(R.id.tvFUErgebnissG);

        btZurueckFU.setOnClickListener(View -> clickedZFU());
        btFUB.setOnClickListener(View -> clickedFUB());
    }

    private void clickedFUB() {
        String fuastr = etFUa.getText().toString();
        String fubstr = etFUb.getText().toString();
        String fucstr = etFUc.getText().toString();
        String fudstr = etFUd.getText().toString();
        String fuestr = etFUe.getText().toString();

        if (fuastr.length()==0||fubstr.length()==0||fucstr.length()==0||fudstr.length()==0||fuestr.length()==0){
            tvFUErgebnis.setText("Bitte alle geforderten Werte eingeben!");
        }
        else{
            double fua = Double.parseDouble(fuastr);
            double fub = Double.parseDouble(fubstr);
            double fuc = Double.parseDouble(fucstr);
            double fud = Double.parseDouble(fudstr);
            double fue = Double.parseDouble(fuestr);
            double fuErgebnis = fua + fub + fuc + fud + fue;

            tvFUErgebnis.setText("Umfang: " + fuErgebnis + " cm");

            double fueg = fue * 100;
            fueg = fueg +0.5;
            fueg = (int) fueg;
            fueg = (double) fueg / 100;
            tvFUErgebnisG.setText("Ergebnis gerundet :"+ fueg + " cm");
        }
    }

    private void clickedZFU() {
        Intent iZFU = new Intent(this,FuenfeckAuswahl.class);
        startActivity(iZFU);
    }
}