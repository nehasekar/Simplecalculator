package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ADD(View view) {
        EditText input1 = findViewById(R.id.input1);
        int a = Integer.parseInt(input1.getText().toString());
        EditText input2 = findViewById(R.id.input2);
        int b = Integer.parseInt(input2.getText().toString());
        int result = a + b;
        TextView ans = findViewById(R.id.sum);
        ans.setText(String.valueOf(result));
    }

    public void SUB(View view) {
        EditText input1 = findViewById(R.id.input1);
        int a = Integer.parseInt(input1.getText().toString());
        EditText input2 = findViewById(R.id.input2);
        int b = Integer.parseInt(input2.getText().toString());
        int result = a - b;
        TextView ans = findViewById(R.id.sum);
        ans.setText(String.valueOf(result));
    }

    public void MUL(View view) {
        EditText input1 = findViewById(R.id.input1);
        int a = Integer.parseInt(input1.getText().toString());
        EditText input2 = findViewById(R.id.input2);
        int b = Integer.parseInt(input2.getText().toString());
        int result = a * b;
        TextView ans = findViewById(R.id.sum);
        ans.setText(String.valueOf(result));
    }

    public void DIV(View view) {
        EditText input1 = findViewById(R.id.input1);
        int a = Integer.parseInt(input1.getText().toString());
        EditText input2 = findViewById(R.id.input2);
        int b = Integer.parseInt(input2.getText().toString());
        int result = a / b;
        TextView ans = findViewById(R.id.sum);
        ans.setText(String.valueOf(result));
    }

}