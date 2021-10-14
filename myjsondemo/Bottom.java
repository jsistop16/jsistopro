package com.example.myjsondemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Bottom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_long_short);

        StringBuffer sb = new StringBuffer();//문자열 저장 메모리공간
        //thread동기화를 위해 StringBuffer사용(변수 중복 방지)
        String str =
                "[{'top' : 'top'}, " +
                        "{'bottom' : 'bottom'}, " +
                        "{'long' : 'long'}, " +
                        "{'short' : 'short'}]";

        Button up_long_btn = (Button)findViewById(R.id.bottom_long_btn);
        up_long_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
