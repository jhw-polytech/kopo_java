package com.acompany.KopoHomework;

import java.util.Scanner;

public class No5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        final double EXCHANGE = 1092.50; // 상수 환율 선언
        System.out.println("달러를 입력하세요 ? ");
        int dollar = sc.nextInt();  // 몇 달러인지 선언
        sc.nextLine();

        System.out.printf("원화 : %.2f원", EXCHANGE * dollar);




    }
}
