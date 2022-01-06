package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ViereckFlaeche extends AppCompatActivity {

    Button btZurueckVFI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viereck_flaeche);

        btZurueckVFI = findViewById(R.id.btZurueckVFI);

        btZurueckVFI.setOnClickListener(View -> clickedZVFI());

    }

    private void clickedZVFI() {
        Intent iZVFI =  new Intent(this, ViereckAuswahl.class);
        startActivity(iZVFI);
    }
}