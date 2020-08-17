package kr.ac.kopo.day3.assignment;

public class Exam09 {
	
	public static void main(String[] args) {
	//구구단을 한 줄에 3단씩 출력. 반복문은 최대 3개만 사용
		
		//1~9단까지 3단씩 묶음(2,3,4단/5,6,7단/8,9단)
		for(int i = 1; i <= 3; i++) {
			//한 행 기준 각 단에 곱해질 수(1~9)
			for(int j = 1; j <= 9; j++) {
				//한 행에 들어갈 단 3개 차례대로						
				for(int k = (3*i-1); k < (3*i-1)+3 ; k++) {
					//9단까지만 출력하도록
					if (k <= 9) {			
						System.out.printf("%d * %d = %d\t", k, j, k*j);
						System.out.print('\t');
					} 
				}
				System.out.print('\n');	
			}
			System.out.print('\n');	
		}
		
		
	}
}
