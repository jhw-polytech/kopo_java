package kr.ac.jinwoo.day04.homework;

public class Exam05_1 {

	public static void main(String[] args) {
		
		int numArr[] = new int[99];
		
		for(int i = 0; i < numArr.length; i++)
			numArr[i] = i+2;
				
		System.out.println("< 2 ~ 100 사이의 소수 출력 >");
		for(int i = 0; i < 99; i++) {
			
			/*
				제가 설명한 알고리즘에서는 자연스럽게 29~41라인의 코드를 같게됩니다.
				그래서 굳이 필요없어요...
				다시한번 알고리즘 생각하셔서 작성해주세요
				
				==> 클라이언트의 요구를 무조건 맞춰야한다는 편견때문에 오히려 이상한 알고리즘이 되었던 것 같습니다.
				         다음부터는 더 꼼꼼히 확인하도록 하겠습니다. 피드백 진심으로 감사드립니다. 
			*/
			
			if(numArr[i] != 0) {
				for(int j = i+1; j < 99; j++) {
					if(numArr[j] % numArr[i] == 0)
						numArr[j] = 0;
				}
			}
		}
		
		for(int item : numArr) {
			if(item != 0)
				System.out.printf("%d ", item);
		}
	}
}
