package day03;

public class No12 {
    public static void main(String[] args) {

        // 1행~4행의 규칙, 5행의 규칙, 6행~9행의 규칙이 다른 것으로 인식하고 3 케이스로 나눠서 구현

        for (int i = 1; i <= 9; i++) {
            if (i <= 4) { // 1~4행 규칙
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j <= 9-2*i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else if (i == 5) { // 5행 규칙
                for (int j = 1; j <= i; j++) { // 왼쪽 별 집단은 5개 찍고
                    System.out.print("*");
                }
                for (int j = 1; j <= 9-2*i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 4; j++) { // 오른쪽 별 집단은 4개 찍어야 함
                    System.out.print("*");
                }
                System.out.println();
            } else { // 6~9행 규칙
                for (int j = 1; j <= 10-i; j++) { //
                    System.out.print("*");
                }
                for (int j = 1; j <= 2*i-11; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 10-i; j++) { //
                    System.out.print("*");
                }
                System.out.println();
            }


        }
    }
}
