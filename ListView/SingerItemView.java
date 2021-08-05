package com.example.mylistview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class SingerItemView extends LinearLayout { //singer_item.xml의 최상위 레이아웃인 LinearLayout을 상속
    TextView textView1;
    TextView textView2;
    public SingerItemView(Context context) {
        super(context);
        init(context);
    }

    public SingerItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context){//인플레이션 담당
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.singer_item, this, true);

        textView1 = (TextView) findViewById(R.id.textview1);//singer_item.xml에 있는 textview1을 가져옴
        textView2 = (TextView) findViewById(R.id.textview2);
    }

    public void setName(String name){
        textView1.setText(name);
    }

    public void setMobile(String mobile) {
        textView2.setText(mobile);
    }
}
