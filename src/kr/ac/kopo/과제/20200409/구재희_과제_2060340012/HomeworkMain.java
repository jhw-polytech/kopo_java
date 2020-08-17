package jaeheehomework;

import java.util.Scanner;
import java.util.Random;

public class HomeworkMain {
	
	public static void main(String[] args) {
		
		// 1. 염문자 모음의 아스키 코드 값을 출력형식에 맞추어 화명에 출력
		
		String s1 = "-------------------";
		String s2 = "영문자 모음의 아스키 코드 값";
		
		System.out.println(s1 + "\n" + s2 + "\n" + s1);
		
		// cha -> int 형변환을 통해 아스키 코드 값을 만들었습니다.
		
		System.out.printf("%s = %d\n", "A", (int) 'A');
		System.out.printf("%s = %d\n", "E", (int) 'E');
		System.out.printf("%s = %d\n", "I", (int) 'I');
		System.out.printf("%s = %d\n", "O", (int) 'O');
		System.out.printf("%s = %d\n%s\n", "U", (int) 'U', s1);
		
		
		
		//2. 3661초가 몇 시간 몇 분 몇 초인지 환산해서 출멱하시오
		
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
		
		
		//3. 반지름이 10인 원의 면적을 구해서 출력하시오.
		int radius = 10;
		double result = Math.PI * Math.pow(radius, 2); 
		System.out.printf("\n결과출력 : 원의 면적은 %.4f 입니다.\n", result);
		
		
		//4. 화면에서 하나의 정수를 입력 받고 정수를 나눌 수 를 입력 받은 다음, 목과 나머지를 화면에 출력하시오
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		System.out.print("\n정수를 입력하세요 : ");
		int num1 = Integer.parseInt(sc1.nextLine());
		
		System.out.print("나눌 수를 입력하세요 : ");
		int num2 = Integer.parseInt(sc2.nextLine());
		
		System.out.printf("몫 : %d\n나머지 : %d\n", num1/num2, num1%num2);
		
		
		//5. 1달러는 현재 1092.5원 입니다. 화면에서 달러를 입력 받아 원화로 보여주는 프로그램을 작성하세요
		Scanner sc3 = new Scanner(System.in);
		
		System.out.print("\n달러를 입력하세요 : ");
		int num3 = Integer.parseInt(sc3.nextLine());
		System.out.printf("원화 : %.2f원\n", num3 * 1092.5);
		
		
		//6. 알파벳이 모두 몇 자 인지 화면에 출력하시오
		
		//소문자, 대문자의 아스키 숫자 구하기
		int num_a = (int) 'a';
		int num_z = (int) 'z';
		
		int num_A = (int) 'A';
		int num_Z = (int) 'Z';
		
		//소문자, 대문자 별로 갯수 구하기
		int small_num = Math.abs(num_a - num_z) + 1;
		int big_num = Math.abs(num_A - num_Z) + 1;
		
		System.out.printf("\n개수 : %d\n", small_num + big_num);
		
		
		//7. 화면에서 알파벳을 입력 받아 대문자는 소문자로 소문자는 대문자로 출력하시오
		
		//대문자와 소문자의 아스키 숫자 차이
		int asci_diff = Math.abs((int) 'a' - (int) 'A' );
		
		//입력 받기
		System.out.print("\n입력(알파벳) : ");
	
		// 이부분 잘 이해 안되지만, 구글링을 통해 해결했습니다.
		Scanner sc4 = new Scanner(System.in);
		char c = sc4.next().charAt(0);
		
		int alphabat_num = 0;
		
		// 받은 알파벳이 소문자이면 아스키 숫자 차이를 빼주고, 대문자이면 더해줍니다.
		if( (int) c <= (int) 'Z' ) {		
			alphabat_num = (int) c + asci_diff;
			System.out.printf("\n변경된 값 : %s", (char) alphabat_num);
		} else {
			alphabat_num = (int) c - asci_diff;
			System.out.printf("\n변경된 값 : %s\n", (char) alphabat_num);
		}
		
		
		//8. 1000원, 500원, 100원, 50원, 10원 거스름돈 받기
		
		System.out.print("\n물건값을 입력하세요 : ");
		Scanner sc5 = new Scanner(System.in);
		int thing = Integer.parseInt(sc5.nextLine());
		
		System.out.print("\n지불한 돈의 액수를 입력하세요 : ");
		Scanner sc6 = new Scanner(System.in);
		int pay = Integer.parseInt(sc6.nextLine());
		
		if(thing > pay) {
			System.out.printf("\n%d원이 부족합니다.\n", thing - pay);
		}else {
			int payback = pay - thing;
			System.out.printf("\n거스름돈 : %d원\n", payback);
			System.out.printf("1000원 : %d개\n", payback / 1000);
			System.out.printf("500원 : %d개\n", (payback % 1000) / 500);
			System.out.printf("100원 : %d개\n", ((payback % 1000) % 500) / 100);
			System.out.printf("50원 : %d개\n", (((payback % 1000) % 500) % 100) / 50);
			System.out.printf("10원 : %d개\n", ((((payback % 1000) % 500) % 100) % 50) / 10);

			
		}
		
		
	}

}
