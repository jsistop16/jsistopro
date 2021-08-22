package com.example.listview_practice1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView listView = (ListView) findViewById(R.id.listview);
        //리스트뷰에 어댑터를 설정해주기 위해 리스트뷰를 먼저 찾아준다.
        //어댑터는 하나의 객체이므로 먼저 클래스를 정의하고 객체생성을 해서 사용해야함

    }

    class SingerAdapter extends BaseAdapter{
        //SingerAdapter라는 클래스에는 4개의 메소드가 필요했던것!!
        //빨간줄 경고메세지 읽으면 나옴
        ArrayList<SingerItem> items = new ArrayList<SingerItem>();
        //<>안에 들어가는 것은 가수의 데이터(이름, 전화번호)를 담을수있는 "객체"가 들어가야함
        //그러므로 별도의 클래스를 만드는것임(singeritem클래스)

        @Override
        public int getCount() {
            return items.size();
        }

        @Override
        public Object getItem(int position) {
            return items.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            SingerItemView view = new SingerItemView(getApplicationContext());
            //뷰는 context객체를 매개변수로 받아야함 무조건
            //여기까지만 하면 리스트뷰의 아이템이 보이는것까지만 한것

            SingerItem item = items.get(position);
            view.setName(item.getName());
            view.setMobile(item.getMobile());

            return view;
        }
    }

}