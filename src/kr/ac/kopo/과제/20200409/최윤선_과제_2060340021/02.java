package prac;

import java.util.Scanner;

public class prac_homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("초를 입력하세요");
		int time = sc.nextInt();
		sc.nextLine();
		int time_save = time; //time은 계속 바뀌어서 미리 저장해둠
		
		int ho=0,mi=0,se=0;
		
		ho = time /(60*60); //시간계산
		time = time%(60*60);
		mi = time/60; //분계산
		time = time%60;
		se=time; //나머지는 초
		
		System.out.println(time_save+"초 : "+ho+"시간"+mi+"분"+se+"초");
		
	}
}