package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class PrismenDreieckVolumen extends AppCompatActivity {

    Button btZurueckPriDV;
    Button btPriDVB;
    EditText etPriDVa;
    EditText etPriDVha;
    EditText etPriDVh;
    TextView tvPriDVe;
    TextView tvPriDVeG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prismen_dreieck_volumen);
        
        btZurueckPriDV = findViewById(R.id.btZurueckPriDV);
        btPriDVB = findViewById(R.id.btPriDVB);
        etPriDVa = findViewById(R.id.etPriDVa);
        etPriDVh = findViewById(R.id.etPriDVh);
        etPriDVha = findViewById(R.id.etPriDVha);
        tvPriDVe = findViewById(R.id.tvPriDVe);
        tvPriDVeG = findViewById(R.id.tvPriDVeg);

        btZurueckPriDV.setOnClickListener(View -> clickedZPriDV());
        btPriDVB.setOnClickListener(View -> clickedPriDVB());
    }

    private void clickedPriDVB() {
        String pridvastr = etPriDVa.getText().toString();
        String pridvhastr = etPriDVha.getText().toString();
        String pridvhstr = etPriDVh.getText().toString();

        if (pridvastr.length()==0||pridvhastr.length()==0||pridvhstr.length()==0){
            tvPriDVe.setText("Bitte alle erforderten Werte eingeben!");
            tvPriDVeG.setText(" ");
        }
        else{
            double pridva = Double.parseDouble(pridvastr);
            double pridvha = Double.parseDouble(pridvhastr);
            double pridvh = Double.parseDouble(pridvhstr);
            double pridve = (0.5 * pridva * pridvha) * pridvh;

            tvPriDVe.setText("Volumen: " + pridve + " cm³");

            double pridveg = pridve * 100;
            pridveg = pridveg +0.5;
            pridveg = (int) pridveg;
            pridveg = (double) pridveg / 100;
            tvPriDVeG.setText("Ergebnis gerundet: "+ pridveg + " cm³");
        }
    }

    private void clickedZPriDV() {
        Intent iZPriDV = new Intent(this, PrismenDreieckAuswahl.class);
        startActivity(iZPriDV);
    }
}