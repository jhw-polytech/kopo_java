package kr.ac.kopo.day4.assignment;

public class Exam05 {
	
	public static void main(String[] args) {
	/*2 ~ 100사이의 소수를 출력하는 코드를 작성 
		 
		< 2 ~ 100사이의 소수 출력 > 
		2  3  5  7  11 13  17 … 97 	
	*/
		
		
	//배열에 2부터 100까지 차례대로 대입
	int[] intArr = new int[99];
	for(int i = 0; i < 99; i++) {
		intArr[i] = i+2;
	}
	
	
	for(int i = 0; i < 99; i++) {
		if(intArr[i] != 0) {		//원소가 0이 아니라면  
			for(int j = i+1; j <99; j++) {		//다음에 위치한 모든 원소를 돌며 해당 원소의 배수를 0으로 만듦.
				if(intArr[j] % intArr[i] == 0) {
					intArr[j] = 0;
				}								 //첫번째 원소인 2는 일단 소수이므로 2를 제외한 2의 배수는 모두 0이 됨. 
			}									 //1과 3사이에는 2밖에 없는데 3이 0으로 바뀌지 않았다는 것은 2로 나눠지지 않았다는 뜻. 즉, 소수를 의미. 앞에서와 마찬가지로 3의 배수는 모두 0이 됨				
		}										 //인덱스 순서대로 반복하다보면 배열의 원소는 0과 0이 아닌 원소로 구분되는데, 0으로 바뀌지 않은 원소는 모두 소수
	}											  
	
				
	//0이 아닌 배열 원소(소수) 출력
	System.out.println("< 2 ~ 100 사이의 소수 출력 >");
	for(int i = 0; i < 99; i++) {
		if(intArr[i] != 0) {
			System.out.print(intArr[i]+"  ");
		}
	}
			
			
		
	}
}
