package test0418;

/**
 * 사칙연산 기능을 가지고 있는 Calculator 클래스 입니다
 * @author user
 *
 */



public class Calculator2 {
	
	/**
	 * 입력받은 두 정수를 차례대로 표시하는 메소드
	 * @param input_1
	 * @param input_2
	 */
	void input(int input_1, int input_2) {
		
		
		System.out.println("정수 : " + input_1);
		
		System.out.println("정수 : " + input_2);
		
		
	}
	
		
	/**
	 * 더하기 기능의 메소드 
	 * sum = first + second
	 * @param first
	 * @param second
	 * @return
	 */
	int sum(int first, int second) {
		
		int sum = first + second;
		
		return sum;
	}
	
	/**
	 * 뺴기 기능의 메소드
	 * subtract = first - second
	 * @param first
	 * @param second
	 * @return
	 */
	
	int subtract(int first, int second) {
		
		int sub = first - second;
		
		return sub;
		
	}
	
	/**
	 * 곱하기 기능의 메소드
	 * multiple = first*second
	 * @param first
	 * @param second
	 * @return
	 */
	int multiple(int first, int second) {
		
		int mul = first*second;
		
		return mul;
		
	}
	
	/**
	 * 나누기 기능의 메소드
	 * 나누기의 경우 반환값을 double로 설정했습니다
	 * div = first/second
	 * @param first
	 * @param second
	 * @return
	 */
	
	double divide(int first, double second) {
				
		double div = first/second;
		
		return div;
		
	}
	
	/**
	 * 소수체크를 위한 메소드
	 * 기존에 있던 코드를 수정했습니다
	 * @param first
	 */
	
	void prime(int first) {
		
		if(first == 2) {
			
			System.out.println("2 소수체크 : true");
		}
		
		int cnt = 2;
		while(cnt<first-1) {
			
			cnt+=(first%cnt != 0 ? 1 : 0 );
			String str =(first%cnt != 0 ? "true" : "false" );
			
			if(cnt == first -1) {
				
				System.out.println("소수체크 :" + str);
			
			}
			
			System.out.println("소수체크 : " + str);
			break;
			
		}
		


			
	}
	
	/**
	 * prime 메소드를 활용하여 두개의 정수 소수체크
	 * @param first
	 * @param second
	 */
	
	void primetwo(int first, int second) {
		
		prime(first);
		prime(second);
	}
		
		
	
		
	
	/**
	 * 사칙연산 계산 결과를 출력해주는 메소드
	 * @param first
	 * @param second
	 */
	void print(int first, int second) {
		
		int sum = sum(first, second);
		int sub = subtract(first, second);
		int mul = multiple(first, second);
		double div = divide(first, second);
		
		
		System.out.println(first + " + " + second + " = " + sum);
		System.out.println(first + " - " + second + " = " + sub);
		System.out.println(first + " * " + second + " = " + mul);
		System.out.printf("%d %s %d %s %.1f\n", first , "/" , second , "=" , div);
		primetwo(first, second);
	}
	
}
	
		
		
	       
	
		
		
