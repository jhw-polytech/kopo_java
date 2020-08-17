package kr.ac.jinwoo.day03.homework;


/*
 * 다음의 결과를 보이는 코드를 작성하시오.
 * 
 *     *****
 *     _****
 *     __***
 *     ___**
 *     ____*
 *     ___**
 *     __***
 *     _****
 *     *****
 *     
 */

public class Exam10 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 9; i++) {
			if(i < 5) {
				for(int j = 0; j < 5; j++) {
					if(i <= j) System.out.print('*');
					else System.out.print('_');
				}			
			}
			else {
				for(int j = 5; j > 0; j--) {		
					if(i-2 > j) System.out.print('*');
					else System.out.print('_');
				}
			}
			System.out.println();
		}
	}
}
