package Assignment04;

import java.util.Scanner;

import kr.ac.kopo.day05.HandPhone;

/*
	윤후씨 이런 경우에는 P01 클래스에 main 메소드와 아이스크림의 변수 name, price를 설정하기 보다는 아이스크림 클래스를 하나 설계해서 코드를 작성하는 것이 더 좋을 거 같습니다 
	수고하셨습니다
*/

public class P01 {

	String name;
	String price;
	
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		
		int cnt=0;
		int buy;
		
		
		System.out.println("아이스크림 몇개 구입할래?");
		buy=sc.nextInt();
		sc.nextLine();
		P01 [] ice= new P01[buy]  ; //P01 클래스에있는 변수를 배열로 buy변수만큼 배열로 선언 
		
		//HandPhone hp = new HandPhone();
//		for(int i=0; i<ice.length;i++) {
//			ice[i]=i;
//		}
//		
		
		
		for(int i=0 ;i<buy; i++ ) {
			ice[i]=new P01();	//객체 인스턴스 선언
			System.out.println(i+1+"번째 아이스크림 구매 정보");
			System.out.print("아이스크림명 : ");
			//ice[i]=new iceCream();
			ice[i].name=sc.nextLine();
			System.out.println("아이스크림 가격 : ");
			ice[i].price=sc.nextLine();
			
		}
		//입력받음
		
		System.out.println("번호\t아이스크림명\t아이스크림가격");
		for(int i=0; i<ice.length; i++) {

			
			System.out.println((i+1)+"\t" + ice[i].name+"\t\t"+ice[i].price);
			
		}// i만큼 돌아가며 변수값 출력
	}
}
