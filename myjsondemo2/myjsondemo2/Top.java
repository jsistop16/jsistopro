package com.example.myjsondemo2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONException;
import org.json.JSONObject;


public class Top extends AppCompatActivity {
    JSONObject jsonData;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.top_long_short);

        Button top_long_btn = (Button)findViewById(R.id.top_long_btn);
        Button top_short_btn = (Button)findViewById(R.id.top_short_btn);
        Button complete = (Button)findViewById(R.id.complete);
        Intent intent = getIntent();
//        String data1 = intent.getStringExtra("data");
//        StringBuilder sb = new StringBuilder();
        try {
            jsonData = new JSONObject(intent.getStringExtra("jsonData"));
            System.out.println(jsonData.toString());
        }catch(JSONException e){
            e.printStackTrace();
        }
        top_long_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Color.class);
                try {
                    jsonData.put("short_long", "long");
                }catch(JSONException e){
                    e.printStackTrace();
                }
                intent.putExtra("jsonData", jsonData.toString());
                startActivity(intent);
                }
        });
        top_short_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Color.class);
                try {
                    jsonData.put("short_long", "short");
                }catch(JSONException e){
                    e.printStackTrace();
                }
                intent.putExtra("jsonData", jsonData.toString());
                startActivity(intent);
            }
        });

    }


}
