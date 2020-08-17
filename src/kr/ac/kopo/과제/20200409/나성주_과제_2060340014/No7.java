package com.acompany.KopoHomework;

import java.util.Scanner;

public class No7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // toUpperCase() 메소드를 활용한 방법
        System.out.println("입력(알파벳) : ");
        String a = sc.nextLine();

        System.out.println("변경된 값 : " + a.toUpperCase());


        //아스키 코드를 활용한 방법
        System.out.println("입력(알파벳) : ");
        String b = sc.nextLine();
        int c =  b.charAt(0)-32;

        System.out.println("변경된 값 : " + (char) c);

    }
}
