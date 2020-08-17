package homework07;

public class StringUtil {
	
	
	boolean isUpperChar( char c ) {
		return (   (c>=65) && (c<=90) ? true : false   );
	}
	
	boolean isLowerChar(char c) {
		return (   (c>=97) && (c<=122) ? true : false   );
	}
	
	
	int max(int i, int j) {
		return  (    (i>=j)? i :j     ) ;
	}
	
	int min(int i, int j) {
		return ((i>=j)? j :i);
	}
	
	String reverseString( String str ) {
		String str_rev="";
		int len=str.length();
		for(int i =len-1  ; i >=0 ; i--) {
			str_rev+=str.charAt(i);
		}
		return str_rev;
	}
	
	String toUpperString( String str ){
		String str_upp="";
		for(int i =0 ; i <= (str.length()-1) ; i++) {
			if ( (str.charAt(i)>=97) && (str.charAt(i)<=122) ) {
				str_upp += (char)(str.charAt(i)-32);
			}
			else {
				str_upp += (char)(str.charAt(i));
			}
		}
		return str_upp;
	}
	
	
	String toLowerString( String str ) {
		String str_low="";
		
		for(int i =0 ; i <= (str.length()-1) ; i++) {
			if ( (str.charAt(i)>=65) && (str.charAt(i)<=90) ) {
				str_low += (char)(str.charAt(i)+32);
			}
			else {
				str_low += (char)(str.charAt(i));
			}
		}
		return str_low;
	}
	

}
