package com.example.lg.scrollview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}
    public void onClick(View view) {
        Intent intent = new Intent(this, FramActivity.class);
        startActivity(intent);
    }

    public void onClick1(View view){
        Intent intent = new Intent(this, BasicWidget.class);
        startActivity(intent);
    }

    public void onClick2(View view){
        Intent intent = new Intent(this,ScrollingActivity.class);
        startActivity(intent);

    }

    public void onClick3(View view){
        Intent intent = new Intent(this, layoutInflater.class);
        startActivity(intent);
    }


    }

