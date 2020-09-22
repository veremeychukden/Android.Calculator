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

    String text = " ";





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.display);
    }


    public void click(View v){
        Button b = (Button)v;
        String buttonText = b.getText().toString();
        text += b.getText().toString();
        textView.setText(text);
    }

    public void Clear(View v){
        textView.setText(" ");
        text = " ";
    }

    public void Delete(View v){
        if(textView.getText().toString() == null)
        {
            Toast toast = Toast.makeText(getApplicationContext(), "Введiть число", Toast.LENGTH_LONG);
            toast.show();
        }
        else if(textView.getText().toString() != null) {
            textView.setText(text.substring(0, text.length() - 1));
            text = text.substring(0, text.length() - 1);
        }

    }











}