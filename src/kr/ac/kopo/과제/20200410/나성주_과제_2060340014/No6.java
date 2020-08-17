package day03;

import java.util.Scanner;

public class No6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("2 - 9 단을 입력 : \n");
        int n = sc.nextInt();

        System.out.printf("*** %d단 ***\n",n);
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", n,i,n*i);
        }
    }
}
