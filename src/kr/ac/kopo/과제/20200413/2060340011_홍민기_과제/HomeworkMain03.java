package kr.ac.kopo.day04.homework;

import java.util.Scanner;

/*
 * 2060340011 홍민기
 * 
 * 3. 다음의 결과를 보이는 코드를 작성하시오
 * 1번째 정수 : 10
 * 2번째 정수 : 5
 * 10보다 큰수가 와야합니다
 * 2번째 정수 : 12
 * 3번째 정수 : 36
 * 4번째 정수 : 6
 * 10, 12, 36보다 큰수가 와야합니다
 * 4번째 정수 : 22
 * 10, 12, 36보다 큰수가 와야합니다
 * 4번째 정수 : 40
 * 5번째 정수 : 67
 *
 * < PRINT >
 * 10 12 36 40 67
 *
 * < REVERSE >
 * 76 4 63 21 1 
 * 
 */
public class HomeworkMain03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		int[] rev = new int[5]; // reverse를 담을 배열 선언
		
		int index =0;
		// arr에는 오름차순으로 들어가야 하므로 입력되는 수와 비교하는 값은 입력하기 전 제일 마지막 수
		
		while(index<5) {
			System.out.print(index+1 + "번째 정수 : ");
			arr[index]=sc.nextInt();
			if(index>=1 && arr[index-1]>=arr[index]) { // 현재 입력된 수가 이전 수보다 작으면 다음과 같은 반복문 실행
				for(int i=0;i<index;i++) { // 현재 입력된 인덱스보다 작은 모든값들 출력
					if(i<index-1) {
						System.out.print(arr[i]+", ");
					}
					else {
						System.out.println(arr[i]+"보다 큰수가 와야합니다.");
					}
				}

			}
			else { // 오름차순으로 들어왔다면 index 증가
				index++;
			}
		}
		System.out.println();
		
		System.out.println("< PRINT >");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		// arr에 있는 값들을 참조하여 rev에 값을 넣습니다. arr의 마지막 값부터 참조를 하므로
		int j=0; // rev을 참조할 인덱스를 선언합니다.
		for(int i=arr.length-1;i>=0;i--,j++) {
			while(arr[i]!=0) { // arr의 값을 참조하여 rev에 값을 거꾸로 넣는 반복문입니다.
				
				/* 
				 
				 ex) arr[4] = 123, rev[0] = 321
				
				 arr[4] | arr[4]%10 | rev[0]*10 + arr%10 | rev[0] | arr[4]/10
				        |           |                    |        |
				  123   |     3     |     0*10  +   3    |    3	  |    12
				   12   |     2     |     3*10  +   2    |   32	  |     1
				    1   |     1     |    32*10  +   1    |  321	  |     0 
				
				--------------------------------------------------------------
			
				 ex) arr[4] = 200, rev[0] = 2
				
				 arr[4] | arr[4]%10 | rev[0]*10 + arr%10 | rev[0] | arr[4]/10
				        |           |                    |        |
				  200   |     0     |     0*10  +   0    |    0	  |    20
				   20   |     0     |     0*10  +   0    |    0	  |     2
				    2   |     2     |     0*10  +   2    |    2	  |     0 
				
				*/
				rev[j]= rev[j]*10 + arr[i]%10; // 
				arr[i]/=10;
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("< REVERSE >");
		for(int i=0;i<rev.length;i++) {
			System.out.print(rev[i]+" ");
		}
	}

}
