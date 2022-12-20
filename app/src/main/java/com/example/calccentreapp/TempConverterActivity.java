package com.example.calccentreapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TempConverterActivity extends AppCompatActivity {


    String[] TempNames={"Celsjusz","Farenheit","Kelwin","Delisle","Réaumur","Rankine","Romer","Newton"};
    String From,To;
    TextView textView;
    Button Converter_button;
    android.widget.EditText EditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_converter);
        EditText=findViewById(R.id.EditText);
        textView=findViewById(R.id.textView);
        Converter_button=findViewById(R.id.Converter_button);
        Spinner numberspinner =(Spinner)findViewById(R.id.From);
        Spinner numberspinner2=(Spinner)findViewById(R.id.To);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,TempNames);
        numberspinner.setAdapter(adapter);
        numberspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(TempConverterActivity.this,"Connvert From "+adapterView.getSelectedItem().toString(),Toast.LENGTH_SHORT).show();
                From= adapterView.getSelectedItem().toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        ArrayAdapter adapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,TempNames);
        numberspinner2.setAdapter(adapter);
        numberspinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(TempConverterActivity.this,"Convert To "+adapterView.getSelectedItem().toString(),Toast.LENGTH_SHORT).show();
                To= adapterView.getSelectedItem().toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        Converter_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cyfra_podana= EditText.getText().toString();
                Double cyfra_wyjscie=Double.parseDouble(cyfra_podana);
                if(From.equals("Celsjusz")&&To.equals("Celsjusz"))
                {
                    double result=cyfra_wyjscie;
                    textView.setText("Result "+result);
                }
                else if(From.equals("Celsjusz")&&To.equals("Farenheit"))
                {
                    double result =32+9/5d*cyfra_wyjscie;
                    textView.setText("Result " + result);
                }
                else if(From.equals("Celsjusz")&&To.equals("Kelwin"))
                {
                    double result =cyfra_wyjscie+273.15;
                    textView.setText("Result " + result);
                }
                else if(From.equals("Celsjusz")&&To.equals("Delisle"))
                {
                    double result=150d-cyfra_wyjscie*1.5d;
                    textView.setText("Result "+result);
                }
                else if(From.equals("Celsjusz")&&To.equals("Réaumur"))
                {
                    double result =cyfra_wyjscie*0.8d;
                    textView.setText("Result " + result);
                }
                else if(From.equals("Celsjusz")&&To.equals("Rankine"))
                {
                    double result =cyfra_wyjscie*1.8+491.67;
                    textView.setText("Result " + result);
                }
                else if(From.equals("Celsjusz")&&To.equals("Romer"))
                {
                    double result =cyfra_wyjscie*21d/40d+7.5;
                    textView.setText("Result " + result);
                }
                else if(From.equals("Celsjusz")&&To.equals("Newton"))
                {
                    double result =cyfra_wyjscie*0.33d;
                    textView.setText("Result " + result);
                }
                ///// Faren \/

                if(From.equals("Farenheit")&&To.equals("Celsjusz"))
                {
                    double result=5/9d*(cyfra_wyjscie-32);
                    textView.setText("Result "+result);
                }
                else if(From.equals("Farenheit")&&To.equals("Farenheit"))
                {
                    double result =cyfra_wyjscie;
                    textView.setText("Result " + result);
                }
                else if(From.equals("Farenheit")&&To.equals("Kelwin"))
                {
                    double result =(cyfra_wyjscie+459.67)*5/9;
                    textView.setText("Result " + result);
                }
                else if(From.equals("Farenheit")&&To.equals("Delisle"))
                {
                    double result=(212-cyfra_wyjscie)*5/6;
                    textView.setText("Result "+result);
                }
                else if(From.equals("Farenheit")&&To.equals("Réaumur"))
                {
                    double result =(cyfra_wyjscie-32)*0.44444;
                    textView.setText("Result " + result);
                }
                else if(From.equals("Farenheit")&&To.equals("Rankine"))
                {
                    double result =cyfra_wyjscie+459.67;
                    textView.setText("Result " + result);
                }
                else if(From.equals("Farenheit")&&To.equals("Romer"))
                {
                    double result =((cyfra_wyjscie-32)*0.29167)+7.50;
                    textView.setText("Result " + result);
                }
                else if(From.equals("Farenheit")&&To.equals("Newton"))
                {
                    double result =(cyfra_wyjscie-32)*0.18333;
                    textView.setText("Result " + result);
                }

                ////////Kel

                if(From.equals("Kelwin")&&To.equals("Celsjusz"))
                {
                    double result=cyfra_wyjscie-273.15;
                    textView.setText("Result "+result);
                }
                else if(From.equals("Kelwin")&&To.equals("Farenheit"))
                {
                    double result =cyfra_wyjscie*5/9d-459.67;
                    textView.setText("Result " + result);
                }
                else if(From.equals("Kelwin")&&To.equals("Kelwin"))
                {
                    double result =cyfra_wyjscie;
                    textView.setText("Result " + result);
                }
                else if(From.equals("Kelwin")&&To.equals("Delisle"))
                {
                    double result=(373.15-cyfra_wyjscie)*3/2d;
                    textView.setText("Result "+result);
                }
                else if(From.equals("Kelwin")&&To.equals("Réaumur"))
                {
                    double result =(cyfra_wyjscie - 273.15) * 4/5;
                    textView.setText("Result " + result);
                }
                else if(From.equals("Kelwin")&&To.equals("Rankine"))
                {
                    double result =cyfra_wyjscie*9/5d;
                    textView.setText("Result " + result);
                }
                else if(From.equals("Kelwin")&&To.equals("Romer"))
                {
                    double result =((cyfra_wyjscie- 273.15) * 0.525) + 7.5;
                    textView.setText("Result " + result);
                }
                else if(From.equals("Kelwin")&&To.equals("Newton"))
                {
                    double result =(cyfra_wyjscie-273.15) * 33/100;
                    textView.setText("Result " + result);
                }

                // del

                if(From.equals("Delisle")&&To.equals("Celsjusz"))
                {
                    double result=100 - cyfra_wyjscie * 2/3;
                    textView.setText("Result "+result);
                }
                else if(From.equals("Delisle")&&To.equals("Farenheit"))
                {
                    double result =212 -cyfra_wyjscie * 6/5;
                    textView.setText("Result " + result);
                }
                else if(From.equals("Delisle")&&To.equals("Kelwin"))
                {
                    double result =373.15 -cyfra_wyjscie * 2/3;
                    textView.setText("Result " + result);
                }
                else if(From.equals("Delisle")&&To.equals("Delisle"))
                {
                    double result=cyfra_wyjscie;
                    textView.setText("Result "+result);
                }
                else if(From.equals("Delisle")&&To.equals("Réaumur"))
                {
                    double result =80 - cyfra_wyjscie * 8/15;
                    textView.setText("Result " + result);
                }
                else if(From.equals("Delisle")&&To.equals("Rankine"))
                {
                    double result =671.67 - cyfra_wyjscie * 6/5;
                    textView.setText("Result " + result);
                }
                else if(From.equals("Delisle")&&To.equals("Romer"))
                {
                    double result =60 - cyfra_wyjscie * 7/20;
                    textView.setText("Result " + result);
                }
                else if(From.equals("Delisle")&&To.equals("Newton"))
                {
                    double result =33 - cyfra_wyjscie * 11/50;
                    textView.setText("Result " + result);
                }
                /////rea

                if(From.equals("Réaumur")&&To.equals("Celsjusz"))
                {
                    double result=100 - cyfra_wyjscie * 5/4;
                    textView.setText("Result "+result);
                }
                else if(From.equals("Réaumur")&&To.equals("Farenheit"))
                {
                    double result =cyfra_wyjscie * 9/4 + 32;
                    textView.setText("Result " + result);
                }
                else if(From.equals("Réaumur")&&To.equals("Kelwin"))
                {
                    double result =cyfra_wyjscie * 5/4 + 273.15;
                    textView.setText("Result " + result);
                }
                else if(From.equals("Réaumur")&&To.equals("Delisle"))
                {
                    double result=(80 - cyfra_wyjscie) * 15/8;
                    textView.setText("Result "+result);
                }
                else if(From.equals("Réaumur")&&To.equals("Réaumur"))
                {
                    double result =cyfra_wyjscie;
                    textView.setText("Result " + result);
                }
                else if(From.equals("Réaumur")&&To.equals("Rankine"))
                {
                    double result =cyfra_wyjscie * 9/4 + 491.67;
                    textView.setText("Result " + result);
                }
                else if(From.equals("Réaumur")&&To.equals("Romer"))
                {
                    double result =cyfra_wyjscie * 21/32 + 7.5;
                    textView.setText("Result " + result);
                }
                else if(From.equals("Réaumur")&&To.equals("Newton"))
                {
                    double result =cyfra_wyjscie * 33/80;
                    textView.setText("Result " + result);
                }

                /// ran

                if(From.equals("Rankine")&&To.equals("Celsjusz"))
                {
                    double result=(cyfra_wyjscie - 491.67) * 5/9;
                    textView.setText("Result "+result);
                }
                else if(From.equals("Rankine")&&To.equals("Farenheit"))
                {
                    double result =cyfra_wyjscie - 459.67;
                    textView.setText("Result " + result);
                }
                else if(From.equals("Rankine")&&To.equals("Kelwin"))
                {
                    double result =cyfra_wyjscie*5/9;
                    textView.setText("Result " + result);
                }
                else if(From.equals("Rankine")&&To.equals("Delisle"))
                {
                    double result=(671.67 - cyfra_wyjscie) * 5/6;
                    textView.setText("Result "+result);
                }
                else if(From.equals("Rankine")&&To.equals("Réaumur"))
                {
                    double result =(cyfra_wyjscie - 491.67) * 4/9;
                    textView.setText("Result " + result);
                }
                else if(From.equals("Rankine")&&To.equals("Rankine"))
                {
                    double result =cyfra_wyjscie;
                    textView.setText("Result " + result);
                }
                else if(From.equals("Rankine")&&To.equals("Romer"))
                {
                    double result =(cyfra_wyjscie - 491.67) * 7/24 + 7.5;
                    textView.setText("Result " + result);
                }
                else if(From.equals("Rankine")&&To.equals("Newton"))
                {
                    double result =(cyfra_wyjscie - 491.67) * 11/60;
                    textView.setText("Result " + result);
                }

                //rom


                if(From.equals("Romera")&&To.equals("Celsjusz"))
                {
                    double result=((cyfra_wyjscie - 7.5) * 40/21);
                    textView.setText("Result "+result);
                }
                else if(From.equals("Romer")&&To.equals("Farenheit"))
                {
                    double result =(cyfra_wyjscie - 7.5) * 24/7 + 32;
                    textView.setText("Result " + result);
                }
                else if(From.equals("Romer")&&To.equals("Kelwin"))
                {
                    double result =(cyfra_wyjscie - 7.5) * 40/21 + 273.15 ;
                    textView.setText("Result " + result);
                }
                else if(From.equals("Romer")&&To.equals("Delisle"))
                {
                    double result=(60 - cyfra_wyjscie) * 20/7;
                    textView.setText("Result "+result);
                }
                else if(From.equals("Romer")&&To.equals("Réaumur"))
                {
                    double result =(cyfra_wyjscie - 7.5) * 32/21;
                    textView.setText("Result " + result);
                }
                else if(From.equals("Romer")&&To.equals("Rankine"))
                {
                    double result =(cyfra_wyjscie + 7.5) * 24/ 7 + 491.67;
                    textView.setText("Result " + result);
                }
                else if(From.equals("Romer")&&To.equals("Romer"))
                {
                    double result =cyfra_wyjscie;
                    textView.setText("Result " + result);
                }
                else if(From.equals("Romer")&&To.equals("Newton"))
                {
                    double result =(cyfra_wyjscie - 7.5) * 22/35;
                    textView.setText("Result " + result);
                }

                // newton

                if(From.equals("Newton")&&To.equals("Celsjusz"))
                {
                    double result=cyfra_wyjscie *100/33;
                    textView.setText("Result "+result);
                }
                else if(From.equals("Newton")&&To.equals("Farenheit"))
                {
                    double result =cyfra_wyjscie  * 60/11 + 32;
                    textView.setText("Result " + result);
                }
                else if(From.equals("Newton")&&To.equals("Kelwin"))
                {
                    double result =cyfra_wyjscie  * 100/33 + 273.15;
                    textView.setText("Result " + result);
                }
                else if(From.equals("Newton")&&To.equals("Delisle"))
                {
                    double result=(33 - cyfra_wyjscie) * 50/11;
                    textView.setText("Result "+result);
                }
                else if(From.equals("Newton")&&To.equals("Réaumur"))
                {
                    double result =cyfra_wyjscie * 80/33;
                    textView.setText("Result " + result);
                }
                else if(From.equals("Newton")&&To.equals("Rankine"))
                {
                    double result =cyfra_wyjscie * 60/11 + 491.67;
                    textView.setText("Result " + result);
                }
                else if(From.equals("Newton")&&To.equals("Romer"))
                {
                    double result =cyfra_wyjscie * 35/22 + 7.5;
                    textView.setText("Result " + result);
                }
                else if(From.equals("Newton")&&To.equals("Newton"))
                {
                    double result =cyfra_wyjscie;
                    textView.setText("Result " + result);
                }
            }
        });
    }
}