package test0430;

import java.util.Scanner;

public class LottoController {
	
	private Scanner sc;
	
	public LottoController() {
		sc = new Scanner(System.in);
	}
	
	public int getNumber(String msg) {
		System.out.println(msg);
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}
	
	public void execute() {
		
		loop : while(true) {
			
			System.out.print("게임 타입을 입력하세요: (1.TypeA 2.TypeB 3.TypeC 4.TypeD 5.종료) ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			
			case 1 :
				
				LottoTypeA lta = new LottoTypeA();
				int input_a = getNumber("게임 수를 입력하세요");
				lta.LottoGetNumberA(input_a);
			    break;
			
			case 2 :
				LottoTypeB ltb = new LottoTypeB();
				int input_b = getNumber("게임 수를 입력하세요");
				ltb.LottoGetNumberB(input_b);
				break;
			
			case 3 :
				LottoTypeC ltc = new LottoTypeC();
				int input_c = getNumber("게임 수를 입력하세요");
				ltc.LottoGetNumberC(input_c);
			    break;
			
			case 4 :
				LottoTypeD ltd = new LottoTypeD();
				int input_d = getNumber("게임 수를 입력하세요");
				ltd.LottoGetNumberD(input_d);
			    break;
			
			case 5 :
			   System.out.println("게임을 종료합니다");
			   break loop;
			}
			
				
			
		}
		
		
	}
	
	
}
			
			
			
			
	
	

