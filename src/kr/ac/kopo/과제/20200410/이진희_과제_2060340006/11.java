package day0410;
//
//
//
//
//
//
public class practice11 {
	public static void main(String[] args) {
	for(int i=1; i<=5; i++) {           //행 1-5 +1씩 증가되도록 입력 
		 for(int j=9; j>=i; j--) {      //열 9 -1씩 줄어들도록 입력 단, i행 까지 
        
  
           if(i+j>10)                   //i+j가 10 이상인 경우(2345,9)(345,8)(45,7)(5,6)
              System.out.print("-");     // - 출력  , 왼쪽에서 부터 오른쪽으로 출력 
           else
              System.out.print("*");      //이외 * 출력 
           
        }
        
        System.out.println(); 
        
     }
          
  }
}

