package kr.ac.kopo.day07.project.string02;

import java.util.Scanner;

import static kr.ac.kopo.day07.project.string02.String02.removeChar;

/**
 다음은 주어진 문자열에서 특정 문자를 제거하는 문제입니다.

 public static String removeChar(String oriStr, char delChar)
 - 문자열 (oriStr)의 내용 중 주어진 문자(delChar)를 삭제한다.
 - 삭제된 내용으로 문자열의 내용을 변경한다.

 <<처리 결과>>

 입력 스트링 : String oriStr = "Hello World Java"
 a.  delChar = 'l' 인 경우  =>  Heo Word Java  리턴
 b.  delChar = 'o' 인 경우 =>  Hell Wrld Java   리턴
 */
public class String02Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요.");
        String oriStr = sc.nextLine();
        System.out.println("삭제하고싶은 문자를 입력하세요.");
        char delChar = sc.next().charAt(0);
        String answer = removeChar(oriStr, delChar);

        System.out.printf("%s안에서 %s를 삭제했습니다. \n %s", oriStr, delChar, answer);
    }
}
