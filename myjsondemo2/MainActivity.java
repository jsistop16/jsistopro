package com.example.myjsondemo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.io.Serializable;


public class MainActivity extends AppCompatActivity implements Serializable {


    StringBuilder sb = new StringBuilder();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button top_btn = (Button)findViewById(R.id.btn1);
        Button bottom_btn = (Button)findViewById(R.id.btn2);

        top_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Top.class);
                sb.append("\"top_bottom\" : \"top\", ");
                intent.putExtra("data", sb.toString());
                startActivity(intent);
            }
        });

        bottom_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Bottom.class);
                sb.append("\"top_bottom\" : \"bottom\", ");
                intent.putExtra("data", sb.toString());
                startActivity(intent);
            }
        });
    }
}