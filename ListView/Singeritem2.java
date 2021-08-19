package com.example.mylistview2;

public class Singeritem {

    String name;
    String mobile;

    public Singeritem(String name, String mobile) {//생성자
        this.name = name; //this가 의미하는것은 객체
        this.mobile = mobile;
    }

    //자바 특성상 변수에 직접 접근하지 않고 get,set함수를 이용하기 위한것
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

    //toString메소드를 호출하면 이 객체안에있는 데이터를 문자열로 출력해줌 아마도 데이터 확인용
    @Override
    public String toString() {
        return "Singeritem{" +
                "name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
