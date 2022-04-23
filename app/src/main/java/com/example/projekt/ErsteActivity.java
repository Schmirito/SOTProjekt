package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ErsteActivity extends AppCompatActivity {
    Button btAuswahlDimension;



   /* Button bt2D;
    Button bt3D;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_erste);

        btAuswahlDimension = findViewById(R.id.btAuswahlDimension);

        btAuswahlDimension.setOnClickListener(View -> clickedAuswahlDimension());

    }

    private void clickedAuswahlDimension() {
        Intent iAD = new Intent(this, AuswahlDimension.class);
        startActivity(iAD);
    }
}

