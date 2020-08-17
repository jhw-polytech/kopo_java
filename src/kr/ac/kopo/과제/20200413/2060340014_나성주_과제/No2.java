package day04;
/*
2.
5개의 짝수를 입력받아 출력하는 코드를 작성
        1's 정수 : 12
        2's 정수 : 5
        2's 정수 : 20
        3's 정수 : 10
        4's 정수 : 26
        5's 정수 : 5
        5's 정수 : 11
        5's 정수 : 4

< 5개의 정수 출력 >
        12 20 10 26 4
*/

import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정수 입력값 중 짝수를 배열에 담기
        int[] evenArr = new int[5]; // 짝수를 담을 배열 생성
        int i = 0; // 몇번째 짝수 입력인지 & evenArr 배열의 index를 가리킴
        int cnt = 0; // 배열에 짝수가 몇 개 담겼는지 확인

        while (cnt != 5) { // 배열에 5개의 짝수가 담기면 멈춤

            System.out.printf("%d's 정수 : ",i+1);
            int input = sc.nextInt();
            if (input % 2 == 0 && input > 0) { // 짝수인지 검증
                evenArr[i] = input;
                i += 1;
                cnt += 1;
            }
        }

        //짝수가 담긴 배열 값들 출력
        System.out.println("< 5개의 짝수 출력 >");
        for (int j : evenArr) { // 짝수 배열 값 출력
            System.out.printf("%-3d",j);
        }
    }
}
