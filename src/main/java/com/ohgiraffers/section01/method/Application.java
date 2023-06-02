package com.ohgiraffers.section01.method;

public class Application {

    public static void main(String[] args) {
    Application app1 = new Application();

    app1.testMethod(40);



    // 수업 목표 : 메소드의 호출 흐름에 대해 이해할 수 있다.

    // method 호출하는 방법
    /*
    * 클래스명 사용할 이름 = new 클래스명(); -> 객체를 생성하는 구문
    * 사용할 이름.메소드명(); -> 메소드를 호출하는 구문
    *  */

    /*
    * 지역변수는 선언한 메소드 블럭 내부에서만 사용이 가능하다. (지역변수의 스코프)
    * 다른 메소드 간의 서로 공유해야 하는 값이 존재하는 경우 메소드 호춣 시 괄호를 통해 값을 전달할 수 있다.
    * 이 때 전달하는 값을 전달인자(argument)라고 하며
    * 메소드 선언부 괄호 안에 전달 인자를 받기 위해 선언하는 변수를 매개변수(parameter)라고 부른다.
    *  */


    /* 메소드 호출 시 넣는 값을 전달인자, 그 값을 받기 위해 메소드에 선언하는 변수를 매개변수 */
    }
    public void testMethod(int age) {
        System.out.println("당신의 나이는 " + age + "세 입니다.");

    }
}
