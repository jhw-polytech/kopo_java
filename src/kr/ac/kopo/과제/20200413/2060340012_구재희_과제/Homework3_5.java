package jaeheehomework;

public class Homework3_5 {
	/*
	 5. 2 ~ 100사이의 소수를 출력하는 코드를 작성
	 
	   < 2 ~ 100사이의 소수 출력 >
	   2 3 5 7 11 13 17 … 97
	 
	 */
	public static void main(String[] args) {
		
		// 2 ~ 100 갖는 배열 생성
		int[] array4 = new int[99];
		for(int i = 0; i < array4.length; i++) {
			array4[i] = i+2;
		}
		
		//2부터 시작
		for(int i = 0; i < array4.length; i++) {
			
			// 자신보다 큰 값들과 순차적으로 나눔
				for(int j = i+1; j < array4.length; j++) {
					
					//나눌 값이 0이 아니고, 나눠야 될 값이 0이 아닌 상태에서,
					//배수 관계기면 그 값을 0으로 바꿈
					if(array4[i] != 0 && array4[j] != 0 && array4[j] % array4[i] == 0) {
						array4[j] = 0;
					}
				}
			}
		
		
		//남은 array4에서 0이 아닌 것들이 소수의 집합
		System.out.println("< 2 ~ 100사이의 소수 출력 >");
		
		for(int i = 0; i < array4.length; i++) {
			if(array4[i] != 0) {
				System.out.print(array4[i] + " ");
			}
		}
		
	}
}
