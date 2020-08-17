package test0414;

import java.util.Arrays;

/*
 다음의 결과를 보이는 코드를 작성하시오
 
 1번째 정수 : 10 
 2번째 정수 : 5 
  10보다 큰수가 와야합니다 
 2번째 정수 : 12 
 3번째 정수 : 36 
 4번째 정수 : 6
   10, 12, 36보다 큰수가 와야합니다 
 4번째 정수 : 22
   10, 12, 36보다 큰수가 와야합니다
 4번째 정수 : 40 
 5번째 정수 : 67
 
 < PRINT >    
 10  12  36  40  67
 
 < REVERSE >
  76  4  63  21  1 
      
 */

// 고민할 점 : "~ 보다 큰수가 와야합니다" 를 해결하는 것
import java.util.Scanner;

public class exam03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요");
		
		int[] ar = new int[10]; // 처음에 입력받은 정수를 배열에 할당 , 여유롭게 10개를 할당했습니다
		int[] br = new int[10];
		int[] cr = new int[10];
		int[] dr = new int[5];
		
		/*
			여기서 한번엔 10개를 입력받는 것이이 아니라... 58라인의 for문을 돌면서 입력을 받고, 크기비교를 하는 것이 더 올바를거 같습니다
			다시한번 생각해주시겠어요????
		*/
		
		for(int i = 0;i<ar.length;i++) {
			
			ar[i] = sc.nextInt();
			sc.nextLine();					
			
		}
		
		System.out.println("1번째 정수 :" + ar[0]);
		
		int cnt = 0;
		int cmt = 1;
		for(int i = 1;i<ar.length;i++) {
			
			for(int j = 1;j<=i;j++) {   // 새로나온 배열과 그전에 있던 배열들의 대소비교를 모두합니다
				
				cnt+=(ar[i]>ar[j-1] ? 1 : 0);    // +1 번째 정수가 되기 위해선 전에 있던 모든 배열 보다 커야합니다, 62행
				cr[i-1] = cnt;   // cnt를 cr이라는 배열에 할당합니다
			}
			
			if(cr[i-1] == i) {   // +1 번째 정수가 되는 조건을 만족했습니다 
				
				++cmt;
				System.out.println(cmt + "번째 정수 :" + ar[i]);
			}else if(cr[i-1]<i) {   // 그렇지 않은 경우에는 카운트 하지 않습니다
				
			    cmt+=0;
			    System.out.println(cmt + "번째 정수 :" + ar[i]);
			    
			    for(int k = 1;k<=i;k++) {
			    	
			    	if(ar[i]<ar[k-1]) {   // 위에서 언급한 고민할점 : ~ 보다 큰수가 와야합니다 해결법
			    		
			    		br[k-1] = ar[k-1]; 
			    	
			    	}else if(ar[i]>ar[k-1]) {
			    		
			    		dr[k-1] = ar[i];
			    	}
			    	
			    }
			    
			    System.out.println(Arrays.toString(br) + "보다 큰수가 와야합니다");
			    
			}
			    
			
			
			cnt=0; // cnt값을  초기화 시켜줍니다
			
			if(cmt == 5) { //종료 조건
				
				break;
			}
			
		}
		
		
		System.out.println("<Print>");
		System.out.println(Arrays.toString(dr));
		
}			    
			    
			
	
			
			
			
			
			
			
			
			
			
			
			
					
					
					
		
		
		
		
		
}


