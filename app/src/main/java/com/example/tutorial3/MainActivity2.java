package com.example.tutorial3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    EditText et_num1;
    EditText et_num2;
    TextView tv_answer;

    String number1;
    String number2;

    float n1;
    float n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        et_num1 = findViewById(R.id.et_num1);
        et_num2 = findViewById(R.id.et_num2);
        tv_answer = findViewById(R.id.tv_answer);

        Intent intent = getIntent();
        number1 = intent.getStringExtra("n1");
        number2 = intent.getStringExtra("n2");

        et_num1.setText(number1);
        et_num2.setText(number2);

        n1 = Integer.parseInt(number1);
        n2 = Integer.parseInt(number2);
    }

    public  void add(View view){
        tv_answer.setText(number1 + "+" + number2 + "=" + (n1 + n2));
    }
    public  void subtract(View view){
        tv_answer.setText(number1 + "-" + number2 + "=" + (n1 - n2));
    }
    public  void multiply(View view){
        tv_answer.setText(number1 + "X" + number2 + "=" + (n1 * n2));
    }
    public  void divide(View view){
        tv_answer.setText(number1 + "/" + number2 + "=" + (n1 / n2));
    }
}