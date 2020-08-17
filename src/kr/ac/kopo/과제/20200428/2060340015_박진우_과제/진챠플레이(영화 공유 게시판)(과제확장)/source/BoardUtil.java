package kr.ac.jinwoo.day12.homework.BoardHomework;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BoardUtil {
	
	private BoardDB boardDB = null;
	private boolean bConnect = false;
	private Scanner sc = new Scanner(System.in);
	
	BoardUtil(){
		connect();
	}
	
	// 디비에 접속
	public boolean connect() {
		
		boardDB = new BoardDB();
		bConnect = true;
		return true;
	}
	
	// 전체 게시물 조회
	public boolean printAllBoard() {
		
		boolean ret = true;
		
		if(!bConnect) {
			System.out.println("DB가 연결되지 않았습니다.");
			ret = false;
		}
		
		if(boardDB.getDataCnt() == 0) {
			System.out.println("등록된 게시물이 없습니다.");
			ret = false;
		}
		
		if(ret) {
			Board board[] = boardDB.selectAllData();
			
			System.out.println("< 전체 게시글 조회 >");
			System.out.printf("번호\t%-40s\t%-15s%15s\n", "제목", "글쓴이", "등록일");
			for(int i = 0; i < board.length; i++) {
				System.out.printf("%d\t%-40s\t%-15s%10s\n", board[i].getNum(), board[i].getTitle(), board[i].getWriter(), board[i].getDate());
			}
			System.out.println();
			
			while(printBoard()) {
				
			}
		}
		
		return ret;
	}
	
	
	// 글번호 조회
	public boolean printBoard() {
		
		int num;
		boolean exitFlag = false;
		
		if(boardDB.getDataCnt()== 0) {
			System.out.println("등록된 게시물이 없습니다.");
			exitFlag = true;
		}
		
		if(!exitFlag) {
			while(true) {
				System.out.print("읽고 싶은 게시물의 번호를 입력해주세요.(0 입력 시 전 단계로 돌아감.): ");
				
				try {
					num = Integer.parseInt(sc.nextLine());
				}  catch(Exception NumberFormatException) {
					System.out.println("잘못 입력하셨습니다.\n");
					continue;
				}
				if(num < 0 || boardDB.getDataCnt() < num ) {
					System.out.println("잘못 입력하셨습니다.\n");
					continue;
				}
				if(num == 0)
					exitFlag = true;
				
				break;
			}
			
			if(!exitFlag) {
				Board board = boardDB.selectDataToDB(num);
				if(board != null) {
					System.out.println("=================================\n");
					System.out.println("제목 : " + board.getTitle() + "\n");
					System.out.println("글쓴이 : " + board.getWriter()+ "\n");
					System.out.println("등록일 : " + board.getDate()+ "\n");
					System.out.println("한줄평 : " + board.getContents() + "\n");
					System.out.println("=================================\n");
				}
			}
			else exitFlag = true;
		}
		
		return !exitFlag;
	}
	
	// 내 게시물 조회
	public boolean printMyBoard(User user) {
			
		boolean exitFlag = false;
		
		String name = user.getId();
			
		if(boardDB.getUserBoardCnt(name) == 0) {
			System.out.println("유저가 등록한 게시물이 없습니다.");
			exitFlag = true;
		}
		
		if(!exitFlag) {
			
			Board board[] = boardDB.selectUserBoard(name);
			
			System.out.println("< 유저 게시글 조회 >");
			System.out.printf("번호\t%-40s\t%-15s%15s\n", "제목", "글쓴이", "등록일");
			for(int i = 0; i < board.length; i++) {
				System.out.printf("%d\t%-40s\t%-15s%s\n", board[i].getNum(), board[i].getTitle(), board[i].getWriter(), board[i].getDate());
			}
			System.out.println();
			while(printBoard()) {
			}
		}
			
		return !exitFlag;
	}
	
	// 글 등록
	public boolean registration(User user) {
		
		boolean ret = true;
		
		if(!bConnect) {
			System.out.println("DB가 연결되지 않았습니다.");
			ret = false;
		}
		if(!boardDB.chkServerCapacity()) {
			System.out.println("서버의 용량이 가득 찼습니다.");
			ret = false;
		}
		
		if(ret) {
			String title = inputString("등록할 영화의 제목을 입력하세요 : ");
			String writer = user.getId();
			
			String pattern = "yyyy-MM-dd";
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
				
			String date = sdf.format(new Date());
			String contents = inputString("등록할 한줄평을 입력하세요 : ");
			
			Board board = new Board(title, writer, date, contents);
			ret = boardDB.insertDataToDB(board); 
			
			if(ret)
				System.out.println("게시물이 등록되었습니다.");
			else
				System.out.println("게시물 등록에 실패했습니다.");
		}
		else {
			System.out.println("게시물 등록에 실패했습니다.");
		}

		return ret;
	}
	
	// 글 수정
	public boolean modifyBoard(User user) {
		
		int num;
		boolean ret = true;
		
		if(!bConnect) {
			System.out.println("DB가 연결되지 않았습니다.");
			ret = false;
		}
		
		if(ret) {
			while(true) {
				System.out.print("수정할 게시물의 번호를 입력해주세요.(0 입력 시 전 단계로 돌아감.): ");
				
				try {
					num = Integer.parseInt(sc.nextLine());
				}  catch(Exception NumberFormatException) {
					System.out.println("잘못 입력하셨습니다.\n");
					continue;
				}
				if(num < 0 || boardDB.getDataCnt() < num ) {
					System.out.println("잘못 입력하셨습니다.\n");
					continue;
				}
				if(num == 0)
					ret = false;
				
				if(ret) {
					// 글이 사용자 글인지 체크
					Board board = boardDB.selectDataToDB(num);
					if(board.getWriter().equals(user.getId())) {
						System.out.println("기존 글");
						System.out.print("제목 : ");
						System.out.println(board.getTitle());
						System.out.print("한줄평 : ");
						System.out.println(board.getContents());
						String title = inputString("수정할 제목을 입력하세요 : ");
						String contents = inputString("수정할 한줄평을 입력하세요 : ");
						String date = board.getDate();
						ret = boardDB.updateUserBoard(num, title, user.getId(), date, contents);
					}
					else {
						System.out.println("해당 게시물은 유저가 작성한 게시물이 아닙니다.\n");
					}
					
				}
				break;
			}
		}
		return ret;
	}
	
	
	// 글 삭제
	public boolean deleteBoard(User user) {
		
		int num;
		boolean ret = true;
		
		if(!bConnect) {
			System.out.println("DB가 연결되지 않았습니다.");
			ret = false;
		}
		
		if(ret) {
			
			while(true) {
				System.out.print("삭제할 게시물의 번호를 입력해주세요.(0 입력 시 전 단계로 돌아감.): ");
				
				try {
					num = Integer.parseInt(sc.nextLine());
				}  catch(Exception NumberFormatException) {
					System.out.println("잘못 입력하셨습니다.\n");
					continue;
				}
				if(num < 0 || boardDB.getDataCnt() < num ) {
					System.out.println("잘못 입력하셨습니다.\n");
					continue;
				}
				if(num == 0)
					ret = false;
				
				if(ret) {
					// 글이 사용자 글인지 체크
					Board board = boardDB.selectDataToDB(num);
					
					if(board.getWriter().equals(user.getId())) {
						System.out.println("====================");
						System.out.print("제목 : ");
						System.out.println(board.getTitle());
						System.out.print("한줄평 : ");
						System.out.println(board.getContents());
						System.out.println("====================");
						
						String cmd = inputString("정말 삭제 하시겠습니까? (Y 삭제  N 취소): ");
						if(!(cmd.equals("Y") || cmd.equals("y")) || (cmd.equals("N") || cmd.equals("n"))) {
							System.out.println("다시 입력해주세요.");
						}
						
						if(cmd.equals("Y") || cmd.equals("y")) {
							ret = boardDB.deleteBoard(user.getId(), num);
						}
						else if(cmd.equals("N") || cmd.equals("n")){
							ret = false;
							break;
						}
						
					}
					else {
						System.out.println("해당 게시물은 유저가 작성한 게시물이 아닙니다.\n");
					}
					
				}
				break;
			}
		}
		return ret;
		
	}
	
	// 유저의 게시물 모두 삭제
	public boolean deleteUserBoard(String deleteUserName) {
	
		boolean ret = true;
		
		if(!bConnect) {
			System.out.println("DB가 연결되지 않았습니다.");
			ret = false;
		}
		
		if(ret) {

			while(true) {
				Board deleteBoard[] = boardDB.selectUserBoard(deleteUserName);
				
				if(deleteBoard != null)
					boardDB.deleteBoard(deleteBoard[0].getWriter(), deleteBoard[0].getNum());
				else
					break;
			}
		}
		
	return ret;
	}
	
	public String inputString(String msg) {
		
		System.out.print(msg);
		return sc.nextLine();
	}
}