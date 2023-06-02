package com.ohgiraffers.section03.math;

import java.util.Random;

public class Application3 {

    public static void main(String[] args) {

        Random random = new Random();

        int randomNumber = random.nextInt(10);
        System.out.println("0 부터 9 까지의 난수 발생 : " + randomNumber);

        // 객체를 생성하자마자 메소드를 호출할 수 있다.
        int random2 = new Random().nextInt(256) -128;
        System.out.println("-128 ~ 127 까지의 난수 : " + random2);
    }
}
