package kr.ac.kopo.day04.homework;

import java.util.Scanner;

/*
 * 2060340011 홍민기
 * 
 * 2. 5개의 짝수를 입력받아 출력하는 코드를 작성
 * 1's 정수 : 12
 * 2's 정수 : 5
 * 2's 정수 : 20
 * 3's 정수 : 10
 * 4's 정수 : 26
 * 5's 정수 : 5
 * 5's 정수 : 11
 * 5's 정수 : 4
 *
 * < 5개의 정수 출력 >
 * 12 20 10 26 4
 * 
 */
public class HomeworkMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		int index =0;
		
		while(index<5) {
			System.out.print(index+1 + "'s 정수 : ");
			arr[index]=sc.nextInt();
			if(arr[index]%2==0) {
				index++; // 짝수일 경우만 index가 증가되기 때문에 홀수를 입력해도 다음 반복에서 똑같은 인덱스에 값을 입력
			}
		}
		System.out.println("< 5개의 정수 출력 >");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
