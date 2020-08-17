package kr.ac.kopo.assignment.day11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
/*
 * 로또 번호 추출 : 좋아하는 로또 번호를 입력하면, 1 ~ 45 사이의 숫자 총 6개를 추천해주는  프로그램
 * ---------------출력방식--------------------
 * 좋아하는 로또 번호 입력 : 34
 * 34를 포함해서 로또 번호들을 추출하겠습니다.
 * n n n n 34 n
 * 
 * 좋아하는 로또 번호 입력 : 77
 * LottoNumberException : 1 - 45 사이만 가능합니다. 77은 올바르지 않습니다.
 * 
 */
	private Scanner sc;
	private Random ran;
	private int[] lottoNums;
	private int myLottoNum;
	
	public Lotto() {
		sc = new Scanner(System.in);
		ran = new Random();
	}
	
	//이따 삭제하기
	public int[] getLottoNums() {
		return lottoNums;
	}


	//로또 번호 중 좋아하는 숫자 입력 
	public void myNum() {
		
			System.out.print("좋아하는 번호 입력(1-45 사이의 번호) : ");
			myLottoNum = sc.nextInt();
			sc.nextLine();
							
	}
	
	//Random 로또 번호 추출, 숫자 중복 안되게!
	//숫자 중복을 방지하기 위해 while문을 추가했지만, 실행해보니 중복이 되는 경우가 생기네요..? ㅜㅜ 어디서 문제가 생긴건지 잘 모르겠습니다..
	public void ranNum() {
		
		lottoNums = new int[6];
		lottoNums[0] = myLottoNum;
		for(int i = 1; i < lottoNums.length; i++) {
			int tmp = ran.nextInt(45) + 1;
			
			/*
				while문의 조건이 맘에 안듭니다~~~~~
				tmp == lottoNums[i-1])
				힌트~~ 반복문은 어느경우에 반복하죠????
			*/
			while(tmp == lottoNums[i-1]) {
				tmp = ran.nextInt(45) + 1;
			}
			
			lottoNums[i] = tmp;
		}
				
	}
	
	//Random 로또 번호 오름차순으로 정렬
	public void sortNum() {
		
		for(int i = 0; i < lottoNums.length; i++) {
			for(int j = i+1; j < lottoNums.length; j++) {
				if(lottoNums[i] > lottoNums[j]) {
					int tmp = lottoNums[i];
					lottoNums[i] = lottoNums[j];
					lottoNums[j] = tmp;
				}
			}
		}
	}
	
	//전체 출력 메소드 - 입력한 숫자가 1 - 45가 아닌 경우 예외처리
	public void execute() {
		
		System.out.println("--------------당신을 위한 로또 추첨--------------");
		
		try {
			this.myNum();
			if(myLottoNum < 1 || myLottoNum > 45) {
				throw new LottoNumberException("1 - 45 사이만 가능합니다." + myLottoNum + "은 올바르지 않습니다.");
			}
			System.out.println( myLottoNum +"번호를 포함한 로또 번호 6개는....");
			ranNum();
			sortNum();
			System.out.println(Arrays.toString(this.lottoNums));
		}catch(Exception e) {
			e.printStackTrace();
		}

//		
		
	}
	
	
	
}
