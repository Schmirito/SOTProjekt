package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class TrapezFlaeche extends AppCompatActivity {

    Button btZurueckTFI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapez_flaeche);

        btZurueckTFI = findViewById(R.id.btZurueckTFI);

        btZurueckTFI.setOnClickListener(View -> clickedZTFI());

    }

    private void clickedZTFI() {
        Intent iTZFI = new Intent(this,TrapezAuswahl.class);
        startActivity(iTZFI);
    }
}