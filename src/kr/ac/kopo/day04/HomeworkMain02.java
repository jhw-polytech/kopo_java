package kr.ac.kopo.day04;

import java.util.Random;

public class HomeworkMain02 {
	
	public static void main(String[] args) {
		
		Random r = new Random();
		

		int num = r.nextInt(10) + 1;
		
		System.out.println("< 1 ~ 100 사이의 정수 중 " + num + "배수 제외 >");
		for(int i = 1; i <= 100; i++) {
			if(i % num != 0) {
				System.out.printf("%5d", i);				
			}
			
		}
		
		System.out.println();
		
		//5개씩 숫자를 출력하기 위해서는 총 몇개를 찍었는지 알기 위해 변수가 필요
		int cnt = 0;
		
		System.out.println("< 1 ~ 100 사이의 정수 중 " + num + "배수 제외, 한라인에 5개씩>");

		for(int i = 1; i<=100; i++) {
			if(i % num != 0) {
				System.out.printf("%5d", i); //%5d에서 숫자 5는 오른쪽정렬로 5칸만큼씩 됨
				cnt++;
				if(cnt % 5 == 0) {
					System.out.println();
				}
			}
			
//			//아래 if문이 위 for문 밖에 있으면 num과 5의 공배수일 때 엔터가 한번씩 더 쳐짐
//			if(cnt % 5 == 0) {
//				System.out.println();
//			}

			
			//또는 if문을 밖에 써주고 싶으면 아래와 같이 코드를 쓰면 됨
//			if(cnt == 5) {
//				System.out.println();
//				cnt = 0;
//			}
			
		}		
		
	}

}
