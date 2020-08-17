package kr.ac.kopo.assignment.day12;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class BoardUtil {
	
	private BoardView view;
	private static Board[] boardArr;
	
	public BoardUtil() {
		
		view = new BoardView();
		boardArr = new Board[100];
	}
	
	public void execute() {
		
		boolean check = true;
		while(check) {
			int select = view.printMenu();
			
			switch(select) {
			case 1 : this.printBoard();
				break;
			case 2 : this.searchBoard();
				break;
			case 3 : this.postBoard();
				break;
			case 4 : this.modifyBoard();
				break;
			case 5 : this.deleteBoard();
				break;
			case 0 : System.out.println("���α׷��� �����մϴ�.");
				check = false;
				break;
			default : System.out.println("�´� ���ڸ� �Է��ϼ���.");
				break;			
			}
			
		}

		
		
	}
	
	public void printBoard() {
		System.out.println("   <��ü �Խñ� ��ȸ>   ");
		System.out.println("��ȣ\t����\t\t\t�۾���\t�����");
		for(int i = 0; i < boardArr.length; i++) {
			
			if(boardArr[i] == null) break;
			System.out.printf("%d\t%s\t\t\t%s\t%s\n", i+1, boardArr[i].getTitle(), 
							  boardArr[i].getUser(), boardArr[i].getDate());
			
		}
	}
	
	public void searchBoard() {
		int i = view.printInputInt("��ȸ�� �� ��ȣ�� �Է��ϼ��� : ") - 1;
		System.out.println("��ȣ\t����\t�۾���\t�����");
		System.out.printf("%d\t%s\t\t\t%s\t%s\n", i+1, boardArr[i].getTitle(), 
						  boardArr[i].getUser(), boardArr[i].getDate());

		
	}
	
	
	public void postBoard() {
		

		String title = view.printInputString("����� ���� �Է� : ");
		String name = view.printInputString("����� �۾��̸� �Է� : ");
		String date = this.todayDate();
		
		for(int i = 0; i < boardArr.length; i++) {
			if(boardArr[i] == null) {
				Board b = new Board(title, name, date);
				boardArr[i] = b;
				i = boardArr.length;
			}
		}
				
	}
	
	
	public String todayDate() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		String strToday = sdf.format(c.getTime());
		
		return strToday;		
	}
	
	public void modifyBoard() {
		
		int i = view.printInputInt("������ �� ��ȣ�� �Է��ϼ��� : ") - 1;
		
		String title = view.printInputString("����� ���� �Է� : ");
		String name = view.printInputString("����� �۾��̸� �Է� : ");
		String date = this.todayDate();
		
		Board b = new Board(title, name, date);
		boardArr[i] = b;
		
	}
	
	public void deleteBoard() {
		
		for(int i = 0; i < boardArr.length; i++) {
			if(boardArr[i] != null) {
				boardArr[i] = null;
			}
		}
		
	}

}
