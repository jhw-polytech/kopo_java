package Assignment05;

import java.util.Scanner;

public class IceCream {
/*
 * 1.입력 받은 변수들의 배열로 만드는 메소드
 * 2.출력메소드
 * 
 */
	Scanner sc=new Scanner(System.in);
	String name;
	int price;

	IceCream(){
		name="";
		price=0;
	}
	
	void input(int num) {
		IceCream[] ice = new IceCream[num];
		for(int i=0; i<num; i++) {
			ice[i]= new IceCream();
			System.out.println((i+1)+"번째 아이스크림 구매정보");
			System.out.print("아이스크림명 :");
			ice[i].name=sc.nextLine();

			System.out.print("아이스크림 가격 :");
			ice[i].price=sc.nextInt();
			sc.nextLine();
		}
		
		print(ice);
	}
	
	/*
		 print메소드 인자에 IceCream[] 넣으면서 조금 의문이 생기지 않았어요?? ^^
		 좀더 생각해보면 조금 더 좋은 코드들이 나올수 있을거 같아요... 수고하셨습니다
	*/

	void print(IceCream [] ice) {
		System.out.println("번호\t아이스크림명\t아이스크림가격");
		
		for(int i=0; i<ice.length; i++) {
			
			System.out.println((i+1)+"\t" + ice[i].name+"\t\t"+ice[i].price);
		}
		
		
	}
}
