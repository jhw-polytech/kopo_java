package test0419;

import java.util.Scanner;

public class Icecream2 {
	
	int    num;
	String name;
	int    price;
    int yn;
    static int totalPrice;
    static int totalNum;
	Icecream2[] iceArr;
	
	Scanner sc = new Scanner(System.in);
	Icecream2(){}
	
	Icecream2(String name, int price){
		this.name = name;
		this.price = price;
		Icecream2.totalNum++;
	}
	
	Icecream2(int totalPrice){
		
		Icecream2.totalPrice += totalPrice;
	}
		
		
	
	int getNum() {
		
		System.out.print("아이스크림 몇개 구입할래? ");
		num = sc.nextInt();
		sc.nextLine();
		return num;
		
	}
	
	
	String getName() {
		
		name = sc.nextLine();
		return name;
	}
	
	int getPrice() {
		
		
		price = sc.nextInt();
		sc.nextLine();
		return price;
		
		
	}
	
	void icecreamInfo() {
		
		iceArr = new Icecream2[num];
		
		
		for(int i = 0;i<num;i++) {
			
			System.out.println((i+1) + "번");
			System.out.print("아이스크림명 : ");
			String name = getName();
			System.out.print("아이스크림가격 : ");
			int price = getPrice();
			
			iceArr[i] = new Icecream2(name, price);
			
		}
		
		int totalPrice = 0;
		Icecream2 icePrice = new Icecream2();
		for(int i = 0;i<num;i++) {
			
			totalPrice +=iceArr[i].price;
			icePrice = new Icecream2(totalPrice);
		}
		
		print();
		System.out.println("추가구매할래?(Y=1/N=2) : ");
		
		int yn = 0;
		yn = buy();
	    
		if(yn == 1) {
			
			again();
		}else {
			
			end();
		}
		
		
	}
	
	
	
	void print() {
		
		System.out.println("<총" + num + "개의 아이스크림 구매정보 출력>");
		
		System.out.println("번호\t아이스크림명\t아이스크림가격");
		
		for(int i = 0;i<num;i++) {
			System.out.printf("%d\t%s\t%d\n", (i+1), iceArr[i].name, iceArr[i].price);
			
		}
		
		
	}
	
	int buy() {
		
		int yn = sc.nextInt();
		sc.nextLine();
		return yn;
	}
	
	
	/*
	 * 메소드끼리 계속 순환시키기 위해서  again() 밑에 againmiddle()란 중간 메소드를 넣었습니다.
	 * (질문) : 처음에 again()에다가 바로 icecreamInfo를 쓰려했지만 안됐습니다. 중간메소드를 넣는 것 말고
	 * 더 나은 방식이 있는지 궁금합니다! 
	 */
	void again() {

	/*
		// 이렇게 넣어놓으면 결과 잘나올텐데요...
		// icecreamInfo()만 작성하시면 출력만 나오는거니 안나올거 같구요.....
		// again() 메소드를 사용하지 않고 반복문을 활용하는 것이 더 좋을 수도 있어요...^^
		
		getNum();
		icecreamInfo();
	*/
		againmiddle();
		
	}
		
	
	void againmiddle() {
		
		getNum();
		icecreamInfo();
	}
	
	void end() {
		System.out.println("총구매정보");
		System.out.println("총 구매개수 : " + Icecream2.totalNum);
		System.out.println("총 구매가격 : " + Icecream2.totalPrice);
	}
		
	
		
	
	

}
