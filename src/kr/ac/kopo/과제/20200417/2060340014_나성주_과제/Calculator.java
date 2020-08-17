package homework.day06Class;

/*8. 사칙연산을 수행하는 Calculator 클래스 작성
        정수 : 12
        정수 : 5
        12 + 5 = 17
        12 - 5 = 7
        12 * 5 = 60
        12 / 5 = 2.4
        12 소수체크 : false
        5 소수체크 : true*/

import java.util.Scanner;

public class Calculator {
    /*
    입출력까지 메소드로 구현해주는 방식과, 구현해주지 않는 방식을 모두 코딩해보니,
    입출력까지 메소드로 구현해주면 대체로 멤버변수가 필요하고,
    구현해주지 않으면 멤버변수가 필요없이 매개변수로만 메소드를 구현해줄 수 있다는 것을 느꼈다.
    Caculator, IceCream은 입출력 메소드 구현 / StringUtil은 입출력 메소드 구현 x
    */

    int x1, x2;


    // 입력 메소드
    void numInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        this.x1 = sc.nextInt();
        System.out.print("정수 : ");
        this.x2 = sc.nextInt();
    }

    // 덧셈 메소드
    int addFunction() {

        int sum = 0;
        sum = this.x1 + this.x2;

        return sum;
    }

    // 뺄셈 메소드
    int minusFunction() {

        int minus = 0;
        minus = this.x1 - this.x2;

        return minus;
    }

    // 곱셈 메소드
    int multiplyFunction() {

        int multiply = 0;
        multiply = this.x1 * this.x2;

        return multiply;
    }

    // 나눗셈 메소드
    double divideFunction() {

        double divide = 0;
        divide = (double) this.x1 / this.x2;

        return divide;
    }

    // 소수 판단 메소드 1
    boolean isSosu() {

        int cnt = 0;
        for (int i = 1; i <= this.x1; i++) {
            if (this.x1 % i == 0) {
                cnt += 1;
            }
        }
        if (cnt == 2) {
            return true;
        }
        return false;
    }

    // 소수 판단 메소드 2
    boolean sosuJudge2() {

        int cnt = 0;
        for (int i = 1; i <= this.x2; i++) {
            if (this.x2 % i == 0) {
                cnt += 1;
            }
        }
        if (cnt == 2) {
            return true;
        }
        return false;
    }

    // 값 출력 메소드
    void printResult() {
        System.out.printf("%d + %d = %d\n", this.x1, this.x2, addFunction());
        System.out.printf("%d - %d = %d\n", this.x1, this.x2, minusFunction());
        System.out.printf("%d * %d = %d\n", this.x1, this.x2, multiplyFunction());
        System.out.printf("%d / %d = %.1f\n", this.x1, this.x2, divideFunction());
        System.out.printf("%d 소수체크 : %b\n", this.x1, isSosu());
        System.out.printf("%d 소수체크 : %b\n", this.x2, sosuJudge2());

    }








 /*       if ()

        if ()
            for (int i = 0; i <= sosuArr.length - 1; i++) {

                if (sosuArr[i] == x1) {
                    break;
                }
            }
        return true;

*/

}
