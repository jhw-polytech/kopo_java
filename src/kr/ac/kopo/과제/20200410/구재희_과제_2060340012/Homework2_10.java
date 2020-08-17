package jaeheehomework;

public class Homework2_10 {
	public static void main(String[] args) {
		System.out.println("10번\n");
		/*  출력
		    *****
		 	-****
		 	--***
		 	---**
		 	----*
		 	---**
		 	--***
		 	-****
		 	*****
		 */
		
		//반복문 2개, 조건문 2개
		// 결과물이 9행, 5열 이므로 반복문을 통해 틀을 만듦
		for(int i = 1; i <= 9; i++) { //반복문1
			for(int j = 1; j <= 5; j++) { //반목문2
			
				// 5행까지는 -가 증가하고, 이후에는 감소하므로 조건문을 통해 두 경우를 나눔
				if(i <= 5) { //조건문1
					
					//i가 증가함에따라 -의 개수가 0개부터 한개씩 증가함
					if(i > j) { //조건문2
						System.out.print("-");
					} else {
						System.out.print("*");
					}
				} else {
					//행과 열의 합이 10보다 작으면 -
					if(i + j <10) { //조건문3
						System.out.print("-");
					} else {
						System.out.print("*");
					}
				}
			}
			System.out.print("\n");
		}
	}

}

