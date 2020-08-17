package Homework_0413;

/* 5) 2 ~ 100 사이의 소수를 출력하는 코드를 작성
<조건>
1. 2~100 숫자를 저장하는 배열을 생성한다.
2. 0번지에 있는 2의 배수는 0으로 만든다.
3. 1번지에 있는 3의 배수는 0으로 만든다.
4. 2번지에 있는 4 -> 0으로 바뀜 -> 소수가 아님
5. 반복
6. 이 때 0으로 바뀌지 않은 수는 소수이다. 이를 출력하라
*/

public class Test05 {

	public static void main(String[] args) {

		System.out.println("< 2 ~ 100사이의 소수 출력 >");

		int[] primeNum = new int[101];

		for (int i = 1; i <= 100; i++) {
			primeNum[i] = i; // 쉽게 계산하기 위해 index의 번호를 배열의 값으로 바로 저장하였어요.
		}

	/*
		계속 continue;가 거슬리지만 일단 패스!!! ^^
	*/
		// index 안의 값이 2,3,5...의 배수일 경우 index안의 값을 0으로 만들어주고 0이 아닌 것을 출력한다.
		for (int i = 2; i <= 99; i++) {
			if (primeNum[i] == 0) {
				continue; 
			} else {
				System.out.print(primeNum[i] + " "); 

				for (int k = i*(i-1); k <= 99; k += i) {	// 2,3,5...의 배수이면
					primeNum[k] = 0;	// index안의 값을 0으로 설정해준다.
				}
			}
		}
	}
}