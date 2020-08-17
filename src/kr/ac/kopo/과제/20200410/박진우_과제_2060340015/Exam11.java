package kr.ac.jinwoo.day03.homework;

/*
 * 다음의 결과를 보이는 코드를 작성하시오.
 * 
 *     *********
 *     _*******
 *     __*****
 *     ___***
 *     ____*
 * 
 */
public class Exam11 {

	public static void main(String[] args) {
		
		int cnt = 0;
		
		for(int i = 5; i > 0; i--) {
			for(int j = 0; j < i+4; j++) {
				if(j >= cnt) System.out.print('*');
				else System.out.print('_');
			}
			cnt++;
			System.out.println();
		}
	}
}
