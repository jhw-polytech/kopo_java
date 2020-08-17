package day03;

import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("정수 4개를 입력하세요 : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int partialMax1 = 0; // a와 b 중 큰 수
        int partialMax2 = 0; // c와 d 중 큰 수
        int max = 0; // 4개의 숫자 중 가장 큰 수

        // 2개, 2개씩 비교한 후 각각의 큰 수를 비교하여 최대값을 구할 예정

        if (a >= b) {
            partialMax1 = a;
        } else {
            partialMax1 = b;
        }

        if (c >= d) {
            partialMax2 = c;
        } else {
            partialMax2 =d;
        }

        if (partialMax1 >= partialMax2) {
            max = partialMax1;
        } else {
            max = partialMax2;
        }

        System.out.printf("%d, %d, %d, %d 중 가장 큰 수 : %d", a,b,c,d,max);

    }
}
