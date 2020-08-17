package prac_homework05;
import java.util.*;


public class IcecreamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("아이스크림을 몇개 구입할래? ");
		int cnt = sc.nextInt();
		sc.nextLine();
		
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
		
		
		System.out.printf("< 총 %d개의 아이스크림 구매정보 출력 >\n",cnt);
		System.out.println(" 번호   아이스크림명\t 아이스크림가격\t");
		for (int i=0 ; i<cnt ; i++) {
			System.out.printf(" %d   %s\t %d\t\n",i+1,icecreamarr[i].name , icecreamarr[i].price);
		}
		
		
		
	}

}
