package com.example.lg.scrollview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class BasicWidget extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_widget);

        RadioButton radioButton = (RadioButton) findViewById(R.id.radioButton2);
        boolean checked = radioButton.isChecked();
    }


        public void onClick(View view){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }



