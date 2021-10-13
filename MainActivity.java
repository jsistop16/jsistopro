package com.example.myjsondemo;

import androidx.appcompat.app.AppCompatActivity;

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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button long_btn = (Button)findViewById(R.id.btn1);
        txt = (TextView)findViewById(R.id.textview);

        long_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doJSONParser();
            }
        });
    }

    void doJSONParser() {
        StringBuffer sb = new StringBuffer();

        String str =
                "[{'top_bottom':'top','long_short': 'long'}," +
                        "{'top_bottom':'bottom','long_short':'short'}]";

        try {
            JSONArray jarray = new JSONArray(str);
            for (int i = 0; i < jarray.length(); i++) {
                JSONObject jObject = jarray.getJSONObject(i);  // JSONObject 추출
                String top_bottom = jObject.getString("top_bottom");
                String long_short = jObject.getString("long_short");

                sb.append(
                        "top_bottom:" + top_bottom +
                                "long_short:" + long_short + "\n"
                );
            }
            txt.setText(sb.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}