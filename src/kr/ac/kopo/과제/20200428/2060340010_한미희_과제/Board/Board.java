package kr.ac.kopo.day12.assignment;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Board {
	
	Post[] postArr;
	int capacity;
	int totalNumber;
	Scanner sc;
	SimpleDateFormat sdf;
	
	Board(){
		capacity = 10;
		postArr = new Post[capacity];
		totalNumber = 0;
		sc = new Scanner(System.in);
		sdf = new SimpleDateFormat("yyyy-MM-dd");	//MM은 반드시 대문자로, mm은 분을 가리킴
	}
	
	public int menu(){
		System.out.println("1. 전체게시물 조회\n2. 글번호 조회\n3. 글등록\n4. 글수정\n5. 글삭제\n0. 종료");
		System.out.println("--------------------------");
		int num = -1;
		while(num < 0 | num > 5) {
			num = getInt("메뉴 중 처리할 항목을 선택하세요 : ");
		}
		return num;
	}
	
	public void execute() {
		int option = 1;
		while(option != 0) {
			option = menu();
			if(option == 1) {
				search();
			}else if(option == 2) {
				search(getInt("조회할 게시글 번호를 입력하세요: "));
			}else if(option == 3) {
				write();
			}else if(option == 4) {
				revise();
			}else if(option == 5){
				delete();
			}
		}
		sc.close();
	}
	
	public void search() {
		System.out.println("\t< 전체 게시글 조회 >");
		System.out.println("번호\t제목\t글쓴이\t등록일");
		for(int i = 0; i < totalNumber; i++) {
			System.out.println((i+1) + "\t" + postArr[i].getTitle() + "\t"
					+ postArr[i].getWriter() + "\t" + postArr[i].getRegistrationDate());
		}
	}
	
	public void search(int num) {
		System.out.println("\t< " + num + "번 게시글 조회 >");
		System.out.println("번호\t제목\t글쓴이\t등록일");
		if(num <= totalNumber) {
			System.out.println(num + "\t" + postArr[num-1].getTitle() + "\t" 
					+ postArr[num-1].getWriter() + "\t" + postArr[num-1].getRegistrationDate());
		}else {
			System.out.println("해당 게시글 번호가 존재하지 않습니다");
		}
	}
	
	public void write() {
		Post p = new Post();
		
		if(totalNumber >= capacity) {
			capacity = capacity*2;
			Post[] newPostArr = new Post[capacity];
			System.arraycopy(postArr, 0, newPostArr, 0, postArr.length);
			postArr = newPostArr;
		}
		
		postArr[totalNumber] = p;
		p.setTitle(getString("등록할 제목을 입력 : "));
		p.setWriter(getString("등록할 글쓴이를 입력 : "));
		Calendar cal = Calendar.getInstance();
		String today = sdf.format(cal.getTime());
//		long systemTime = System.currentTimeMillis();
//		String today = sdf.format(systemTime);
		p.setRegistrationDate(today);
		
		System.out.println("게시글이 등록되었습니다");
		totalNumber++;
	}
	
	public void revise() {
		int num = getInt("수정할 글 번호를 입력하세요 : ");
		postArr[num-1].setTitle(getString("수정할 제목을 입력 : "));
		postArr[num-1].setWriter(getString("수정할 글쓴이를 입력 : "));
	}
	
	public void delete() {
		int num = getInt("삭제할 글 번호를 입력하세요 : ");
		for(int i = num-1; i < totalNumber-1; i++) {
			postArr[i] = postArr[i+1];
		}
		System.out.println("게시글이 삭제되었습니다");
		totalNumber--;
	}
	
	public String getString(String msg) {
		System.out.print(msg);
		String input = sc.nextLine();
		return input;
	}
	
	public int getInt(String msg) {
		System.out.print(msg);
		int input = sc.nextInt();
		sc.nextLine();
		return input;
	}
}
