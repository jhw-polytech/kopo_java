package homework0417;

import java.util.Scanner;

public class Ice {
	Scanner sc = new Scanner(System.in);
	
	String name;
	int price;
	
	Ice(){
	}
	Ice(int num, String name, int price){
		
	}

	/*
		형재씨 execute() 메소드가 맘에 참 들었겠어요
		뭔가 분리할 수 있을거 같으면서 애매했죠???^^
		고민을 좀 해보자구요
	*/
	void execute(int num) {
		Ice[] arr = new Ice[num];
		
		for(int i = 1; i<=num; i++) {
			Ice ic = new Ice();
			System.out.printf("*** %d번째 아이스크림 구매 정보 ***\n", i);
			System.out.print("아이스크림 명 : ");
			ic.name = sc.nextLine();
			
			System.out.print("아이스크림 가격 : ");
			ic.price = sc.nextInt();
			sc.nextLine();
			
			arr[i-1] = ic;
		}
		System.out.printf("< 총 %d개의 아이스크림 구매정보 출력 >\n", num);
		System.out.print("번호\t아이스크림명\t아이스크림 가격 \n");
		
		for(int j = 1; j<=num; j++) {
			System.out.println(j-1+"\t"+arr[j-1].name+"\t\t"+arr[j-1].price);
		}
	}
	

}
