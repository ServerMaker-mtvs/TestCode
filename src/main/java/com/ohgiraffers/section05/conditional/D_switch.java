package com.ohgiraffers.section05.conditional;

import java.util.Scanner;

public class D_switch {

    public void testSimpleSwitchStatement() {

        // 사칙연산 계산기 만들기
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력해주세요 : ");
        int first = sc.nextInt();
        System.out.print("두 번째 정수를 입력해주세요 : ");
        int second = sc.nextInt();
        System.out.print("사칙연산 기호를 입력해주세요 : (+, -, *, /, ) : ");
        char ch = sc.next().charAt(0);

        int result = 0;

         switch (ch) {
             case '+' :
                 result = first + second;
                 break;
             case '-' :
                 result = first - second;
                 break;
             case '*' :
                 result = first * second;
                 break;
             case '/' :
                 result = first / second;
             case '%' :
                 result = first % second;
                 break;
             default:
                 System.out.println("사칙연산 기호를 입력해주세요");

         }
        System.out.println(first + " " + ch + " " + second + " = " + result);

    }
}
