package com.example.lab4_application;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNumber2;
    private EditText editTextNumber;
    private TextView textView6;
    private TextView textView7;
    private TextView textView8;
    private TextView textView9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editTextNumber2 = findViewById(R.id.editTextNumber2);
        editTextNumber = findViewById(R.id.editTextNumber);
        textView6 = findViewById(R.id.textView6);
        textView7 = findViewById(R.id.textView7);
        textView8 = findViewById(R.id.textView8);
        textView9 = findViewById(R.id.textView9);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateResults();

            }
        });
    }

    private void calculateResults() {
        try {
            double num1 = Double.parseDouble(editTextNumber2.getText().toString());
            double num2 = Double.parseDouble(editTextNumber.getText().toString());

            double sum = num1 + num2;
            double subtraction = num1 - num2;
            double product = num1 * num2;
            double quotient = num1 / num2;

            textView6.setText("" + sum);
            textView7.setText("" + quotient);
            textView8.setText("" + product);
            textView9.setText("" + subtraction);
        } catch (NumberFormatException e) {

        }

        }
}