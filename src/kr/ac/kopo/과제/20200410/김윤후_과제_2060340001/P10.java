package Assignment02;

public class P10 {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			if(i<=5) {
			for(int j=1; j<=5; j++) {
				if(j < i) {
					System.out.print('_');
				}
				else {
					System.out.print('*');
				}
				
				
			}
			
			System.out.println();
			}
			else if(i>=6){ 
			for(int j=10; j>=6; j--) {
				if(i<j) {
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

//2중 for문을 통해 j가 더 크면 _를 출력하고 i가 더크면 *을 출력함.
//if문을 사용하여 _가 줄어들 수 있도록 j값을 점점 줄어들도록 설정.