package com.acompany.KopoHomework;

import java.util.Scanner;

public class No8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("물건값을 입력하세요 : ");
        int price = sc.nextInt(); // 물건값 입력
        sc.nextLine();

        System.out.println("지불한 돈의 액수를 입력하세요 : ");
        int payment = sc.nextInt(); //지불액 입력
        sc.nextLine();

        int change =  payment - price; //거스름돈 입력
        sc.nextLine();

        int thousand = change/1000; // 거스름돈의 1000원짜리 개수
        int fiveHundred = change%1000 / 500; // 거스름돈의 500원짜리 개수
        int hundred = change%1000%500 / 100; // 거스름돈의 100원짜리 개수
        int fifty = change%1000%500%100 / 50; // 거스름돈의 50원짜리 개수
        int ten = change%1000%500%100%50 / 10; // 거스름돈의 10원짜리 개수


        if (change >= 0) { //지불한 금액이 물건값보다 클 때
            System.out.printf("거스름돈 : %d원\n", change);
            System.out.printf("1000원 : %d개\n 500원 : %d개\n 100원 : %d개\n  50원 : %d개\n  10원 : %d개",thousand,fiveHundred,hundred,fifty,ten);
        } else { //지불한 금액이 물건값보다 작을 때
            System.out.printf("%d원이 부족합니다",price-payment);
        }

    }
}
