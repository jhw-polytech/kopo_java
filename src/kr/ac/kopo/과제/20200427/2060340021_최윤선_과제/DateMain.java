
/*
 * 
 * 모르는 부분 구글링하다 코드를 봤는데,
 * 한번 봐버리니 결국 거기서 거기인 코드를 짜게되었습니다..ㅠㅠ
 * 다음부터는 과제 끝나기 전에 코드는 보지않겠습니닷...ㅜ
 * 반성하며 과제 제출합니다.... 8ㅅ8
 * 
   => 코드를 봐버렸구만요~~~~~
      그래도 코드는 잘 이해되던가요?
	  일단 이해되고 짜보면 되는 거구요~~
	  주말에 다시한번 작성해보세요~!!!
 * 
 */



package homework11;

import java.util.*;

public class DateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();

		int year = 0; // 년도
		int mon = 0; // 월
		int ipt=0;


		while (ipt != 3) {
			System.out.println("선택하세요  (1. 특정년도    2. 특정월      3. 종료)");
			ipt = sc.nextInt();
			sc.nextLine();
			switch (ipt) {
			case 1:
				System.out.println("년도 입력 : ");
				year = sc.nextInt();
				cal.set(Calendar.YEAR, year); 
				for (int k = 1; k <= 12; k++) {
					cal.set(Calendar.MONTH, k);
					System.out.println(+year + "년  " + k + "월.");
					System.out.println("   일      월       화      수      목      금      토");
					cal.set(year, k - 1, 1);
					int end = cal.getActualMaximum(Calendar.DATE);
					int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

					for (int i = 1; i <= end; i++) {
						if (i == 1) {
							for (int j = 1; j < dayOfWeek; j++) {
								System.out.print("    ");
							}
						}
						if (i < 10) { 
							System.out.print(" ");
						}
						System.out.print(" " + i + " ");
						if (dayOfWeek % 7 == 0) {
							System.out.println();
						}
						dayOfWeek++;
					}
					System.out.println("\n\n");

				}
				break;
			case 2:
				System.out.println("년도 입력 : ");
				year = sc.nextInt();
				cal.set(Calendar.YEAR, year); 
				System.out.println("월 입력 : ");
				mon = sc.nextInt();
				cal.set(Calendar.MONTH, mon); 
				System.out.println(+year + "년  " + mon + "월.");
				System.out.println("   일      월       화      수      목      금      토");
				cal.set(year, mon - 1, 1);
				int end = cal.getActualMaximum(Calendar.DATE);
				int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
				for(int i=1; i<=end; i++) {
					if(i==1) {
						for(int j=1; j<dayOfWeek; j++) {
							System.out.print("    ");
						}
					}
					if(i<10) {
						System.out.print(" ");
					}
					System.out.print(" "+i+" ");
					if(dayOfWeek%7==0) { 
						System.out.println();
					}
					dayOfWeek++;
				}
				System.out.println("\n\n");
				break;
			}
		}
	}

}
