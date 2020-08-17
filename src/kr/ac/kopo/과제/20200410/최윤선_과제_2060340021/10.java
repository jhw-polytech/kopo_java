package prac;

import java.util.Scanner;

public class prac_homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//교수님!! 저는 반목문4개, 조건문2개로 구성했는데요,
		//교수님께서 제시하신 조건으로 풀지는 못했어요ㅠㅠㅠ 아이디어가 생각이 나질않네요ㅠ
		//조금더풀어보겠습니닷!
		
		for (int i=0;i<4;i++) {   //4번째줄까지 출력
			for(int j=0;j<5;j++) {
				if(i>j) {
					System.out.print("-");
				}
				else {
					System.out.print("*");
					
				}
			}
			System.out.print("\n");  
		}
		for (int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
					if(j<-i+4) System.out.print("-");
					else {
						System.out.print("*");
					}

			}
			System.out.print("\n");
		}
		
	}
}