package Assignment03;

import java.util.Scanner;

/*
	윤후씨 과제하느라 고생하셨어요.
	사실 우리는 1이상의 수를 입력받기 때문에 이 코드가 상관없다 하지만 만일 0을 입력하는 경웨에는 짝수 출력하는 if문에서 문제가 생길수도 있을 거 같아요
	이럴때는 0이 아닌값을 출력하기 보다는 10개중에 몇개의 짝수가 저장되었는지를 기억하는게 더 효율적인거 같습니다.
	과제하느라 고생하셨습니다
*/

public class P01 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int num [] = new int[10];
		int even[] =new int[10];
		int odd[] =new int[10];
		int esum=0;
		int osum=0;
		
		System.out.println("10개의 정수를 입력하시오");
		for(int i=0; i<num.length; i++) {
			num[i]=sc.nextInt();
			sc.nextLine();
			if(num[i]%2==0) {//짝수로 만들기 위해 인덱스값을 2로 나눠 나머지가 0이면 짝수로 취급
				even[i]= num[i];//짝수 배열에 인덱스값 삽입
				esum+=num[i];//짝수의 누적합을 구하기 위해 인덱스값을 더함
			}
			else {
				odd[i]=num[i];//홀수도 짝수와 마찬가지
				osum+=num[i];
			}
		}
		System.out.println(num[9]);
		for(int i=0; i<num.length; i++) {
			System.out.printf("%d's num : %d\n",i+1,num[i]);
		}
		System.out.println("짝수");
		for(int i=0; i<even.length; i++) {
			if(even[i]!=0) {
			System.out.printf("%d ",even[i]);
			}	
		}
		System.out.println();
		System.out.println("짝수의 총합 :"+esum);
		System.out.println();
		
		System.out.println("홀수");
		for(int i=0; i<odd.length; i++) {
			if(odd[i]!=0) {
			System.out.printf("%d ",odd[i]);
		
			}
		}
		System.out.println();
		System.out.println("홀수의 총합 :"+osum);
			
	}
}

