package com.acompany.KopoHomework;

import java.util.Scanner;

public class No3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("반지름을 입력하세요 : ");
        double r = sc.nextDouble(); // 반지름 선언
        sc.nextLine();
        final double PI = 3.141592; // 상수 파이 값 설정

        System.out.printf("원의 면적은 %.4f 입니다.",PI*Math.pow(r,2));

    }
}
