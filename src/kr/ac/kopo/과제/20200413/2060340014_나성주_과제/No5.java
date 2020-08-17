package day04;
/*
5.
2 ~ 100사이의 소수를 출력하는 코드를 작성
        < 2 ~ 100사이의 소수 출력 >
        2 3 5 7 11 13 17 … 97
*/

import java.util.Scanner;

public class No5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // 우선 배열에 2~100 까지 정수 입력
        int[] sosuArray = new int[99];
        for (int i = 0; i <= 98; i++ ) {
            sosuArray[i] = i+2;
        }

        // 2~100 중 소수 걸러내기
        for (int i = 0; i <= 98; i++) {
            /*
                제가 생각했던 알고리즘 코드는 아니네요~~
                답은 잘나오지만 한번 제가 말한 코드와 맞는지 생각해주세요...^^
            */
            for (int j = 2; sosuArray[i]*j-2 >= 0 && sosuArray[i]*j-2 <= 98; j++ ) //주의: 인덱스가 배열의 크기보다 크거나 음수 인덱스에 대한 요청이 있으면 예외 발생
                sosuArray[sosuArray[i] * j - 2] = 0; // 소수를 제외한 수는 모두 0으로 처리
        }

        // 2~100 까지의 소수 출력
        System.out.print("< 2 ~ 100 사이의 소수 출력 >\n");
        for (int i : sosuArray) {
            if (i != 0) {
                System.out.print(i+" ");
            }
        }
    }
}
