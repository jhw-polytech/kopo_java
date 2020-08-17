package kr.ac.kopo.day11.project01;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lottery {
	private int userNumber;
	public Random random;
	private Set<Integer> numberSet;
	
	public Lottery(int userNumber) {
		this.userNumber = userNumber;
		random = new Random();
		numberSet = new HashSet<Integer>();
		numberSet.add(this.userNumber);
	}
	
	// 로또번호는 6개, 로또번호는 중복되면 안된다.
	// 45를 입력했으면,
	// 1-44사이의 숫자
	// 그러면 중복을 허용안하는 set에서 처리하자.
	public void getNumbers()  throws LottoNumberException{
		if (userNumber > 45 || userNumber < 1 ) { // 45 초과, 1 미만인 경우
			throw new LottoNumberException("LottoNumberException: 1 - 45 사이만 가능합니다. "+userNumber+"은 올바르지 않습니다.");
		}
		
		System.out.println(userNumber+"를 포함해서 로또번호들을 추출하겠습니다.");
		
		
		while(numberSet.size() < 7) {
			int number = random.nextInt(46)+1;
			numberSet.add(number);
		}
		System.out.println(numberSet.toString());
	}
	
}
