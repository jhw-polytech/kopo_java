package prac;

import java.util.*;

public class prac_homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
	
	int[] iptarr= new int[5];
		Scanner sc = new Scanner(System.in);

		
		for (int i=0 ; i<5 ; i++ ) {
			/*
				20~21줄라인은 우리는 안배웠지만 do~while 문으로 치환하실 수 있습니다  ^^
			*/
			int num = 1;
			while(num%2 !=0) {
				System.out.printf("%d's num : ",i+1);
				num  = sc.nextInt();
				sc.nextLine();
			}
			iptarr[i] =num;
		}
		
		System.out.println("< 5개의 정수 출력 >");
		for(int j=0 ; j < iptarr.length ; j++) {
			System.out.printf("%d\t",iptarr[j]);
		}
	
	
	
	
	
	
	}
}