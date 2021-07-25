package com.example.relativelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton1Clicked(View v){
        Toast.makeText(getApplicationContext(),"Wrong!!", Toast.LENGTH_LONG).show();
    }

    public void onButton2Clicked(View v){
        Toast.makeText(getApplicationContext(),"Congraturation!! Correct!!", Toast.LENGTH_LONG).show();
    }
}