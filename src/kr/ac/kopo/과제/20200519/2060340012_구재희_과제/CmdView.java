package jaeheehomework;

import java.util.Scanner;

public class CmdView {
	
	Cmd c = new Cmd();
	Scanner sc = new Scanner(System.in);
	
	public void view() {
		
		while(true) {
			c.allInfo();
			System.out.println("[C]폴더생성  [R]이름수정  [D]삭제  [.]상위폴더이동  [m]하위이동폴더이동  [Q]종료");
			System.out.print("선택");
			String choose = sc.nextLine();
			
			switch(choose) {
			case "C":
			case "c":
				c.createFolder();
				break;
			case "R":
			case "r":
				c.changeName();
				break;
			case "D":
			case "d":
				c.deleteFolder();
				break;
			case ".":
				c.goUp();
				break;
			case "M":
			case "m":
				c.goDown();
				break;
			case "Q":
			case "q":
				System.out.println("종료");
				System.exit(0);
			default:
				System.out.println("다시 선택하세요");
				break;
			}
			
		}
	}
}
