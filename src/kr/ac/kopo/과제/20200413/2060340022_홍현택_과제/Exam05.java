package kr.co.hana.Homework03;

public class Exam05 {
	public static void main(String[] args) {

		int num = 100;

		int[] arr1 = new int[num + 1];
		int[] arr2 = new int[num + 1];

		for (int i = 0; i <= num; i++) { // 데이터 초기화
			arr1[i] = i;
			arr2[i] = 1;
		}

		for (int j = 2; j * j <= num; j++) {  // i*j <= num 이부분 다른 방법은 없을지 생각
			if (arr2[j] != 0) {	
				for (int k = j + j; k <= num; k += j) {		// j의 배수를 0으로 만들어준다
					arr2[k] = 0;
				}
			}
		}

		/*
			현택씨 왜 1일때 출력해요???????? 궁금궁금..... 
		*/
		for (int j = 2; j <= num; j++) {
			if (arr2[j] == 1) {
				System.out.println(arr1[j]);
			}
		}

	}
}
