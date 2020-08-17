package kr.ac.kopo.day06.project.stringUtil;

public class StringUtil {

    /**
     * 1. 하나의 문자를 입력받아 해당 문자가 대문자이면 true 를 반환하는 isUpperChar( char c ) 메소 드를 작성하시오
     * 2. 하나의 문자를 입력받아 해당 문자가 소문자이면 true를 반환하는 isLowerChar(char c) 메 소드 를 작성하시오
     * 3. 두개의 숫자를 입력받아 큰수를 반환하는 max( int i, int j) 메소드를 작성하시오
     * 4. 두개의 숫자를 입력받아 작은수를 반환하는 min(int i, int j) 메소드를 작성하시오
     * 5. 문자열을 입력받아 거꾸로 변경하는 reverseString( String str ) 메소드를 작성하시오
     * 6. 문자열을 입력받아 대문자로 변경하는 toUpperString( String str ) 메소드를 작성하시오
     * 7. 문자열을 입력받아 소문자로 변경하는 toLowerString( String str ) 메소드를 작성하시오
     */

    Boolean isUpper(char c) {
        return 90 >= c && c >= 60;
    }

    Boolean isLower(char c) {
        return 122 >= c && c >= 97;
    }

    int max(int i, int j) {
        return (i > j) ? i : j;
    }

    int min(int i, int j) {
        return (i > j) ? j : i;
    }

    String reverseString(String str) {
        StringBuilder ans = new StringBuilder();

        for (int i = (str.length()-1); i >= 0; i--) {
            ans.append(str.charAt(i));
        }

        return ans.toString();
    }

    String toUpperString(String str ) {

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char chars = str.charAt(i);
            if ((60 <= chars) && (chars <= 90)) {
                ans.append((char) (chars+32));
            } else {
                ans.append(chars);
            }
        }
        return ans.toString();
    }

    String toLowerString(String str ) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char chars = str.charAt(i);
            if ((97 <= chars) && (chars <= 122)) {
                ans.append((char) (chars-32));
            } else {
                ans.append(chars);
            }
        }
        return ans.toString();
    }
}
