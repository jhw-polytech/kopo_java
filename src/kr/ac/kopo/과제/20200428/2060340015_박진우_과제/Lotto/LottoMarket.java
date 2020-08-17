package kr.ac.jinwoo.day12.LottoHomework;

import java.util.Random;
import java.util.Scanner;

public class LottoMarket {

	Scanner sc = new Scanner(System.in);
	
	private static Random r = new Random();
	
	private int totalMoney = 0;
	
	// 1 ~ 45 사이의 난수를 생성하는 메소드
	private int makeAlgo() {
		
		int num = r.nextInt(3) + 1;	
		return num;
	}
	
	void open() {
		
		while(true) {
			System.out.print("로또를 몇 개 구입하시겠습니까 : ");
			int lotCnt = Integer.parseInt(sc.nextLine());
			
			totalMoney += 1000 * lotCnt;
			
			System.out.println("\n" + (1000 * lotCnt) + "원을 지불하셨습니다. (총 지불 금액 : " + totalMoney + "원 )\n");
			
			System.out.println("금주의 로또 번호");
			
			// 금주의 로또당첨 번호 추출
			int weekLot[] = LottoAlgo.weeklyLotto();
			System.out.println(" [ " + weekLot[0] + ", " + weekLot[1] + ", " + weekLot[2] + ", " + weekLot[3] + ", " + weekLot[4] + ", " + weekLot[5] + " ] " + "[ " + weekLot[6] + " ]");
			
			System.out.println();
			
			// 유저의 로또 번호 추출
			for(int i = 0; i < lotCnt; i++) {
				
				// 무슨 알고리즘으로 할지 난수로 설정
				int algo = makeAlgo();
				int lot[] = null;
				
				switch(algo) {
				
				case 1 :
					lot = LottoAlgo.Algo1();
					break;
					
				case 2 :
					lot = LottoAlgo.Algo2();
					break;
					
				case 3 :
					lot = LottoAlgo.Algo3();
					break;
					
				case 4 :
					lot = LottoAlgo.Algo4();
					break;
					
				default:
					break;
				}
				
				// 등수 확인
				int prize = LottoAlgo.chkPrize(weekLot, lot);
				
				String str;
				
				if(prize == 1) str = "1등!"; 
				else if(prize == 2) str = "2등";
				else if(prize == 3) str = "3등";
				else if(prize == 4) str = "4등";
				else if(prize == 5) str = "5등";
				else str = "꽝.";
				
				System.out.printf("로또 %d [ %2d, %2d, %2d, %2d, %2d, %2d ] %2s\n",(i+1), lot[0], lot[1], lot[2], lot[3], lot[4],lot[5], str);
				
			}
			System.out.println();
		}
		
	}
}
