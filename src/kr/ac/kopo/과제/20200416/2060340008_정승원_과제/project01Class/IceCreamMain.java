package kr.ac.kopo.day05.project01Class;

import java.util.Scanner;

public class IceCreamMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // 아이스크림 개수에 대한 파라미터를 받는다.
        System.out.print("아이스크림을 몇개 구입할래? ");
        int count = sc.nextInt();
        IceCream[] iceCreams = new IceCream[count];

        for (int i = 0; i < count; i++) {
            iceCreams[i] = new IceCream();

            System.out.printf("*** %d번째 아이스크림 구매정보 ***\n", i + 1);
            System.out.print("아이스크림명 : ");
            iceCreams[i].name = sc.next();

            System.out.print("아이스크림가격 : ");
            iceCreams[i].price = sc.nextInt();
            ;
        }

        System.out.printf("< 총 %d개의 아이스크림 구매정보 출력 >\n", count);
        System.out.println("번호    아이스크림명    아이스크림가격");
        for (int i = 0; i < count; i++) {
            // 출력 시 줄을 맞춰서 예쁘게 출력해준다.
            System.out.printf("%2d       %5s     %8d\n", i + 1, iceCreams[i].name, iceCreams[i].price);
        }
    }
}
