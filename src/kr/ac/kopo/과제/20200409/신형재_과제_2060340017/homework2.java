package homework0409;

/*
 * 2060340017 신형재 과제 2번
 * 
 * 초 입력 시 시, 분, 초 값을 계산하기 위한 코드
 */

import java.util.Scanner;
// 외부 입력을 위해 Scanner import 진행

public class homework2 {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);

	// 사용자의 초 입력을 위한 코드, int 변수 ss를 사용자 입력으로 설정
	System.out.print("초를 입력하세요 : ");
	int ss = sc.nextInt();
	
	// 시간의 경우 입력된 초를 3600으로 나눴을 때 몫에 해당하는 숫자가 시간
	int hr = ss/3600;
	// 분의 경우 입력된 초를 3600으로 나누고 그 나머지를 60으로 나눴을 때 시간
	int mn = ss%3600/60;
	// 초의 경우 입력된 초를 3600으로 나누고 그 나머지를 60으로 나눴을 때 나머지가 의미
	int scd = ss%3600%60;
	
	// 결과 출력을 위한 입력, 이때 println입력 시 다음 줄에 결과가 출력되기 때문에 print 매서드 사용
	System.out.print("결과출력 : ");
	
	// 시, 분, 초에 해당하는 결과가 0이 아닐때만 출력할 수 있도록 조건문 지정(!=)
	if(hr != 0) {
		System.out.print(hr + "시간 ");
	}
	if(mn != 0) {
		System.out.print(mn + "분 " );
	}
	if(scd != 0) {
		System.out.print(scd + "초 ");
	}
		
	}
}
