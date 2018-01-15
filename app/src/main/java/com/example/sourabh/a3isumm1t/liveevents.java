package com.example.sourabh.a3isumm1t;

import android.content.Intent;
import android.os.TokenWatcher;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

public class liveevents extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liveevents);

    }

    public void vieww(View v){
        Intent live=new Intent(this,viewlive.class);
        startActivity(live);
    }

    public void onshow(View v){
        Intent a=new Intent(this,viewdetails.class);
        startActivity(a);
    }
}
