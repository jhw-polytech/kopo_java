package homework.day10Interface;

/*문제
        1 . 숫자를 입력 받아서 아래와 같은 실행결과가 나타나도록 SumTest 클래스의 main 메쏘드
        를 완성하십시오 .
        a.
        입력받은 숫자가 홀수인 경우에는 , 0 부터 입력 값까지 훌수의 합을 출력합니다
        -
        예제 : 입력 이 7 이면 16 을 출력 ( 1 + 3 + 5 + 7 = 16 )
        b.
        입력받은 숫자가 짝수인 경우에는 , 0 부터 입력 값까지 짝수의 합을 출력합니다
        -
        예제 : 입력 이 10 이면 30 을 출력 ( 2 + 4 + 6 + 8 + 10 30 )
        */

import java.util.Scanner;

public class SumTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자값을 입력하세요. : ");
        int n = sc.nextInt();
        sc.nextLine();

        int sumN = 0;
        if (n > 0 && n%2 == 1) {
            for (int i = 1; i <= n; i += 2) {
                sumN += i;
            }
        } else if (n > 0 && n%2 == 0) {
            for (int i = 0; i <= n; i += 2) {
                sumN += i;
            }
        }

        System.out.print("결과값 : " + sumN);

    }
}
