package Assignment02;

public class P12 {
	public static void main(String[] args) {
		
		
		for(int i = 1; i <= 9; i++) {
			if(i<=5) {
			for(int j=1; j<=9; j++) {
				if(i < j && i+j<=9) {
					System.out.print('_');
				}
				else {
					System.out.print('*');
				}
				
				
			}
			
			System.out.println();
			}
			else if(i>=6){ 
			for(int j=9; j>=1; j--) {
				if(j<i && i+j>=11) {
					System.out.print('_');
				}
				else {
					System.out.print('*');
				}
			}
			System.out.println();
				
			}
		}
	}
}
//앞의 문제와 같은 방식으로 i+j가 <=9가 넘으면 *을 하나 더 추가하여 출력하도록 설정함.
