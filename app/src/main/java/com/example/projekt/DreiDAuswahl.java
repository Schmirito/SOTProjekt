package com.example.projekt;


import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class DreiDAuswahl extends AppCompatActivity {

    Button btPyramide;
    Button btZurueck3DA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drei_d_auswahl);

        btPyramide = findViewById(R.id.btPyramide);
        btZurueck3DA = findViewById(R.id.btZurueck3DA);

        btPyramide.setOnClickListener(View -> clickedPyramide());
        btZurueck3DA.setOnClickListener(View -> clickedZurueck3DA());

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