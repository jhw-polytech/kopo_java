package homework.day10Interface;

/*최대
        공약수는 두 숫자를 공통된 숫자로 나누어도 나머지가 0 이 되는 가장 큰 수
        를 의미합니다 . 예를 들어 2 와 5 의 최대 공약수는 1 입니다 . 왜냐하면 , 1 부터 2 까
        지의 숫자중 공통으로 나눌 수 있는 숫자는 1 뿐이기 때문입니다 . 다른 예로 , 5 와
        15 의 최대 공약수는 5 가 됩니다 . 메소드의 이름은 gcd 로 하며 , 매개변수는 두개
        의 정수를 받으며 , 리턴 하는 타입 역시 정수입니다*/

import java.util.Scanner;

public class GreatestCommonDivisor {

    static int gcd(int a, int b) {

        int biggerN, smallerN;
        if (a > b) {
            biggerN = a;
            smallerN = b;
        } else {
            biggerN = b;
            smallerN = a;
        }

        int gcdValue; // 최대공약수
        for (int i = smallerN; true; i--) { // 계산을 줄이기 위해서 큰 수 쪽부터 계산
            if (smallerN % i == 0 && biggerN % i == 0) {
                gcdValue = i;
                break;
            }
        }
        return gcdValue;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("두 수를 입력하세요");
        int a =sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        System.out.print("최대공약수 : ");
        System.out.println(gcd(a,b));
    }
}
