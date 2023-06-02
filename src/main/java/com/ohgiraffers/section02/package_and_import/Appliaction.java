package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.Calculator;

public class Appliaction {

    public static void main(String[] args) {

        /*
         * package란?
         * 서로 관련 있는 클래스 또는 인터페이스를 모아 묶음
         * 다른 패키지에 존재하는 클래스를 사용하려면 클래스명 앞에 패키지명을 입력해야 한다.
         *  */

        // 예시 : Calculator 클래스를 사용해서 static method와  non-static method 호출
        // 1. non-static method 호출
        com.ohgiraffers.section01.method.Calculator calc = new Calculator();
        int min = calc.minNumberOf(30, 3);

        System.out.println(min);

        // 2. static method 호출
        int max = com.ohgiraffers.section01.method.Calculator.maxNumberOf(30 , 500);
        System.out.println(max);
    }
}
