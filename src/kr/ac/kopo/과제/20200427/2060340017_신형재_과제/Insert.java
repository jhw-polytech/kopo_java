package homework0427;

/*
 * 2060340017 신형재 과제 1번
 * 절차대로 코딩하다보니 불필요한 부분이 많은 것 같습니다.
 * 해당 코딩 방식을 객체지향으로 다시 구성해보겠습니다.
 * 
 */

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Insert {
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	
	int user;
	int ran;
	int[] numArr = new int[7]; 
	
	void insert(String msg) {
		System.out.println(msg);
		user = sc.nextInt();
		sc.nextLine();
		//복습 후 try ~ catch로 바꿔보겠습니다.
		if(user<0 || user>45) {
			System.out.println("LottoNumberException : 1~45 사이만 가능합니다. " +
								user + "은 올바르지 않습니다.");
			insert("좋아하는 로또 번호를 입력하세요 : ");
		}numArr[0] = user;
	}
	void randomNum() {
		System.out.println(user + "를 포함하여 로또 번호들을 추출하겠습니다. ");
		
		for(int i=1; i<=(numArr.length-1); i++) {
			ran = r.nextInt(45)+1;
			numArr[i]=ran;
		}
		System.out.println(Arrays.toString(numArr));
	}
	
	void execute() {
		insert("좋아하는 로또 번호를 입력하세요 : ");
		randomNum();
		
	}
}
