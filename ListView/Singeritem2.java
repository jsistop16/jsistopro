package com.example.mylistview2;

public class Singeritem2 {

    String name;
    String mobile;
    int resId;

    public Singeritem2(String name, String mobile, int resId) {//생성자
        this.name = name; //this가 의미하는것은 객체
        this.mobile = mobile;
        this.resId = resId;
    }

    //자바 특성상 변수에 직접 접근하지 않고 get,set함수를 이용하기 위한것
    //OOP는 정보은닉과 객체의 무결성보장을 추구->캡슐화(get,set함수(=엑세스 함수))
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

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
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
