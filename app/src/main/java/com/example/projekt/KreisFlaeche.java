package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class KreisFlaeche extends AppCompatActivity {
    Button btZurueckKF;
    EditText etKFD;
    Button btKFB;
    TextView tvKFE;
    TextView tvKFEG;
    double pi = Math.PI;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kreis_flaeche);

        btZurueckKF = findViewById(R.id.btZurueckKF);
        btKFB = findViewById(R.id.btKFB);
        etKFD = findViewById(R.id.etKFD);
        tvKFE = findViewById(R.id.tvKFE);
        tvKFE = findViewById(R.id.tvKFEG);

        btZurueckKF.setOnClickListener(view -> clickedZKF());
        btKFB.setOnClickListener(view -> clickedKFB());
    }

    private void clickedKFB() {
        String kfdstr = etKFD.getText().toString();
        if (kfdstr.length()==0){
            tvKFE.setText("Bitte alle geforderten Werte eintragen!");

        }
        else {
            double kfd = Double.parseDouble(kfdstr);
            double kfe = pi/4*kfd*kfd;
            tvKFE.setText("Umfang: " + kfe + " cm²");

            double kfeg = kfe * 100;
            kfeg = kfeg +0.5;
            kfeg = (int) kfeg;
            kfeg = (double) kfeg / 100;
            tvKFEG.setText("Ergebnis gerundet: "+ kfeg + " cm²");
        }
    }

    private void clickedZKF() {
        Intent iZKF = new Intent(this, KreisAuswahl.class);
        startActivity(iZKF);
    }
}