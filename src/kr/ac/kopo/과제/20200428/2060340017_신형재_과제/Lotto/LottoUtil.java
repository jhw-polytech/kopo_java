package homework0428;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

//의도하신 부분이 랜덤 값을 도출하는 서로 다른 알고리즘 4개를 만드는 걸로 생각이 되는데,
//알고리즘은 동일하고 저장하는 방식, 랜덤 데이터 출력 패키지 변경 등의 방법으로 작성했습니다...

public class LottoUtil {
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	
	int coin;
	
	
	public void execute() {
		coin = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		int[] lottoArr = new int[coin*7];
		
		System.out.println("번호\t 1번\t2번\t3번\t4번\t5번"
								+ "\t6번\t+보너스 번호");
		
		/*랜덤 숫자 출력 #1 {Random.nextInt([])}
		for(int i = 1; i<=coin; i++) {
			System.out.printf("게임 %d\t ", i);
			for(int j = 0; j<7; j++) {
				int lottoNum = r.nextInt(45)+1;
				lottoArr[j] = lottoNum;
				if(j==0) {
					System.out.print("[" + lottoArr[j]+",\t");
				}else if(j!=6) {
					System.out.print(lottoArr[j]+",\t");
				}else if(j==6){
					System.out.print(lottoArr[j]+"]");
				}	
			}
			System.out.println();
		}
		*/
		/* 랜덤 숫자 출력 #3 {(int)(Math.random()*[]+1)}
		for(int i = 1; i<=coin; i++) {
			System.out.printf("게임 %d\t",i);
			for(int j=0;j<7;j++) {
				int lottoNum = (int) ((Math.random()*44)+1);
				lottoArr[j] = lottoNum;
				if(j==0) {
					System.out.print("["+lottoArr[j]+",\t");
				}else if(j!=6) {
					System.out.print(lottoArr[j]+",\t");
				}else if(j==6){
					System.out.print(lottoArr[j]+"]");
				}	
			}System.out.println();
		}
		*/
		
		/*랜덤 숫자 출력#2{Random.nextInt()에서 배열을 게임 수 만큼 먼저 생성, 이후 출력}
		for(int i = 0; i<coin*7; i++) {
			int lottoNum = r.nextInt(45)+1;
			lottoArr[i] = lottoNum;
		}
		int cnt=1;
		for(int j = 0; j<coin*7; j++){
			if(j%7==0){
				System.out.printf("게임 %d\t ", cnt);
				System.out.print(lottoArr[j]+"\t");
				cnt++;
			}else if(j%7==6) {
				System.out.print(lottoArr[j]+"\n");
			}else {
				System.out.print(lottoArr[j]+"\t");
			}
		}
		*/
		/*랜덤 숫자 출력 #3{ArrayList를 활용한 임의값 저장 및 출력}
		ArrayList<Integer> list = new ArrayList<Integer>();
			for(int j=0; j<7*coin;j++) {
				list.add(r.nextInt(45)+1);
			}
			int cnt=1;
			for(int j=0;j<coin*7;j++) {
				
				if(j%7==0) {
				System.out.print("게임 "+ (cnt) + "\t");
				System.out.print(list.get(j));
				}
				if(j%7==6) {
					System.out.print(list.get(j) + "\n");
					cnt++;
				}else {
					System.out.print(list.get(j)+"\t");
				}
			}
		*/
	}
}