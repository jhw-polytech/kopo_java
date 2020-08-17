package shlee1993.day06.homework;

import java.util.Scanner;

/*
	따로 관리클래스를 만든것은 잘 생각하신 거 같습니다~~~
	조금만 더 생각해보면 좀 더 효율적인 코드를 작성할 수 있을거 같습니다
	고생하셨습니다
*/

public class IcecreamManagement {
	Scanner sc = new Scanner(System.in);
	String iceName;	//이름저장 임시공간
	int icePrice;	//가격저장 임시공간
	
	int serialNum = 0;	//아이스크림의 시리얼 넘버를 저장할 변수	
	Icecream[] iceArr = new Icecream[100];	//최대 100개의 아이스크림을 저장할 수 있도록 작성
	
	void setIce() {	//정보 저장을 위한 메소드		
		System.out.printf("*** %d번째 아이스크림 구매정보 ***\n", serialNum + 1);
		System.out.println("아이스크림명 : ");
		iceName = sc.nextLine();

		System.out.println("아이스크림가격 : ");
		icePrice = Integer.parseInt(sc.nextLine());	
		
		iceArr[serialNum] = new Icecream();	//인스턴트 객체 생성
		iceArr[serialNum].setInfo(serialNum++, iceName, icePrice);	//iceName, icePrice에 입력받은 값을 바로 대입해도 되지만, 보안성을 위해 메소드를 이용해 접근
	}
	
	void getAllInfo() {	//모든 데이터 출력을 위한 메소드
		System.out.printf("< 총 %d개의 아이스크림 구매정보 출력 >\n", serialNum);
		for (int i = 0; i < serialNum; i++)
			iceArr[i].getInfo();
	}
	
}
