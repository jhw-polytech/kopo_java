package kr.ac.jinwoo.day04.homework;

/*
    2 ~ 100 사이의 소수를 출력하는 코드를 작성

    < 2 ~ 100 사이의 소수 출력 >
    2 3 5 7 11 13 17 ... 97
 */

public class Exam05 {

	public static void main(String[] args) {
		
		int numArr[] = new int[99];
		
		for(int i = 0; i < 99; i++)
			numArr[i] = i+2;
				
		System.out.println("< 2 ~ 100 사이의 소수 출력 >");
		
		boolean bPrime = false;
		int cnt = 0;
		for(int i = 0; i < 99; i++) {

			/*
				제가 설명한 알고리즘에서는 자연스럽게 29~41라인의 코드를 같게됩니다.
				그래서 굳이 필요없어요...
				다시한번 알고리즘 생각하셔서 작성해주세요
			*/

			for(int j = 1; j <= numArr[i]; j++) {
				
				if(numArr[i] % j == 0) cnt++;
				
				if(j == numArr[i] && cnt == 2) {
					bPrime = true;
					cnt = 0;
				}
				
				if(cnt > 2) {	// not Prime
					cnt = 0;
					break;
				}
			}
			if(bPrime) {
				for(int j = i+1; j < 99; j++) {
					if(numArr[j] % numArr[i] == 0)
						numArr[j] = 0;
				}
			}
			else 
				numArr[i] = 0;
			
			bPrime = false;
			cnt = 0;
		}
		
		for(int item : numArr) {
			if(item != 0)
				System.out.printf("%d ", item);
		}
	}
}
