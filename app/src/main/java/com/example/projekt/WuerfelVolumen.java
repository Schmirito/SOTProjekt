package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class WuerfelVolumen extends AppCompatActivity {

    Button btZurueckWV;
    Button btWVB;
    EditText etWVa;
    TextView tvWVe;
    TextView tvWVeG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wuerfel_volumen);

        btZurueckWV = findViewById(R.id.btZurueckWV);
        btWVB = findViewById(R.id.btWVB);
        etWVa = findViewById(R.id.etWVa);
        tvWVeG = findViewById(R.id.tvWVeG);

        btZurueckWV.setOnClickListener(View -> clickedZWV());
        btWVB.setOnClickListener(View -> clickedWVB());
    }

    private void clickedWVB() {
        String wvastr = etWVa.getText().toString();

        if (wvastr.length()==0){
            tvWVe.setText("Bitte alle geforderten Werte angeben!");
        }
        else{
            double wva = Double.parseDouble(wvastr);
            double wve = wva * wva * wva;

            tvWVe.setText("Volumen: " + wve + " cm³");
            double wveg = wve * 100;
            wveg = wveg +0.5;
            wveg = (int) wveg;
            wveg = (double) wveg / 100;
            tvWVeG.setText("Ergebnis gerundet :"+ wveg + " cm³");
        }
    }

    private void clickedZWV() {
        Intent iZWV = new Intent(this,WuerfelAuswahl.class);
        startActivity(iZWV);
    }
}