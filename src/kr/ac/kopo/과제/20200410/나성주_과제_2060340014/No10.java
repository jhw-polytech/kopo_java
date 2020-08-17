package day03;

public class No10 {
    public static void main(String[] args) {

        for (int i = 1; i <= 9;i++ ) {

            if (i <= 5) {

                for (int j = 1; j <= i - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 6 - i; j++) { // 6-n 이라는 등차수열 규칙 적용
                    System.out.print("*");
                }
                System.out.println();

            } else {

                for (int j = 1; j <= 9-i; j++ ) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i-4; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }
}
