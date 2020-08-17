package homework0417;

/*
 * 2060340017 신형재 과제 8번
 * 전체적으로 다른 학생들에 비해 메인 클래스가 너무 길다는걸 확인했습니다.
 * 주말 간 타 학생들 코드 확인해서 효율성을 높여 보도록 하겠습니다.
 */

public class Calculator {

	int add(int num1, int num2) {
		int result_add = num1+num2;
		return result_add;
	}
	int sub(int num1, int num2) {
		int result_sub = num1-num2;
		return result_sub;
	}
	int mul(int num1, int num2) {
		int result_mul = num1*num2;
		return result_mul;
	}
	int div(int num1, int num2) {
		int result_div = num1/num2;
		return result_div;
	}
	boolean check(int num) {
		boolean result = false;
		int i = 0;
		for(int j = 1; j<=num; j++) {
			if(num%j == 0) {
				i++;
			}
		result = (i==2 ? true : false);
		}return result;
	}
	
}
