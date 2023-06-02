package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.Calculator;

import static com.ohgiraffers.section01.method.Calculator.maxNumberOf;

public class Application2 {

    public static void main(String[] args) {

        // import 란?
        /*
        * 서로 다른 패키지에 존재하는 클래스를 사용하는 경우 풀 패키지명을 사용해야하는 번거로움 해소
        * 패기지명을 생략하는 것이 import
        *  */

        // Calculator 메소드 호출
        Calculator clac = new Calculator();
        int min = clac.minNumberOf(30, 10);
        System.out.println(min);

        int max = Calculator.maxNumberOf(30, 50);
        System.out.println(max);

        int max2 = maxNumberOf(30, 10);
        System.out.println(max2);

    }
}
