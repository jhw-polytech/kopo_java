package kr.ac.jinwoo.day03.homework;

/*
 * 다음의 결과를 보이는 코드를 작성하시오.
 * 
 *     *_______*
 *     **_____**
 *     ***___***
 *     ****_****
 *     *********
 *     ****_****
 *     ***___***
 *     **_____**
 *     *_______*
 * 
 */
public class Exam12 {

	public static void main(String[] args) {
		
		int starCnt = 1;
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				if(j < starCnt || j > 8 - starCnt)
					System.out.print('*');
				else
					System.out.print('_');
			}
			System.out.println();
			if(i < 4)
				starCnt++;
			else
				starCnt--;
		}
	}
}
