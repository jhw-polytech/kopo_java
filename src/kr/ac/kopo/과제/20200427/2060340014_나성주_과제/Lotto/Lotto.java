package homework.day11ExceptionDateAPI.Lotto;

/*
    과제1>
    좋아하는 로또 번호를 입력하세요 : 34
            34를 포함해서 로또번호들을 추출하겠습니다

    좋아하는 로또 번호를 입력하세요 : 77
    LottoNumberException : 1 - 45사이만 가능합니다. 77은 올바르지 않습니다
*/

import java.util.Scanner;

public class Lotto {

    static void playLotto() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("좋아하는 로또 번호를 입력하세요 : ");
            int n = sc.nextInt();
            sc.nextLine();
            if (n < 1 || n > 45) {
                throw new LottoNumberException("1 - 45사이만 가능합니다. " + n + "은 올바르지 않습니다.");
            }
            System.out.println( n + "을(를) 포함해서 로또번호들을 추출하겠습니다.");

        } catch (LottoNumberException le) {
            System.out.println("LottoNumberException: " +le.getMessage());
        }
    }

    public static void main(String[] args) {

        playLotto();

    }
}