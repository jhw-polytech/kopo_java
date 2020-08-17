package kr.ac.kopo.day06.project.calculator;

import java.util.Scanner;

public class Calculator {
    // 객체마다 가지고 있어야 하므로 인스턴스 필드로 선언한다.
    int ans;
    int num1;
    int num2;

    public void excute() {
        getNums();
        sum();
        subtract();
        multiple();
        divide();
        isPrime(this.num1);
        isPrime(this.num2);
    }


    // 저장된 인스턴스 필드를 계속해서 사용할 것이다.
    void getNums() {
        int[] ans = new int[2];
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        num1 = Integer.parseInt(sc.nextLine());
        ans[0] = num1;
        System.out.print("정수 : ");
        num2 = Integer.parseInt(sc.nextLine());
        ans[1] = num2;
    }

    // 인스턴스 메소드로 사용한다.
    int sum() {
        ans = num1 + num2;
        System.out.printf("%d + %d = %d\n", num1, num2, ans);
        return ans;
    }

    int subtract() {
        ans = num1 - num2;
        System.out.printf("%d - %d = %d\n", num1, num2, ans);
        return ans;
    }

    int multiple() {
        ans = num1 * num2;
        System.out.printf("%d * %d = %d\n", num1, num2, ans);
        return ans;
    }

    double divide() {
        double ans = (double) num1 / num2;
        System.out.printf("%d / %d = %.1f\n", num1, num2, ans);
        return (double) num1 / num2; // 형변환한 후 반환한다.
    }

    Boolean isPrime(int num) {
        Boolean ansBoolean = true;

        for (int i = 2; i < num; i ++) { // 만약 num이 5라면, 2부터 3,4 까지 도는데,
            // 5%2, 5%3, 5%4를 한다. 5의 경우 5-1을 돌때까지 해당 조건문을 통과하지 못한다.
            if (num % i == 0) { // 만약 통과하는 경우, 소수가 아니므로 false로 바꿔주고, for문을 break한다.
                ansBoolean = false;
                break;
            }
        }

        System.out.printf("%2d 소수체크 : %b\n", num, ansBoolean);
        return ansBoolean; // 소수인 경우  true, 소수가 아닌 경우 false가 출력된다.
    }

}
