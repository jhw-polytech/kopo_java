package jaeheehomework;

import java.util.Scanner;

public class Homework3_3 {
/*
 3. 다음의 결과를 보이는 코드를 작성하시오
	1번째 정수 : 10
	2번째 정수 : 5
	10보다 큰수가 와야합니다
	2번째 정수 : 12
	3번째 정수 : 36
	4번째 정수 : 6
	10, 12, 36보다 큰수가 와야합니다
	4번째 정수 : 22
	10, 12, 36보다 큰수가 와야합니다
	4번째 정수 : 40
	5번째 정수 : 67

	< PRINT >
	10 12 36 40 67
	
	< REVERSE >
	76 4 63 21 1
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 5개의 오름차순 숫자를 담을 배열 생성 
		int[] array2 = new int[5];
		// 오름차순인지 아닌지를 판단할 boolean 변수 생성
		boolean bool = false;
		
		// 오름차순이면 bool을 true로 바꿔주어서, i를 1 증가시킴
		for(int i = 0; i < array2.length; i += (bool == true ? 1:0)) {
			
			//첫번째 수는 비교 대상이 없으므로 일단 받아줌
			if(i == 0) {
				System.out.print("1번째 정수는 : ");
				int num = sc.nextInt();
				array2[i] = num;
				bool = true;
			
			//두번째 수 부터는, 받은 수가 이전에 입력한 수 보다 크면 array에 받고, bool를 true로 바꿔주어서 i를 증가시킴 
			} else if(i != 0){
				System.out.printf("%d 번째 정수 : ", i+1);
				int num = sc.nextInt();
				
				if(array2[i-1] < num) {
					array2[i] = num;
					bool = true;
				
				//받은 정수가 이전에 입력한 수 보다 작으면, bool을 false로 바꿔서 i를 그대로 둠
				} else {
					// array2 출력. default값인 0이 나오지 않게 해야함
					for(int j = 0; j < array2.length; j++) {
						if(array2[j] != 0)
							System.out.print(array2[j] + " ");
					}
					System.out.println("보다 큰 수가 나와야합니다");
					bool = false;
				}
			}
		}
		
		// < PRINT >
		System.out.println("< PRINT >");
		for(int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		
		// < REVERSE > 배열 생성
		int[] array2Reverse = new int[array2.length];
		
		// array2Reverse의 첫번째 원소는, array2 마지막 원소 값의 10의 자리와 1의 자리를 바꾼 것임
		for(int i = 0; i < array2.length; i++) {
			
			int num10 = array2[4-i] / 10; // 10의 자리는 값을 10으로 나눴을 때의 몫
			int num1 = array2[4-i] % 10; // 1의 자리는 값을 10으로 나눘을 때의 나머지
			
			array2Reverse[i] = 10* num1 + num10;  
		}
		
		System.out.println("< REVERSE >");
		for(int i = 0; i < array2Reverse.length; i++) {
			System.out.print(array2Reverse[i] + " ");
		}
	}
}
