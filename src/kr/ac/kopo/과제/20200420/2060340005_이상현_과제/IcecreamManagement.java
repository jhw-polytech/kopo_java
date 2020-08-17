package shlee1993.day07.homework;

import java.util.Scanner;

public class IcecreamManagement {
	Scanner sc = new Scanner(System.in);
	private String iceName;	//이름저장 임시공간
	private int icePrice;	//가격저장 임시공간
	
	int serialNum = 1;	//아이스크림의 시리얼 넘버를 저장할 변수	
	Icecream[] iceArr = new Icecream[100];	//최대 100개의 아이스크림을 저장할 수 있도록 작성	
	
	IcecreamManagement(){
		iceArr[0] = new Icecream();	//인덱스 1부터 출력하기 위해 인덱스 0에 임의의 객체 생성
	}
	
	public void setIce() {	//정보 저장을 위한 메소드		
		System.out.printf("*** %d번째 아이스크림 구매정보 ***\n", serialNum);
		System.out.println("아이스크림명 : ");
		iceName = sc.nextLine();

		System.out.println("아이스크림가격 : ");
		icePrice = Integer.parseInt(sc.nextLine());	
		
		iceArr[serialNum] = new Icecream();	//인스턴트 객체 생성
		iceArr[serialNum].setInfo(serialNum++, iceName, icePrice);	//iceName, icePrice에 입력받은 값을 바로 대입해도 되지만, 보안성을 위해 메소드를 이용해 접근
	}
	
	public void getAllInfo() {	//모든 데이터 출력을 위한 메소드
		System.out.printf("< 총 %d개의 아이스크림 구매정보 출력 >\n", serialNum - 1);
		for (int i = 1; i < serialNum; i++)
			iceArr[i].getInfo();
	}
}
