package com.example.projekt;


import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class DreiDAuswahl extends AppCompatActivity {

    Button btZurueck3DA;
    Button btPyramide;
    Button btWuerfel;
    Button btPrismen;
    Button btKugel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drei_d_auswahl);

        btPyramide = findViewById(R.id.btPyramide);
        btZurueck3DA = findViewById(R.id.btZurueck3DA);
        btWuerfel = findViewById(R.id.btWuerfel);
        btPrismen = findViewById(R.id.btPrismen);
        btKugel = findViewById(R.id.btKugel);

        btPyramide.setOnClickListener(View -> clickedPyramide());
        btZurueck3DA.setOnClickListener(View -> clickedZurueck3DA());
        btWuerfel.setOnClickListener(View -> clickedWuerfel());
        btPrismen.setOnClickListener(View -> clickedPrismen());
        btKugel.setOnClickListener(View -> clickedKugel());
    }

    private void clickedKugel() {
        Intent iKugel = new Intent(this,KugelAuswahl.class);
        startActivity(iKugel);
    }

    private void clickedPrismen() {
        Intent iPrismen = new Intent(this,PrismenAuswahl.class);
        startActivity(iPrismen);
    }

    private void clickedWuerfel() {
        Intent iWuerfel = new Intent(this, WuerfelAuswahl.class);
        startActivity(iWuerfel);
    }

    private void clickedZurueck3DA() {
        Intent iZ3DA = new Intent(this,ErsteActivity.class);
        startActivity(iZ3DA);
    }

    private void clickedPyramide() {
        Intent iP = new Intent(this, PyramideAuswahl.class);
        startActivity(iP);
    }
}