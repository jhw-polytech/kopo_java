import java.util.Scanner;

/*
	진희씨 저 클래스 이름보고 깜짝 놀랐자나요~~ ㅋㅋㅋㅋㅋ
	근데 Icecream 클래스에 있어야할 name, price가 우째서 여기에 있을까요.... 궁금궁금....
*/

public class Icecream01Main {
	
	Scanner scan = new Scanner(System.in); //자리 생성
	String[] name;
	int[] price;
	int size;
	
	void buy() {
		System.out.println("아이스크림 몇개 구입할래? "); //아이스크림 개수 입력
		 size = scan.nextInt(); 
		 
		name =new String [size]; //size만큼의 name배열 생성
		price = new int[size];   //size만큼의 price배열 생성
		
		for(int i =0; i < size; i++) {
			System.out.println( "***" + (i+1) + "번째 아이스크림 구매정보 ***");
			 System.out.println(); 
			System.out.print("아이스크림명 : ");
			name[i] = scan.next();
			System.out.print("아이스크림가격 : ");
			price[i] = scan.nextInt();
			System.out.println(); 
		}
	}
	void print() {
		System.out.printf("< 총 %d개의 아이스크림 구매정보 출력 >", size); 
		 System.out.println();  //엔터
		System.out.println("번호\t" + "아이스크림명\t" + "아이스크림가격\t");
		for(int i =0; i < size; i++) {
			System.out.println((i + 1) + "\t" + name[i] + "\t" +"" +"\t" + price[i] +"\t");
		}
	}
}