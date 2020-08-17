package Assignment02;

public class P11 {
	public static void main(String[] args) {
		
		for (int i=1; i<=5; i++) {
			for(int j=1; j<=9; j++) {
				if(i>j) {				
					System.out.print('_');
				}
				else if (i<=j && i+j<=10) {
					System.out.print('*');
				}
				
			}
			System.out.println();
		}
	}
}

//앞의 문제와 같지만 i+j<=10 즉 i와 j의 합이 10넘지 않아야만 *을 출력할 수 있게하여 * 개수를 조절함.