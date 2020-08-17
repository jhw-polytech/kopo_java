package homework.day06Class;

/*- 아래의 내용을 만족하는 StringUtil 클래스를 작성합니다. (1번 ~7번)
        1. 하나의 문자를 입력받아 해당 문자가 대문자이면 true 를 반환하는 isUpperChar( char c ) 메소
        드를 작성하시오
        2. 하나의 문자를 입력받아 해당 문자가 소문자이면 true를 반환하는 isLowerChar(char c) 메 소드
        를 작성하시오
        3. 두개의 숫자를 입력받아 큰수를 반환하는 max( int i, int j) 메소드를 작성하시오
        4. 두개의 숫자를 입력받아 작은수를 반환하는 min(int i, int j) 메소드를 작성하시오
        5. 문자열을 입력받아 거꾸로 변경하는 reverseString( String str ) 메소드를 작성하시오
        6. 문자열을 입력받아 대문자로 변경하는 toUpperString( String str ) 메소드를 작성하시오
        7. 문자열을 입력받아 소문자로 변경하는 toLowerString( String str ) 메소드를 작성하시오*/

import java.util.Scanner;

public class StringUtilMain {
    public static void main(String[] args) {

        StringUtil Str = new StringUtil();

        Scanner sc = new Scanner(System.in);

        // 대문자 판단
        System.out.print("문자를 입력하세요 : ");
        String str = sc.nextLine();
        char c = str.charAt(0); //
        System.out.println("대문자 입니까? " + Str.isUpperChar(c));

        System.out.println();

        // 소문자 판단
        System.out.print("문자를 입력하세요 : ");
        String str2 = sc.nextLine();
        char d = str2.charAt(0);
        System.out.println("소문자 입니까 ? " + Str.isLowerChar(d));

        System.out.println();

        // 큰 수 반환
        System.out.print("정수를 입력하세요 : ");
        int a = sc.nextInt();
        System.out.print("정수를 입력하세요 : ");
        int b = sc.nextInt();
        System.out.println("큰 수 : " + Str.max(a,b));

        System.out.println();

       // 작은 수 반환
        System.out.print("정수를 입력하세요 : ");
        int e = sc.nextInt();
        sc.nextLine();
        System.out.print("정수를 입력하세요 : ");
        int f = sc.nextInt();
        sc.nextLine();
        System.out.println("작은 수 : " + Str.min(e,f));

        System.out.println();

        // 문자열을 거꾸로 출력
        System.out.print("문자열을 입력하세요 : ");
        String str3 = sc.nextLine();
        System.out.println("거꾸로 문자열 값 : " + Str.reverseString(str3));

        System.out.println();

        //문자열의 대문자화
        System.out.print("문자열을 입력하세요 : ");
        String str4 = sc.nextLine();
        System.out.println("대문자화 된 문자열 : " + Str.toUpperString(str4));

        System.out.println();

       //문자열의 소문자화
        System.out.print("문자열을 입력하세요 : ");
        String str5 = sc.nextLine();
        System.out.println("대문자화 된 문자열 : " + Str.toLowerString(str5));


    }
}
