package kr.ac.yeongnam.day04.homework;

import java.util.Scanner;

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
	10  12  36  40  67        
	
	< REVERSE >    
	76  4  63  21  1
*/

public class Problem03 {

	public static void main(String[] args) {
		
		/*
			3중 loop문이네요~~~  효율성이 좀 떨어질 거 같아요
			2중으로는 안될까요?? 생각한번 해주세요

			==> i--; 개념 덕분에 반복문을 줄일 수 있었습니다.
			==> 앞으로 반복문 중첩을 최대한 피하는 방법을 먼저 고민해보겠습니다.
			==> 피드백 주셔서 감사합니다^^

		*/

		Scanner sc = new Scanner(System.in);		
		int[] intArr = new int[5]; // 정수형 배열 선언
		
		for(int i = 1; i <= 5; i++) {
			System.out.print(i + "번째 정수 : ");
			intArr[i-1] = Integer.parseInt(sc.nextLine());
			
			if(i >= 2 && intArr[i-1] <= intArr[i-2]) { // 이전보다 작은 수를 입력했을 때
				int[] tmpArr = new int[i-1];  // 임시 배열
				System.arraycopy(intArr, 0, tmpArr, 0, i-1); // 이전 배열의 값을 'deep copy'하고 출력한다.
				System.out.println(Arrays.toString(tmpArr).replace("[", "").replace("]", "") // brackets 제거
						+ "보다 큰 수가 와야 합니다.");
				i--; // 조건을 만족하지 못했을 때, 다시 입력받기 위한 조치
			}
		}
		
		
		// < PRINT >
		System.out.println("< PRINT >");
		for(int num : intArr) {
			System.out.print(num + " ");
		}
		
		// < REVERSE >
		int [] reverseArr = new int [intArr.length];		
		for(int i = (intArr.length - 1); i >= 0; i--){
			int tmp = intArr[i]; // 배열의 요소를 받는 임시 변수
			int reverseInt = 0; // 반전된 정수를 담는 변수
			
			while(tmp % 10 == 0) { // 0으로 끝나는 정수라면, 0을 제거한다.
				tmp /= 10;
			}		
			
			while((tmp % 10) != 0) { // 반전된 정수를 reverseInt 변수에 담는다.
				reverseInt = reverseInt * 10;
				reverseInt = reverseInt + (tmp % 10);
				tmp /= 10;
			}			
			reverseArr[4-i] = reverseInt;
		}
		
		System.out.println();
		System.out.println("< REVERSE >");
		for(int num : reverseArr) {
			System.out.print(num + " ");
		}				

		
		/*
		int[] intArr = new int[5]; 
		for(int i = 0; i < 5; i ++) {
			System.out.print((i+1) + "번째 정수 : ");
			intArr[i] = sc.nextInt();									
			
			if( i >= 1) {
				while(intArr[i-1] >= intArr[i]) {
					// 0 ~ i-1 까지의 element에 있는 요소들을 콤마로 나열해야 함.
					System.out.printf("%4d", intArr[0]);
					
					for(int j = 1; j < i; j++) {
						System.out.print(", " + intArr[j]);						
					}

					System.out.println("보다 큰수가 와야합니다.");					
					System.out.print((i+1) + "번째 정수 : ");
					intArr[i] = sc.nextInt();								
				}				
			}			
		}
		
		System.out.println();
		System.out.println("< PRINT >");
		for(int num : intArr) {
			System.out.print(num + " ");
		}
		
		//REVERS
		int [] reverseArr = new int [intArr.length];		
		for(int i = (intArr.length - 1); i >= 0; i--){
			int tmp = intArr[i];
			int reverseInt = 0;
			int count = 0;
			
			if(tmp % 10 == 0) {
				tmp /= 10;
			}
			
			// System.out.println("tmp ==> " + tmp); // debug
			
			while((tmp % 10) != 0) {
				reverseInt = reverseInt * 10;
				reverseInt = reverseInt + (tmp % 10);
				tmp /= 10;
				count++;
			}			
			reverseArr[4-i] = reverseInt;
			
			// System.out.println(); // debug
			// System.out.println("reverseArr[4-" + i + "]" + reverseInt); // debug
		}
		
		System.out.println();
		System.out.println("< REVERSE >");
		for(int num : reverseArr) {
			System.out.print(num + " ");
		}	
		*/	
	}
}
