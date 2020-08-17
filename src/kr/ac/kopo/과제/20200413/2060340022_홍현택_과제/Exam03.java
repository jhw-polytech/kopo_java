package kr.co.hana.Homework03;

import java.util.*;


// 이렇게 짜다가 더이상 진행이 안되서 미완성입니다 ㅠ
/*
	네네~~~ 수업시간에 한번 해볼게요..
	그런후에 오후에 다시한번 작성해보세요....
*/

public class Exam03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5]; //array 생성
		
		for (int i = 0; i < 5; i= i+0) {
			System.out.printf("%d번째 정수 : ", i+1);
		
			arr[i] = sc.nextInt(); 
			int[] temp = new int[1];  //temp라는 array 
			
			if (i == 0) {
				i++;
			}
			else if (arr[i] > arr[i-1]) {
				i++;
			} 
			else {
				System.out.printf("%d보다 큰 수가 와야합니다\n", arr[i-1]);
				temp[0] = arr[i-1];
			}
		}
		
	sc.close();
	}
}
