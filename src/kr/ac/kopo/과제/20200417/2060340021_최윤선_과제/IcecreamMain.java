package homework07;

import java.util.*;


public class IcecreamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Icecream ice = new Icecream();
		
		System.out.println("아이스크림을 몇개 구입할래? ");
		int cnt = sc.nextInt();
		sc.nextLine();
		
		Icecream[] icecreamarr = new Icecream[cnt];
		icecreamarr = ice.icecream_input(cnt);
		
		ice.icecream_print(icecreamarr,cnt);
		
	}

}