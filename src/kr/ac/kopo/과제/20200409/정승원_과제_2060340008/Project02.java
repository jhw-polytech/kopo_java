package kr.ac.kopo.day02.project;

import java.util.Scanner;
/**
 * 
 * @author tess
 * 3661초가 몇 시간 몇 분 몇 초인지 환산해서 출력하는 클래스 
 */
public class Project02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 입력을 받는다. 
		System.out.print("초를 입력하세요 : ");
		int input = sc.nextInt();
		
		String hours = String.valueOf((input/60)/60)+"시간";
		String minutes = String.valueOf((input/60)%60)+"분";
		String seconds = String.valueOf(input%60)+"초";
		
		String[] times = {hours, minutes, seconds}; // 변환한 수를 담고있는 배열 
		for (String time : times) { // 순환하면서, 0이 아닌 경우만 출력한다. 
			if (time.charAt(0) != '0') {
				System.out.print(time+" ");
			}
		}
		
	}
}
