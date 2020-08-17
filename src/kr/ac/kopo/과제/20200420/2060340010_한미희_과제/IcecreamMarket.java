package kr.ac.kopo.day7.assignment;

import java.util.Scanner;

public class IcecreamMarket {
	
	//멤버 변수 선언
	Icecream[] iceArr;
	Scanner sc;
	int totalCustomer = 0;		//총 고객 수
	int totalCnt = 0;			//총 아이스크림 판매 개수
	int totalPrice = 0;			//총 판매액
	
	
	//생성자
	IcecreamMarket() {
		sc = new Scanner(System.in);
	}
	
	
	//아이스크림 구입 개수, 가격을 입력받기 위한 메소드
	public int getInt(String msg) {
		System.out.print(msg);
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}
	
	//아이스크림명을 입력받기 위한 메소드
	String getStr(String msg) {
		System.out.print(msg);
		String str = sc.nextLine();
		return str;
	}
	
	//계속 구매할 것인지에 대한 여부를 입력받기 위한 메소드
	boolean getBool(String msg) {
		System.out.print(msg);
		String yesOrNo = sc.nextLine();
		//계속 구매한다고 "Y" 혹은 "y"를 입력하면 true를, 아니면 false를 반환
		if (yesOrNo.equals("Y") == true || yesOrNo.equals("y") == true) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public void open() {
		//아이스크림 구입개수 입력받기
		int cnt = getInt("아이스크림 몇개 구입할래? : ");
		iceArr = new Icecream[cnt];		//아이스크림 배열 객체 생성
		
		//구매할 아이스크림의 정보 입력받아서 저장하기
		for(int i = 0; i < iceArr.length; i++) {
			System.out.println((i+1) + "번");
			iceArr[i] = new Icecream();		//아이스크림 객체 생성
			String name = getStr("아이스크림명 : ");
			int price = getInt("아이스크림가격 : "); 
			iceArr[i] = new Icecream(name, price);
			//한개의 아이스크림 정보 입력이 끝나면 아이스크림 개수와 가격 누적
			totalCnt++;
			totalPrice += price;	
		}
		//한 명의 고객으로부터 모든 아이스크림 정보를 입력을 받으면 고객 수 누적
		totalCustomer++;
		
		//각 고객의 아이스크림 구매 정보 출력
		print();
		
		//구매 여부 묻기
		boolean purchase = getBool("계속 구매할래?(Y/N) => ");
		//구매O => 앞의 과정 반복
		if (purchase == true) {
			System.out.println();
			open();
		//구매O => 총 고객 수, 아이스크림 개수, 판매액 출력
		}else {
			printTotal();
		}
			
	}
		
	
	//개별 고객의 구매 정보 출력
	void print() {
		System.out.println("< 총 " + iceArr.length + "개의 아이스크림 구매정보 출력 >");
		System.out.printf("%-5s%-10s%10s\n", "번호", "아이스크림명", "아이스크림가격");
		for(int i = 0; i < iceArr.length; i++) {
			Icecream ice = iceArr[i];
			System.out.printf("%-5d%-10s%10d\n", i+1, ice.getName(), ice.getPrice());
		}
		
	}
	
	
	//총 판매 정보 출력
	void printTotal() {
		System.out.println('\n' + "총 " + totalCustomer + "명의 고객이 아이스크림을 구매했습니다");
		System.out.println("판매된 아이스크림 총개수 : " + totalCnt + "개");
		System.out.println("총 판매액 : " + totalPrice + "원");
	}
		
	
	
	
	
	
	
}
