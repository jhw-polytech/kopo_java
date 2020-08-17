package shlee1993.day12.homework;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoRandom4 {	//중복된 숫자가 add될 수 없는 Set을 이용
	Set<Integer> num;

	public void exe() {
		Random rand = new Random();
		num = new HashSet<>();
		int number = 0;

		while (num.size() < 7) {
			number = rand.nextInt(45) + 1;
			num.add(number);
		}
	}

	public void printNumber(int game) {
		System.out.printf("게임%d : 보너스 번호 포함 7자리 ", game);
		System.out.println(num.toString());
	}
}
