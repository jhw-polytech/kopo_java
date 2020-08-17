package shlee1993.day12.homework;

import java.util.ArrayList;
import java.util.Random;

public class LottoRandom3 {	
	ArrayList<Integer> num;
	
	public void exe() {
			int number;
			this.num = new ArrayList<>();
			while (num.size() < 7) {
				Random rand = new Random();
				number = rand.nextInt(45) + 1;
				if (!num.contains(number)) {   //숫자가 포함되지 않을 경우에만 숫자를 더함  
					num.add(number);
				}
			}
	}

	public void printNumber(int game) {
		System.out.printf("게임%d : 보너스 번호 포함 7자리 ", game);
		System.out.println(num.toString());	//일정형식으로 배열을 끝까지 출력
	}

}
