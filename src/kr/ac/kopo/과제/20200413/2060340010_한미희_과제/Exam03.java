package kr.ac.kopo.day4.assignment;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
	/*다음의 결과를 보이는 코드를 작성하시오    
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
		
		//5개의 정수를 저장할 배열과 사용자로부터 값을 입력받을 변수 선언
		int[] intArr = new int[5];
		Scanner sc = new Scanner(System.in);
		int input;
		
		/*
			학생들이 다들 3중 loop문을 너무너무 좋아하는데요??
			그러나 효율적이진 않아요??? 한번 어떻게 하면 반복문을 줄일 수 있는지 생각해봅시다
		*/
		
		//
		for(int i = 0; i < 5; i++) {
			System.out.printf("%d번째 정수 : ", i+1);
			input = sc.nextInt();		//정수를 입력받음
			//처음 입력받은 정수는 어떤 수이든 배열의 첫번째 원소에 위치할 수 있음 -> 처음 입력받은 정수는 while문을 돌 필요 없이 바로 배열에 저장
			//각 배열의 원소는 한 칸 이전의 변수보다 크기만 한다면 배열은 크기순대로 정렬됨 -> 입력받은 정수가 한 칸 이전의 배열 원소보다 작거나 같다면, 메시지를 출력하고 다시 정수를 입력받음
			while((i != 0) && (input <= intArr[i-1])) {		
				System.out.print('\t');
				for(int j = 0; j < i-1; j++) {			//이전 배열 원소들보다 큰수여야 된다는 메시지 출력
					System.out.print(intArr[j]+", ");
				}
				System.out.println(intArr[i-1] + "보다 큰수가 와야합니다");
				System.out.printf("%d번째 정수 : ", i+1);		
				input = sc.nextInt();			//정수를 다시 입력받기
			}
			intArr[i] = input;		//입력받은 정수가 비로소 이전 배열 원소보다 크게 되면 다음 인덱스에 저장
		}
		
		
		//배열의 원소 모두 출력
		System.out.println("< PRINT >");
		for(int i = 0; i < 5; i++) {
			System.out.print(intArr[i]+"  ");
		}
		System.out.println("");
		System.out.println("");
		
		
		//배열을 거꾸로 출력하되, 각 원소들 또한 값이 뒤집힌 채 출력(단, 0은 출력하지 않음)
		System.out.println("< REVERSE >");
		for(int i = 4; i >=0 ; i--) {	//배열의 마지막 원소부터 하나씩 감소하며 출력
			if (intArr[i] % 10 != 0) {		
				System.out.print(intArr[i]%10);		//일의 자리(10으로 나눈 나머지)먼저 출력. (단, 0이 아닌 경우에만)
			}
			//while문을 돌며 10, 100, 1000, ,,,의 자리 순서대로 출력
			while(intArr[i]/10 != 0) {		//10으로 나눈 몫이 0이 아니라면(즉, 일의 자리만 남아있는 수(10보다 작은 수)가 아니라면)출력할 자리가 남아있다는 뜻이므로 마지막 자리를 출력할 때까지 whilean문 반복
				intArr[i] /= 10;		//10으로 나눈 몫을 저장
				if (intArr[i] % 10 != 0) {		
					System.out.print(intArr[i]%10);		//10으로 나눈 나머지(각 자리의 수) 출력. (단, 0이 아닌 경우에만)
				}				// 							
			}
			System.out.print("  ");
		}
		
		
		
		
		
	}
}