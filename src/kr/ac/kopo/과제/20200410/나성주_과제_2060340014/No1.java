package day03;

import java.util.Scanner;

public class No1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("정수 3개를 입력하세요 :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int n1 = 0, n2 = 0, n3 = 0;  // 순서를 나타낼 변수 설정 ( n1 > n2 > n3 로 설정할 예정)

        /*
            성주씨 n1, n2, n3 변수를 사용할 거라면 if문 조건을 조금 더 줄일 수도 있을 거 같아요.
            지금처럼 변수의 목적으로 사용하지 않으면 if문을 줄여서 작성할 수 있을 거같습니다. 한번 다시 생각해볼까요??? ^^
        */

        if (a > b) {
            if (a > c) {
                n1 = a;
                if (b > c) {
                    n2 = b;
                    n3 = c;
                }
                else {
                    n2 = c;
                    n3 = b;
                }
            } else {
                n1 = c;
                n2 = a;
                n3 = b;
            }

        } else {
            if (b > c) {
                n1 = b;
                if (a > c) {
                    n2 = a;
                    n3 = c;
                }
                else {
                    n2 = c;
                    n3 = a;
                }
            } else {
                n1 = c;
                n2 = b;
                n3 = a;
            }

        }
        System.out.printf("%d %d %d", n1, n2, n3);

    }
}
