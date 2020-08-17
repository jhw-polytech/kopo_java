package kr.co.hana.Homework03;

import java.util.Scanner;
import java.util.Arrays;

/*
 input, 정수 입력 ==> <intEven == 짝수 ?> ==> (no : input으로 되돌아가기) yes : intEven[i]에 정수 저장 ==> <i+1 = 5 ?>
 ==> (no : input으로 되돌아가기) yes : for문 탈출 / intEven 값들 출력
 */

public class Exam02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] intEven = new int[5];
		
		
		for (int i = 0; i < 5; i = i + 0) {
			System.out.printf("%d's 정수 : ", i+1);
			intEven[i] = sc.nextInt();

		/*
			if문의 순서를 변경하시는게 더 좋을 거 같아요.. 짝홀은 양수만 가능하니깐요...
		*/
			if (intEven[i] % 2 == 0 && intEven[i] > 0) {
				i++;
			} 
		}
		
		System.out.println("< 5개의 정수 출력 > "); 
		System.out.println(Arrays.toString(intEven));
		sc.close();
	}
}
