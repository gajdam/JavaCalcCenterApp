package com.example.calccentreapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import java.util.HashMap;

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
    private static HashMap<Character, Integer> map = new HashMap<>();

    static {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_from_to_roman);

        final EditText input = findViewById(R.id.txt_from);
        final TextView output = findViewById(R.id.poka);
        Button toButton = findViewById(R.id.toRoman_btn);
        Switch choice = findViewById(R.id.switch1);

        toButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!choice.isChecked()) {
                    String inputString = input.getText().toString();
                    int inputInt = Integer.parseInt(inputString);
                    String outputString = toRoman(inputInt);
                    output.setText(outputString);
                }
                else {
                    String inputString = input.getText().toString();
                    int outputInt = fromRoman(inputString);
                    output.setText(String.valueOf(outputInt));
                }





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
        for (int i = 0; i < roman.length(); i++) {
            int current = map.get(roman.charAt(i));
            if (i + 1 < roman.length()) {
                int next = map.get(roman.charAt(i + 1));
                if (current >= next) {
                    result += current;
                } else {
                    result += next - current;
                    i++;
                }
            } else {
                result += current;
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