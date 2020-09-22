package com.example.dream;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public TextView textView;
    public Button btn_one, btn_two, btn_three, btn_four, btn_five, btn_six, btn_seven, btn_eight,
            btn_nine, btn_total, btn_plus, btn_minus, btn_multiply, btn_div, btn_clear, btn_delete;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.display);
        btn_plus = findViewById(R.id.btn_plus);
        btn_one = findViewById(R.id.btn_one);
    }

    public void btnClickPlus(View v){
        Toast toast = Toast.makeText(getApplicationContext(),
                "Plus", Toast.LENGTH_LONG);
        toast.show();
        
    }

    public void btnClickTotal(View v){
        Toast toast = Toast.makeText(getApplicationContext(),
                "Total", Toast.LENGTH_LONG);
        toast.show();
    }

    public void btnClickPercent(View v){
        Toast toast = Toast.makeText(getApplicationContext(),
                "Percent", Toast.LENGTH_LONG);
        toast.show();
    }

    public void btnClickZero(View v){
        Toast toast = Toast.makeText(getApplicationContext(),
                "Zero", Toast.LENGTH_LONG);
        toast.show();

    }

    public void BtnClickComma(View v){
        Toast toast = Toast.makeText(getApplicationContext(),
                "Comma", Toast.LENGTH_LONG);
        toast.show();
    }

    public void BtnClickOne(View v){
        Toast toast = Toast.makeText(getApplicationContext(),
                "One", Toast.LENGTH_LONG);
        toast.show();
    }

    public void BtnClickTwo(View v){
        Toast toast = Toast.makeText(getApplicationContext(),
                "Two", Toast.LENGTH_LONG);
        toast.show();
    }

    public void BtnClickThree(View v){
        Toast toast = Toast.makeText(getApplicationContext(),
                "Three", Toast.LENGTH_LONG);
        toast.show();
    }

    public void BtnClickFour(View v){
        Toast toast = Toast.makeText(getApplicationContext(),
                "Four", Toast.LENGTH_LONG);
        toast.show();
    }

    public void BtnClickFive(View v){
        Toast toast = Toast.makeText(getApplicationContext(),
                "Five", Toast.LENGTH_LONG);
        toast.show();
    }

    public void BtnClickSix(View v){
        Toast toast = Toast.makeText(getApplicationContext(),
                "Six", Toast.LENGTH_LONG);
        toast.show();
    }

    public void BtnClickSeven(View v){
        Toast toast = Toast.makeText(getApplicationContext(),
                "Seven", Toast.LENGTH_LONG);
        toast.show();
    }

    public void BtnClickEight(View v){
        Toast toast = Toast.makeText(getApplicationContext(),
                "Eight", Toast.LENGTH_LONG);
        toast.show();
    }

    public void BtnClickNine(View v){
        Toast toast = Toast.makeText(getApplicationContext(),
                "Nine", Toast.LENGTH_LONG);
        toast.show();
    }

    public void BtnClickMinus(View v){
        Toast toast = Toast.makeText(getApplicationContext(),
                "Minus", Toast.LENGTH_LONG);
        toast.show();
    }

    public void BtnClickDelete(View v){
        Toast toast = Toast.makeText(getApplicationContext(),
                "Delete", Toast.LENGTH_LONG);
        toast.show();
    }

    public void BtnClickMultiply(View v){
        Toast toast = Toast.makeText(getApplicationContext(),
                "Multiply", Toast.LENGTH_LONG);
        toast.show();
    }

    public void BtnClickDiv(View v){
        Toast toast = Toast.makeText(getApplicationContext(),
                "Div", Toast.LENGTH_LONG);
        toast.show();
    }

    public void BtnClickClear(View v){
        Toast toast = Toast.makeText(getApplicationContext(),
                "Clear", Toast.LENGTH_LONG);
        toast.show();
    }


    public void Rotate(View v){
        Intent intent = new Intent(this, CalculatorActivity.class);
        startActivity(intent);
    }




}