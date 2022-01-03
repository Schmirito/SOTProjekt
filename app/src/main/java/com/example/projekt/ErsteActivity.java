package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ErsteActivity extends AppCompatActivity {

    Button bt2D;
    Button bt3D;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_erste);

        bt2D = findViewById(R.id.bt2D);
        bt3D = findViewById(R.id.bt3D);


        bt2D.setOnClickListener(View -> clicked2D());

        bt3D.setOnClickListener(View -> clicked3D());

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