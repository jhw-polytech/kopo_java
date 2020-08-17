package Assignment03;

import java.util.Scanner;

public class P02 {
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		int num[] =new int[5];
		
		
		for (int i=0; i<num.length;i++) {
			System.out.printf("%d's 정수:",i+1);
			num[i]=sc.nextInt();
			
				if(num[i]%2==0) {//짝수만 출력하기위해 2로 나눠서 나머지가 0인 값을 저장함
					sc.nextLine();
			}
			else if(num[i]%2!=0){// 짝수가 아니라면 i--로 이전 인덱스값을 다시 입력 받도록함
				i--;
			}
			
		}
		System.out.println("5개의 짝수 출력");
		for(int i=0; i<num.length; i++) {
			System.out.printf("%d\t", num[i]);
		}
		
	}
}
