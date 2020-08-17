package day04;
/*
4.
다음의 결과를 보이는 프로그램을 작성하시오.
        int[] nums = new int[30];
        1 – 100사이의 정수를 입력하시오 : 64
        64의 약수의 개수 : 7개
< 64의 7개 약수 출력 >
        1 2 4 8 16 32 64
        1 – 100사이의 정수를 입력하시오 : 79
        79의 약수의 개수 : 2개
< 79의 2개 약수 출력 >
        1 79
*/
import java.util.Scanner;


public class No4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] yaksuNums = new int[30]; // 약수를 담을 배열

        System.out.print("1과 100사이의 정수를 입력하세요 : ");
        int n = sc.nextInt();

        int cnt = 0; // 약수의 개수 카운트
        int j = 0; // nums배열의 인덱스로 사용할 변수

        // 배열에 n의 약수 담기
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                yaksuNums[j] = i;
                j += 1; // i가 n의 약수이면 nums 배열에 담고
                cnt += 1;
            }
            // 아니면 담지 않는다
        }

        System.out.printf("%d의 약수의 개수 : %d개\n", n, cnt);

        System.out.printf("< %d의 %d개 약수 출력 >\n", n, cnt);
        for (int i : yaksuNums) {
            if (i != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
