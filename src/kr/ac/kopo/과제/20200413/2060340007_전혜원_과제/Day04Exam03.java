package kr.ac.kopo.day04.exam;

import java.util.Scanner;

/*
3. 다음의 결과를 보이는 코드를 작성하시오
	1번째 정수 : 10
	2번째 정수 : 5
	10보다 큰수가 와야합니다
	2번째 정수 : 12
	3번째 정수 : 36
	4번째 정수 : 6
	10, 12, 36보다 큰수가 와야합니다
	4번째 정수 : 22
	10, 12, 36보다 큰수가 와야합니다
	4번째 정수 : 40
	5번째 정수 : 67
	
	< PRINT >
	10 12 36 40 67
	
	< REVERSE >
	76 4 63 21 1
*/

/*
	혜원씨 reverse 결과 이상해요..
	두자리 입력해도 한자리만 나오는데요??? ^^
	다시 생각해봅시다
*/

public class Day04Exam03 {

	public static void main(String[] args) {

		// 변수 선언

		// Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		// 입력값을 저장할 배열
		int[] arr = new int[5];

		// 저장된 값을 카운트 하는 변수
		int cnt = 0;

		// 숫자를 거꾸로 출력하기 위해 입력을 문자열로 변환받아 저장할 변수
		String line = "";

		// 5개의 정수 입력받기

		while (cnt < 5) {

			System.out.printf("%d번째 정수 : ", cnt + 1);
			int inputNumber = sc.nextInt();

			// 입력값이 기존 값들보다 크면 배열에 저장
			if (cnt == 0 || arr[cnt - 1] < inputNumber) {

				arr[cnt] = inputNumber;

				// 입력받은 정수를 문자열로 변환하여 변수에 누적저장
				line += Integer.toString(arr[cnt]) + " "; // " "는 구분자

				cnt++;

				// 입력값이 기존 값들보다 작으면 경고문 출력
			} else {

				for (int i = 0; i < cnt; i++) {
					System.out.print(arr[i]);

					// 마지막 출력숫자에는 콤마를 찍지 않음
					if (i < cnt - 1) {
						System.out.print(", ");
					}
				}

				System.out.println("보다 큰 수가 와야합니다.");

			}

		}

		System.out.println("< PRINT >");

		// 문자열 출력 (입력받은 정수가 순서대로 들어가 있음)
		System.out.println(line);

		System.out.println("< REVERSE >");

		// 배열 생성 후 문자열을 한글자씩 저장
		char[] lineArr = new char[line.length()];

		for (int i = 0; i < lineArr.length; i++) {
			lineArr[i] = (line.charAt(i));
		}

		

		//앞에 0이 붙을 경우 숫자가 변환되지 않음
		//3자리 이상 정수에서 맨앞 숫자가 잘려서 나옴
		
		for (int i = lineArr.length-1; i > 0; i--) {

			if (lineArr[i] != ' ') {
				System.out.print(lineArr[i - 1]);
			}
			
		}

		
		
		/*
		 
		 다른 시도방법)
		 
		
		//역순으로 출력해주기 위한 배열 생성
 		String[] reverse = { "0", "0", "0", "0", "0" }; //null exception이 뜨므로 0으로 초기화
		cnt=0; //cnt 초기화하여 재활용
		
		
		for (int i = lineArr.length-1; i > 0; i--) {
			
			//' '를 구분자로 배열에 각기 저장
			if (lineArr[i] != ' ') {
				reverse[cnt] += lineArr[i];
			
			//구분자를 만날 경우 cnt 증가
			} else {
				cnt++;
			}
			
		}
		
		
		//앞에 0이 붙는것을 없애기 위해 각 배열에 저장된 수를 정수로 바꾸어 출력
		for (int i = 0; i < 5; i++) {
			System.out.print(Integer.parseInt(reverse[i]) + " ");
		}
		
		
		 */

		
		sc.close();
		
		
	}
}
