package com.example.sourabh.a3isumm1t;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button photos;
Button upevents;
Button livee;
Button aboutus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startAnim();
    }

    public void startAnim(){
        livee = (Button)findViewById(R.id.livee);
        Animation animation1 = AnimationUtils.loadAnimation(this,R.anim.lefttoright);
        livee.startAnimation(animation1);


        upevents = (Button)findViewById(R.id.upevents);
        Animation animation2 = AnimationUtils.loadAnimation(this,R.anim.righttoleft);
        upevents.startAnimation(animation2);

        photos = (Button)findViewById(R.id.photoG);
        Animation animation3 = AnimationUtils.loadAnimation(this,R.anim.ltof);
        photos.startAnimation(animation3);

        aboutus = (Button)findViewById(R.id.AboutUs);
        Animation animation4 = AnimationUtils.loadAnimation(this,R.anim.rtof);
        aboutus.startAnimation(animation4);
    }


    public void onliveclick(View v){
        Intent live=new Intent(this,liveevents.class);
        startActivity(live);
    }


}

