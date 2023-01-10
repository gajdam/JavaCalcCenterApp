package com.example.calccentreapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Period;

public class Activity_Time_dilation extends AppCompatActivity {

    @SuppressLint({"MissingInflatedId", "LocalSuppress"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_dilation);

        RadioGroup radioGroup;
        RadioGroup radioGroup2;
        radioGroup2=findViewById(R.id.radioGroup2);
        radioGroup = findViewById(R.id.radioGroup);
        RadioGroup radioGroup3;
        radioGroup3=findViewById(R.id.radioGroup3);
        int x=1;
        Button btn = findViewById(R.id.apply);
        TextView textView=findViewById(R.id.wyniki);
        EditText predkosc =findViewById(R.id.light);
        EditText wejsciowyCzas =findViewById(R.id.czasWejsciowy);
        btn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint({"SetTextI18n", "NonConstantResourceId"})
            @Override
            public void onClick(View view) {

                double lata = 1;
                double czas = Double.parseDouble(String.valueOf(wejsciowyCzas.getText()));
                double dylatacja;
                int radioId = radioGroup.getCheckedRadioButtonId();
                switch (radioId) {
                    case R.id.dni:
                        lata = czas / 356.0;
                        break;
                    case R.id.tygodnie:
                        lata = czas / 52.0;
                        break;
                    case R.id.miesiace:
                        lata = czas / 12.0;
                        break;
                    case R.id.lata:
                        lata = czas;
                        break;
                    case R.id.dekady:
                        lata = czas * 10.0;
                        break;
                    case R.id.stulecia:
                        lata = czas * 100.0;
                        break;
                    default:
                        break;
                }

                String procent = predkosc.getText().toString().replace(",", ".");
                double wartoscProcentu = Double.parseDouble(procent);
                wartoscProcentu = wartoscProcentu / 100;
                BigDecimal swiatloDoKwadratu = BigDecimal.valueOf((299792.458 * 299792.458));
                BigDecimal twojaSzybkosc = BigDecimal.valueOf(0);
                double wartPredk = Double.parseDouble(String.valueOf(predkosc.getText()));
                int radioId2 = radioGroup2.getCheckedRadioButtonId();
                switch (radioId2) {
                    case R.id.procent:
                        twojaSzybkosc = BigDecimal.valueOf((299792.458 * wartoscProcentu) * (299792.458 * wartoscProcentu));
                        break;
                    case R.id.kmNaSekunde:
                        twojaSzybkosc = BigDecimal.valueOf(wartPredk * wartPredk);
                        break;
                    case R.id.metryNaSek:
                        wartPredk = wartPredk / 100;
                        twojaSzybkosc = BigDecimal.valueOf(wartPredk * wartPredk);
                        break;
                    case R.id.mileNaSek:
                        wartPredk = wartPredk * 1.609344;
                        twojaSzybkosc = BigDecimal.valueOf(wartPredk * wartPredk);
                        break;
                    default:
                        break;
                }


                int radioId3 = radioGroup3.getCheckedRadioButtonId();

                BigDecimal dzialaniePodSqrt = twojaSzybkosc.divide(swiatloDoKwadratu, 10, RoundingMode.HALF_DOWN);
                double dzialaniePodSqrtD = Double.parseDouble(String.valueOf(dzialaniePodSqrt));
                BigDecimal jedenOdjSqrt = BigDecimal.valueOf(Math.sqrt(1 - dzialaniePodSqrtD));
                double jedenOdjSqrtD = Double.parseDouble(String.valueOf(jedenOdjSqrt));
                String odp;
                dylatacja = lata / (jedenOdjSqrtD);
                switch (radioId3) {
                    case R.id.zdanie:
                        int totalYears = (int) dylatacja;
                        double fractionalYears = dylatacja - totalYears;

                        LocalDate start = LocalDate.of(2020, 1, 1);
                        LocalDate end = start.plusYears(totalYears).plusDays((int) (fractionalYears * 365));
                        Period period = Period.between(start, end);

                        int months = period.getMonths();
                        int weeks = period.getDays() / 7;
                        int days = period.getDays() % 7;
                        odp = (totalYears + " years, " + months + " months, " + weeks + " weeks, " + days + " days");
                        textView.setText(odp);
                        break;
                    case R.id.lat:
                        odp=dylatacja+" of year";
                        textView.setText(String.valueOf(odp));
                        break;
                    case R.id.dnii:
                        BigDecimal dni=BigDecimal.valueOf((long)(int)(dylatacja*365*24));
                        odp=dni+" days";
                        textView.setText(String.valueOf(odp));
                        break;
                    case R.id.sekund:
                        BigDecimal sekundy= BigDecimal.valueOf((long) (int) dylatacja *365*24*60*60);
                        odp=sekundy+" seconds";
                        textView.setText(odp);

                }

            }



        });
    }
}