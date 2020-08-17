package Assignment03;

import java.util.Scanner;

public class P04 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int[] num= new int[30];
		int in;
		int cnt=0;
		int loc=0;
		
		
		System.out.println("1~100사이의 정수를 입력하시오 :");
		in=sc.nextInt();
		sc.nextLine();
		//1~100사이의 정수를 입력받을 수 있게함
		
		for(int i=1;i<=in;i++) {//입력받은 정수값 보다 i값이 작을때만 루프
			if(in%i==0) {// 입력받은 값을 i로 나눠 나머지가 0이면 약수
				cnt+=1;// 약수의 개수를 측정하기위해 만약 약수면 cnt값을 1개씩 증가
				num[loc++]=i;//loc를 하나씩증가시키며 i값을 저장
				
			}
		}
		System.out.printf("%d 의 약수의 개수: %d개",in,cnt);
		System.out.println();
//		System.out.println(num[0]);
	//	System.out.println(num[3]);
		for (int j=0; j<cnt;j++) {//약수의 개수만큼만 배열을 출력하면 되기때문에 cnt까지 루프
			System.out.printf("%d\t",num[j]); 
		}
	}
}
