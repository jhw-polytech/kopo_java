package day03;

import java.util.Scanner;

public class No8 {

    public static void main(String[] args) {

        // 수정했습니다! startDan과 endDan 추가해서 불필요한 if 조건문 삭제

        Scanner sc = new Scanner(System.in);

        System.out.print("시작단을 입력 : ");
        int n = sc.nextInt(); // 시작단 설정
        System.out.print("종료단을 입력 : ");
        int m = sc.nextInt(); // 종료단 설정

        int startDan, endDan; // 시작단, 종료단 확정
        if (n < m) {
            startDan = n;
            endDan = m;
        } else {
            startDan = m;
            endDan = n;
        }

        for (int i = startDan; i <= endDan; i++) { // startDan단부터 endDan단까지 구구단
            System.out.printf("*** %d단 ***\n", i);
            for (int j = 1; j <= 9; j++) { // 1- 9 까지 곱셈
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
            System.out.println(); // 한 단 끝나면 한 줄 띄기
        }
    }
}
