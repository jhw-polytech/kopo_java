package com.acompany.KopoHomework;

import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하세요 : ");
        int i = sc.nextInt();
        sc.nextLine();

        System.out.println("나눌 수를 입력하세요 : ");
        int a = sc.nextInt();
        sc.nextLine();

        System.out.println("몫 : " + i/a);
        System.out.println("나머지 : " + i%a);
    }


}
