package kr.ac.kopo.day07.project.string01;

import java.util.Scanner;

/**
 *
 다음은 주어진 문자열에서 문자를 찾는 문제입니다.
 입력값에 따라 다음과 같은 출력이 나오도록
 해당 char 의 개수를 리턴하는 checkChar 메소드를 작성하시오.

 public static int checkChar(String strData, char ch)
 - 문자열의 각 내용들을 비교하여 입력 받는 char c의 값과 동일한 char 의 개수를 리턴 한다.
 - 대소문자 구별하여 비교한다.

 <<처리 결과>>

 입력 스트링 : String strData = "Hello World Java";
 a. ch = ’o’ 인 경우   =>  2 리턴
 b. ch = ’W’ 인 경우  =>  1 리턴

 */
public class String01Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요.");
        String strData = sc.nextLine();
        System.out.println("찾고 싶은 문자를 입력하세요.");
        char ch = sc.next().charAt(0);
        int answer = String01.checkChar(strData, ch);

        System.out.printf("%s안에는 %s가 %d개가 존재 합니다.", strData, ch, answer);
    }
}
