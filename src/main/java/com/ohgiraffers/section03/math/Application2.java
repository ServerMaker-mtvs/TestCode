package com.ohgiraffers.section03.math;

public class Application2 {

    public static void main(String[] args) {
        
        // 원하는 범위의 난수를 구하는 공식
        // (int)(Math.random() * 구하려는 난수의 갯수) + 구하려는 난수의 최솟값
        
        int random1 = (int)(Math.random() * 10);
        System.out.println("random1 = " + random1);
    }
}
