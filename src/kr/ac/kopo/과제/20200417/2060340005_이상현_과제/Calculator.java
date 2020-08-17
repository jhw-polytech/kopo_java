package shlee1993.day06.homework;

//32라인에 질문있습니다!!

public class Calculator {
	int a;
	int b;

	void sum() {
		System.out.printf("%d + %d = %d\n", a, b, a+b);
	}

	void sub() {
		System.out.printf("%d - %d = %d\n", a, b, a-b);
	}

	void mul() {
		System.out.printf("%d * %d = %d\n", a, b, a*b);
	}

	void div() {
		if (b != 0)
		System.out.printf("%d / %d = %.1f\n", a, b, (double)a/b);	//소수점 한자리까지 표현하기 위해 %.1f사용, 실수로 표현하기 위한 형변환
		else System.out.println("나누는 값이 0입니다.");
	}

	void prime(int p) {
		boolean bool = true;
		for (int i = 2; i < p; i++) {
			if (p % i == 0) {
				bool = false;
				break;	//break를 쓰는 것이 좋지 않다고 하셨는데, 예를들어 2000의 값이 들어왔을 때,
						//2의 배수에서 소수가 아님이 밝혀지고도 1999까지 작업을 진행하는 것이 좋은 지, break를 이용해 중지하는 것이 좋은 지 궁금합니다!
						/*
							=> 답변 
							   이럴때는 break;를 써야겠지요....
							   당연히 2000번 도는 것보다는 한번 돌고 결과를 안다면 중단해요~~
							   저는 이런경우 for문의 조건식에 i < p && p % i != 0 이런 코드를 넣을거 같기도 해요~~~
							   
						*/
			}
		}
		System.out.println(p + " 소수체크 : " + bool);
	}
}