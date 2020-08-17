package jaeheehomework;

public class Calculator {
	
	//어떤 자료형 값을 return해주는 것이 아니기 때문에 void로 적습니다
	void cal(int num1, int num2) {
	
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("%d / %d = %.2f\n", num1, num2, (double) num1 / num2 );
		
		dicimal(num1);
		dicimal(num2);
	}
	
	// 소수를 체크하는 메소드를 따로 만듭니다
	void dicimal(int num) {
		
		int cntDicimal = 0;
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				cntDicimal++;
			}
		}
		
		/*
			재희씨 num이 2일때도 for문을 실행하지 않기 때문에 cntDecimal이 0이에요 굳이 num == 2 || 코드를 써야할 필요가 없네요 ^^
		*/
		if(num == 2 || cntDicimal == 0) {
			System.out.println(num + " 소수체크 true");
		} else {
			System.out.println(num + " 소수체크 false");
		}
		
	}
}
