package test0418;

import java.util.Scanner;

import java.util.Arrays;



public class Icecream {
	
	String name;
	int price;
	
	Icecream(){
		
	}
	
	/*
		생성자 만들어 놓고 왜 내용부를 비워두었어요??? ^^
	*/
	Icecream(int num, String name, int price){
		
		
	}
	
	
	/*
		icecreamInfo() 메소드에서 입력에 출력까지?????????
	*/
	void icecreamInfo(int num) {
		
		Scanner sc = new Scanner(System.in);
        Icecream[] iceArr = new Icecream[num]; 
		
		for(int i = 0;i<num;i++) {
			
			Icecream ice = new Icecream(); // bk 초기화 
			System.out.println("***" + (i+1) + "번째 아이스크림 구매정보***");
			System.out.print("아이스크림 명 :");
			ice.name = sc.next();
			
			System.out.print("아이스크림 가격 :");
			ice.price = sc.nextInt();
			
			iceArr[i] = ice; 
		}
		
		System.out.println("<총 " + num + "개의 아이스크림 구매정보 출력>");
		System.out.println("번호   " + "아이스크림명   " + "아이스크림가격");
		for(int i = 0;i<num;i++) {
			
			System.out.println((i+1) +"   " + iceArr[i].name + "         " + iceArr[i].price  );
		}
		
		
	}
	
		
	
	
	
	
	
	
	
	
}
	
		
		
		
	
		
		
		
	

