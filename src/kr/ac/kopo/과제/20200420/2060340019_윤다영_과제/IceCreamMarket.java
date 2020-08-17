package kr.ac.kopo.assignment.day07;

import java.util.Scanner;

public class IceCreamMarket {
	
	static int totalCustomer;
	static int totalIceCream;
	static int totalPrice;
	Scanner sc = new Scanner(System.in);
		
	public void open(){
		
		IceCream[] iceArr = inputIceCream();
		outputIceCream(iceArr);
		inputAgain();
		total();
		
	}
		
		
	//아이스크림 몇 개 살지 입력 받고, 아이스크림 이름과 가격을 입력 받는 메소드
	public IceCream[] inputIceCream() {
		
		System.out.print("아이스크림 몇 개 구입할래? ");
		int num = sc.nextInt();
		sc.nextLine();

		totalCustomer++;
		totalIceCream += num;
		
		IceCream[] iceArr = new IceCream[num];
						
		for(int i = 0; i < iceArr.length; i++) {
			iceArr[i] = new IceCream();
			
			System.out.println((i+1) + "번");
			
			System.out.print("아이스크림 명 : ");
			String name = sc.nextLine();
			iceArr[i].inputName(name);
			
			System.out.print("아이스크림 가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			iceArr[i].inputPrice(price);
			totalPrice += price;
		}
		
		return iceArr;
	}
	
	
	//입력받은 아이스크림의 구매정보를 출력하는 메소드
	public void outputIceCream(IceCream[] iceArr) {

		System.out.printf("< 총 %d개의 아이스크림 구매 정보 출력 >\n", iceArr.length);
		System.out.println("번호\t아이스크림명\t아이스크림가격");
		
		for(int i = 0; i < iceArr.length; i++) {
			System.out.printf("%d\t%s\t\t%7d\n", i+1, iceArr[i].outputName(), iceArr[i].outputPrice()); //가운데 정렬을 위해 %7s
		}
	}
	
	//또 살지 물어보는 메소드
	public void inputAgain() {		
		
		while(true) {
			System.out.print("계속 구매할래?(Y/N을 입력하시오) : ");
			char c = sc.nextLine().charAt(0);
			if(c == 'Y') {
				IceCream[] iceArr = inputIceCream();
				outputIceCream(iceArr);					
			}else if (c == 'N') {
				break;
			}else System.out.println("Y/N을 입력하시오");
		}		
		
	}
	
	//총 판매된 아이스크림 개수와 가격을 출력하는 메소드
	public void total() {
		System.out.println("총 " + totalCustomer + "명의 고객이 아이스크림을 구매했습니다.");
		System.out.println("판매된 아이스크림의 총 개수 : " + totalIceCream);
		System.out.println("총 판매액 : " + totalPrice);
		
	}

}
