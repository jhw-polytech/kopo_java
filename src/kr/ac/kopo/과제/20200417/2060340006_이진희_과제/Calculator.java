package task;

public class Calculator {

	int add(int a, int b) {
		return a+ b;
	}
	int sub(int a , int b) {
		return a- b;
	}
	int mul(int a, int b) {
		return a * b;
	}
	double div(int a , int b) {
		return (double)a / b; //나누기는 실수가 나올수있기에 double로 변환
	}
	public static boolean primeNum(int num) {		
		int cnt = 0; //어떤수가 2부터 자기 직전까지 전부나누었을 때 한 번이라도 나눠지면 소수가 아니다(예 num이 7이면 7/2 ,7/3, 7/4, 7/5, 7/6)
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {//나눠지면 count체크
				cnt += 1;
			}
		}
		if(cnt == 0) {//count가 0이면 소수
			return true;
		}
		return false;//count가 0보다 크면 소수가 아니다
	}
}
