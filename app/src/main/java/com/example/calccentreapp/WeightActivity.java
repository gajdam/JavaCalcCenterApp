package com.example.calccentreapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class WeightActivity extends AppCompatActivity {


    RadioGroup radioGroup;
    RadioGroup radioGroup2;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weight_activity);
        radioGroup = findViewById(R.id.radioGroup);
        radioGroup2=findViewById(R.id.radioGroup2);
        Button btn = findViewById(R.id.apply_button);
        TextView textView=findViewById(R.id.results);
        EditText x =findViewById(R.id.number);
        btn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint({"SetTextI18n", "NonConstantResourceId"})
            @Override
            public void onClick(View view) {
                int radioId = radioGroup.getCheckedRadioButtonId();
                int radioId2 = radioGroup2.getCheckedRadioButtonId();
                String numer=x.getText().toString();
                double number;
                double wynik;
                switch (radioId2)
                {
                    case R.id.gram2:
                        switch(radioId)
                        {
                            case R.id.tygodnie:
                                number=Double.parseDouble(numer);
                                wynik=number*0.001;
                                textView.setText(String.valueOf(wynik));
                                break;
                            case R.id.miesiace:
                                number=Double.parseDouble(numer);
                                wynik=number/1000;
                                textView.setText(String.valueOf(wynik));
                                break;
                            case R.id.lata:
                                number=Double.parseDouble(numer);
                                wynik=number/1000000;
                                textView.setText(String.valueOf(wynik));
                                break;
                            case R.id.dekady:
                                number=Double.parseDouble(numer);
                                wynik=number*0.00220462262;
                                textView.setText(String.valueOf(wynik));
                                break;
                            case R.id.stulecia:
                                number=Double.parseDouble(numer);
                                wynik=number*5;
                                textView.setText(String.valueOf(wynik));
                                break;

                            default:
                                break;
                        }
                        break;
                    case R.id.kilogram2:
                        switch (radioId)
                        {
                            case R.id.dni:
                                number=Double.parseDouble(numer);
                                wynik=number*1000;
                                textView.setText(String.valueOf(wynik));
                                break;
                            case R.id.miesiace:
                                number=Double.parseDouble(numer);
                                wynik=number/1000;
                                textView.setText(String.valueOf(wynik));
                                break;
                            case R.id.lata:
                                number=Double.parseDouble(numer);
                                wynik=number*35.2739619;
                                textView.setText(String.valueOf(wynik));

                                break;
                            case R.id.dekady:
                                number=Double.parseDouble(numer);
                                wynik=number*2.20462262;
                                textView.setText(String.valueOf(wynik));
                                break;
                            case R.id.stulecia:
                                number=Double.parseDouble(numer);
                                wynik=number*5000;
                                textView.setText(String.valueOf(wynik));
                                break;
                            default:
                                break;
                        }
                        break;
                    case R.id.tona2:
                        switch (radioId)
                        {
                            case R.id.dni:
                                number=Double.parseDouble(numer);
                                wynik=number*1000000;
                                textView.setText(String.valueOf(wynik));
                                break;
                            case R.id.tygodnie:
                                number=Double.parseDouble(numer);
                                wynik=number*1000;
                                textView.setText(String.valueOf(wynik));
                                break;
                            case R.id.lata:
                                number=Double.parseDouble(numer);
                                wynik=number*35273.9619;
                                textView.setText(String.valueOf(wynik));

                                break;
                            case R.id.dekady:
                                number=Double.parseDouble(numer);
                                wynik=number*2204.62262;
                                textView.setText(String.valueOf(wynik));
                                break;
                            case R.id.stulecia:
                                number=Double.parseDouble(numer);
                                wynik=number*5000000;
                                textView.setText(String.valueOf(wynik));
                                break;
                            default:
                                break;
                        }
                        break;
                    case R.id.uncja2:
                        switch (radioId)
                        {
                            case R.id.dni:
                                number=Double.parseDouble(numer);
                                wynik=number*28.3495231;
                                textView.setText(String.valueOf(wynik));
                                break;
                            case R.id.tygodnie:
                                number=Double.parseDouble(numer);
                                wynik=number*0.0283495231;
                                textView.setText(String.valueOf(wynik));
                                break;
                            case R.id.miesiace:
                                number=Double.parseDouble(numer);
                                wynik=number/35273.9619;
                                textView.setText(String.valueOf(wynik));

                                break;
                            case R.id.dekady:
                                number=Double.parseDouble(numer);
                                wynik=number*0.0625;
                                textView.setText(String.valueOf(wynik));
                                break;
                            case R.id.stulecia:
                                number=Double.parseDouble(numer);
                                wynik=number*141.7476;
                                textView.setText(String.valueOf(wynik));
                                break;
                            default:
                                break;
                        }
                        break;
                    case R.id.funt2:
                        switch (radioId)
                        {
                            case R.id.dni:
                                number=Double.parseDouble(numer);
                                wynik=number*28.3495231;
                                textView.setText(String.valueOf(wynik));
                                break;
                            case R.id.tygodnie:
                                number=Double.parseDouble(numer);
                                wynik=number*0.0283495231;
                                textView.setText(String.valueOf(wynik));
                                break;
                            case R.id.miesiace:
                                number=Double.parseDouble(numer);
                                wynik=number/35273.9619;
                                textView.setText(String.valueOf(wynik));

                                break;
                            case R.id.lata:
                                number=Double.parseDouble(numer);
                                wynik=number*0.0625;
                                textView.setText(String.valueOf(wynik));
                                break;
                            case R.id.stulecia:
                                number=Double.parseDouble(numer);
                                wynik=number*141.7476;
                                textView.setText(String.valueOf(wynik));
                                break;
                            default:
                                break;
                        }
                        break;
                    case R.id.karat2:
                        switch (radioId)
                        {
                            case R.id.dni:
                                number=Double.parseDouble(numer);
                                wynik=number*0.2;
                                textView.setText(String.valueOf(wynik));
                                break;
                            case R.id.tygodnie:
                                number=Double.parseDouble(numer);
                                wynik=number* 0.0002 ;
                                textView.setText(String.valueOf(wynik));
                                break;
                            case R.id.miesiace:
                                number=Double.parseDouble(numer);
                                wynik=number*0.0000002;
                                textView.setText(String.valueOf(wynik));

                                break;
                            case R.id.lata:
                                number=Double.parseDouble(numer);
                                wynik=number*0.007054792389916082;
                                textView.setText(String.valueOf(wynik));
                                break;
                            case R.id.dekady:
                                number=Double.parseDouble(numer);
                                wynik=number*0.0004409245243697551;
                                textView.setText(String.valueOf(wynik));
                                break;
                            default:
                                break;
                        }
                        break;
                }
            }
        });
    }


}