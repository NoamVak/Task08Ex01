package com.example.task08ex01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.net.Inet4Address;

public class MainActivity extends AppCompatActivity {
    double num1,num2,sum;
    String input;
    EditText display;
    int par;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display=(EditText) findViewById(R.id.display);

        sum=0.0;
    }

    public void add(View view) {
        input=display.getText().toString();
        if(input.equals("")){
            Toast.makeText(this,"Error: Enter Number",Toast.LENGTH_SHORT).show();
        }
        else{
            num1=Double.parseDouble(input);
            display.setText("");
            par=1;
        }
    }

    public void minus(View view) {
        input=display.getText().toString();
        if(input.equals("")){
            Toast.makeText(this,"Error: Enter Number",Toast.LENGTH_SHORT).show();
        }
        else{
            num1=Double.parseDouble(input);
            display.setText("");
            par=2;
        }
    }

    public void mult(View view) {
        input=display.getText().toString();
        if(input.equals("")){
            Toast.makeText(this,"Error: Enter Number",Toast.LENGTH_SHORT).show();
        }
        else{
            num1=Double.parseDouble(input);
            display.setText("");
            par=3;
        }
    }

    public void div(View view) {
        input=display.getText().toString();
        if(input.equals("")){
            Toast.makeText(this,"Error: Enter Number",Toast.LENGTH_SHORT).show();
        }
        else{
            num1=Double.parseDouble(input);
            display.setText("");
            par=4;
        }
    }

    public void clear(View view) {
        sum=0.0;
        num1=0.0;
        num2=0.0;
        display.setText("");
    }

    public void equal(View view) {
        input=display.getText().toString();
        if (input.equals("")){
            Toast.makeText(this,"Error: Enter Number", Toast.LENGTH_SHORT).show();
        }
        else{
            num2=Double.parseDouble(input);
            switch (par){
                case 1:
                    sum=num1+num2;
                    break;
                case 2:
                    sum=num1-num2;
                    break;
                case 3:
                    sum=num1*num2;
                    break;
                case 4:
                    sum=num1/num2;
                    break;
            }
            display.setText(String.valueOf(sum));
            num1=sum;
        }
    }

    public void newActivityCred(View view) {
        Intent ans=new Intent (this,Credits.class);
        ans.putExtra("answer",sum);
        startActivity(ans);
    }
}