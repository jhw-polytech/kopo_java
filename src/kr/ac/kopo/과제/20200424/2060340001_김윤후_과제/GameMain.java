package kr.ac.kopo.day10.homework;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		ScissorsRockPaper srp = new ScissorsRockPaper();
		Dice di = new Dice();
		int you=0;
		int win=0;
		int draw=0;
		int lose=0;
		int result=0;
		
		
		while(true) {
			System.out.println("게임을 선택하세요");
			System.out.println("A. 가위바위보");
			System.out.println("B. 주사위 값 맞추기");
			System.out.println("C. 종료");
			char select =sc.nextLine().charAt(0);
			
			
			if(select=='A') {
				
				System.out.println("가위바위보 게임입니다.");
				System.out.println("가위바위보중 하나를 선택하세요.");
				System.out.println("1:가위 2:바위 3:보");
				you=sc.nextInt();
				sc.nextLine();
				
				while(true) {
					if(you!=1 && you!=2 && you!=3) {
						System.out.println("다시 입력하세요.");
						you=sc.nextInt();
						sc.nextLine();
					}
					else {
						break;
					}
				}
				//srp.startGame(you);
				result=srp.startGame(you);
				if(result==1) {
					win++;
				}
				else if(result==-1) {
					lose++;
				}
				else if(result==0) {
					draw++;
				}
			}
		
			else if(select=='B') {
				System.out.println("주사위 값 맞추기 게임입니다.");
				System.out.println("주사위를 선택하세요(1~6사이)");
				you=sc.nextInt();
				sc.nextLine();
				
				while(true) {
					if(you!=1 && you!=2 && you!=3 && you!=4 &&you!=5 && you!=6) {
						System.out.println("다시 입력하세요.");
						you=sc.nextInt();
						sc.nextLine();
					}
					else {
						break;
					}
						
				}
				//di.startGame(you);
				result=di.startGame(you);
				if(result==1) {
					win++;
				}
				else if(result==-1) {
					lose++;
				}
				else if(result==0) {
					draw++;
				}
			}
			
			else if(select=='C') {
				System.out.println("게임을 종료합니다");
				System.out.printf("당신의 게임 전적은 %d승 %d패 %d무 입니다.",win,lose,draw);
				break;
			}
			
			else {
				while(true) {
					System.out.println("다시 입력하세요");
					select=sc.nextLine().charAt(0);
					if(select=='A' || select=='B'|| select=='C') {
						break;
					}
				}
			}
		}
	}
}
