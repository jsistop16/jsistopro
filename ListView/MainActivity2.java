package com.example.mylistview2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    SingerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);

        //데이터 추가하는 부분, 어댑터에 추가하는것,
        adapter = new SingerAdapter();//어댑터 객체 생성
        adapter.additem(new Singeritem("김준성", "010-8000-8000"));//생성자에 추가
        adapter.additem(new Singeritem("김준성", "010-8000-8000"));
        adapter.additem(new Singeritem("김준성", "010-8000-8000"));
        adapter.additem(new Singeritem("김준성", "010-8000-8000"));
        adapter.additem(new Singeritem("김준성", "010-8000-8000"));

        listView.setAdapter(adapter);//리스트뷰와 어댑터 연결,
        //어댑터에 있는 getview메소드를 호출함으로서 최종결과물이 나오긴함
        //근데 그전에 데이터를 추가해줘야함
    }

    //리스트뷰에 설정해줄 어댑터 객체를 생성하기 위해서 먼저 어댑터 클래스를 만들어준다
    //그리고 이렇게 만들어준 어댑터를 나중에 상속해서 추가적으로 필요한 데이터들만 추가해줄것임

    class SingerAdapter extends BaseAdapter{
        ArrayList<Singeritem> items = new ArrayList<Singeritem>();//데이터들을 관리할수있는 배열리스트생성
        //하나의 문자를 데이터로 관리한다면 <String>을 추가해야되지만
        //핸드폰 연락처 아이템은 문자 하나로는 불가능함으로
        //그 정보를 담을 수 있는 별도의 객체를 정의해야함

        @Override
        public int getCount() { //몇개의 아이템이 있는지 물어봄 리스트뷰에 몇개가있는지 알게됨
            return items.size();
        }

        @Override
        public Object getItem(int position) { //매개변수 position은 인덱스역할
            return items.get(position); //그 인덱스의 아이템 확인가능
        }

        @Override
        public long getItemId(int position) { //실제 id값은 다르지만 그냥 position값으로 간주
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            //어댑터 보고 화면에 보여질 뷰도 보여달라고 하는 메소드
            //리스트뷰에 있는 하나의 아이템을 부분화면으로 정의하고
            //그 부분화면의 객체를 만들어가면서 데이터만 바꾼 view를 리턴해주는 방식으로
            //설정
            //Singeritemview라는 클래스를 만들었으므로 이걸 이용해서 객체를 만들어야함
            //그래야 뷰가 나옴
            Singeritemview view = new Singeritemview(getApplicationContext());
            Singeritem item = items.get(position);//데이터를 설정해줘야 데이터가 들어감
            //items는 위에서 설정한 배열리스트
            //거기에서 position값을 이용해 데이터를 가져온것을 item이라는 객체에 저장
            //item은 Singeritem클래스고 부터 나온 객체
            view.setName(item.getName());//item에 있는 name변수를 setName메소드를 통해 저장
            view.setMobile(item.getMobile());
            return view;
            //여기까지의 과정은 SingerAdapter라는 클래스만 만들어놓은거임
            //즉 아직 어댑터의 틀만 만들어 놓은것이고 그안에 데이터는 들어가있지 않은상태
            //본격적으로 어댑터에 데이터를 담아야한다. 다음줄
        }

        //그래서 어댑터안에 데이터를 담을 메소드를 추가해준다
        public void additem(Singeritem item){
            items.add(item);
        }
    }
}