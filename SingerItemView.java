package com.example.listview_practice1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class SingerItemView extends LinearLayout {
    //linearlayout을 상속하는 이유는 메모리 객체화 (레이아웃인플레이션) 할때
    //그대로 붙여줄수있음
    //이 클래스는 아이템 하나를 나타내는 xml파일인 singer_item.xml과의 연동되는
    //자바 클래스이다.
    //즉 뷰와 관련된 자바소스파일이라는 것!!

    TextView textView1;
    TextView textView2;


    public SingerItemView(Context context) {
        super(context);

        init(context);
    }

    public SingerItemView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init(context);
    }

    private void init (Context context){//생성자 안에서 초기화해주기위한 메소드
        //다음줄 인플레이션을 해주는 이유
        //우리가 추가로 만들어준 singer_item이라는 xml파일을 가져와서
        //자바 코드에서 마음대로 접근하기 위해서이다.
        //xml파일을 추가로 만들었을때는 메모리에 객체화 해야 편하게 접근가능
        //그래서 xml파일을 인플레이션 해주는것임!!
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.singer_item, this, true);
        //singer_item이라는 xml파일을 this(객체: 현재 이 클래스의 객체)에 갖다붙인것!!
        //그러므로 이제부터 singer_item.xml에 있는 여러가지 뷰들을 참조해서 쓸수 잇음

        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);
    }

    public void setName(String name){
        textView1.setText(name);
    }

    public void setMobile(String mobile){
        textView2.setText(mobile);
    }
}
