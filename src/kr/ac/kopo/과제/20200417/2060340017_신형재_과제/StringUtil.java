package homework0417;


public class StringUtil {
        
        boolean isUpperChar(char c){
            return(((int) c >= 65) && ((int)c <=90)) ? true : false;
        }
        boolean isLowerChar(char c) {
        	return(((int) c >=97) && ((int)c <=122)) ? true : false;
        }
        int max(int num3_1, int num3_2) {
        	return(num3_1 > num3_2) ? num3_1 : num3_2;
        	}
        int min(int num4_1, int num4_2) {
        	return(num4_1 < num4_2) ? num4_1 : num4_2;
        	}
        String reverseString(String str5) {
        	String reverse = "";
        	int length = str5.length();
        	for(int i = length-1; i>=0; i--) {
        		reverse = reverse + str5.charAt(i);
        	}return reverse;
        }
        String toUpperString(String str6) {
        	String upp = "";
        	int length = str6.length();
        	for(int i = 0; i<= (length-1); i++) {
        		upp = upp + (char)(str6.charAt(i) - 32);
        	}return upp;
        }
        String toLowerString(String str7) {
        	String low = "";
        	int length = str7.length();
        	for(int i = 0; i<= (length-1); i++) {
        		low = low + (char)(str7.charAt(i) + 32);
        	}return low;
        }
}
