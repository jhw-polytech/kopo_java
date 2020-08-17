package kr.ac.kopo.day2.assignment;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// 2. 초를 입력받으면 몇 시간 몇 분 몇 초인지 환산해서 출력 (0인 단위는 출력X)
		
		//초를 입력받기
		System.out.println("초를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt(); //초를 입력받기
		sc.nextLine();
		
		//몇 시간 몇 분 몇 초인지 구하기
		String sec = input%60 + "초";
		String min = (input/60)%60 + "분";   //입력된 초를 분으로 환산한 뒤 시간을 구하고 남은 게 몇 분인지
		String hour = (input/60)/60 + "시간";  //입력된 초를 분으로 환산한 뒤 60(1시간)씩 묶으면 몫이 얼마 나오는지

		//0인 단위는 출력하지 않도록 공백 대입
		if (input%60 == 0){
			sec = "";
		}
		if ((input/60)%60 == 0){
			min = "";
		}
		if ((input/60)/60 == 0){
			hour = "";
		}
		
		//출력
		System.out.println(hour + " " + min + " " + sec); 
		
	}
}
