package com.example.myjsondemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Top extends AppCompatActivity {

    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.top_long_short);

        txt = (TextView)findViewById(R.id.textview);

        StringBuffer sb = new StringBuffer();//문자열 저장 메모리공간
        //thread동기화를 위해 StringBuffer사용(변수 중복 방지)
        String str =
                "[{'top' : 'top'}, " +
                        "{'bottom' : 'bottom'}, " +
                        "{'long' : 'long'}, " +
                        "{'short' : 'short'}]";

        Button top_long_btn = (Button)findViewById(R.id.top_long_btn);
        top_long_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = getIntent();
                try {
                    JSONArray jarray = new JSONArray(str);
                    String data = intent.getStringExtra("top_bottom");
                    JSONObject jObject = jarray.getJSONObject(2);  // JSONObject 추출
                    String top_bottom = jObject.getString("long");
                    sb.append(
                            "top_bottom : " + data + "\n" +
                            "long_short : " + top_bottom + "\n"
                    );
                    txt.setText(sb.toString());
                } catch (JSONException e){
                    e.printStackTrace();
                }
            }
        });


    }


}
