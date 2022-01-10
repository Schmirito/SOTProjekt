package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ParallelogrammUmfang extends AppCompatActivity {

    Button btZurueckParaU;
    Button btParaUB;
    EditText etParaUa;
    EditText etParaUb;
    TextView tvParaUe;
    TextView tvParaUeG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parallelogramm_umfang);

        btZurueckParaU = findViewById(R.id.btZurueckParaU);
        btParaUB = findViewById(R.id.btParaUB);
        etParaUa = findViewById(R.id.etParaUa);
        etParaUb = findViewById(R.id.etParaUb);
        tvParaUe = findViewById(R.id.tvParaUe);
        tvParaUeG = findViewById(R.id.tvParaUeG);

        btZurueckParaU.setOnClickListener(View -> clickedZParaU());
        btParaUB.setOnClickListener(View -> clickedParaUB());
    }

    private void clickedParaUB() {
        String parauastr = etParaUa.getText().toString();
        String paraubstr = etParaUb.getText().toString();

        if (parauastr.length()==0||paraubstr.length()==0){
            tvParaUe.setText("Bitte alle geforderten Werte angeben!");
        }
        else{
            double paraua = Double.parseDouble(parauastr);
            double paraub = Double.parseDouble(paraubstr);
            double paraue = 2 * (paraua + paraub);

            tvParaUe.setText("Umfang: " + paraue + " cm");

            double paraueg = paraue * 100;
            paraueg = paraueg +0.5;
            paraueg = (int) paraueg;
            paraueg = (double) paraueg / 100;
            tvParaUeG.setText("Ergebnis gerundet: "+ paraueg + " cm");
        }
    }

    private void clickedZParaU() {
        Intent iZParaU = new Intent(this,ParallelogrammAuswahl.class);
        startActivity(iZParaU);
    }
}