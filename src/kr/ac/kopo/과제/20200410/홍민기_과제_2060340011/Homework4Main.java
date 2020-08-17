package kr.ac.kopo.day03.homework;

import java.util.Scanner;

/*
 * 2060340011 홍민기
 * 
 * 4. 다음의 결과를 보이는 프로그램 작성하시오.
 * 1 - 100 사이의 정수를 입력 : 40
 * 2 - 10사이의 정수를 입력 : 5
 *
 * < 1 ~ 40사이의 5의 배수를 제외한 정수 출력>
 * 1 2 3 4 6 7 8 9 11 ... 39
 *
 * < 1 ~ 40사이의 5의 배수를 제외한 정수 5개씩 출력>
 * 1 2 3 4 6
 * 7 8 9 11 12
 * 
 */
 /*
	continue; 가 맘에 드세요?? ^^ 
	if, else가 없어져서 깔끔해보이기는 하죠???? 그래도 웬만하면 if문으로 쓰는것을 권장합니다
 */
public class Homework4Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 - 100사이의 정수를 입력 : ");
		
		int num1 = sc.nextInt();
		
		System.out.print("2 - 10사이의 정수를 입력 : ");
		
		int num2 = sc.nextInt();
		System.out.println();
		
		System.out.println("< 1 ~ "+num1+"사이의 "+num2+"의 배수를 제외한 정수 출력 >");
		for(int i=1;i<=num1;i++) {
			if(i%num2==0) {
				continue; // i가 num2의 배수일 때, continue를 하여 출력하지 않고 넘어간다.
			}
			System.out.print(i+" ");
		}
		System.out.println("\n");
		
		int j=0;
		System.out.println("< 1 ~ "+num1+"사이의 "+num2+"의 배수를 제외한 정수"+num2+"개씩 출력 >");
		for(int i=1;i<=num1;i++) {
			if(i%num2==0) {
				continue;
			}
			j++;
			System.out.print(i+" ");
			if(j%num2==0) { // num2만큼의 개수를 출력하기 위해 j가 num2의 배수이면 줄바꿈을 해준다.
				System.out.println();
			}
		}

	}
}
