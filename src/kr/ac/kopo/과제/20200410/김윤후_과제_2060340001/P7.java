package Assignment02;

public class P7 {
	public static void main(String[] args) {
		
		
		for(int i=2; i<=9 ; i++) {
			System.out.printf("***%d 단***",i);
			System.out.println();
			for(int j=1; j<=9; j++) {
				System.out.printf("%d * %d = %d",i,j,i*j);
				System.out.println();
			}
			System.out.println();
		}
	}
}

//2중 for문을 사용하여 2단부터 9단까지 도출함.