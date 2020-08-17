package day03;

public class No11 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i-1; j++) {
                System.out.print(" ");
            }
            for (int j =1; j <= 11 - 2*i; j++) {  // 11-2n 이라는 등차수열 규칙 적용
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
