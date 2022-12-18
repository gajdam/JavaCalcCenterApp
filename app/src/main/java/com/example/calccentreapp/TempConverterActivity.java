package com.example.calccentreapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TempConverterActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_converter);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        radioGroup = findViewById(R.id.radioGroup);
        textView = findViewById(R.id.text_view_selected);

        Button buttonApply = findViewById(R.id.button_apply);
        buttonApply.setOnClickListener(new View.OnClickListener()
        {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v)
            {
                int radioId = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(radioId);
                TextView wyniki=(TextView)findViewById(R.id.liczba);
                double wynikiDouble=Double.parseDouble(String.valueOf(wyniki.getText()));
                BigDecimal cel;
                BigDecimal faren;
                BigDecimal kel;
                BigDecimal del;
                BigDecimal rea;
                BigDecimal ran;
                BigDecimal rom;
                BigDecimal newton;

                if (radioId==R.id.cel)  //celsjusze
                {
                    cel=BigDecimal.valueOf(wynikiDouble);
                    faren=BigDecimal.valueOf(32+9/5d*wynikiDouble);
                    kel=BigDecimal.valueOf(wynikiDouble+273.15);
                    del=BigDecimal.valueOf(150d-wynikiDouble*1.5d);
                    rea=BigDecimal.valueOf(wynikiDouble*0.8d);
                    ran=BigDecimal.valueOf(wynikiDouble*1.8+491.67);
                    rom=BigDecimal.valueOf(wynikiDouble*21d/40d+7.5);
                    newton=BigDecimal.valueOf(wynikiDouble*0.33d);

                    textView.setText("Stopnie Celsjusza: "+cel.setScale(3, RoundingMode.HALF_DOWN)+
                            "\nStopnie Farenheita: "+faren.setScale(3, RoundingMode.HALF_UP)+
                            "\nKelwiny: "+kel.setScale(3, RoundingMode.HALF_UP)+
                            "\nStopnie Delisle'a: "+del.setScale(2, RoundingMode.HALF_UP)+
                            "\nStopnie Réaumura: "+rea.setScale(3, RoundingMode.HALF_UP)+
                            "\nStopnie Rankine'a: "+ran.setScale(3, RoundingMode.HALF_UP)+
                            "\nStopnie Romera: "+rom.setScale(3, RoundingMode.HALF_UP)+
                            "\nNewtony: "+newton.setScale(8, RoundingMode.HALF_UP));
                }
                else if (radioId==R.id.faren) //
                {
                    cel=BigDecimal.valueOf(5/9d*(wynikiDouble-32));
                    faren=BigDecimal.valueOf(wynikiDouble);
                    kel=BigDecimal.valueOf((wynikiDouble+459.67)*5/9);
                    del=BigDecimal.valueOf((212-wynikiDouble)*5/6);
                    rea=BigDecimal.valueOf((wynikiDouble-32)*0.44444);
                    ran=BigDecimal.valueOf(wynikiDouble+459.67);
                    rom=BigDecimal.valueOf(((wynikiDouble-32)*0.29167)+7.50);
                    newton=BigDecimal.valueOf((wynikiDouble-32)*0.18333);

                    textView.setText("Stopnie Celsjusza: "+cel.setScale(3, RoundingMode.HALF_DOWN)+
                            "\nStopnie Farenheita: "+faren.setScale(3, RoundingMode.HALF_UP)+
                            "\nKelwiny: "+kel.setScale(3, RoundingMode.HALF_UP)+
                            "\nStopnie Delisle'a: "+del.setScale(2, RoundingMode.HALF_UP)+
                            "\nStopnie Réaumura: "+rea.setScale(3, RoundingMode.HALF_UP)+
                            "\nStopnie Rankine'a: "+ran.setScale(3, RoundingMode.HALF_UP)+
                            "\nStopnie Romera: "+rom.setScale(3, RoundingMode.HALF_UP)+
                            "\nNewtony: "+newton.setScale(8, RoundingMode.HALF_UP));
                }
                else if (radioId==R.id.kel)
                {
                    cel=BigDecimal.valueOf(wynikiDouble-273.15);
                    faren=BigDecimal.valueOf(wynikiDouble*5/9d-459.67);
                    kel=BigDecimal.valueOf(wynikiDouble);
                    del=BigDecimal.valueOf((373.15-wynikiDouble)*3/2d);
                    rea=BigDecimal.valueOf((wynikiDouble - 273.15) * 4/5);
                    ran=BigDecimal.valueOf(wynikiDouble*9/5d);
                    rom=BigDecimal.valueOf(((wynikiDouble - 273.15) * 0.525) + 7.5);
                    newton=BigDecimal.valueOf((wynikiDouble - 273.15) * 33/100);

                    textView.setText("Stopnie Celsjusza: "+cel.setScale(3, RoundingMode.HALF_DOWN)+
                            "\nStopnie Farenheita: "+faren.setScale(3, RoundingMode.HALF_UP)+
                            "\nKelwiny: "+kel.setScale(3, RoundingMode.HALF_UP)+
                            "\nStopnie Delisle'a: "+del.setScale(2, RoundingMode.HALF_UP)+
                            "\nStopnie Réaumura: "+rea.setScale(3, RoundingMode.HALF_UP)+
                            "\nStopnie Rankine'a: "+ran.setScale(3, RoundingMode.HALF_UP)+
                            "\nStopnie Romera: "+rom.setScale(3, RoundingMode.HALF_UP)+
                            "\nNewtony: "+newton.setScale(8, RoundingMode.HALF_UP));
                }
                else if (radioId==R.id.del)
                {
                    cel=BigDecimal.valueOf(100 - wynikiDouble * 2/3);
                    faren=BigDecimal.valueOf(212 - wynikiDouble * 6/5);
                    kel=BigDecimal.valueOf(373.15 - wynikiDouble * 2/3);
                    del=BigDecimal.valueOf(wynikiDouble);
                    rea=BigDecimal.valueOf(80 - wynikiDouble * 8/15);
                    ran=BigDecimal.valueOf(671.67 - wynikiDouble * 6/5);
                    rom=BigDecimal.valueOf(60 - wynikiDouble * 7/20);
                    newton=BigDecimal.valueOf(33 - wynikiDouble * 11/50);

                    textView.setText("Stopnie Celsjusza: "+cel.setScale(3, RoundingMode.HALF_DOWN)+
                            "\nStopnie Farenheita: "+faren.setScale(3, RoundingMode.HALF_UP)+
                            "\nKelwiny: "+kel.setScale(3, RoundingMode.HALF_UP)+
                            "\nStopnie Delisle'a: "+del.setScale(2, RoundingMode.HALF_UP)+
                            "\nStopnie Réaumura: "+rea.setScale(3, RoundingMode.HALF_UP)+
                            "\nStopnie Rankine'a: "+ran.setScale(3, RoundingMode.HALF_UP)+
                            "\nStopnie Romera: "+rom.setScale(3, RoundingMode.HALF_UP)+
                            "\nNewtony: "+newton.setScale(8, RoundingMode.HALF_UP));
                }
                else if (radioId==R.id.rea)
                {
                    cel=BigDecimal.valueOf(wynikiDouble * 5/4);
                    faren=BigDecimal.valueOf(wynikiDouble * 9/4 + 32);
                    kel=BigDecimal.valueOf(wynikiDouble * 5/4 + 273.15 );
                    del=BigDecimal.valueOf((80 - wynikiDouble) * 15/8);
                    rea=BigDecimal.valueOf(wynikiDouble);
                    ran=BigDecimal.valueOf(wynikiDouble * 9/4 + 491.67);
                    rom=BigDecimal.valueOf(wynikiDouble * 21/32 + 7.5);
                    newton=BigDecimal.valueOf(wynikiDouble * 33/80);

                    textView.setText("Stopnie Celsjusza: "+cel.setScale(3, RoundingMode.HALF_DOWN)+
                            "\nStopnie Farenheita: "+faren.setScale(3, RoundingMode.HALF_UP)+
                            "\nKelwiny: "+kel.setScale(3, RoundingMode.HALF_UP)+
                            "\nStopnie Delisle'a: "+del.setScale(2, RoundingMode.HALF_UP)+
                            "\nStopnie Réaumura: "+rea.setScale(3, RoundingMode.HALF_UP)+
                            "\nStopnie Rankine'a: "+ran.setScale(3, RoundingMode.HALF_UP)+
                            "\nStopnie Romera: "+rom.setScale(3, RoundingMode.HALF_UP)+
                            "\nNewtony: "+newton.setScale(8, RoundingMode.HALF_UP));
                }
                else if (radioId==R.id.ran)
                {
                    cel=BigDecimal.valueOf((wynikiDouble - 491.67) * 5/9);
                    faren=BigDecimal.valueOf(wynikiDouble- 459.67);
                    kel=BigDecimal.valueOf(wynikiDouble*5/9 );
                    del=BigDecimal.valueOf((671.67 - wynikiDouble) * 5/6);
                    rea=BigDecimal.valueOf((wynikiDouble - 491.67) * 4/9);
                    ran=BigDecimal.valueOf(wynikiDouble);
                    rom=BigDecimal.valueOf((wynikiDouble - 491.67) * 7/24 + 7.5);
                    newton=BigDecimal.valueOf((wynikiDouble - 491.67) * 11/60);

                    textView.setText("Stopnie Celsjusza: "+cel.setScale(3, RoundingMode.HALF_DOWN)+
                            "\nStopnie Farenheita: "+faren.setScale(3, RoundingMode.HALF_UP)+
                            "\nKelwiny: "+kel.setScale(3, RoundingMode.HALF_UP)+
                            "\nStopnie Delisle'a: "+del.setScale(2, RoundingMode.HALF_UP)+
                            "\nStopnie Réaumura: "+rea.setScale(3, RoundingMode.HALF_UP)+
                            "\nStopnie Rankine'a: "+ran.setScale(3, RoundingMode.HALF_UP)+
                            "\nStopnie Romera: "+rom.setScale(3, RoundingMode.HALF_UP)+
                            "\nNewtony: "+newton.setScale(8, RoundingMode.HALF_UP));
                }
                else if (radioId==R.id.rom)
                {
                    cel=BigDecimal.valueOf((wynikiDouble - 7.5) * 40/21);
                    faren=BigDecimal.valueOf((wynikiDouble - 7.5) * 24/7 + 32);
                    kel=BigDecimal.valueOf((wynikiDouble - 7.5) * 40/21 + 273.15 );
                    del=BigDecimal.valueOf((60 - wynikiDouble) * 20/7);
                    rea=BigDecimal.valueOf((wynikiDouble - 7.5) * 32/21);
                    ran=BigDecimal.valueOf((wynikiDouble + 7.5) * 24/ 7 + 491.67);
                    rom=BigDecimal.valueOf(wynikiDouble);
                    newton=BigDecimal.valueOf((wynikiDouble - 7.5) * 22/35);

                    textView.setText("Stopnie Celsjusza: "+cel.setScale(3, RoundingMode.HALF_DOWN)+
                            "\nStopnie Farenheita: "+faren.setScale(3, RoundingMode.HALF_UP)+
                            "\nKelwiny: "+kel.setScale(3, RoundingMode.HALF_UP)+
                            "\nStopnie Delisle'a: "+del.setScale(2, RoundingMode.HALF_UP)+
                            "\nStopnie Réaumura: "+rea.setScale(3, RoundingMode.HALF_UP)+
                            "\nStopnie Rankine'a: "+ran.setScale(3, RoundingMode.HALF_UP)+
                            "\nStopnie Romera: "+rom.setScale(3, RoundingMode.HALF_UP)+
                            "\nNewtony: "+newton.setScale(8, RoundingMode.HALF_UP));
                }
                else if (radioId==R.id.newton)
                {
                    cel=BigDecimal.valueOf(wynikiDouble*100/33);
                    faren=BigDecimal.valueOf(wynikiDouble * 60/11 + 32);
                    kel=BigDecimal.valueOf(wynikiDouble * 100/33 + 273.15 );
                    del=BigDecimal.valueOf((33 - wynikiDouble) * 50/11);
                    rea=BigDecimal.valueOf(wynikiDouble * 80/33);
                    ran=BigDecimal.valueOf(wynikiDouble * 60/11 + 491.67);
                    rom=BigDecimal.valueOf(wynikiDouble * 35/22 + 7.5);
                    newton=BigDecimal.valueOf(wynikiDouble );

                    textView.setText("Stopnie Celsjusza: "+cel.setScale(3, RoundingMode.HALF_DOWN)+
                            "\nStopnie Farenheita: "+faren.setScale(3, RoundingMode.HALF_UP)+
                            "\nKelwiny: "+kel.setScale(3, RoundingMode.HALF_UP)+
                            "\nStopnie Delisle'a: "+del.setScale(2, RoundingMode.HALF_UP)+
                            "\nStopnie Réaumura: "+rea.setScale(3, RoundingMode.HALF_UP)+
                            "\nStopnie Rankine'a: "+ran.setScale(3, RoundingMode.HALF_UP)+
                            "\nStopnie Romera: "+rom.setScale(3, RoundingMode.HALF_UP)+
                            "\nNewtony: "+newton.setScale(8, RoundingMode.HALF_UP));
                }
            }
        });
    }

    public void checkButton(View v)
    {
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
    }
}