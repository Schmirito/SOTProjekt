package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class WuerfelVolumen extends AppCompatActivity {

    Button btZurueckWV;
    Button btWVB;
    EditText etWVa;
    TextView tvWVe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wuerfel_volumen);

        btZurueckWV = findViewById(R.id.btZurueckWV);
        btWVB = findViewById(R.id.btWVB);
        etWVa = findViewById(R.id.etWVa);
        tvWVe = findViewById(R.id.tvWVe);

        btZurueckWV.setOnClickListener(View -> clickedZWV());
        btWVB.setOnClickListener(View -> clickedWVB());
    }

    private void clickedWVB() {
        String wvastr = etWVa.getText().toString();

        if (wvastr.length()==0){
            tvWVe.setText("Bitte alle geforderten Werte angeben!");
        }
        else{
            double wva = Double.compare(wvastr);
            double wve = wva * wva * wva;

            tvWVe.setText("Volumen: " + wve + "cm³");
        }
    }

    private void clickedZWV() {
        Intent iZWV = new Intent(this,WuerfelAuswahl.class);
        startActivity(iZWV);
    }
}