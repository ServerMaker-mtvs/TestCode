package com.ohgiraffers.section4.scanner;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        // Scanner 의 nextLine()과 next()를 구분할 수 있다.
        /*
        * nextLine() : 공백을 포함한 한 줄을 입력을 위한 개행문자 전 까지 읽어서 문자열 반환
        * next() : 공백 문자나 개행문자 전 까지를 읽어서 문자열로 반환.
        * */

        Scanner sc = new Scanner(System.in);
        // nextLine()
        System.out.print("인사말을 입력해주세요 : ");
        String greeting1 = sc.nextLine();

        System.out.println(greeting1);


        // 개행문자 전까지를 반환한다.
        System.out.println("인사말을 입력해주세요 : ");
        String greeting2 = sc.next();

        System.out.println(greeting2);
    }
}
