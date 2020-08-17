package shlee1993.day11.homework;

import java.util.Random;

public class LottoRandom {
	int[] num = new int[6];
	int bonus;
	int playerNum;

	LottoRandom() {
	}

	LottoRandom(int playerNum) {
		this.playerNum = playerNum;
	}

	public void start() {
		num[0] = playerNum;	//인덱스 0 값에 입력받은 수를 저장
		
		for (int i = 1; i < num.length; i++) {
			num[i] = randomNum(num, i);
		}
		
		num = bubble(num);	//버블정렬을 이용해 보기좋게 정렬

		bonus = randomNum(num, 6);	//이미 여섯개의 숫자가 있으므로 두번째 매개변수에 6을 대입
	}

	public int randomNum(int[] n, int index) {
		int number = 0;
		Random rand = new Random();
		
//continue문에 혹시나해서 break처럼 분기점을 잡아서 해보았는데  정상적으로 출력이 되었습니다.
//강의시간  continue문을 사용하지 않는 것이 좋다는 말에 방법2의 코드로 작성했습니다.	
//		방법1.
		/*
		branch: while (true) {
			number = rand.nextInt(45) + 1;
			for (int i = 0; i < index; i++) {
				if (number == n[i])
					continue branch;
			}
			return number;
		}
		*/
		
//		방법2.
		while (true) {
			number = rand.nextInt(7) + 1;
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

	public void printNumber() {
		System.out.printf("%d를 포함한 랜덤 로또번호 : %d %d %d %d %d %d + 보너스 번호 : %d입니다\n", playerNum, num[0], num[1], num[2],
				num[3], num[4], num[5], bonus);
	}

}
