package com.example.projekt;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Umrechner extends AppCompatActivity {
    EditText etMili;
    EditText etZenti;
    EditText etDezi;
    EditText etMeter;
    EditText etKilo;
    Button btUmrechnen;
    Button btZurueckUmrechner;
    TextView tvMiliE;
    TextView tvZentiE;
    TextView tvDeziE;
    TextView tvMeterE;
    TextView tvKiloE;
    TextView tvAngaben;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_umrechner);
        etMili = findViewById(R.id.etMili);
        etZenti = findViewById(R.id.etZenti);
        etDezi = findViewById(R.id.etDezi);
        etMeter = findViewById(R.id.etMeter);
        etKilo = findViewById(R.id.etKilo);
        btUmrechnen = findViewById(R.id.btUmrechnen);
        btZurueckUmrechner = findViewById(R.id.btZurueckUmrechner);
        tvMiliE = findViewById(R.id.tvMiliE);
        tvZentiE = findViewById(R.id.tvZentiE);
        tvDeziE = findViewById(R.id.tvDeziE);
        tvMeterE = findViewById(R.id.tvMeterE);
        tvKiloE = findViewById(R.id.tvKiloE);
        tvAngaben = findViewById(R.id.tvAngaben);

        btUmrechnen.setOnClickListener(View -> clickedUmrechnen());
        btZurueckUmrechner.setOnClickListener(View -> clickedZurueckUmrechner());




    }

    private void clickedZurueckUmrechner() {
        Intent izUmrechner = new Intent(this, AuswahlDimension.class);
        startActivity(izUmrechner);
    }

    private void clickedUmrechnen() {
        String milistr = etMili.getText().toString();
        String zentistr = etZenti.getText().toString();
        String dezistr = etDezi.getText().toString();
        String meterstr = etMeter.getText().toString();
        String kilostr = etKilo.getText().toString();

        if (milistr.length() > 0){
            if (zentistr.length() == 0 & dezistr.length() == 0 & meterstr.length() == 0 & kilostr.length() == 0 ){
            double mili = Double.parseDouble(milistr);

            double zentiu = mili/10;
            double deziu = mili/100;
            double meteru = mili/1000;
            double kilou = mili/1000000;

            etMili.getText().clear();

            tvMiliE.setText(mili + " mm");
            tvZentiE.setText(zentiu + " cm");
            tvDeziE.setText(deziu + " dm");
            tvMeterE.setText(meteru+ " m");
            tvKiloE.setText(kilou + " km");

        }
            else {
                tvAngaben.setText("Bitte nur einen Wert eingeben!");
            }

            }
        else {
            if (zentistr.length() >0) {
                if (dezistr.length() == 0 & meterstr.length() == 0 & kilostr.length() == 0) {
                    double zenti = Double.parseDouble(zentistr);

                    double miliu = zenti * 10;
                    double deziu = zenti / 10;
                    double meteru = zenti / 100;
                    double kilou = zenti / 100000;

                    etZenti.getText().clear();

                    tvMiliE.setText(miliu + " mm");
                    tvZentiE.setText(zenti + " cm");
                    tvDeziE.setText(deziu + " dm");
                    tvMeterE.setText(meteru + " m");
                    tvKiloE.setText(kilou + " km");
                }
                else {
                    tvAngaben.setText("Bitte nur einen Wert eingeben!");
                }
            }

            else {
                if (dezistr.length() > 0){
                    if (meterstr.length() == 0 & kilostr.length() == 0){
                    double dezi = Double.parseDouble(dezistr);

                    double miliu = dezi*100;
                    double zentiu = dezi*10;
                    double meteru = dezi/10;
                    double kilou = dezi/10000;

                    etDezi.getText().clear();

                    tvMiliE.setText(miliu + " mm");
                    tvZentiE.setText(zentiu + " cm");
                    tvDeziE.setText(dezi + " dm");
                    tvMeterE.setText(meteru+ " m");
                    tvKiloE.setText(kilou + " km");
                }
                    else {
                        tvAngaben.setText("Bitte nur einen Wert eingeben!");
                    }
                    }
                else {
                    if (meterstr.length() > 0){
                        if (kilostr.length() == 0){
                        double meter = Double.parseDouble(meterstr);

                        double miliu = meter*1000;
                        double zentiu = meter*100;
                        double deziu = meter*10;
                        double kilou = meter/1000;

                        etMeter.getText().clear();

                        tvMiliE.setText(miliu + " mm");
                        tvZentiE.setText(zentiu + " cm");
                        tvDeziE.setText(deziu + " dm");
                        tvMeterE.setText(meter + " m");
                        tvKiloE.setText(kilou + " km");
                    }
                        else {
                            tvAngaben.setText("Bitte nur einen Wert eingeben!");
                        }
                        }
                    else {
                        if (kilostr.length() > 0) {
                            double kilo = Double.parseDouble(kilostr);

                            double miliu = kilo*1000000;
                            double zentiu = kilo*100000;
                            double deziu = kilo*10000;
                            double meteru = kilo*1000;

                            etMeter.getText().clear();

                            tvMiliE.setText(miliu + " mm");
                            tvZentiE.setText(zentiu + " cm");
                            tvDeziE.setText(deziu + " dm");
                            tvMeterE.setText(meteru + " m");
                            tvKiloE.setText(kilo + " km");
                        }
                    }
                }
            }
        }
    }
}