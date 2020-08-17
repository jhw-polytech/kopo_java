package day0410;

import java.util.Scanner;

//정수 3개를 입력받아 큰수에서 작은수 순으로 출력하는 코드를 작성하시오.ㅣ
//정수3개를 입력하세요:
//또는  000
//첫번째 청수 입력:
//두번째 정수 입력:
//세번째 정수 입력:
//000
// 1.abc입력--> 비교 abc or if조건,for반복 
// abc 비교 시 경우의 수 3!=6가지 

public class practice1 {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
			
		System.out.println("첫번째 정수를 입력하세요 :");
			int a = sc.nextInt();
			sc.nextLine();
			
		System.out.println("두번째 정수를 입력하세요 :");
			int b = sc.nextInt();
			sc.nextLine();
		
		System.out.println("세번째 정수를 입력하세요 :");	
			int c = sc.nextInt();
			sc.nextLine();
			
	     if(a>=b && b>=c)                                  //a가 b보다 크거나 같다 and b가 c보다 크거나 같다  
	     System.out.printf("%d %d %d",a,b,c);         // 정수 a,b,c 출력
	     else if(a>=c && c>=b)
	     System.out.printf("%d %d %d",a,c,b);    
	     else if(b>=a && a>=c)
		     System.out.printf("%d %d %d",b,a,c);
	     else if(b>=c && c>=a)
		     System.out.printf("%d %d %d",b,c,a);
	     else if(c>=a && a>=b)
	     System.out.printf("%d %d %d",c,a,b);
	     else if(c>=b && b>=a)
		     System.out.printf("%d %d %d",c,b,a);
	 
	}
}

			    
//else if(a==b && b==c)
//   System.out.printf("%d %d %d",a , b, c);        //같은 숫자 출력
			    
			
			
			  		
			
//		if (a>b) {
//        compare(a, b, c);
//		}else {
//			compare(b,c,a);
//	   for (int i=0; i<1; i++) 
//		   System.out.println(a+" "+b+" "+c);
//		   System.out.printf("%d", (a>b? a:b)<c? c: (a>b? a:b), );
		   
		   
//		   int max = (a< b ? a: b);
//		   System.out.println("MAX : " + max+ " ");
		   
//		   int max = (b< c ? b: c);
//		   System.out.println("MAX : " + max);
		   
//			System.out.printf("%d")
//		System.out.printf("%d", (a>b? b:a)<c? c: (a>b? b:a));
			
//	   private static void compare(int a, int b, int c) {
//		   if (a<b) {
//			   if (b<c)
//				   System.out.print("a,b,c");
//			   else
//				   System.out.print("a,c,b");
//		   }
//		   else {
//			   if(b<a)
//				   System.out.print("c,b,a");
//			   else
//				   System.out.print("c,a,b");
//				   
//			   
//		   }
//	   }
//		    
////		System.out.println("첫번째 수를 입력하세요: ");
//		    int num1= sc.nextInt()
//	        int num2= sc.nextInt();
//	        System.out.println("두번째 수를 입력하세요: ");
//		    int num3= sc.nextInt();
//		    System.out.println("세번째 수를 입력하세요: ");
		
	
//		System.out.println("%d,(a,b,c));
//		sc.close();
 //  }  
 //}

//  }
		