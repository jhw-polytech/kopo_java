package com.acompany.KopoHomework;

public class No6 {
    public static void main(String[] args) {

        int cnt = 0;
        for (char i = 'a'; i <= 'z' ; i++) { //a~z 까지 개수 세기

            cnt += 1;

        }

        int cnt2 = 0;
        for (char i = 'A'; i <= 'Z' ; i++) { //A~Z 까지 개수 세기기
            cnt2 += 1;

        }
        System.out.println("개수 ? " + (cnt + cnt2)); //a~z, A~Z 개수 합쳐주기
    }
}
