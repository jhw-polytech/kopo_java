package jaeheehomework;

import java.util.Scanner;

public class IceManage { //아이스크림을 관리하는 클래스를 만들어줍니다
	
	
	//계속 축적이 되야하는 변수들이므로 static을 써줍니다
	private static int totalCustom;   
	private static int totalIce;
	private static int totalPrice;
	
	//개인이 구매한 아이스크림의 정보를 담을 배열을 선언합니다
	private Ice[] iceArr;
	Scanner sc;
	
	//입력 받는 메소드를 호출할때마다 스캐너 인스턴스객체를 만듭니다
	IceManage(){
		sc = new Scanner(System.in);
	}
	
	
	// 메세지를 띄우고 입력값을 받는 절차를 메소드로 만들어, 깔끔하게 코드를 만듭니다
	int getInt(String msg) {
		System.out.println(msg);
		int num = Integer.parseInt(sc.nextLine());
		return num;
	}
	String getStr(String msg) {
		System.out.println(msg);
		String str = sc.nextLine();
		return str;
	}
	
	
	public void manage() {
		
		//계속구매할래?(Y/N) => N 일때까지 while문을 시행합니다
		while(true) {
			
			int cnt = this.getInt("아이스크림 몇개 구입할래? : ");
			iceArr = new Ice[cnt];   //개인마다 구매한 아이스크림 정보(name, price)를 new를 통해 각각 저장합니다
			
			for (int i = 0; i < cnt; i++) {
				System.out.println((i + 1) + "번");
				String name = this.getStr("아이스크림명 : ");
				int price = this.getInt("아이스크림가격 : ");
				
				iceArr[i] = new Ice(name, price);

				// 아이스크림 하나를 살때마다, totalIce와 totalPrice를 업데이트 해줍니다
				IceManage.totalIce++;
				IceManage.totalPrice += price;
			}
			IceManage.totalCustom++; // totalCustom도 업데이트 해줍니다
			
			print();
			
			String yesno = this.getStr("계속구매할래?(Y/N) => ");
			if(yesno.equals("N")) {
				this.printAll();
				break;
			}
		}
	}
	
	
	public void print() {
		System.out.println("***" + IceManage.totalCustom + " 번째 고객의 " + iceArr.length + "개 정보 출력 ***");
		System.out.println("번호\t 아이스크림명\t 아이스크림가격\t");
		
		for(int i = 0; i < iceArr.length; i++) {
			Ice ice = iceArr[i]; 
			//이부분이 왜 필요한지 이해가 안됩니다... iceArr[i] = new Ice(name, price)을 for문에서 해줬기때문에
			//ice.getName() 대신 iceArr[i].name 으로 하면 될거라고 생각했는데 안되는 이유가 뭔지 모르겠습니다 ㅠㅠ
			System.out.printf("%d\t %-10s\t %-10d\t \n", (i+1), ice.getName(), ice.getPrice());
		}
	}
	
	
	void printAll() {
		System.out.printf("총 %d명의 고객이 아이스크림을 구매했습니다\n"
				+ "판매된 아이스크림 총 개수 : %d개, "
				+ "총 판매액 : %d"
				, IceManage.totalCustom,IceManage.totalIce, IceManage.totalPrice);
	}
	
}
