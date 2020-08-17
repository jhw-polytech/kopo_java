package Assignment03;

import java.util.Scanner;

public class P05 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int [] num = new int[99];
		
		
		for(int i = 0; i<99; i++) {
			num[i]=i+2;
		}
		//num의 배열공간을 99개 만들어 2~100까지의 정수를 저장
		
        for (int i = 0; i < 100; i++) {
            for (int j = i+1; j<99 ; j++ ) // j가 i+1만큼 증가하도록 설정(참고함)
            	if(num[i]!=0 && num[j]%num[i]==0){// i가 0이면 나눌 수 by zero 에러가 생기기 때문에 i= 0이 아니도록 하고, j값에서 i값의 나머지가 0인 경우만 추출
            		
            		num[j] = 0; // 소수를 제외한 수는 모두 0으로 처리
        	}
            	
        }
				
        System.out.print("< 2 ~ 100 사이의 소수 출력 >\n");
        for (int k=0 ;k<num.length;k++) {
        	if(num[k]!=0) {//num이 0인 값을 제외하고 출력
                System.out.print(num[k]+" ");
            }
        }
       }
		
	}
		


