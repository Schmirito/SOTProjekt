package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class AuswahlDimension extends AppCompatActivity {
    Button bt2D;
    Button bt3D;
    Button btUmrechner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auswahl_dimension);
        bt2D = findViewById(R.id.bt2D);
        bt3D = findViewById(R.id.bt3D);
        btUmrechner = findViewById(R.id.btUmrechner);


        bt2D.setOnClickListener(View -> clicked2D());

        bt3D.setOnClickListener(View -> clicked3D());

        btUmrechner.setOnClickListener(View -> clickedUmrechenr());


    }

    private void clickedUmrechenr() {
        Intent iU = new Intent(this, Umrechner.class);
        startActivity(iU);

    }

    private void clicked3D() {
        Intent i3D = new Intent(this, DreiDAuswahl.class);
        startActivity(i3D);
    }

    private void clicked2D() {
        Intent i2D = new Intent(this, ZweiDAuswahl.class);
        startActivity(i2D);
    }
}
