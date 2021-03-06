package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class KegelVolumen extends AppCompatActivity {

    Button btZurueckKegelV;
    Button btKegelVB;
    EditText etKegelVr;
    EditText etKegelVh;
    TextView tvKegelVe;
    TextView tvKegelVeG;

    double pi = Math.PI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kegel_volumen);

        btZurueckKegelV = findViewById(R.id.btZurueckKegelV);
        btKegelVB = findViewById(R.id.btKegelVB);
        etKegelVr = findViewById(R.id.etKegelVr);
        etKegelVh = findViewById(R.id.etKegelVh);
        tvKegelVe = findViewById(R.id.tvKegelVe);
        tvKegelVeG = findViewById(R.id.tvKegelVeG);

        btZurueckKegelV.setOnClickListener(View -> clickedZKegelV());
        btKegelVB.setOnClickListener(View -> clickedKegelVB());
    }

    private void clickedKegelVB() {
        String kegelvrstr = etKegelVr.getText().toString();
        String kegelvhstr = etKegelVh.getText().toString();

        if (kegelvrstr.length()==0||kegelvhstr.length()==0){
            tvKegelVe.setText("Bitte alle geforderten Werte eintragen!");
            tvKegelVeG.setText(" ");
        }
        else{
            double kegelvr = Double.parseDouble(kegelvrstr);
            double kegelvh = Double.parseDouble(kegelvhstr);
            double kegelve = 0.33335 * pi * (kegelvr * kegelvr) * kegelvh;

            tvKegelVe.setText("Volumen: " + kegelve + " cm³");



            double kegelveg = kegelve * 100;
            kegelveg = kegelveg +0.5;
            kegelveg = (int) kegelveg;
            kegelveg = (double) kegelveg / 100;
            tvKegelVeG.setText("Ergebnis gerundet: "+ kegelveg + " cm³");
        }
    }

    private void clickedZKegelV() {
        Intent iZKegelV = new Intent(this,KegelAuswahl.class);
        startActivity(iZKegelV);
    }
}