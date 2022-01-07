package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.material.bottomappbar.BottomAppBar;

public class PyramideDreieckOberflaeche extends AppCompatActivity {

    Button btZurueckPDOI;
    Button btPDOB;
    EditText etPDOa;
    EditText etPDOd;
    EditText etPDOha;
    TextView tvPDOe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pyramide_dreieck_oberflaeche);

        btZurueckPDOI = findViewById(R.id.btZurueckPOI);
        btPDOB = findViewById(R.id.btPDOB);
        etPDOa = findViewById(R.id.etPDOa);
        etPDOd = findViewById(R.id.etPDOd);
        etPDOha = findViewById(R.id.etPDOha);
        tvPDOe = findViewById(R.id.tvPDOe);

        btZurueckPDOI.setOnClickListener(View -> clickedZPDOI());
        btPDOB.setOnClickListener(View -> clickedPDOB());
    }

    private void clickedPDOB() {
        String pdoastr = etPDOa.getText().toString();
        String pdodstr = etPDOd.getText().toString();
        String pdohastr = etPDOha.getText().toString();

        if (pdoastr.length()==0||pdohastr.length()==0||pdodstr.length()==0){
            tvPDOe.setText("Bitte alle geforderten Werte eintragen");
        }
        else{
            double pdoa = Double.parseDouble(pdoastr);
            double pdod = Double.parseDouble(pdodstr);
            double pdoha = Double.parseDouble(pdohastr);
            double pdoe = (0.5 * pdoa * pdod) + (3 * (0.5 * pdoa * pdoha));

            tvPDOe.setText("Oberflächeninhalt: " + pdoe + "cm²");
        }
    }

    private void clickedZPDOI() {
        Intent iZPDOI = new Intent(this, PyramideDreieckAuswahl.class);
        startActivity(iZPDOI);
    }
}