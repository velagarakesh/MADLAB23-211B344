package com.example.myapplication211b344;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
boolean im1=true;
    public void change(View view){
    ImageView iv=findViewById(R.id.imageView);
if(im1){
    iv.setImageResource(R.drawable.image2);
    iv.animate().setDuration(4000).translationY(-600);
    im1=false;
}
else {
    iv.animate().alpha(0).setDuration(4000);
    iv.setImageResource(R.drawable.image1);
    iv.animate().alpha(1).setDuration(2000);
    iv.animate().setDuration(1000).translationY(800);
    im1=true;
}
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}