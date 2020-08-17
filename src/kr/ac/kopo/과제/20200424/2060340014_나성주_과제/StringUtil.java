package homework.day10Interface;

/*문제
        2
        아래와
        같은 출력이 나오도록 StringUtil 클래스의 hokeyGraphics(char cell, int size, boolean
        isRect) 메소드를 완성한다 . hokeyGraphics 메소드는 cell 문자와 size 값을 이용하여 특정 모양을
        출력한다 . isRect 값이 true 이면 사각형 모양을 출력하고 , false 이면 삼각형을 출력한다 .*/

public class StringUtil {

    public static void hokeyGraphics(char cell, int size, boolean isRect) {

        if (isRect) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(cell);
                }
                System.out.println();
            }
        } else if (!isRect)
            for (int i = 0; i < size; i++) {
                for (int j = 0; j <= i ; j++) {
                    System.out.print(cell);
                }
                System.out.println();
            }
        }

    public static void main(String[] args) {
        hokeyGraphics('$', 4, true);
    }
}
