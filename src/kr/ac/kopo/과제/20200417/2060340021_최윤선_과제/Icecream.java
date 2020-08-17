package homework07;
import java.util.*;
public class Icecream {
	String name;
	int price;
	
	Scanner sc = new Scanner(System.in);
	
	
	
	
	/*
		윤선씨... main() 메소드에서도 Icecream배열을 생성하던데.....
		여기서도 생성하네요???
		중복되게 생성하면 메모리가 비효율적일거 같아요.....
		조금만 수정해봅시다
	*/

	Icecream[] icecream_input(int cnt) {
		Icecream[] icecreamarr = new Icecream[cnt];
		for (int i=0 ; i<cnt ; i++) {
			icecreamarr[i] = new Icecream();
			System.out.printf("**** %d번째 아이스크림 정보 ****\n",i+1);
			System.out.print("아이스크림 이름 : ");
			icecreamarr[i].name = sc.next();
			System.out.print("아이스크림 가격 : ");
			icecreamarr[i].price = sc.nextInt();
			sc.nextLine();
		}
		return icecreamarr;
	}
	
	void icecream_print(Icecream[] icecreamarr,int cnt) {
		System.out.printf("< 총 %d개의 아이스크림 구매정보 출력 >\n",cnt);
		System.out.println(" 번호   아이스크림명\t 아이스크림가격\t");
		for (int i=0 ; i<cnt ; i++) {
			System.out.printf(" %d   %s\t %d\t\n",i+1,icecreamarr[i].name , icecreamarr[i].price);
		}
	}
	
}	


