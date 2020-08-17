package exam0427;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Lotto {
	
	Lotto() throws LottoNumberException {
		System.out.println("좋아하는 로또 번호를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		int selectNum = sc.nextInt();
		if ((selectNum < 0) || (selectNum > 45)) {
			while((selectNum < 0) || (selectNum > 45)) {
				throw new LottoNumberException("1 ~ 45 사이만 가능합니다." + selectNum +"는 올바르지 않습니다.");
			}
		}
		sc.close();
		System.out.println(selectNum + "을 포함하여 로또 번호를 추출하겠습니다.");
		lottoNumGenerator(selectNum);
	}
	
	public int[] lottoNumGenerator(int selectNum) {
		
		Random r = new Random();
		int[] lottoArr = new int[6];
		
		lottoArr[0] = selectNum;
		for (int i = 1; i < lottoArr.length; i++) {
			int tempValue = r.nextInt(45) + 1;
			
			for (int j = i; j >= 0; j--) {
				if (tempValue == lottoArr[j]) {
					tempValue = r.nextInt(45) + 1;
					j = i;
				}
			}
			lottoArr[i] = tempValue;
		}

		return lottoNumSorting(lottoArr);
		
	}
	
	public int[] lottoNumSorting(int[] lottoArr) {

		for (int i = 0; i < lottoArr.length; i++) {
			int minIdx = i;
			
			for (int j = i + 1; j < lottoArr.length; j++) {
				minIdx = lottoArr[minIdx] > lottoArr[j] ? j : minIdx;
			}
			
			int tempValue = lottoArr[i];
			lottoArr[i] = lottoArr[minIdx];
			lottoArr[minIdx] = tempValue;
		}
		System.out.println(Arrays.toString(lottoArr));
		return lottoArr;
	}
	
}
