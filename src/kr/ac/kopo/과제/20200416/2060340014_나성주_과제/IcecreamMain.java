package homework.day05;

/*
1. 다음의 결과를 보이는 프로그램을 작성하시오.
        아이스크림을 몇개 구입할래? 3 (입력)

        *** 1번째 아이스크림 구매정보 ***
        아이스크림명 : 메로나 (입력)
        아이스크림가격 : 1000 (입력)

        *** 2번째 아이스크림 구매정보 ***
        아이스크림명 : 월드콘 (입력)
        아이스크림가격 : 2000 (입력)

        *** 3번째 아이스크림 구매정보 ***
        아이스크림명 : 비비빅 (입력)
        아이스크림가격 : 800 (입력)

< 총 3개의 아이스크림 구매정보 출력 >
        번호 아이스크림명 아이스크림가격
        1 메로나 1000
        2 월드콘 2000
        3 비비빅 800
*/

import java.util.Scanner;

public class IcecreamMain {
    public static void main(String[] args) {

        // 수정했습니다!


        // 객체 배열 생성 -> 배열 내 인스턴스 객체들 생성

        Scanner sc = new Scanner(System.in);

        System.out.print("아이스크림을 몇개 구입할래? ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println();

        Icecream[] iceArr = new Icecream[n]; // Icecream 클래스's 인스턴스 객체의 주소를 기억하기위한 객체 배열 생성

        for (int i = 0; i < n; i++) {

            iceArr[i] = new Icecream(); // 인스턴스 객체 생성

            System.out.println("*** " + (i + 1) + "번째 아이스크림 구매정보 ***");
            System.out.print("아이스크림명 : ");
            iceArr[i].name = sc.nextLine();
            sc.nextLine();

            System.out.print("아이스크림가격 : ");
            iceArr[i].price = sc.nextInt();
            sc.nextLine();

            System.out.println();
        }

        System.out.println("< 총 " + n + "개의 아이스크림 구매정보 출력 >");
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                System.out.printf("%7s%15s%15s\n", "번호", "아이스크림명", "아이스크림가격");
            } else {
                System.out.printf("%7d%15s%15d\n", i, iceArr[i - 1].name, iceArr[i - 1].price);
            }
        }

    }
}
