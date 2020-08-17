package kr.ac.kopo.day04.exam;

public class Day04Exam05SecondMethod {
	
	public static void main(String[] args) {

		// 배열생성(배열이 2부터 시작하므로 크기는 99)
		int[] arr = new int[99];

		// 배열주소를 옮겨가기 위한 인덱스 변수 생성
		int index = 0;

		// 생성한 배열에 2~100사이 정수 순서대로 저장
		for (int i = 2; i <= 100; i++) {
			arr[i - 2] = i;
		}

		// 소수 2의 배수에 해당하는 수는 0으로 변환
		for (int i = 1; i < 99; i++) { // arr[1] ~ arr[99]까지 반복문을 돌려
			if (arr[i] % 2 == 0) { // 2로 나눈 나머지가 0일 때
				arr[i] = 0; // 0으로 변환
			}
		}

		
		int cnt=0;
		
		// 1과 자신을 제외한 정수 중에 나눠지는 수가 있는지 확인
		while (index < 99) {

			if (index > 1) {

				for (int i = 2; i < arr[index] - 1; i++) {

					

					//나눠지는 수가 없으면(소수O)
					if (arr[index] % i == 0) {
						cnt++;
					}
					

					if(cnt>0) {
						//소수의 배수 0으로 변환
						for (int j = index+1; j < 99; j++) { // 반복문을 돌려
							if (arr[j] % arr[index] == 0) { // 소수로 나눈 나머지가 0일 때
								arr[j] = 0; // 0으로 변환
							}
						}
					}
					
					
//-----------------------------------------------------------------------------------
//					// 나눠지는 수가 있으면(소수X) 0으로 변환
//					if (arr[index] % i == 0) {
//
//						arr[index] = 0;
//
//					}
//
//-----------------------------------------------------------------------------------
				}

			}

			cnt=0;
			index++;
		}

		// 인덱스 초기화
		index = 0;

		System.out.println("< 2 ~ 100사이의 소수 출력 >");

		// 소수, 즉 0이 아닌 수만 출력
		while (index < 99) {

			if (arr[index] != 0) {
				System.out.print(arr[index] + " ");
			}

			index++;
		}

	}

}
