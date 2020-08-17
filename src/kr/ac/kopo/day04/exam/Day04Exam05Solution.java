package kr.ac.kopo.day04.exam;

/*
 * 교수님이 제시하셨던 알고리즘은
 * "2부터" 시작할 때 의미가 있는 코드
			//소수임을 판별하는 식 --- 하나씩 구할 때
			int num = 13;
			
			for(int i = 2; i < num; i++) {
				if(num % i == 0);
			}
	일반적으로 위 코드를 소수인지 판단할 때 쓰지만
	교수님의 알고리즘엔 위의 내용이 포함되어 있다.
 * 
 */

public class Day04Exam05Solution {

	public static void main(String[] args) {

		int[] nums = new int[99];

		// 배열에 "2부터" 차례대로 입력해준다.
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 2;
		}

		/*
		 * * * 교수님 알고리즘의 원리 * * *
		 * 
		 * 배열 첫 번째칸의 값(=2)가 소수라는 가정 2의 배수를 0으로 변환
		 * 
		 * 다음칸 3을 봤는데, 으로 변하지 않았음. 그렇다면 3은 소수라는 말(나누기 할 후보가 2밖에 없는데, 2의 배수가 아니므로)
		 * 
		 * 다음칸 4를 봤는데, 2와 3으로 나눠봐야 하지만 이미 0으로 변했으므로 소수가 아님
		 * 
		 * 즉
		 * 
		 */

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) { // 자신보다 앞에 있는 숫자들로 이미 나눠지지 않았다면 소수
				for (int j = i + 1; j < nums.length; j++) {

					if (nums[j] % nums[i] == 0) {
						nums[j] = 0;
					}
				}
			}
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				System.out.printf("%5d", nums[i]);
			}
		}

		System.out.println();

	}

}
