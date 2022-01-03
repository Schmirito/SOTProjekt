package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class DreieckUmfang extends AppCompatActivity {

    EditText etUa;
    EditText etUb;
    EditText etUc;

    Button btZurueckDU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dreieck_umfang);

        etUa = findViewById(R.id.etUa);
        etUb = findViewById(R.id.etUb);
        etUc = findViewById(R.id.etUc);
        btZurueckDU =findViewById(R.id.btZurueckDA);

        btZurueckDU.setOnClickListener(View -> clickedZurueckDU());

    }

    private void clickedZurueckDU() {
        Intent iZDU = new Intent(this, DreieckAuswahl.class);
        startActivity(iZDU);
    }


}
