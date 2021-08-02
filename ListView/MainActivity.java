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

        ListView listView = (ListView) findViewById(R.id.listView);


    }

    class SingerAdapter extends BaseAdapter{

        ArrayList<SingerItem> arrayList = new ArrayList<SingerItem>();

        @Override
        public int getCount() { //SingerAdapter라는 클래스에 몇개의 아이템이 있는지
            return items.size();
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
            return null;
        }
    }
}
