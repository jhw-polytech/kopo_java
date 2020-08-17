package prac;

import java.util.*;

public class prac_homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	int even=0; //짝수
		int add=0; //홀수
		
		int cnteven=0, cntadd=0;
		
		
		int[] iptarr= new int[10];
		int[] evenarr= new int[10];
		int [] addarr = new int[10];
		
		int evenloc=0;
		int addloc=0;
		
		
		Scanner sc = new Scanner(System.in);
		
		for (int i=0 ; i<10 ; i++) {
			System.out.printf("%d's num : ",i+1);
			int num  = sc.nextInt();
			sc.nextLine();
			
			if (num%2 ==0) {
				even += num;
				evenarr[evenloc++]=num;
				cnteven++;
			}
			else {
				add += num;
				addarr[addloc++]=num;
				cntadd++;
			}
		}
		
		System.out.println("< 짝 수 >");
		for (int i =0 ;  i<cnteven ; i++) {
			System.out.printf("%d\t",evenarr[i]);
		}
		System.out.println();
		System.out.printf("짝수의 총합 :  %d\n\n",even);
		
		System.out.println("< 홀 수 >");
		for (int i =0 ; i<cntadd ; i++) {
			System.out.printf("%d\t",addarr[i]);
		}
		System.out.println();
		System.out.printf("홀수의 총합 :  %d",add);
	
	
	
	
	}
}