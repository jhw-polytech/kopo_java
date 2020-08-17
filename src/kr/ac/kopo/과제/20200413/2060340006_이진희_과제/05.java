
public class ar5 {
	
	public static void main (String[]args) {
/*
 * 2-100 사이의 소수를 출력하는 코드를 작성
 * <2-100사이의 소수출력>
 * 2 3 5 7 11 13 17 ...97
 * 교수님의 알고리즘대로 해석해서 코드만들기!
 */
		int num[]= new int[100];      //100개짜리 배열 선언
		
		System.out.println("< 2~100사이의 소수 출력>");
		for(int i=2; i<=100; i++) {    //num배열에 2-100 숫자 저장
			num[i-2]=i;                //배열 값을 i로 설정 ,2부터 시작하므로i-2
		
		for(int j=2; j<=100; j++) {     //j는 나눌수, 2-100사이의 숫자중 소수를 골라내기 위한 반복문
			
			if(i%j==0) {       //나눠서 0이고 그게 자기자신이 아니면 출력x 
				if(j!=i) {
				
			   break;
				}
				else {                //이외는 출력 
					System.out.print(i+" ");  // 옆으로 띄워쓰기 위해 " "
					
				}
			}
		}
		}
	}
}
