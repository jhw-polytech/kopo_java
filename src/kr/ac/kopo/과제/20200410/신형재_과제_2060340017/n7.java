package homework0410;

/*
 * 2060340017 신형재 과제 7번
 * 
 * 2~9 구구단 출력하기
 * 
 */

public class n7 {
	public static void main(String[] args) {
		System.out.println("구구단을 출력하세요");
		
		int i;
		//모든 코드 입력 후, 각 단별로 줄을 나눠주기 위한 추가 변수 입력
		// k는 0에서 시작하여 매 단 9번째 줄에서 줄 바꿈 실행
		int k = 0;
		for(i=1; i<=9; i++) {
			System.out.printf("***%d단***\n", i);
			for(int j=1; j<=9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
				k++;
				if(k%9==0) {
					System.out.print("\n");
				}
			}
		}
	}
}
