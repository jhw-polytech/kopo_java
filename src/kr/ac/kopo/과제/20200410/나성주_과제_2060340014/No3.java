package day03;

import java.util.Scanner;

public class No3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1~100 사이의 정수를 입력 : ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.printf("< 1 ~ %d 정수 출력 >\n",n);
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}
