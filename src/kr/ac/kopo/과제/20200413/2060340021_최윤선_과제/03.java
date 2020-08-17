package prac;

import java.util.*;

public class prac_homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
	
	int[] iptarr= new int[5];
		int num=0;

		Scanner sc = new Scanner(System.in);
		System.out.printf("%d번째 정수 : ",1);
		iptarr[0]  = sc.nextInt();
		sc.nextLine();
		//System.out.printf("iptarr[%d] : %d\n",0,iptarr[0]);
		
		
		//3중 루프 아닌 방법 생각해보기
		for (int i=1 ; i<5 ; i++) {
			int cnt=0;
			while(num<=iptarr[i-1]) {
				
				if (cnt != 0 ) {
					for(int k=0; k<i ; k++) {
						System.out.printf("%d\t",iptarr[k]);
					}
					System.out.println("보다 큰 수가 와야합니다.");
				}
				System.out.printf("%d번째 정수 : ",i+1);
				num  = sc.nextInt();
				sc.nextLine();
				cnt++;
			}
			iptarr[i]=num;
			//System.out.printf("iptarr[%d] : %d\n",i,iptarr[i]);
		}
		
		
		
		/// 이후는 단순 출력

		System.out.println();
		System.out.println("< P R I N T >");
		for(int j=0 ; j < 5 ; j++) {
			System.out.printf("%d\t",iptarr[j]);
		}
		System.out.println();
		
		System.out.println("< R E V E R S E >");
		for(int j=4 ; j >= 0 ; j--) {
			int a = iptarr[j]/10;
			int b = iptarr[j]%10;
			System.out.printf("%d\t",b*10 +a);
		}
	
	
	
	
	
	
	}
}