package kr.co.hana.homework02;

public class Exam09 {
	
	/*
	 * 1. if (line = 1+3i) 일때 곱셈 출력하 다음 라인으로 넘어가기 짜다가 실패 ==> line++ 써서 다시 시도해보기 
	 * 2. * for문 3개로 2단, 3단, 4단을 하나로 보고 for문... 9단 10단 출력되는 문제 ==> 해결
	 */
	/*
		현택씨 과제하시느라 고생하셨어요..
		답이 나올때까지 고민하는 것도 실력향상에 도움이 많이 됩니다.
		계속 꾸준히 해주실꺼죠??? ^^
	*/
	public static void main(String[] args) {
	
		for (int i = 1; i < 4; i++) {   
				
			for (int multi = 1; multi <= 9; multi++) // (x단  * y) 중 y에 해당 

				for (int dan = 3 * i - 1; dan < 3 * i + 2; dan++) {  // 2~4단, 5~7단, 8단 
					if(dan == 9) break;
					System.out.printf("%d * %d\t", dan, multi);
					
				}
				System.out.println("");
			}
			System.out.println("");
		}
		
	}

