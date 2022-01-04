package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class DreieckFlaeche extends AppCompatActivity {

    EditText etUa;

    Button btZurueckDFI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dreieck_flaeche);

        etUa = findViewById(R.id.etUa);
        btZurueckDFI =findViewById(R.id.btZurueckDFI);

        btZurueckDFI.setOnClickListener(View -> clickedZurueckDU());

    }

    private void clickedZurueckDU() {
        Intent iZDU = new Intent(this, DreieckAuswahl.class);
        startActivity(iZDU);
    }


}
