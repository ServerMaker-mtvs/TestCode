package com.ohgiraffers.section4.scanner;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        /* Scanner 콘솔에 값을 입력받아 출력하기 위한 Class */

        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.println("입력하신 이름은 : " + name + "입니다.");
    }
}
