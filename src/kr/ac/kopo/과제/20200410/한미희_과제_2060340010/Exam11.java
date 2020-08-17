package kr.ac.kopo.day3.assignment;

public class Exam11 {
	
	public static void main(String[] args) {
	
		//출력할 행(i) 개수 : 5줄
		for (int i = 1; i <= 5; i++) {
				//출력할 열(k) 개수: (10-행의 자리(i))
				/*왜냐하면
				 *다음 행으로 이동할 때 출력될 "*"는 9개에서 시작하여 2개씩 줄고, "-"는 0개에서 시작하여 1개씩 늘어난다.
				      즉, 다음 행으로 이동할 때 출력되는 총 문자의 개수(열 개수)는 9개에서 시작하여 1개씩 줄어든다. (-2 + 1= -1)
				 *행의 자리가 1씩 늘어날 때 열 개수는 1씩 줄어드므로 행의 자리와 열 개수의 합은 10으로 고정된다. 
				   따라서 각 행마다 출력될 열 개수는 10-행의 자리로 구할 수 있다.
				 */
				for(int k = 1; k <= (10-i); k++) {
					if(k < i) {
						System.out.print("-");
					}else {
						System.out.print("*");
					}
				}
				System.out.print('\n');
		}	
	
		
	}
}
