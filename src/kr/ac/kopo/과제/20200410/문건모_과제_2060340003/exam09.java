package test0411;

/*
 * 구구단을 한라인에 3단씩 출력하는 코드를 작성하세요. 이때 9단은 나오면 안됩니다.
 * 반복문은 최대 3개만 사용합니다.
 * 
 * 2*1=2 3*1=3 4*1=4
 * 2*2=2 3*2=6 4*2=8
 * ...
 * 5*1=5 6     7
 * ...
 * 8     9 
 */


public class exam09 {
	
	public static void main(String[] args) {
		
		for(int dan = 2; dan<=9 ; dan+=3) {
			
			for(int i = 1; i<=9 ;i++) {
				
				if(dan<8) {
				
					System.out.printf("%d*%d=%d %d*%d=%d %d*%d=%d\n", dan,i,dan*i, dan+1,i,(dan+1)*i, dan+2,i,(dan+2)*i);
				
				}else {
					
					System.out.printf("%d*%d=%d\n", dan,i,dan*i );
				}
				
				
			}
			
			
		}
		
	}

}
