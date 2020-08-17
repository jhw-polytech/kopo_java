package homework0410;

/*
 * 2060340017 신형재 과제 8번
 * 
 * 구구단을 3개 단씩 출력하기
 * 이때, 9 단은 출력되면 안됨
 */


public class n9 {
	public static void main(String[] args) {
		
		// 최초 구조 파악을 위해 코드 작성
		// 반복문이 기준치 초과로 공통 부분 1개의 반복문으로 통합 진행
//		int line=0;
//		for(int i = 1; i<=9; i++) {
//			for(int j = 2; j<=4; j++) {
//				System.out.printf("%d * %d = %d   ", j, i, j*i);
//				line++;
//				if(line%3==0) {
//					System.out.println("");
//				}
//			}
//		}for(int i = 1; i<=9; i++) {
//			for(int j = 5; j<=7; j++) {
//				System.out.printf("%d * %d = %d   ", j, i, j*i);
//				line++;
//				if(line%3==0) {
//					System.out.println("");
//				}
//			}
//		}for(int i = 1; i<=9; i++) {
//			for(int j = 8; j<=10; j++) {
//				if(j>=9) {
//					System.out.print("           ");
//				}else {
//				System.out.printf("%d * %d = %d   ", j, i, j*i);
//				}
//				line++;
//				if(line%3==0) {
//					System.out.println("");
//				}
//			}
//		}
		
		// 어디를 고쳐야할지 모르겠습니다.ㅠㅠ
		// for 반복문이 많은 것은 괜찮은데, 반복문을 합치니까
		// 반복되는 순서를 찾아가기가 너무 힘드네요.

		/*
			맞아요... 반복문의 중첩이 늘어가면서 정신이 없으시죠?
			수업시간에 한번 해볼테니 본인이 한 코드와 비교하시면서 봐주세요 ^^
		*/
		
		int line = 0;
		for(int i = 1; i<=9; i++) {
			for(int j = 2; j<=10; j++)
				if(j<=4) {
					System.out.printf("%d * %d = %d   ", j, i, j*i);
					line++;
					if(line%3==0) {
						System.out.println("");
					}
				}else if((j>4)&&(j<=7)) {
						System.out.printf("%d * %d = %d   ", j, i, j*i);
						line++;
						if(line%3==0) {
							System.out.println("");
						}
				}else if(j>7) {
					if((j>7)&&(j<9)) {
					System.out.printf("%d * %d = %d   ", j, i, j*i);
					} else {
					System.out.print("               ");
					}
					line++;
					if(line%3==0) {
						System.out.println("");
				}
		}
	}
}
}