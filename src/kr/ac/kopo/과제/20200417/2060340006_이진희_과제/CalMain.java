package task;

import java.util.Scanner;

public class CalMain {
	
	public static void main(String[] args) {
		   Calculator c =new Calculator();//객체생성
	       Scanner scan = new Scanner(System.in);
		    
	       System.out.println("정수 1입력: ");
			int num1= scan.nextInt();
			
			System.out.println("정수 2입력: ");
			int num2= scan.nextInt();
			
			System.out.println("정수:"+num1);
			System.out.println("정수:"+num2);
			System.out.println();
			
			System.out.println(num1+" + "+num2+" = "+c.add(num1,num2));//add메소드 호출
			System.out.println(num1+" - "+num2+" = "+c.sub(num1,num2));//suc메소드 호출
			System.out.println(num1+" * "+num2+" = "+c.mul(num1,num2));//mul메소드 호출
			System.out.println(num1+" / "+num2+" = "+c.div(num1,num2));//div메소드 호출
			System.out.println();
			
			System.out.println(num1 +"  "+ "소수체크:"+"  "+c.primeNum(num1));//소수체크
			System.out.println(num2 +"  "+ "소수체크:"+ "  "+c.primeNum(num2));//소수체크
		}
	} 

