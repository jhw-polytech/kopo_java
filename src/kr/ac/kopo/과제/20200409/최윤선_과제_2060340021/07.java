package prac;

import java.util.Scanner;

public class prac_homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int i ; //for문을 위한 변수
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요 : ");
		String input = sc.nextLine();
		
		for(i=0;i< input.length();i++) {
			char c = input.charAt(i);
			num= (int)c;
			if (num>=65 && num<=90) { //대문자범위
				System.out.printf("%c",num+32); //아스키에서 32만큼 차이남
			}
			else if (num>=97 && num<=122){ //소문자범위
				System.out.printf("%c",num-32);
			}
			
		}
		
		
	}
}