package homework.day04;
/*
3.
다음의 결과를 보이는 코드를 작성하시오
        1번째 정수 : 10
        2번째 정수 : 5
        10보다 큰수가 와야합니다
        2번째 정수 : 12
        3번째 정수 : 36
        4번째 정수 : 6
        10, 12, 36보다 큰수가 와야합니다
        4번째 정수 : 22
        10, 12, 36보다 큰수가 와야합니다
        4번째 정수 : 40
        5번째 정수 : 67
        < PRINT >
        10 12 36 40 67
        < REVERSE >
        76 4 63 21 1
        */

import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] biggerArr = new int[5]; // 5개의 정수를 담을 배열 생성
        int i = 0; // 몇번째 '큰' 정수 입력인지 & evenArr 배열의 index를 가리킴
        int cnt = 0; // 배열에 짝수가 몇 개 담겼는지 확인

        // biggerArr에 '큰' 정수 담기
        while (cnt != 5) { // 배열에 5개의 정수가 담기면 멈춤
            System.out.printf("%d번째 정수 : ", i + 1);
            int input = sc.nextInt();

            if (i + 1 == 1) {
                biggerArr[i] = input;
                i += 1;
                cnt += 1;
            } else {
                if (input > biggerArr[i - 1]) {
                    biggerArr[i] = input;
                    i += 1;
                    cnt += 1;
                } else {
                    for (int j = 1; j <= i + 1; j++) {
                        if (j < i) {
                            System.out.printf("%d, ", biggerArr[j - 1]);
                        } else if (j == i) {
                            System.out.printf("%d", biggerArr[j - 1]);
                        } else {
                            System.out.println("보다 큰 수가 와야합니다.");
                        }
                    }
                }
            }
        }

        // '큰' 수들 출력
        System.out.println("< PRINT >");
        for (int j : biggerArr) {
            System.out.printf("%d ", j);
        }
        System.out.println();
        System.out.println();


        // '큰' 수들 reverse 출력 (값도 reverse, 순서도 reverse)
        System.out.println("< REVERSE >");
        for (int j = biggerArr.length - 1; j >= 0; j--) { // 순서 reverse
            int reverseValue = 0;
            while (true) { // 값 reverse
                reverseValue += biggerArr[j] % 10;
                biggerArr[j] /= 10;

                if (biggerArr[j] == 0) {
                    System.out.print(reverseValue + " ");
                    break;
                } else {
                    reverseValue *= 10;
                }
            }
        }
    }
}

