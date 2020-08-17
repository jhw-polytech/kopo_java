package Assignment02;

/*
	윤후씨 우리의 과제는요...
	2 * 1 = 2	3 * 1 = 3	4 * 1 = 4
	2 * 2 = 4	3 * 2 = 6	4 * 2 = 8
	...

	5 * 1 = 5	6 * 1 = 6	7 * 1 = 7
	...

	8 * 1 = 8	9 * 1 = 9
	8 * 2 = 16	9 * 2 = 18
	...

	이렇게 출력이 되어야 합니다. 그런데 지금 코드는 이결과로 안나올 거 같네요...
	다시한번 생각해주세요 ^^
*/

public class P9 {
	public static void main(String[] args) {
		
		int cnt=0;
		
		for (int i=2; i<=8; i++) {
			
			for (int j=1; j<=9; j++) {
				
				if(cnt<=3) {
					System.out.printf("%d * %d= %d ", i,j,i*j);
					cnt ++;
				}
				
				if(cnt==3) {
					System.out.println();
					cnt=0;
				}
				
				
			}
		}
	}
}

//이전 문제와같이 cnt변수를 선언하고 3번 이상 출력하면 다시 초기화 하는 방식으로 구구단을 3개씩 출력함.