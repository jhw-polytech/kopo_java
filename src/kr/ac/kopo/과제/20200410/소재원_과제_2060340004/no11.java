package exam0410;

public class no11 {

	public static void main(String[] args) {

		// 하다가 애먹었네요;; 이게 맞는진 잘 모르겠습니다만.. 어떻게든 풀어보았습니다.
		// 이렇게 푸는게 아니라면.. 코멘트 주세요..(__)
		// i = 행의 개수 1부터 5행까지
		
		for (int i = 1; i <= 5; i++) {
			
			// j는 열의 개념, 1행인 경우 1-9열까지 별을 모두 출력
			if (i == 1) {
				
				for(int j = 1; j < 10; j++) {
					System.out.print("*");
				}
			}
			
			// 2행부터는 -가 들어가야 함
			else {

				// -는 i-1 개씩 늘어나는 구조. 
				for (int j = 1; j < i; j++) {
					System.out.print("-");
				}
				
				// -를 찍은 후, i번째 열부터 별의 개수를 한개 씩 줄여나감.
				
				for (int j = i; j <= 10-i; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}