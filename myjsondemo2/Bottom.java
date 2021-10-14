package com.example.myjsondemo2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Bottom extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_long_short);

        Button bottom_long_btn = (Button)findViewById(R.id.bottom_long_btn);
        Button bottom_short_btn = (Button)findViewById(R.id.bottom_short_btn);
        Button complete = (Button)findViewById(R.id.complete);
        Intent intent = getIntent();
        String data1 = intent.getStringExtra("data");
        StringBuilder sb = new StringBuilder();

        bottom_long_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Color.class);
                sb.append(data1);
                sb.append("\"short_long\" : \"long\", ");
                intent.putExtra("data2", sb.toString());
                startActivity(intent);
            }
        });

        bottom_short_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Color.class);
                sb.append(data1);
                sb.append("\"short_long\" : \"short\", ");
                intent.putExtra("data2", sb.toString());
                startActivity(intent);
            }
        });
    }
}
