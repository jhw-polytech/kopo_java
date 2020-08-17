package Assignment03;

import java.util.Scanner;

public class P03 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int [] num = new int[6];
		num [0]=0;
		
		//num에 입력을 받음 
		
		for(int i=1; i<num.length;i++) {
			System.out.printf("%d번째 정수 :",i);
			num[i]=sc.nextInt();
			
			if(num[i-1]<num[i]) { //다음 인덱스 값이 이전 인덱스 값보다 크다면 정상이니 다음줄로 넘어감
				sc.nextLine();	
				
			}
			else {
				for(int j=1; j<i;j++) {// 이전 인덱스값이 더 크다면 에러기 때문에 이전 인덱스에 새로 입력을 받아야함
					System.out.printf("%d",num[j]);
					System.out.println("보다 큰 수가 와야합니다");
				}
				i--;// i를 줄여 이전 인덱스로 돌아가게함
			}
		}
		
		System.out.println("Print");
		for(int i=1; i<num.length; i++) {
			System.out.printf("%d\t",num[i]);
		}

		/*
			Reverse 출력하시면서 35가 53으로 출력이 되어야하는데 그냥 출력이 되는거 같네요... 확인한번 해주세요
		*/
		System.out.println();
		System.out.println("Reverse");
		for(int i = 5; i>=1; i--) {//인덱스 출력을 반대로하기위해 i가 큰수부터 감소하는 loop
			System.out.printf("%d\t", num[i]);
		}
		
	}
}
