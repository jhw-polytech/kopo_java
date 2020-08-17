package exam0410;

public class no09 {
	
	public static void main(String[] args) {
		// 단 수 출력하는 부분. 
		for (int dan = 2; dan <= 9; dan++) {
			
			// 1 ~ 9 곱하는 부분
			for (int i = 1; i <= 9; i++) {
				
				if (dan <= 5) {
					// 3개의 단이 출력되도록 하는 부분	
					for (int j = 0; j <= 2; j++) { 
						
						//루프를 돌면서 2단으로 시작하여 돌 때마다 2, 5, 8단이 된다.
						//8단인 경우 10단까지 출력되므로 
						//8단보다 작으면서 j = 2 아닌 경우는 이어서 나올수 있도록 개행하지 않는다.
					
						if ((j != 2) && (dan < 8)) {
							System.out.printf("%d * %d = %2d ", dan + j, i, (dan + j) * i);
						} 
						//8단보다 작으면서 j = 2인 경우는 개행한다.
						else if ((j == 2) && (dan < 8)) {
							System.out.printf("%d * %d = %2d\n", dan + j, i, (dan + j) * i);
						} 
					}
				} else {
					//8단은 따로 출력 (근데 앞에 왜 한칸씩 띄어쓰기가되는지 이해가 잘 안되네요..-0-)
					System.out.printf("%d * %d = %2d\n ", dan, i, dan * i);
					
				}
			}
			// 3개 단씩 출력되므로 기존보다 2개 단을 더해준다.
			dan += 2;
		}
	}
}
