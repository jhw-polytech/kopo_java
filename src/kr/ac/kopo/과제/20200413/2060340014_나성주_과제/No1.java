package homework.day04;
/*
1.
10개의 정수를 입력받아 다음과 같이 출력하는 코드를 작성하시오.
        1's num : 12
        2's num : 5
        3's num : 8
        4's num : 30
        5's num : 22
        6's num : 87
        7's num : 9
        8's num : 4
        9's num : 15
        10's num : 22

< 짝수 >
 12 8 30 22 4 22
         짝수의 총합 : XXX

< 홀수 >
 5 87 9 15
         홀수의 총합 : XXX
*/

import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 10개 정수 입력
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d's num : ", i + 1);
            arr[i] = sc.nextInt();
        }

        /*
                조건의 순서가 바뀌는 것이 더 좋을 거 같아요... 짝홀은 양수일때만 의미가 있으니깐요
                --> 수정했습니다!
         */

        //짝수와 짝수의 합 출력
        System.out.println("< 짝수 >");
        int evenSum = 0; // 짝수의 합을 담을 변수
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0 && arr[i] % 2 == 0) { // 짝수인지 검증
                System.out.printf("%-3d", arr[i]); //짝수면 출력
                evenSum += arr[i];
            }
        }
        System.out.printf("\n짝수의 총합 : %d", evenSum); // 짝수의 합 출력

        System.out.println();

        // 홀수와 홀수의 합 출력
        System.out.println("< 홀수 >");
        int oddSum = 0; // 홀수의 합을 담을 변수
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0 && arr[i] % 2 == 1) { //홀수인지 검증
                System.out.printf("%-3d", arr[i]); //홀수면 출력
                oddSum += arr[i];
            }
        }
        System.out.printf("\n홀수의 총합 : %d", oddSum); //홀수의 합 출력

    }
}
