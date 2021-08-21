package com.example.mylistview2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
//하나의 아이템을 위한 자바소스(부분화면처럼 생각)
public class Singeritemview2 extends LinearLayout {

    TextView textview1;
    TextView textview2;
    ImageView imageview;

    //view를 정의할때는 default생성자(필수생성자)가 2개
    public Singeritemview2(Context context) {
        super(context);
        init(context);
    }   

    public Singeritemview2(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }
    //여기까지가 생성자

    private void init(Context context){//초기화를 위한 메소드
        //singer_item.xml파일을 인플레이션해서 가져옴
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //systemservice라는것은 서비스가 현재 돌고있다는 뜻
        //화면에 없는 백그라운드에서 돌고있는 서비스가 있는데
        //단말기에 기본적으로 실행시켜놓는 서비스=시스템서비스
        //그중에 layoutinflater가 실행되고있으니까 그걸 쓰겠다는 뜻
        layoutInflater.inflate(R.layout.singer_item2, this, true);

        textview1 = (TextView) findViewById(R.id.textview1);
        textview2 = (TextView) findViewById(R.id.textview2);
        imageview = (ImageView) findViewById(R.id.imageview);
    }

    public void setName(String name){
        //리스트뷰의 이름 데이터를 직접 관리하기위한 메소드
        //이 singeritemview라는 클래스를 가지고 만들 객체에다가 바로 데이터를 대입하기위함
        textview1.setText(name);
    }

    public void setMobile(String mobile){
       //같은 과정
       textview2.setText(mobile);
    }

    public void setImage(int resId){
        imageview.setImageResource(resId);
    }

}
