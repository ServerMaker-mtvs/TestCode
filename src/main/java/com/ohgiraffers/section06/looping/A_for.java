package com.ohgiraffers.section06.looping;

import java.util.Scanner;

public class A_for {

    public void testSimpleForStatement() {

        /* for문 단독 사용에 대한 흐름을 이해하고 적용 */

        // for 문은 반복되는 규칙을 발견하여 반복되는 것을 for문을 통해 만드는 것
        // 1~ 10을 출력하는 구문을 만들어 보거라
        for(int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }

    public void testForExample1() {

        // 10명의 학생 이름을 입력 받아 출력해보는 연습을 해보자.
        // 원래라면
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 학생의 이름을 입력해주세요");
        String student1 = sc.nextLine();
        // 이 문장을 10번 째 학생까지 반복해서 적어주어야 한다.

        // 따라서 반복되는 공통점을 발견한다면 1~10 번째 학생와 번호가 있다.

        for(int j = 1; j < 11; j++) {
            System.out.println(j + "번 째 학생의 이름을 입력하세요 : ");
            String student = sc.nextLine();
            System.out.println(j + "번 째 학생의 이름은 : " + student + "입니다.");
        }

    }

    public void testForExample2() {

        // 1 ~ 10 까지의 합계를 구하는 공식
        // 반복문을 사용하지 않는다면 int num1 = 1 ~~ 이런식으로 10개의 변수를 만들어 더해주어야 한다.
        int sum = 0;
        for(int i = 1; i < 11; i++) {
            sum += i;
        }

        System.out.println("sum = " + sum);

    }

    public void testForExample3() {

        // 5~10 사이의 난수를 발생시켜 1부터 발생한 난수까지의 합계를 구하시오
        int random = (int)(Math.random() * 6) + 5;
        int result = 0;
        for(int i = 1; i < random; i++) {
            result += i;
        }
        System.out.println("1부터 발생한 난수 " + random +  " 까지의 합 : " + result);
    }

    public void testForExample4() {

        // 숫자 2개를 입력 받아 작은 수 에서 큰 수까지의 합계를 구하시오
        // 단 두 숫자는 같은 숫자를 입력하지 않는다는 가정

        Scanner sc = new Scanner(System.in);
        System.out.print("1번째 정수를 입력하세요 : ");
        int first = sc.nextInt();
        System.out.print("2번째 정수를 입력하세요 : ");
        int second = sc.nextInt();

        int sum = 0;

        if(first > second) {
            for(int i = second; i <= first; i++) {
                sum += i;
            }
        } else {
            for(int i = first; i <= second; i++) {
                sum += i;
            }
        }

        System.out.println("sum = " + sum);


        // 더 간단한 방법
        int max = 0;
        int min = 0;

        if(first > second) {
            max = first;
            min = second;
        } else {
            max = second;
            min = first;
        }

        int sum2 = 0;
        for (int j = min; j <= max; j++) {
            sum2 += j;
        }

        System.out.println("sum2 = " + sum2);
    }

    public void printSimpleGugudan() {

        // 2~9 사이의 구구단을 입력받아 해당 단의 구구단을 출력하고
        // 그렇지 않는 경우 "반드시 2~9 사이의 양수를 입력하세요" 라는 구문 출력

        Scanner sc = new Scanner(System.in);
        System.out.print("구구단 단 수를 입력하세요 : ");
        int dan = sc.nextInt();

        if(dan >= 2 && dan <= 9) {
            for(int su = 1; su <= 9; su++) {
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
        } else {
            System.out.println("2부터 9 사이의 수를 입력해주세요");
        }

    }

}
