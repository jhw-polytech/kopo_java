package homework.day11ExceptionDateAPI.MakeCalender;

import java.util.Scanner;

public class CalenderMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.print("선택하세요(1. 특정년도   2. 특정월   3. 종료) => ");
            int n = sc.nextInt(); // 숫자 선택
            sc.nextLine();

            if (n == 1) {
                System.out.print("년도를 입력하세요 : ");
                int selectYear = sc.nextInt();  // 년도 선택
                sc.nextLine();

                for (int month = 1; month <= 12; month++) { // 1월부터 12월까지
                    MakeCalender.printCalender(selectYear, month);
                }
                System.out.println();

            } else if (n == 2) {

                System.out.print("년도를 입력하세요 : ");
                int selectYear = sc.nextInt();  // 년도 선택
                System.out.print("월을 입력하세요 : ");
                int selectMonth = sc.nextInt();
                sc.nextLine();

                MakeCalender.printCalender(selectYear, selectMonth);
                System.out.println();

            } else if (n == 3) {
                System.out.println("종료되었습니다.");
                break;

            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}