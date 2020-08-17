package test0411;


/*
 * 구구단을 출력하세요
 * ***2단***
 * 2*1=2
 * ...
 * 2*9=18
 * 
 * ***3단***
 * ...
 * 9*9=81
 */
public class exam07 {
	
	public static void main(String[] args) {
		
		for(int i =2;i<=9;i++) {
			
			System.out.println("***" + i + "단***"); 
			
			for(int j=1;j<=9 ;j++) {
				
				System.out.printf("%d*%d=%d\n", i, j, i*j );
				
			}
			
		}
		
	}

}
