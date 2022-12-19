package com.example.calccentreapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class FromToRomanActivity extends AppCompatActivity {

    private static final int[] values = {
            1000, 900, 500, 400,
            100, 90, 50, 40,
            10, 9, 5, 4,
            1
    };

    private static final String[] symbols = {
            "M", "CM", "D", "CD",
            "C", "XC", "L", "XL",
            "X", "IX", "V", "IV",
            "I"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_from_to_roman);

        final EditText input = findViewById(R.id.txt_from);
        final TextView output = findViewById(R.id.poka);
        Button convertButton = findViewById(R.id.roman_submit);
        Switch choice = (Switch) findViewById(R.id.switch1);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputString = input.getText().toString();

                int inputInt = Integer.parseInt(inputString);
                String outputString = toRoman(inputInt);
                int outputSec = fromRoman(inputString);
                if (!choice.isChecked()) {
                    output.setText(outputString);
                }
                //TODO nie działa
//                if (choice.isChecked()) {
//                    output.setText(outputSec);
//                }
               // output.setText(String.valueOf(outputSec));
            }
        });
    }

    public static String toRoman(int number) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                number -= values[i];
                result.append(symbols[i]);
            }
        }
        return result.toString();
    }
    //TODO gdzieś tu jest problem, ale jeszcze nie wiem gdzie
    public static int fromRoman(String roman) {
        int result = 0;
        for (int i = 0; i < symbols.length; i++) {
            while (roman.startsWith(symbols[i])) {
                result += values[i];
                roman = roman.substring(symbols[i].length());
            }
        }
        return result;
    }
//    public void submit(View view) {
//        EditText input = (EditText) findViewById(R.id.txt_from);
//        TextView output = (TextView) findViewById(R.id.poka);
//        Switch choice = (Switch) findViewById(R.id.switch1);
//        int x = Integer.parseInt(input.getText().toString());
//        if (choice.isChecked()) {
//            output.setText(toRoman(x));
//        }
//        if (!choice.isChecked()) {
//            output.setText(fromRoman(input.getText().toString()));
//        }
//    }

}