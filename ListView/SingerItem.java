package com.example.mylistview;

public class SingerItem {
    String name;
    String mobile;

    public SingerItem(String name, String mobile) {//생성자
        this.name = name;
        this.mobile = mobile;
    }

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
    public String toString() { //문자열로 출려하기 위한 메소드, 데이터가 잘 들어갔는지 확인용
        return "SingerItem{" +
                "name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
