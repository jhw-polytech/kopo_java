package day0410;

//구구단을 출력하세요
//***2단***
//2*1=2
//...
//2*9=18
//***3단***
public class practice7 {
	public static void main(String[] args) {
		
		System.out.println("2-9단을 입력");
		
		int i;    // 변수와 곱해 줄 변수를 저장 
		int j; 
		
		for(i=2, j=1; i<=9; i++) {       //반복문을 사용해 2-9단까지 
			System.out.println("\n*** "+i+"단  ***\n");   //*** i단 ***
			
			for(j=1; j<=9; j++) {                         
				System.out.printf("%d * %d = %d \n",i,j,i*j); 	  // 결과 출력 
			}
		}
	}

}

