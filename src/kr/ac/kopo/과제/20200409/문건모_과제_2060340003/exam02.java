package test0410;

/*
 3661초가 몇 시간 몇 분 몇 초인지 환산해서 출력하시오
  예시) 결과출력 : 1시간 1분 1초 
 */
import java.util.Scanner;

public class exam02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("초를 입력하세요");
		int second = sc.nextInt();
		sc.nextLine();
		
		int minutes_a = second/60;
		int seconds = second%60;
		
		int time = minutes_a/60;
		int minutes = minutes_a%60;
		
		if(second<3600) {
		 System.out.println( minutes + "분" + seconds + "초");
		
		} else if(minutes == 0 && seconds == 0){
			System.out.println(time + "시간");
			
		} else if(minutes == 0){
		 System.out.println(time + "시간"+ seconds + "초");
		 
		} else if(seconds == 0) {
		 System.out.println(time + "시간" + minutes + "분");
		 
		} else {
			System.out.println(time + "시" + minutes + "분" + seconds + "초");
		}

	}	
}
