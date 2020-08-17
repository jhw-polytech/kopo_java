package homework.day07String;

/* 다음은 주어진 문자열에서 문자를 찾는 문제입니다.
         입력값에 따라 다음과 같은 출력이 나오도록
         해당 char 의 개수를 리턴하는 checkChar 메소드를 작성하시오.

public static int checkChar(String strData, char ch)
        - 문자열의 각 내용들을 비교하여 입력 받는 char c의 값과 동일한 char 의 개수를 리턴 한다.
        - 대소문자 구별하여 비교한다.

        <<처리 결과>>

        입력 스트링 : String strData = "Hello World Java";
        a. ch = ’o’ 인 경우   =>  2 리턴
        b. ch = ’W’ 인 경우  =>  1 리턴*/


/*다음은 주어진 문자열에서 특정 문자를 제거하는 문제입니다.

public static String removeChar(String oriStr, char delChar)
        - 문자열 (oriStr)의 내용 중 주어진 문자(delChar)를 삭제한다.
        - 삭제된 내용으로 문자열의 내용을 변경한다.

        <<처리 결과>>

        입력 스트링 : String oriStr = "Hello World Java"
        a.  delChar = 'l' 인 경우  =>  Heo Word Java  리턴
        b.  delChar = 'o' 인 경우 =>  Hell Wrld Java   리턴*/

import java.util.Scanner;

public class No1Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력하세요 : ");
        String strData = sc.nextLine();
        System.out.print("찾을 문자를 입력하세요 : ");
        String input = sc.nextLine();
        char ch = input.charAt(0); // 찾을 문자값 설정

        System.out.printf("해당 문자가 %d개 있습니다.\n", No1.checkChar(strData, ch)); // ch가 몇 개인지 출력


        System.out.println();


        System.out.print("문자열을 입력하세요 : ");
        String oriStr = sc.nextLine();
        System.out.print("삭제할 문자를 입력하세요 : ");
        String input2 = sc.nextLine();
        char delChar = input2.charAt(0); // 찾을 문자값 설정

        System.out.printf("'%c'를(을) 제외한 문자열 : %s",delChar,No1.removeChar2(oriStr, delChar));


    }
}
