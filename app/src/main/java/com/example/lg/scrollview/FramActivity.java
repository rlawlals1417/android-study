package com.example.lg.scrollview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FramActivity extends AppCompatActivity {

        ImageView imageView;
        ImageView imageView2;

        int index = 0; //어떤 이미지인지 알려줌

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentViewti(R.layout.acvity_fram);


        imageView = (ImageView) findViewById(R.id.imageView2); //리턴타입 그냥 View 이기 때문에 imageView 자료형 형변환
        imageView2 = (ImageView) findViewById(R.id.imageView3);

    }
    public void onClick(View view){
    Intent intent = new Intent(this, MainActivity.class);
    startActivity(intent);
    }

    public void onButton1Clicked(View v){
        index += 1;
        if(index>1){
            index=0;
        }


        if(index == 0){     //첫번째 이미지뷰
            imageView.setVisibility(View.VISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
        }   else if (index==1){
            imageView.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.VISIBLE);
        }

    }
}
