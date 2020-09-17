package com.example.task08ex01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Credits extends AppCompatActivity {
    TextView lastAns;
    double answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);

        lastAns=(TextView) findViewById(R.id.lastAns);

        Intent ans=getIntent();
        answer=ans.getDoubleExtra("answer",-1.11111);

        lastAns.setText(""+answer);
    }


    public void BackToMain(View view) {
        finish();
    }
}