package exam0410;

public class no12 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 9; i++) {
			
			/*
			 * 어떻게 풀긴 풀었는데 다시봐도 잘모르겠어요..;
			 * 좀 억지로 푼느낌이 듭니다.
			 */
			// 11번에서 풀었던 것처럼, 5행은 모두 별을 칠한다.
			
			if (i == 5) {
				
				for(int j = 1; j <= 9; j++) {
					System.out.print("*");
				}
			}
			// 5행은 모두 칠해서, 5행 전인 경우와 5행 이후인 경우로 나누었다.
			
			if (i < 5) {
				
				// 5행 이전의 별을 찍는데, 1씩 늘어나므로 행 수까지 찍는다.
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				// -는 전체 열 수 에서 -2만큼씩 줄어든다.
				// 행이 1,2,3,4일 떄, j는 8 7 6 5가 되고, 7 5 3 1 번 찍게 된다..
				for (int j = 9-i; i < j; j--) {
					System.out.print("-");
				}
				
				//뒤의 *은 앞선 것과 똑같이 행마다 1씩 증가한다.
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				
			} 
			
			if (i > 5) {
				
				// 6행 부터는 *을 1개씩 줄어들게 하면서 찍는다.
				for (int j = i; j <= 9 ; j++) {
					System.out.print("*");
				}
				
				// -는 6행부터 1 3 5 7순으로 늘어나므로 맞춰준다.
				for (int j = 11-i; j < i; j++) {
					System.out.print("-");
				}

				// 6행 부터는 *을 1개씩 줄어들게 하면서 찍는다.(위와 동일)
				for (int j = i; j <= 9 ; j++) {
					System.out.print("*");
				}
			}
			//한줄 찍으면 개행한다.
			System.out.println();
		}
	}
}
