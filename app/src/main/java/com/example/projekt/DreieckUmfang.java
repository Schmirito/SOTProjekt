package com.example.projekt;

import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class DreieckUmfang extends AppCompatActivity {

    EditText etUa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dreieck_umfang);

        etUa = findViewById(R.id.etUa);


    }
}