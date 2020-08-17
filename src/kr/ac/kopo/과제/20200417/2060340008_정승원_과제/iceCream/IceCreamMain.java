package kr.ac.kopo.day06.project.iceCream;

import java.util.Scanner;

public class IceCreamMain {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // 아이스크림 개수에 대한 파라미터를 받는다.
        System.out.print("아이스크림을 몇개 구입할래? ");
        iceCreamInfo(sc.nextInt());
    }

    public static void iceCreamInfo(int count) {
        IceCream[] iceCreams = new IceCream[count];

        for (int i = 0; i < count; i++) {
            System.out.printf("*** %d번째 아이스크림 구매정보 ***\n", i + 1);
            System.out.print("아이스크림명 : ");
            String name = sc.next();
            sc.nextLine();
            System.out.print("아이스크림가격 : ");
            int price = Integer.parseInt(sc.nextLine());
            iceCreams[i] = new IceCream(name, price); // 생성자를 통해 값을 넣어준다.
        }

        System.out.printf("< 총 %d개의 아이스크림 구매정보 출력 >\n", count);
        System.out.println("번호    아이스크림명    아이스크림가격");
        for (int i = 0; i < count; i++) {
            // 출력 시 줄을 맞춰서 예쁘게 출력해준다.
            System.out.printf("%3d%10s%13d\n", i + 1, iceCreams[i].getName(), iceCreams[i].getPrice());
        }
    }
}
