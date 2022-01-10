package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class PyramideViereckOberlaeche extends AppCompatActivity {

    Button btZurueckPVO;
    Button btPVOB;
    EditText etPVOa;
    EditText etPVOha;
    TextView tvPVOe;
    TextView tvPVOeG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pyramide_viereck_oberlaeche);

        btZurueckPVO = findViewById(R.id.btZurueckPVO);
        btPVOB = findViewById(R.id.btPVOB);
        etPVOa = findViewById(R.id.etPVOa);
        etPVOha = findViewById(R.id.etPVOha);
        tvPVOe = findViewById(R.id.tvPVOe);
        tvPVOeG = findViewById(R.id.tvPVOeG);

        btZurueckPVO.setOnClickListener(View -> clickedZPVO());
        btPVOB.setOnClickListener(View -> clickedPVOB());
    }

    private void clickedPVOB() {
        String pvoastr = etPVOa.getText().toString();
        String pvohastr = etPVOha.getText().toString();

        if (pvoastr.length()==0||pvohastr.length()==0){
            tvPVOe.setText("Bitte alle geforderten werte angeben!");
            tvPVOeG.setText(" ");
        }
        else{
            double pvoa = Double.parseDouble(pvoastr);
            double pvoha = Double.parseDouble(pvohastr);
            double pvoe = (pvoa * pvoa) + 4 * (0.5 * pvoa * pvoha);

            tvPVOe.setText("Oberflächeninhalt: " + pvoe + " cm²");

            double pvoeg = pvoe * 100;
            pvoeg = pvoeg +0.5;
            pvoeg = (int) pvoeg;
            pvoeg = (double) pvoeg / 100;
            tvPVOeG.setText("Ergebnis gerundet: "+ pvoeg + " cm²");
        }
    }

    private void clickedZPVO() {
        Intent iZPVO = new Intent(this,PyramideViereckAuswahl.class);
        startActivity(iZPVO);
    }
}