package com.example.mylistview;

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

        ListView listView = (ListView) findViewById(R.id.listView); //리스트뷰 객체 찾기

        SingerAdapter adapter = new SingerAdapter();

        adapter.addItem(new SingerItem("aaa", "010-1000-1000", R.drawable.man1));
        adapter.addItem(new SingerItem("bbb", "010-2000-2000", R.drawable.woman1));
        adapter.addItem(new SingerItem("ccc", "010-3000-3000", R.drawable.man1));
        adapter.addItem(new SingerItem("ddd", "010-4000-4000", R.drawable.woman1));
        adapter.addItem(new SingerItem("eee", "010-5000-5000", R.drawable.man1));
        adapter.addItem(new SingerItem("fff", "010-1000-1000", R.drawable.woman1));
        adapter.addItem(new SingerItem("ggg", "010-2000-2000", R.drawable.man1));
        adapter.addItem(new SingerItem("hhh", "010-3000-3000", R.drawable.woman1));
        adapter.addItem(new SingerItem("iii", "010-4000-4000", R.drawable.man1));
        adapter.addItem(new SingerItem("jjj", "010-5000-5000", R.drawable.woman1));

        listView.setAdapter(adapter);

    }

    class SingerAdapter extends BaseAdapter{ //어댑터를 커스터마이징하기 쉽게 클래스 만들기

        ArrayList<SingerItem> items = new ArrayList<SingerItem>();
        //어댑터는 데이터를 관리하는 역할, 데이터를 관리(추가,삭제)하기 쉽게 arraylist만들어줌

        @Override
        public int getCount() { //SingerAdapter라는 클래스에 몇개의 아이템이 있는지
            return items.size();
        }

        public void addItem(SingerItem item){
            items.add(item);
        }

        @Override
        public Object getItem(int position) { //position은 index역할
            return items.get(position);
        }

        @Override
        public long getItemId(int position) { //item의 id가 있다면 그것을 반환
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) { //item들을 view로 보여주는 메소드
            SingerItemView view = new SingerItemView(getApplicationContext());
            SingerItem item = items.get(position);
            view.setName(item.getName()); // 윗줄에서 정의된 item값을 view의 이름으로 설정함
            view.setMobile(item.getMobile());
            view.setImageView(item.getResid());

            return view;
        }
    }
}