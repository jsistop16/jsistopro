package com.example.listview_practice1;

public class SingerItem {
    //메인자바소스에서 필요한 배열리스트의 객체를 생성하기위한 클래스

    String name;
    String mobile;

    public SingerItem(String name, String mobile) {//생성자
        this.name = name;
        this.mobile = mobile;
    }

    //데이터에 접근하기 위한 메소드 4개(getter,setter 엑세스함수)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "SingerItem{" +
                "name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
