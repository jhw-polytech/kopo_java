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


public class StringUtil {

//    String str; // 멤버변수(필드)가 굳이 필요 없었다...


    /* 통상적으로 굳이 입력까지는 메소드를 안 만든다고 해서 제외시키고, 대신에 메인 메소드에서 직접 구현했다.
        void input() {
        Scanner sc = new Scanner(System.in);
        this.str = sc.nextLine();
        this.c = str.charAt(0);

    }*/

    // 대문자인지 판별하는 메소드
    boolean isUpperChar(char c) {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            if (c == ch) {
                return true;
            }
        }
        return false;  // return에 대한 공부 필요
    }

    // 소문자인지 판별하는 메소드
    boolean isLowerChar(char c) {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (c == ch) {
                return true;
            }
        }
        return false;  // return 활용에 대한 공부 필요
    }

    // 두 정수 중 큰 값을 출력하는 메소드
    int max(int i, int j) {
        if (i > j) {
            return i;
        } else {
            return j;
        }
    }

    // 두 정수 중 작은 값을 출력하는 메소드
    int min(int i, int j) {
        if (i > j) {
            return j;
        } else {
            return i;
        }
    }

    // 문자열을 거꾸로 출력하는 메소드
    String reverseString(String str) {

        String reverseValue = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseValue += str.charAt(i);
        }
        return reverseValue;
    }

    // 문자열을 대문자화하는 메소드
    String toUpperString(String str) {

        String upperString = "";
        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                upperString += (char) (str.charAt(i) - 32);
            } else {
                upperString += str.charAt(i);
            }
        }
        return upperString;
    }

    // 문자열을 소문자화하는 메소드
    String toLowerString(String str) {

        String lowerString = "";
        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                lowerString += (char) (str.charAt(i) + 32);
            } else {
                lowerString += str.charAt(i);
            }
        }
        return lowerString;
    }
}





