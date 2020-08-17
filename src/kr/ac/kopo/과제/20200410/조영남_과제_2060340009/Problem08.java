package kr.ac.yeongnam.day03.homework;

import java.util.Scanner;

/*
 	8. 시작단과 종료단을 입력받아 구구단을 출력하시오.
              시작단을 입력 : 5         
              종료단을 입력 : 8
       
       *** 5단 ***      
       5 * 1 = 5      
       ...      
       8 * 9 = 72   
                
       이 때, 시작단을 8, 종료단을 5을 입력해도 같은 결과가 나와야 합니다 
 */

public class Problem08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 단을 입력 : ");
		int startNum = sc.nextInt();
		System.out.print("종료 단을 입력 : ");
		int endNum = sc.nextInt();
		System.out.println("");
		
		if(startNum < endNum) { // 시작 단이 끝나는 단보다 작을 때
			for( ; startNum <= endNum; startNum++) { // 단수를 올려나가기 위한 반복문
				System.out.printf("*** %d단 ***\n", startNum);
				for(int cnt = 1; cnt <= 9; cnt++) {
					System.out.printf("%d * %d = %d\n", startNum, cnt, startNum * cnt);					
				}
				System.out.println("");
			}
		} else { // 시작 단이 끝나는 단보다 클 때
			for( ; startNum >= endNum; startNum--) { // 단수를 줄여나가기 위한 반복문
				System.out.printf("*** %d단 ***\n", startNum);
				for(int cnt = 1; cnt <= 9; cnt++) {
					System.out.printf("%d * %d = %d\n", startNum, cnt, startNum * cnt);					
				}
				System.out.println("");
			}			
		}
	}
}
