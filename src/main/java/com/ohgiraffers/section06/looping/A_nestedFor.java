package com.ohgiraffers.section06.looping;

import java.util.Scanner;

public class A_nestedFor {

    public void printGugudanFromTwoToNine() {

        // 중첩된 for문의 흐름을 이해하고 적용할 수 있다.
        // 2단부터 단을 1개씩 증가시키는 반복문

        for(int dan = 1; dan <= 9; dan++) {
            for(int su = 1; su <= 9; su++) {
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
            System.out.println();
        }
    }

    public void printUpgradeGugudan() {
        for(int dan = 1; dan <= 9; dan++) {

            printGugudanOf(dan);
            System.out.println();
        }
    }

    public void printGugudanOf(int dan) {
        for(int su = 1; su <= 9; su++) {
            System.out.println(dan + " * " + su + " = " + (dan * su));
        }
        System.out.println();
    }

    public void printStarInputRowTimes() {
        // 키보드로 정수를 하나 입력 받아 해당 정수만큼 한 행에 "*"을 5개씩 출력

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 하나 입력해주세요 : ");
        int row = sc.nextInt();

        for(int i = 1; i <= row; i++) {

        star(5);
        System.out.println();
        }
    }

    public void star(int times) {
        for(int i = 1; i <= times; i++) {
            System.out.print("*");
        }
    }
}
