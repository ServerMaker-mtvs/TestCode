package com.ohgiraffers.section01.method;

public class Application9 {

    public static void main(String[] args) {

        /*
        * 다른 클래스에 작성한 다른 메소드를 호출할 수 있다.
        *  */

        // 최대값 최솟값을 비교할 두 정수를 변수로 선언
        int one = 30;
        int two = 50;

        /*
        * non-static인 경우
        * 클래스명 사용할이름 = new 클래스명();
        * 사용할이름.메소드명();
        *  */

        Calculator calc = new Calculator();
        int min = calc.minNumberOf(one, two);


        System.out.println("두 수 중 최솟값은? : " + min);

        /*
        * static인 경우
        * 클래스명.메소드명();
        *  */

        int max = Calculator.maxNumberOf(one, two);
        System.out.println(max);
    }
}
