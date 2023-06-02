package com.ohgiraffers.section01.method;

public class Application6 {

    public static void main(String[] args) {

        /*
        * return 값 테스트
        * return 은 마지막에 호출한 구문으로 돌아가는 것을 말한다.
        * return은 복귀할 때 값을 가지고 갈 수 있다.
        *
        * return 값을 반환 받기 위해서는 메소드 선언부에 리턴 타입을 명시해야 한다.
        * void는 아무 값도 가져가지 않겠다는 구문
        * return 타입의 반환값의 자료형은 반드시 일치해야 한다.
        * */
        Application6 app6 = new Application6();

        app6.testMethod();

        String test = app6.testMethod();
        System.out.println(test);
        System.out.println(app6.testMethod());
    }

    public String testMethod() {

        return "hello world~~";
    }
}
