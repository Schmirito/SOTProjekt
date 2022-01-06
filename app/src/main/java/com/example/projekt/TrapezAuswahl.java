package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class TrapezAuswahl extends AppCompatActivity {
    
    Button btZurueckTA;
    Button btTFI;
    Button btTU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapez_auswahl);
        
        btZurueckTA = findViewById(R.id.btZurueckTA);
        btTFI = findViewById(R.id.btTFI);
        btTU = findViewById(R.id.btTU);
        
        btZurueckTA.setOnClickListener(View -> clickedZTA());
        btTFI.setOnClickListener(View -> clickedTFI());
        btTU.setOnClickListener(View -> clickedTU());
    }

    private void clickedTU() {
        Intent iTU = new Intent(this, TrapezUmfang.class);
        startActivity(iTU);
    }

    private void clickedTFI() {
        Intent iTFI = new Intent(this,TrapezFlaeche.class);
        startActivity(iTFI);
    }

    private void clickedZTA() {
        Intent iZTA = new Intent(this,ZweiDAuswahl.class);
        startActivity(iZTA);
    }
}