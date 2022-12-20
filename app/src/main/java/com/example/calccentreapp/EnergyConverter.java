package com.example.calccentreapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class EnergyConverter extends AppCompatActivity {

    String[] PowerNames = {"Volt", "KiloVolt", "MilliVolt"};
    String From, To;
    TextView textView;
    Button Converter_button;
    android.widget.EditText EditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_energy_converter);


        EditText = findViewById(R.id.EditText);
        textView = findViewById(R.id.textView);
        Converter_button = findViewById(R.id.Converter_button);
        Spinner numberspinner = (Spinner) findViewById(R.id.From);
        Spinner numberspinner2 = (Spinner) findViewById(R.id.To);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, PowerNames);
        numberspinner.setAdapter(adapter);
        numberspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(EnergyConverter.this, "Connvert From " + adapterView.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
                From = adapterView.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        ArrayAdapter adapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, PowerNames);
        numberspinner2.setAdapter(adapter);
        numberspinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(EnergyConverter.this, "Convert To " + adapterView.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
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
                if (From.equals("Volt") && To.equals("KiloVolt")) {
                    double result = 0.001 * cyfra_wyjscie;
                    textView.setText("Result " + result);
                } else if (From.equals("Volt") && To.equals("Volt")) {
                    double result = cyfra_wyjscie;
                    textView.setText("Result " + result);
                } else if (From.equals("Volt") && To.equals("MilliVolt")) {
                    double result = cyfra_wyjscie * 12000;
                    textView.setText("Result " + result);
                } else if (From.equals("KiloVolt") && To.equals("KiloVolt")) {
                    double result = cyfra_wyjscie;
                    textView.setText("Result " + result);
                } else if (From.equals("KiloVolt") && To.equals("Volt")) {
                    double result = cyfra_wyjscie * 1000;
                    textView.setText("Result " + result);
                } else if (From.equals("KiloVolt") && To.equals("MilliVolt")) {
                    double result = cyfra_wyjscie * 1000000;
                    textView.setText("Result " + result);
                } else if (From.equals("MilliVolt") && To.equals("KiloVolt")) {
                    double result = cyfra_wyjscie * 0.0000010;
                    textView.setText("Result " + result);
                } else if (From.equals("MilliVolt") && To.equals("Volt")) {
                    double result = cyfra_wyjscie * 0.001;
                    textView.setText("Result " + result);
                } else if (From.equals("MilliVolt") && To.equals("MilliVolt")) {
                    double result = cyfra_wyjscie;
                    textView.setText("Result " + result);
                } else {
                    double result = 0;
                    textView.setText("Result " + result);
                }
            }
        });
    }
}



