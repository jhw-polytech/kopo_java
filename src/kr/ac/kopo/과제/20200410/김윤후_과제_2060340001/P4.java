package Assignment02;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("100 사이의 정수 입력");
		int one =sc.nextInt();
		sc.nextLine();
		
		System.out.println("10 사이의 정수 입력");
		int two =sc.nextInt();
		sc.nextLine();
		
		for (int i=0; i<=one;i++) {
			
			if(i%two!=0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println("");
		System.out.println("");
		
		int cnt=0;
		
		for(int i=1; i<=one; i++) {
			if(i%two!=0) {
				System.out.print(i+" ");	
				cnt++;
			}
			if(cnt==two) {
				
				System.out.println();	
				cnt=0;	
				}
				
			}

						
		
		
	}
}
//cnt라는 변수를 선언하여 two 변수만큼 값이 나오면 cnt를 초기화하여 줄을 바꿔줌
