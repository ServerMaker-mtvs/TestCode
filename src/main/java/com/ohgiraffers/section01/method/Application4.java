package com.ohgiraffers.section01.method;

public class Application4 {

    public static void main(String[] args) {

        /*
        * 여러 개의 전달 인자를 이용한 메소드 호출을 할 수 있다.
        * 전달인자 와 매개변수는 타입과 순서가 일치해야한다.
        *  */

        Application4 app4 = new Application4();
        app4.testMethod("조평훈", 25, '남');

        String name = "조팽팽";
        int age = 25;
        char gender = '여';

        app4.testMethod(name, age, gender);

    }

    public void testMethod(String name, int age, final char gender) {

        System.out.println("당신의 이름은 :  " + name + " 이고, 나이는 : " + age + "세 이며, 성별은 : " + gender + " 입니다.");
    }

}
