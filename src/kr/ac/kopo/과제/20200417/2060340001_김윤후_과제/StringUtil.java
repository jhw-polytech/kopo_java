package Assignment05;

import java.util.Scanner;

public class StringUtil {

	int num;
	boolean bool;
	char alpha =' ';
	int [] number;
	int ch;
	String out="";
	String str1="";
	String str2="";
	String str;
	Scanner sc= new Scanner(System.in);
	
	char inputChar() {
		
		alpha = sc.next().charAt(0);
		
		return alpha;
	}
	void isUpperChar(char alpha) {
		num=alpha;
		if (97<=num && num<=122) {
			bool=false;
		}
		else {
			bool=true;
		}
		System.out.println(bool);
		
	}
	
	void isLowerChar(char alpha) {
		num=alpha;
		if (97<=num && num<=122) {
			bool=true;
		}
		else {
			bool=false;
		}
		System.out.println(bool);
		
	}
	
	int [] max() {
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		int number[] = {num1,num2};

		if(number[0]>number[1]) {
			num=number[0];
			System.out.println("큰값:  "+num);
		}
		else if(number[0]==number[1]) {
			System.out.println("값이 같음");
		}
		else {
			num=number[1];
			System.out.println("큰값:  "+num);
		}
		return number;
	}
	
	int [] min() {
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		int number[] = {num1,num2};
		
		if(number[0]<number[1]) {
			num=number[0];
			System.out.println("작은값: "+num);
		}
		else if(number[0]==number[1]) {
			System.out.println("값이 같음");
		}
		else {
			num=number[1];
			System.out.println("작은값: "+num);
		}
		return number;
		
	}
	
	void reverseString(String str) {
		for (int i = str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
		}
	}
	
	void toUpperString(String str1) {
	//97부터 소문자 대문자는 32 차이	

		for(int i=0; i<str1.length();i++) {
			ch =(int)str1.charAt(i);
			
			if(97<=ch && ch<=122) {
				out+=(char)(ch-32);
			}
			else {
				out+=(char)ch;
			}
			
		}
		System.out.println("대문자로 변환: "+out);
		out="";
	}
	
	void toLowerString(String str2) {
			

			for(int i=0; i<str2.length();i++) {
				ch =(int)str2.charAt(i);
				
				if(65<=ch && ch<=90) {
					out+=(char)(ch+32);
				}
				else {
					out+=(char)ch;
				}
				
			}
			System.out.println("대문자로 변환: "+out);
			out="";
		}

	
}
