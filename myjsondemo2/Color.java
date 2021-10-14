package com.example.myjsondemo2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Color extends AppCompatActivity {
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.color);

        txt = (TextView)findViewById(R.id.textview);

        Button red_btn = (Button)findViewById(R.id.red);
        Button blue_btn = (Button)findViewById(R.id.blue);
        Button complete = (Button)findViewById(R.id.complete);
        Intent intent = getIntent();
        String data2 = intent.getStringExtra("data2");
        StringBuilder sb = new StringBuilder();

        red_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Color.class);
                sb.append(data2);
                sb.append("\"color\" : \"red\" ");
                intent.putExtra("data3", sb.toString());
            }
        });
        blue_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Color.class);
                sb.append(data2);
                sb.append("\"color\" : \"blue\" ");
                intent.putExtra("data3", sb.toString());
            }
        });

        complete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data_cl = "{" +sb.toString()+ "}";
                txt.setText(data_cl);
            }
        });
    }
}
