package kr.ac.yeongnam.day02.homework;

import java.util.Scanner;

/*
	영남씨 이 과제 하면서 if문의 수렁에 빠졌던거 아시지요?? ^^
	이렇게 많은 중첩코드를 작성할 수도 있지만 시간을 출력여부, 분을 출력여부, 초를 출력여부를 판단하여 조건을 정하면
	조금더 조건문을 줄여서 작성할 수 있습니다. 한번 생각해보세요. 고생하셨습니다

	===> 시, 분, 초 출력 여부를 판단해서 조건을 정해봤습니다. 
	===> 중첩 코드는 해결했지만, 좀 더 깔끔하게 처리할 수 있도록 고민해보겠습니다.
	===> 피드백 주셔서 감사합니다!	
	===> (구재희님의 코드가 간결해서, 학습 목적으로 첨부했습니다.)
*/

/*
2. 3661초가 몇 시간 몇 분 몇 초인지 환산해서 출력하시오.  
      결과출력 : 1시간 1분 1초 
 
      초를 입력하세요 : 3600 
      3600초 : 1시간 0분 0초  -> 1시간 
 
      초를 입력하세요 : 3610
      3610초 : 1시간 0분 10초 -> 1시간 10초  
 */

public class Problem2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // 값을 입력받기 위해 Scanner 객체 생성
		
		System.out.print("초를 입력하세요 : ");
		int inputSeconds = sc.nextInt(); // 정수형태의 입력값을 받기 위해 변수 생성
		sc.nextLine(); // 버퍼 버그 방지를 위한 코드
		
		// 시, 분, 초 각각 계산
		int hours = inputSeconds / 3600; 
		int minutes = (inputSeconds % 3600) / 60;
		int seconds = (inputSeconds % 60) / 1;	
				
		if((hours != 0) & (minutes != 0) & (seconds != 0)) { // x시 x분 x초
			
			System.out.println(inputSeconds + "초 : " + hours + "시간 " + minutes + "분 " + seconds + "초");
			
		} else if((hours != 0) & (minutes != 0) & (seconds == 0)) { // x시 x분 0초
			
			System.out.println(inputSeconds + "초 : " + hours + "시간 " + minutes + "분 ");
			
		} else if((hours != 0) & (minutes == 0) & (seconds != 0)) { // x시 0분 x초
			
			System.out.println(inputSeconds + "초 : " + hours + "시간 " + seconds + "초");
			
		} else if((hours != 0) & (minutes == 0) & (seconds == 0)) { // x시 0분 0초
			
			System.out.println(inputSeconds + "초 : " + hours + "시간 ");
			
		} else if((hours == 0) & (minutes != 0) & (seconds != 0)) { // 0시 x분 x초
			
			System.out.println(inputSeconds + "초 : " + minutes + "분 " + seconds + "초");
			
		} else if((hours == 0) & (minutes != 0) & (seconds == 0)) { // 0시 x분 0초
			
			System.out.println(inputSeconds + "초 : " + minutes + "분 ");

		} else if((hours == 0) & (minutes == 0) & (seconds != 0)) { // 0시 0분 x초
			
			System.out.println(inputSeconds + "초 : " + seconds + "초");

		} else if((hours == 0) & (minutes == 0) & (seconds == 0)) { // 0시 0분 0초
			
			System.out.println("0초보다 큰 시간을 써주세요.");
			
		}


		/* 구재희님의 코드가 간결해서 학습 목적으로 첨부했습니다.
		 
		//스캐너를 통해 값을 사용자로부터 받습니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("초를 입력하세요 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		// int 형의 시간, 분, 초를 만들고, string 형의 시간, 분, 초를 만들었습니다.
		int hour = num / 3600;
		String hourName = Integer.toString(hour) + "시간";
		
		int minute = (num % 3600) / 60;
		String minuteName = Integer.toString(minute) + "분";
		
		int second = (num % 3600) % 60;
		String secondName = Integer.toString(second) + "초";
		
		//if문을 통해, int형의 값이 0인 경우에는 대응되는 string을 지웁니다. 
		if(hour == 0) {
			hourName = "";
		}
		if(minute == 0) {
			minuteName = "";
		}
		if(second == 0) {
			secondName = "";
		}
		
		System.out.printf("결과물 출력 : %s %s %s\n", hourName, minuteName, secondName);
		 */		
		

		/*
		 * 기존 코드
		Scanner sc = new Scanner(System.in); // 값을 입력받기 위해 Scanner 객체 생성
		
		System.out.print("초를 입력하세요 : ");
		int inputSeconds = sc.nextInt(); // 정수형태의 입력값을 받기 위해 변수 생성
		sc.nextLine(); // 버퍼 버그 방지를 위한 코드
		
		// 시, 분, 초 각각 계산
		int hours = inputSeconds / 3600; 
		int minutes = (inputSeconds % 3600) / 60;
		int seconds = (inputSeconds % 60) / 1;	
		
		if(hours == 0) {
			if(minutes == 0) { // 0시간 0분
				if(seconds ==0) { // 0시간 0분 0초
					System.out.println("0초보다 큰 시간을 써주세요.");
				} else { // 0시간 0분 x초
					System.out.println(inputSeconds + "초 : " + seconds + "초");					
				}
				
			} else { // 0시간 x분 
				if(seconds == 0) { // 0시간 x분 0초
					System.out.println(inputSeconds + "초 : " + minutes + "분 ");					
				} else { // 0시간 x분 x초
					System.out.println(inputSeconds + "초 : " + minutes + "분 " + seconds + "초");				
				}				
			}
		} else if(minutes == 0) { // x시간 0분
			if(seconds == 0) { // x시간 0분 0초
				System.out.println(inputSeconds + "초 : " + hours + "시간 ");				
			}else { // x시간 0분 x초
				System.out.println(inputSeconds + "초 : " + hours + "시간 " + seconds + "초");				
			}
		} else { // x시간 x분
			if(seconds == 0) { // x시간 x분 0초
				System.out.println(inputSeconds + "초 : " + hours + "시간 " + minutes + "분 ");
			} else { // x시간 x분 x초
				System.out.println(inputSeconds + "초 : " + hours + "시간 " + minutes + "분 " + seconds + "초");
			}			
		}
		*/				
	}
}
