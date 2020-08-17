package kr.ac.kopo.day05.project;

import java.util.Scanner;

public class project01 {

    // 위에서 선언해서 한 번만 선언하면 될 수 있도록 한다.
    static Scanner sc = new Scanner(System.in);

    // void로 선언해서 반환값이 없도록한다.
    // 출력되는 것만 확인되면 된다.
    static void IceCreamInfo(int count) {

        // 아이스크림 이름과 가격을 저장할 배열을 선언한다.
        String[] name = new String[count]; // 이름
        int[] price = new int[count]; // 가격

        for (int i = 0; i < count; i++ ) {
            // 개수만큼 돌면서 이름과 가격을 입력받는다.
            System.out.printf("*** %d번째 아이스크림 구매정보 ***\n", i+1);
            System.out.print("아이스크림명 : ");
            name[i] = sc.next();
            System.out.print("아이스크림가격 : ");
            price[i] = sc.nextInt();
        }
        // 이름 배열과 가격 배열을 돌면서 출력한다.
        System.out.printf("< 총 %d개의 아이스크림 구매정보 출력 >\n", count);
        System.out.println("번호    아이스크림명    아이스크림가격");
        for (int i = 0; i < count; i++ ) {
            // 출력 시 줄을 맞춰서 예쁘게 출력해준다.
            System.out.printf("%2d       %5s     %8d\n", i+1, name[i], price[i]);
        }
    }

    public static void main(String[] args) {

        // 아이스크림 개수에 대한 파라미터를 받는다.
        System.out.print("아이스크림을 몇개 구입할래? ");
        int count = sc.nextInt();
        // 넘겨준다.
        IceCreamInfo(count);
    }
}
