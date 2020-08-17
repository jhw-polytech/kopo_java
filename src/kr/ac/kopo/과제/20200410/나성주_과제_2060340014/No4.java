package day03;


import java.util.Random;
import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {

        // 수정했습니다!
        //수정 내용: 불필요한 else 구문 삭제, 1-100 사이 정수라는 조건에 맞지 않아도 진행되는 부분 수정

        Scanner sc = new Scanner(System.in);

        System.out.println("1 - 100 사이의 정수를 입력 :");
        int a = sc.nextInt();

        if (a >= 1 && a <= 100) {
            System.out.println(a);

            System.out.println("2 - 10 사이의 정수를 입력 :"); // 2 - 10 범위 외의 숫자를 입력할 경
            int b = sc.nextInt();

            if (b >= 2 && b <= 10) {
                System.out.println(b);


                System.out.printf("< 1 ~ %d 사이의 %d의 배수를 제외한 정수 출력 >\n", a, b);
                for (int i = 1; i <= a; i++) { // i를 b로 나눈 나머지가 0이면 아무것도 출력 안하고, 0이 아니면 i를 출력

                    if (i % b != 0) {
                        System.out.printf("%5d", i);
                    } // 수정
                }
                System.out.print("\n\n");


                System.out.printf("< 1 ~ %d 사이의 %d의 배수를 제외한 정수 %d개씩 출력 >\n", a, b, b);
                int cnt = 0;
                for (int i = 1; i <= a; i++) { // i를 b로 나눈 나머지가 0이면 아무것도 출력 안하고, 0이 아니면 i를 출력

                    if (i % b != 0) {
                        System.out.printf("%5d", i);
                        cnt += 1;
                        if (cnt % b == 0) { // 한 줄에 5개가 숫자가 차면 다음 줄로
                            System.out.println();
                        }
                    } // 수정
                }
            } else {
                System.out.println("잘못된 입력입니다."); // 수정
            }
        } else {
            System.out.println("잘못된 입력입니다."); // 1 - 100 범위 외의 숫자를 입력할 경우 // 수정
        }
    }
}
