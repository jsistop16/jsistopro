package com.example.myjsondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    private TextView txt;

    StringBuffer sb = new StringBuffer();//문자열 저장 메모리공간
    //thread동기화를 위해 StringBuffer사용(변수 중복 방지)
    String str =
            "[{'top' : 'top'}, " +
                    "{'bottom' : 'bottom'}, " +
                    "{'long' : 'long'}, " +
                    "{'short' : 'short'}]";

    void doJSONParser1() {
        try {
            JSONArray jarray = new JSONArray(str);

            JSONObject jObject = jarray.getJSONObject(0);  // JSONObject 추출
            String top_bottom = jObject.getString("top");

            sb.append(
                    "top_bottom : " + top_bottom + "\n"
            );

            txt.setText(sb.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    void doJSONParser2() {

        try {
            JSONArray jarray = new JSONArray(str);

            JSONObject jObject = jarray.getJSONObject(1);  // JSONObject 추출
            String top_bottom = jObject.getString("bottom");

            sb.append(
                    "top_bottom : " + top_bottom + "\n"
            );

            txt.setText(sb.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button top_btn = (Button)findViewById(R.id.btn1);
        Button bottom_btn = (Button)findViewById(R.id.btn2);
        txt = (TextView)findViewById(R.id.textview);



        top_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doJSONParser1();
                Intent intent = new Intent(getApplicationContext(), Top.class);
                intent.putExtra("top_bottom", "top");
                startActivity(intent);

            }
        });

        bottom_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doJSONParser2();
                Intent intent = new Intent(getApplicationContext(), Bottom.class);
                //intent.putExtra("top_bottom", "bottom");
                startActivity(intent);
            }
        });
    }
}