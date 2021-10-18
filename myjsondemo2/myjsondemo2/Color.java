package com.example.myjsondemo2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.myjsondemo2.sendHelper;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;


public class Color extends AppCompatActivity {
    TextView txt;
    String data_cl;
    String postUrl = "http://3.35.9.200/cloth";
    JSONObject jsonData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.color);

        txt = (TextView)findViewById(R.id.textview);

        Button red_btn = (Button)findViewById(R.id.red);
        Button blue_btn = (Button)findViewById(R.id.blue);
        Button complete = (Button)findViewById(R.id.complete);
        Intent intent = getIntent();
//        String data2 = intent.getStringExtra("data2");
//        StringBuilder sb = new StringBuilder();

        try {
            jsonData = new JSONObject(intent.getStringExtra("jsonData"));
            System.out.println(jsonData.toString());
        }catch(JSONException e){
            e.printStackTrace();
        }

        red_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Color.class);
                try {
                    jsonData.put("color", "red");
                }catch(JSONException e){
                    e.printStackTrace();
                }
                intent.putExtra("jsonData", jsonData.toString());
            }
        });
        blue_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Color.class);
                try {
                    jsonData.put("color", "blue");
                }catch(JSONException e){
                    e.printStackTrace();

                }
                intent.putExtra("jsonData", jsonData.toString());
            }
        });

        complete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                data_cl = "{" +sb.toString()+ "}";
//                txt.setText(data_cl);
                JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                        Request.Method.POST,
                        postUrl,
                        jsonData,
                        new Response.Listener<JSONObject>(){
                            @Override
                            public void onResponse(JSONObject response) {
                                txt.setText(response.toString());
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                txt.setText("error");
                            }
                        });
                jsonObjectRequest.setShouldCache(false);
                sendHelper.requestQueue = Volley.newRequestQueue(getApplicationContext());
                sendHelper.requestQueue.add(jsonObjectRequest);

            }

        });
    }
}
