package chap1;

import java.util.Scanner;

public class pr4 {
	
		public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("1~100 사이의 정수를 입력 : ");
		int num= sc.nextInt(); 
		
		System.out.println("2~10사이의 정수를 입력 : ");
		int num2= sc.nextInt(); 
		
		for(int i=1;i<=num; i++) { // 1부터 num까지 반복 실행    
			//1부터 num까지 반복 실행    
			if(i%num2==0) //      i를 num2로 나눈 나머지가 0일때 제외 돼야 함, (num2의 배수가 제외 돼야 하기때문)
			System.out.printf(""); 
			else 
				System.out.printf("%d ",i); //그 밖의 정수는 출력 
		}
		System.out.printf("\n");    //엔터
		   int count=0;               
	           for(int i=1; i<=num; i++) {         
	             count=count+1;             
	               if(i%num2==0 ) {          
	                 count=count-1;          //배수가 출력되는 부분은 공백이니 기본적으로 +가 되는 카운트에서 -1
	               
	            }
	            else {
	                  System.out.printf("%d ",i); // 그 밖의 정수는 출력 
	                 
	                 
	                  
	            }
	            if(count%num2==0)
	               System.out.println();  // 엔터 
						
		}
	}
}




//		for(int i=1; i<=num; i++) {          //num2씩 정수가 나오고 엔터가 되기 위해서 
//			if(i%(num2+2)==0)                 // 8의 배수 일때는 일정하지 않게 나온다.. 
//				System.out.printf("\n");      
//			
//			if(i%num2==0 )
//					System.out.printf("");   //공백 ,제외 
//			else
//					System.out.printf("%d ",i); // 그 밖의 정수는 출력 
//				