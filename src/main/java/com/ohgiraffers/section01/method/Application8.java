package com.ohgiraffers.section01.method;

public class Application8 {

    public static void main(String[] args) {

        /*
        * static 메소드 호출하기
        * 우리가 작성하는 public void 사이에 static 이라는 키워드가 있다.
        * static 메소드를 호출하는 방법 학습
        * */

        System.out.println(sumTwoNumber(30, 20));

    }

    public static int sumTwoNumber(int first, int second) {

        return first + second;
    }
}
