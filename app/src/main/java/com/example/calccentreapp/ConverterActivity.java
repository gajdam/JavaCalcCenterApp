package com.example.calccentreapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ConverterActivity extends AppCompatActivity {

    String[] FArNames = {"Milimetry","Centymetry","Metry","Kilometry","Cale","Stopy","Jardy","Mile"};
    String From, To;
    TextView textView;
    Button Converter_button;
    android.widget.EditText EditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);

        EditText = findViewById(R.id.EditText);
        textView = findViewById(R.id.textView);
        Converter_button = findViewById(R.id.Converter_button);
        Spinner numberspinner = (Spinner) findViewById(R.id.From);
        Spinner numberspinner2 = (Spinner) findViewById(R.id.To);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, FArNames);
        numberspinner.setAdapter(adapter);
        numberspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ConverterActivity.this, "Connvert From " + adapterView.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
                From = adapterView.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        ArrayAdapter adapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, FArNames);
        numberspinner2.setAdapter(adapter);
        numberspinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ConverterActivity.this, "Convert To " + adapterView.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
                To = adapterView.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        Converter_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cyfra_podana = EditText.getText().toString();
                Double cyfra_wyjscie = Double.parseDouble(cyfra_podana);

                if (From.equals("Milimetry") && To.equals("Milimetry")) {
                    double result =cyfra_wyjscie;
                    textView.setText("Result " + result);
                } else if (From.equals("Milimetry") && To.equals("Centymetry")) {
                    double result = cyfra_wyjscie*0.1d;
                    textView.setText("Result " + result);
                } else if (From.equals("Milimetry") && To.equals("Metry")) {
                    double result = cyfra_wyjscie*0.001d;
                    textView.setText("Result " + result);
                } else if (From.equals("Milimetry") && To.equals("Kilometry")) {
                    double result = cyfra_wyjscie *0.000001d;
                    textView.setText("Result " + result);
                } else if (From.equals("Milimetry") && To.equals("Cale")) {
                    double result = cyfra_wyjscie*0.0393700787d;
                    textView.setText("Result " + result);
                } else if (From.equals("Milimetry") && To.equals("Stopy")) {
                    double result = cyfra_wyjscie*0.0032808399d;
                    textView.setText("Result " + result);
                } else if (From.equals("Milimetry") && To.equals("Jardy")) {
                    double result = cyfra_wyjscie *0.0010936133d;
                    textView.setText("Result " + result);
                } else if (From.equals("Milimetry") && To.equals("Mile")) {
                    double result = cyfra_wyjscie * 0.000621371192d * 0.001d;
                    textView.setText("Result " + result);
                    ////
                }
                if (From.equals("Centymetry") && To.equals("Milimetry")) {
                    double result =cyfra_wyjscie*10d;
                    textView.setText("Result " + result);
                } else if (From.equals("Centymetry") && To.equals("Centymetry")) {
                    double result = cyfra_wyjscie;
                    textView.setText("Result " + result);
                } else if (From.equals("Centymetry") && To.equals("Metry")) {
                    double result = cyfra_wyjscie*0.01d;
                    textView.setText("Result " + result);
                } else if (From.equals("Centymetry") && To.equals("Kilometry")) {
                    double result = cyfra_wyjscie *0.00001d;
                    textView.setText("Result " + result);
                } else if (From.equals("Centymetry") && To.equals("Cale")) {
                    double result = cyfra_wyjscie*0.393700787d;
                    textView.setText("Result " + result);
                } else if (From.equals("Centymetry") && To.equals("Stopy")) {
                    double result = cyfra_wyjscie*0.032808399d;
                    textView.setText("Result " + result);
                } else if (From.equals("Centymetry") && To.equals("Jardy")) {
                    double result = cyfra_wyjscie*0.010936133d;
                    textView.setText("Result " + result);
                } else if (From.equals("Centymetry") && To.equals("Mile")) {
                    double result = cyfra_wyjscie * 0.000621371192d * 0.01d;
                    textView.setText("Result " + result);
                }
                if (From.equals("Metry") && To.equals("Milimetry")) {
                    double result =cyfra_wyjscie*1000d;
                    textView.setText("Result " + result);
                } else if (From.equals("Metry") && To.equals("Centymetry")) {
                    double result = cyfra_wyjscie*100;
                    textView.setText("Result " + result);
                } else if (From.equals("Metry") && To.equals("Metry")) {
                    double result = cyfra_wyjscie;
                    textView.setText("Result " + result);
                } else if (From.equals("Metry") && To.equals("Kilometry")) {
                    double result = cyfra_wyjscie *0.001d;
                    textView.setText("Result " + result);
                } else if (From.equals("Metry") && To.equals("Cale")) {
                    double result = cyfra_wyjscie*39.3700787d;
                    textView.setText("Result " + result);
                } else if (From.equals("Metry") && To.equals("Stopy")) {
                    double result = cyfra_wyjscie*3.2808399d;
                    textView.setText("Result " + result);
                } else if (From.equals("Metry") && To.equals("Jardy")) {
                    double result = cyfra_wyjscie*1.0936133d;
                    textView.setText("Result " + result);
                } else if (From.equals("Metry") && To.equals("Mile")) {
                    double result = cyfra_wyjscie *0.000621371192d;
                    textView.setText("Result " + result);
                }
                if (From.equals("Kilometry") && To.equals("Milimetry")) {
                    double result =cyfra_wyjscie*1000000d;
                    textView.setText("Result " + result);
                } else if (From.equals("Kilometry") && To.equals("Centymetry")) {
                    double result = cyfra_wyjscie*100000d;
                    textView.setText("Result " + result);
                } else if (From.equals("Kilometry") && To.equals("Metry")) {
                    double result = cyfra_wyjscie*1000d;
                    textView.setText("Result " + result);
                } else if (From.equals("Kilometry") && To.equals("Kilometry")) {
                    double result = cyfra_wyjscie;
                    textView.setText("Result " + result);
                } else if (From.equals("Kilometry") && To.equals("Cale")) {
                    double result = cyfra_wyjscie*39370.0787d;
                    textView.setText("Result " + result);
                } else if (From.equals("Kilometry") && To.equals("Stopy")) {
                    double result = cyfra_wyjscie*3280.8399d;
                    textView.setText("Result " + result);
                } else if (From.equals("Kilometry") && To.equals("Jardy")) {
                    double result = cyfra_wyjscie*1093.6133d;
                    textView.setText("Result " + result);
                } else if (From.equals("Kilometry") && To.equals("Mile")) {
                    double result = cyfra_wyjscie * 0.621371192d;
                    textView.setText("Result " + result);
                }
            }
        });
    }
}