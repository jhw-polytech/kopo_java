package shlee1993.day12.homework;

import java.util.Random;

public class LottoRandomForWay1and2 {
	int[] num = new int[6];
	int bonus;

	public void exe() {
		Random rand = new Random();
		num[0] = rand.nextInt(45) + 1;	//randomNum으로 6개를 뽑아도 되지만, 저번 소스를 재활용하기 위해 첫번째를 따로 뽑음
		
		for (int i = 1; i < num.length; i++) {
			num[i] = randomNum1(num, i);
		}
		num = bubble(num);	//버블정렬을 이용해 보기좋게 정렬

		bonus = randomNum2(num, 6);	//보너스 숫자는 두번째 방법으로 뽑음
	}

	public int randomNum1(int[] n, int index) {
		int number = 0;
		Random rand = new Random();
		
		while (true) {
			number = rand.nextInt(45) + 1;
			for (int i = 0; i < index;) {
				if (number == n[i])	//중복이 나올 경우 숫자를 다시 뽑음
					break;
				else if((i != index - 1))	//중복이지만 이전 인덱스까지 돌지 않았을 경우 i를 증가
					i++;
				else	//모든 숫자와 겹치지 않을 경우 리턴
					return number;
			}
		}
	}

	
	public int randomNum2(int[] n, int index) {	//continue문을 이용한 중복x 랜덤 뽑기
		int number = 0;
		Random rand = new Random();
		
		branch: while (true) {
			number = rand.nextInt(45) + 1;
			for (int i = 0; i < index; i++) {
				if (number == n[i])
					continue branch;
			}
			return number;
		}
		
	}

	public int[] bubble(int[] n) {	//버블정렬
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				if (n[j - 1] > n[j]) {
					int temp = n[j - 1];
					n[j - 1] = n[j];
					n[j] = temp;
				}
			}
		}
		return n;
	}

	public void printNumber(int game) {
		System.out.printf("게임%d : %d %d %d %d %d %d + 보너스 번호 : %d\n",game, num[0], num[1], num[2],
				num[3], num[4], num[5], bonus);
		//System.out.println(Arrays.toString(num));
	}

}
