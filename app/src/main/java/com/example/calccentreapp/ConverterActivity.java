package com.example.calccentreapp;

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

public class ConverterActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);

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
                BigDecimal mili;
                BigDecimal centy;
                BigDecimal metr;
                BigDecimal kilo;
                BigDecimal cale;
                BigDecimal stopy;
                BigDecimal jardy;
                BigDecimal mile;

                if (radioId==R.id.mili)  //milimetry
                {
                    mili= BigDecimal.valueOf(wynikiDouble);
                    centy=BigDecimal.valueOf(wynikiDouble*0.1d);
                    metr=BigDecimal.valueOf(wynikiDouble*0.001d);
                    kilo=BigDecimal.valueOf(wynikiDouble*0.000001d);
                    cale=BigDecimal.valueOf(wynikiDouble*0.0393700787d);
                    stopy=BigDecimal.valueOf(wynikiDouble*0.0032808399d);
                    jardy=BigDecimal.valueOf(wynikiDouble*0.0010936133d);
                    mile=BigDecimal.valueOf(wynikiDouble*0.000621371192d*0.001d);

                    textView.setText("Milimetry: "+mili.setScale(3, RoundingMode.HALF_DOWN)+
                            "\nCentrymetry: "+centy.setScale(3, RoundingMode.HALF_UP)+
                            "\nMetry: "+metr.setScale(3, RoundingMode.HALF_UP)+
                            "\nKilometry: "+kilo.setScale(8, RoundingMode.HALF_UP)+
                            "\nCale: "+cale.setScale(3, RoundingMode.HALF_UP)+
                            "\nStopy: "+stopy.setScale(3, RoundingMode.HALF_UP)+
                            "\nJardy: "+jardy.setScale(3, RoundingMode.HALF_UP)+
                            "\nMile: "+mile.setScale(8, RoundingMode.HALF_UP));
                }
                else if (radioId==R.id.centy) //centymetry
                {
                    mili=BigDecimal.valueOf(wynikiDouble*10d);
                    centy=BigDecimal.valueOf(wynikiDouble);
                    metr=BigDecimal.valueOf(wynikiDouble*0.01d);
                    kilo=BigDecimal.valueOf(wynikiDouble*0.00001d);
                    cale=BigDecimal.valueOf(wynikiDouble*0.393700787d);
                    stopy=BigDecimal.valueOf(wynikiDouble*0.032808399d);
                    jardy=BigDecimal.valueOf(wynikiDouble*0.010936133d);
                    mile=BigDecimal.valueOf(wynikiDouble*0.000621371192d*0.01d);

                    textView.setText("Milimetry: "+mili.setScale(3, RoundingMode.HALF_DOWN)+
                            "\nCentrymetry: "+centy.setScale(3, RoundingMode.HALF_UP)+
                            "\nMetry: "+metr.setScale(3, RoundingMode.HALF_UP)+
                            "\nKilometry: "+kilo.setScale(8, RoundingMode.HALF_UP)+
                            "\nCale: "+cale.setScale(3, RoundingMode.HALF_UP)+
                            "\nStopy: "+stopy.setScale(3, RoundingMode.HALF_UP)+
                            "\nJardy: "+jardy.setScale(3, RoundingMode.HALF_UP)+
                            "\nMile: "+mile.setScale(8, RoundingMode.HALF_UP));
                }
                else if (radioId==R.id.metry)
                {
                    mili=BigDecimal.valueOf(wynikiDouble*1000d);
                    centy=BigDecimal.valueOf(wynikiDouble*100);
                    metr=BigDecimal.valueOf(wynikiDouble);
                    kilo=BigDecimal.valueOf(wynikiDouble*0.001d);
                    cale=BigDecimal.valueOf(wynikiDouble*39.3700787d);
                    stopy=BigDecimal.valueOf(wynikiDouble*3.2808399d);
                    jardy=BigDecimal.valueOf(wynikiDouble*1.0936133d);
                    mile=BigDecimal.valueOf(wynikiDouble*0.000621371192d);

                    textView.setText("Milimetry: "+mili.setScale(3, RoundingMode.HALF_DOWN)+
                            "\nCentrymetry: "+centy.setScale(3, RoundingMode.HALF_UP)+
                            "\nMetry: "+metr.setScale(3, RoundingMode.HALF_UP)+
                            "\nKilometry: "+kilo.setScale(3, RoundingMode.HALF_UP)+
                            "\nCale: "+cale.setScale(3, RoundingMode.HALF_UP)+
                            "\nStopy: "+stopy.setScale(3, RoundingMode.HALF_UP)+
                            "\nJardy: "+jardy.setScale(3, RoundingMode.HALF_UP)+
                            "\nMile: "+mile.setScale(8, RoundingMode.HALF_UP));
                }
                else if (radioId==R.id.kilome)
                {
                    mili=BigDecimal.valueOf(wynikiDouble*1000000d);
                    centy=BigDecimal.valueOf(wynikiDouble*100000d);
                    metr=BigDecimal.valueOf(wynikiDouble*1000d);
                    kilo=BigDecimal.valueOf(wynikiDouble);
                    cale=BigDecimal.valueOf(wynikiDouble*39370.0787d);
                    stopy=BigDecimal.valueOf(wynikiDouble*3280.8399d);
                    jardy=BigDecimal.valueOf(wynikiDouble*1093.6133d);
                    mile=BigDecimal.valueOf(wynikiDouble*0.621371192d);

                    textView.setText("Milimetry: "+mili.setScale(3, RoundingMode.HALF_DOWN)+
                            "\nCentrymetry: "+centy.setScale(3, RoundingMode.HALF_UP)+
                            "\nMetry: "+metr.setScale(3, RoundingMode.HALF_UP)+
                            "\nKilometry: "+kilo.setScale(2, RoundingMode.HALF_UP)+
                            "\nCale: "+cale.setScale(3, RoundingMode.HALF_UP)+
                            "\nStopy: "+stopy.setScale(3, RoundingMode.HALF_UP)+
                            "\nJardy: "+jardy.setScale(3, RoundingMode.HALF_UP)+
                            "\nMile: "+mile.setScale(8, RoundingMode.HALF_UP));
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