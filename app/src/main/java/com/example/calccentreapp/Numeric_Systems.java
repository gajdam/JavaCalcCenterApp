package com.example.calccentreapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Locale;

public class Numeric_Systems extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioGroup radioGroup2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeric_systems);

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
                int number;
                switch (radioId2)
                {
                    case R.id.decimal2:
                        switch(radioId)
                        {
                            case R.id.binary:
                                number=Integer.parseInt(numer);
                                textView.setText(Integer.toBinaryString(number));
                                break;
                            case R.id.octal:
                                number=Integer.parseInt(numer);
                                textView.setText(Integer.toOctalString(number));
                                break;
                            case R.id.hexdecimal:
                                number=Integer.parseInt(numer);
                                textView.setText(Integer.toHexString(number).toUpperCase(Locale.ROOT));
                                break;
                            default:
                                break;
                        }
                        break;
                    case R.id.binary2:
                        switch (radioId)
                        {
                            case R.id.decimal:
                                number=Integer.parseInt(numer);
                                int x=Integer.valueOf(numer, 2);
                                String octal=Integer.toString(x,8);
                                String hex=Integer.toHexString(x);
                                textView.setText(Integer.valueOf(numer, 2).toString());
                                break;
                            case R.id.octal:
                                number=Integer.parseInt(numer);
                                x=Integer.valueOf(numer, 2);
                                octal=Integer.toString(x,8);
                                textView.setText(octal.toString());
                                break;
                            case R.id.hexdecimal:
                                x=Integer.valueOf(numer, 2);
                                hex=Integer.toHexString(x);
                                textView.setText(hex.toUpperCase(Locale.ROOT));
                                break;
                            default:
                                break;
                        }
                        break;
                    case R.id.octal2:
                        switch(radioId)
                        {
                            case R.id.decimal:
                                int x=Integer.valueOf(numer, 8);
                               number=Integer.parseInt(numer);
                              String bin=Integer.toBinaryString(x);
                              String hex=Integer.toHexString(x);
                              textView.setText(Integer.valueOf(numer, 8).toString());
                              break;
                            case R.id.binary:
                                x=Integer.valueOf(numer, 8);
                                number=Integer.parseInt(numer);
                                 bin=Integer.toBinaryString(x);
                                 hex=Integer.toHexString(x);
                                textView.setText(bin);
                                break;
                            case R.id.hexdecimal:
                                x=Integer.valueOf(numer, 8);
                                number=Integer.parseInt(numer);
                                bin=Integer.toBinaryString(x);
                                hex=Integer.toHexString(x);
                                textView.setText(hex);
                                break;
                            default:
                                break;
                        }
                        break;
                    case R.id.hexdecimal2:
                        switch(radioId)
                        {
                            case R.id.decimal:
                                int x=Integer.valueOf(numer, 16);
                                String bin=Integer.toBinaryString(x);
                                String octal=Integer.toOctalString(x);
                                textView.setText(Integer.valueOf(numer, 16).toString());
                                break;
                            case R.id.binary:
                                 x=Integer.valueOf(numer, 16);
                                 bin=Integer.toBinaryString(x);
                                octal=Integer.toOctalString(x);
                                textView.setText(bin);
                                break;
                            case R.id.octal:
                                 x=Integer.valueOf(numer, 16);
                                bin=Integer.toBinaryString(x);
                                 octal=Integer.toOctalString(x);
                                textView.setText(octal);
                            default:
                                break;
                        }
                        break;
                }
            }
        });
    }
}