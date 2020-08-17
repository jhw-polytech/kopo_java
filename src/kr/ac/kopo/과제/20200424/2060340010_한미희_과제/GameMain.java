package kr.ac.kopo.day10.homework;

import java.util.Scanner;

public class GameMain {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Game g;			//Game 인터페이스 변수 선언
		String option = "A";	//선택한 게임 이름, C 아닌 값으로 초기화
		int you;		//사용자 입력값
		int result;		//게임의 결과값
		int win = 0;	//승
		int lose= 0;	//패
		int tie= 0;		//무
		
		
		//게임 선택, C(종료)를 선택할 때까지 반복 실행
		while( !option.equals("C") ){
			//출력문
			System.out.println("A. 가위바위보");
			System.out.println("B. 주사위 값 맞추기");
			System.out.println("C. 종료");
			//사용자 입력
			option = sc.nextLine();
			//A 또는 B 또는 C를 입력할 때까지 다시 입력받기
			while(!option.equals("A") && !option.equals("B") && !option.equals("C")) {
				System.out.println("다시 입력하세요");
				option = sc.nextLine();
			}
			
			//A. 가위바위보 선택
			if(option.equals("A")){
				//출력문
				System.out.println("가위바위보 게입입니다.");
				System.out.println("가위바위보중 하나를 선택하세요.");
				System.out.println("(1:가위, 2:바위, 3:보)");
				//사용자 입력
				you = sc.nextInt();
				sc.nextLine();
				//1 또는 2 또는 3을 입력할 때까지 다시 입력받기
				while(you != 1 && you != 2 && you != 3) {
					System.out.println("다시 입력하세요");
					you = sc.nextInt();
					sc.nextLine();
				}
				//값을 맞게 입력받으면 위의 반복문을 빠져나와 게임 실행
				g = new ScissorsRockPaper();
				result = g.startGame(you);
				if(result == 1) {
					win++;
				}else if(result == 0) {
					lose++;
				}else {
					tie++;
				}
				
			//B. 주사위 값 맞추기 선택
			}else if(option.equals("B")){
				//출력문
				System.out.println("주사위 값 맞추기 게임입니다.");
				System.out.println("주사위을 선택하세요(1~6값 중 하나)");
				//사용자 입력
				you = sc.nextInt();
				sc.nextLine();
				//1-6 사이의 정수를 입력할 때까지 다시 입력받기
				while(you != 1 && you != 2 && you != 3 && you != 4 && you != 5 && you != 6) {
					System.out.println("다시 입력하세요");
					you = sc.nextInt();
					sc.nextLine();
				}
				//값을 맞게 입력받으면 위의 반복문을 빠져나와 게임 실행
				g = new Dice();
				result = g.startGame(you);
				if(result == 1) {
					win++;
				}else{
					lose++;
				}
			}
		}
		
		//C. 종료 선택
		System.out.println("게임을 종료합니다.");
		System.out.printf("당신의 게임 전적은 %d승 %d패 %d무입니다.", win, lose, tie);
		sc.close();
		
		
	}
}
