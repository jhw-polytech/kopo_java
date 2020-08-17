package kr.ac.kopo.Assignment1;

import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
	    System.out.println("문자를 입력하시오");
		String input=sc.nextLine();
	        
	    char[] Alpha;
	    Alpha= input.toCharArray();
	        
        for(int i=0; i<Alpha.length; ++i){
            if(65<=Alpha[i] && Alpha[i]<=90){
                Alpha[i]=(char)(Alpha[i]+32);
                continue;
                }
            if (97<=Alpha[i] && Alpha[i]<=122){
                Alpha[i]=(char)(Alpha[i]-32);
                continue;
            }
        }
       
    System.out.print(Alpha);
    }
}

//아스키 문자가 A-Z가 (65-90), a-z가 (97-122)임을 확인하고 65~90사이라면 +32를 하여 소문자로 반대라면 -32를 하여 대문자로 변환하였습니다.