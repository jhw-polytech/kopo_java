package shlee1993.day04.homework;

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
ex)	< PRINT >
	10 12 36 40 67
	< REVERSE >
	76 4 63 21 1
*/

/* 교수님 comment
앞에서 코멘트 단것과 마찬가지로.. 이렇게 작성하지만 반복문에 3번 중첩되게 됩니다. 
횟수에서는 상관이 없을 수 있겠지만 일단 시간복잡도에서 O(N*N*N) 이라고 계산되거든요.
O(N*N)으로도 생각해보시겠어요?
*/

//수정후
public class Hw03_modified {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		num[0] = 0; // 생략해도 자동으로 0으로 초기화되지만, 보기 좋기하기 위해 작성

		for (int i = 0; i < num.length;) { // 입력을 위한 for문
			System.out.printf("%d번째 정수 : ", i + 1);
			num[i] = sc.nextInt();
			if (i == 0 || num[i] > num[i - 1]) // 인덱스가 0인 경우 or 전 인덱스보다 큰 수를 받을 경우 인덱스를 증가시켜 다음값에 저장할 준비
				i++;
			else {
				for (int j = 0; j < i; j++)
					System.out.printf("%d ", num[j]);
				System.out.println("보다 큰 수가 와야합니다");
			}
		}
		sc.close();

		System.out.println("< PRINT >");
		for (int i = 0; i < 5; i++)
			System.out.print(num[i] + " ");
		System.out.println();

		int[] rev = new int[5];
		for (int i = 0; i < 5; i++) { // reverse부분 출력
			while (num[i] != 0) { // num[i]에 저장된 값이 1/10, 1/100 ... 0이 될때까지 진행
				rev[i] = rev[i] * 10 + num[i] % 10;
				num[i] /= 10;
			}
		}

		System.out.println("< REVERSE >");
		for (int i = rev.length - 1; i >= 0; i--)
			System.out.print(rev[i] + " ");
	}

}

/*
//수정전
//2번과 비슷하게 입력을 받고 print와 reverse를 출력한다
//reverse문을 출력한 방법:
//1 - num과 같은 크기의 배열을 만든다.
//2 - num[i]의 1의 자리수를 rev[i]에 저장하고, num[i]를 10으로 나누어준다.
//3 - 2번 과정에서 얻은 rev[i]값에 10을 곱해주고 2번에서 10으로 나누어준 num[i]값의 1의 자리수를 rev[i]에 더한다, num[i]는 다시 10으로 나누어준다.
//4 - 반복

public class Hw03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		num[0] = 0; // 생략해도 자동으로 0으로 초기화되지만, 보기 좋기하기 위해 작성

		for (int i = 0; i < 5; i++) {	//입력을 위한 for문
			while (true) {
				System.out.printf("%d번째 정수 : ", i + 1);
				num[i] = sc.nextInt();
				if (i == 0)
					break; // 인덱스가 0인 경우(첫번째 정수)바로 탈출
				else {
					if (num[i] > num[i - 1]) // 앞선 인덱스 값에 저장된 값보다 클 때 break로 탈출
						break;
					else {
						for (int j = 0; j < i; j++)
							System.out.printf("%d ", num[j]);
						System.out.println("보다 큰 수가 와야합니다");
					}
				}
			}
		}
		sc.close();

		System.out.println("< PRINT >");
		for (int i = 0; i < 5; i++)
			System.out.print(num[i] + " ");
		System.out.println();

		int[] rev = new int[5];
		for (int i = 0; i < 5; i++) {	//reverse부분 출력
			while (num[i] != 0) {	//num[i]에 저장된 값이 1/10, 1/100 ... 0이 될때까지 진행
				rev[i] = rev[i] * 10 + num[i] % 10;
				num[i] /= 10;
			}
		}

		System.out.println("< REVERSE >");
		for (int i = 0; i < 5; i++)
			System.out.print(rev[i] + " ");
	}
	
}
*/
