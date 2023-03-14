package com.example.laskin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText number1, number2;
    private TextView result, symbol;
    private int n1Int, n2Int, resultInt;
    DecimalFormat df = new DecimalFormat("#.##");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.editTextNumber);
        number2 = findViewById(R.id.editTextNumber2);
        result = findViewById(R.id.textView);
        symbol = findViewById(R.id.textView3);
    }

    public void summary(View view){
        n1Int = Integer.parseInt(number1.getText().toString());
        n2Int = Integer.parseInt(number2.getText().toString());
        resultInt = n1Int + n2Int;
        result.setText(String.valueOf(resultInt));
        symbol.setText("+");
    }

    public void deduction(View view){
        n1Int = Integer.parseInt(number1.getText().toString());
        n2Int = Integer.parseInt(number2.getText().toString());
        resultInt = n1Int - n2Int;
        result.setText(String.valueOf(resultInt));
        symbol.setText("-");
    }

    public void multiplication(View view){
        n1Int = Integer.parseInt(number1.getText().toString());
        n2Int = Integer.parseInt(number2.getText().toString());
        resultInt = n1Int * n2Int;
        result.setText(String.valueOf(resultInt));
        symbol.setText("*");
    }

    public void divide(View view){
        double n1Double = Double.parseDouble(number1.getText().toString());
        double n2Double = Double.parseDouble(number2.getText().toString());
        double resultDouble = n1Double / n2Double;
        result.setText(df.format(resultDouble));
        symbol.setText("/");
    }

}