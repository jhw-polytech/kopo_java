package task;

import java.util.Scanner;

public class StringUtil {
//1. 하나의 문자를 입력받아 해당 문자가 대문자이면 true 를 반환하는 isUpperChar( char c ) 메소 드를 작성하시오
        boolean isUpperChar(char c) {
		if((int)c <= 90 && (int)c >=65) {//글자를 숫자로 변환해서 대소문자 구분(아스키코드활용)
			return true;
		}
		
		return false;
	}	
//2. 하나의 문자를 입력받아 해당 문자가 소문자이면 true를 반환하는 isLowerChar(char c) 메 소드 를 작성하시오     
        boolean isLowerChar(char b) {
    		if((int)b <= 122 && (int)b >=97) {//아스키코드를 활용해서 소문자 확인
    			return true;
    		}
    		
    		return false;    
        }
//3.두개의 숫자를 입력받아 큰수를 반환하는 max( int i, int j) 메소드를 작성하시오

         int max(int i , int j) {//
    		if(i > j) {//i가 크면 j반환
    			return i;
    		}else if (i < j){//i가 작으면 j반환
    			return j;
    		}
    		return 0;
    	}

//4.두개의 숫자를 입력받아 작은수를 반환하는 min(int i, int j) 메소드를 작성하시오
        
         int min(int x, int y) {
     		if(x < y) { //x가 작으면 y반환
     			return x;
     		}else if(x > y) { //x가 크면 y반환
     			return y;
     		}
     		return 0;
     	}
         
 //5.문자열을 입력받아 거꾸로 변경하는 reverseString( String str ) 메소드를 작성하시오
         
         String reverseString(String str) {
     		String data = "";
     		
     		int last = str.length() - 1; //마지막 index를 기억 
     		for(int i =0; i < str.length(); i++) {
     			data += str.charAt(last);//뒤에서부터 한글자씩 data의 추가 
     			last -= 1; //index감소
     		}
     		
     		return data;
     	}

//6.문자열을 입력받아 대문자로 변경하는 toUpperString( String str ) 메소드를 작성하시오
         
         String toUpperString(String str) {
     		String data = "";
     		for(int i = 0; i < str.length(); i++ ) {
     			char temp = str.charAt(i);//한글자씩 검사
     			if((int)temp > 90) {//글자가 대문자Z(90)보다 크면 소문자이기 때문에 32를 빼서 대문자로 바꾼다.
     				temp -= 32;
     			}
     			data += temp;//글자를 더해준다
     			
     		}
     		
     		return data;
     	} 
//7.문자열을 입력받아 소문자로 변경하는 toLowerString( String str ) 메소드를 작성하시오
         
         String toLowerString(String str) {
     		String data = "";
     		for(int i = 0; i < str.length(); i++ ) {
     			char temp = str.charAt(i);//한글자씩 검사
     			if((int)temp < 97) {//글자가 소문자 a(97)보다 작으면 대문자 이기 때문에 32를더해서 소문자로 변경
     				temp += 32;
     			}
     			data += temp;//글자를 추가한다.
     			
     		}	
     		return data;
     	}	  
         
}