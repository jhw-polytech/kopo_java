package kr.ac.kopo.homework.classMethod;

import java.util.Scanner;

public class IceCream_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("아이스크림을 몇개 구입할래? "); // 아이스크림 개수 입력받기 
		int n = Integer.parseInt(sc.nextLine());
		
		IceCream[] ic = new IceCream[n]; // IceCream 클래스의 객체 배열을 만들고, 배열 크기는 n개이다. 
		
		for(int i = 0; i < ic.length; i++) {
			ic[i] = new IceCream(); // n번만큼, 즉 ic.length만큼 반복하며 배열 내 인스턴스 값으로 IceCream의 name과 price를 저장한 주소값을 할당해준다. 
			System.out.printf("%s", "아이스크림명 : ");
			ic[i].name = sc.nextLine();
			System.out.printf("%s", "아이스크림 가격 : ");
			ic[i].price = sc.nextInt();
			sc.nextLine();
		}
		
		ic[0].printInfoEach(n, ic); // 메소드를 호출하면 ic 배열 전체가 피호출자 메소드에게 전해진다. 
		ic[0].printInfoAll(n, ic);
		
		/*
		 * To. 교수님
		 * 교수님 저도 쳐보다 알았는데 왜 ic.printInfoEach(n, ic) 처럼 배열 전체를 바로 넘길순 없는건가요?
		 * ic[0]으로 인덱스를 명시해줘야 작동하더라구요...! 
		 */
		 /*
		 	==> 답변
			 Icecream클래스를 이용하여 인스턴스 객체를 3개만들면 각각 prinInfoEach(), printInfoAll() 메소드가 생깁니다. ic는 그냥 참조변수배열일뿐이잖아요
			 그래서 주소값을 가지는 ic는 Icecream클래스에 정의된 메소드를 가지고 있을 수가 없죠
			 따라서 각 배열의 원소인 Icecream 객체를 접근하여 메소드를 호출하도록 해야합니다 
			 이해가시나요? 안가시면 수업시간에 다시 질문해주세요 ^^
		 */
		
	}

}
