package com.ohgiraffers.section01.method;

public class Application7 {

    /* parameter와 retrun 값을 복합적으로 활용하는 것을 이해 */

    // 간단한 계산기 만들기
    public static void main(String[] args) {

        Application7 app7 = new Application7();

        int first = 30;
        int second = 20;


        System.out.println(app7.pulsTwoNumber(first, second));
        System.out.println(app7.divideTwoNumber(40, 0));

    }

    public int pulsTwoNumber(int first, int second) {

        return first + second;
    }

    public int minusTwoNumber(int first, int second) {

        return first - second;
    }

    public int multipleTwoNumber(int first, int second) {

        if(first == 0 && second == 0) {
            throw new IllegalArgumentException("0은 사용할 수 없습니다.");
        }

        return first * second;
    }

    public int divideTwoNumber(int first, int second) {

        if(second == 0) {
            throw new IllegalArgumentException("0으로는 나눌 수 없습니다.");
        }

        return first / second;
    }
}
