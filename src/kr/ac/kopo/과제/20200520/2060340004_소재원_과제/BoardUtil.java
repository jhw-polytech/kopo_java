package kr.ac.kopo.day15.homework;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import kr.ac.kopo.util.FileClose;

public class BoardUtil {

	private String title;
	private String name;
	private FileInputStream fis;
	private ObjectInputStream ois;
	private FileOutputStream fos;
	private ObjectOutputStream oos;
	private List<Board> list = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);
	
	public void printAll() {
		
		System.out.println("============= 전체 게시글 조회 =============");
		System.out.printf("%2s\t %s\t\t %s\t\t  %s\n", "번호", "제목", "글쓴이" ,"등록일");
		
		fis = null;
	    ois = null;
		
		try {
			
			fis = new FileInputStream("iotest/selectBoard.txt");
			ois = new ObjectInputStream(fis);
			
			try {
				list = (List<Board>) ois.readObject();
				} catch (EOFException e) {
			}
			
			for (Board b : list) {
				System.out.println(b);
			}
		
		} catch(Exception e) {
			
			e.printStackTrace();
			
		} finally {
			FileClose.close(fis, ois);
		}
	}
	
	public void print(int num) throws IncorrectException {
		
		fis = null;
		ois = null;
				
		try {
			System.out.printf("%s\t %s\t %s\t %s\n", "번호", "제목", "글쓴이" ,"등록일");
			fis = new FileInputStream("iotest/selectBoard.txt");
			ois = new ObjectInputStream(fis);
			list = (List<Board>) ois.readObject();
			System.out.println(list.get(num-1));
			
		} catch (Exception e) {
			throw new IncorrectException("해당 번호는 존재하지 않습니다.");
		}
	}
	
	public void register() {
		
		fos = null;
		oos = null;
		
		try {
			fos = new FileOutputStream("iotest/selectBoard.txt");
			oos = new ObjectOutputStream(fos);
			System.out.println("등록할 제목을 입력하세요 : ");
			title = sc.nextLine();
			System.out.println("글쓴이를 입력하세요 : ");
			name = sc.nextLine();
			list.add(new Board(list.size()+1, title, name));
			oos.writeObject(list);
			System.out.println("게시들이 등록되었습니다.\n");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(fos, oos);
		}
	}
	
	public void alter(int num) throws IncorrectException {
		
		fis = null;
		ois = null;
		fos = null;
		oos = null;
		
		try {
			fis = new FileInputStream("iotest/selectBoard.txt");
			ois = new ObjectInputStream(fis);
			
			list = (List<Board>) ois.readObject();
			
			System.out.println("수정할 제목 입력 : ");
			title = sc.nextLine();
			System.out.println("글쓴이 입력 :");
			name = sc.nextLine();
		
			list.set(num-1, new Board(num, title, name));
			
			fos = new FileOutputStream("iotest/selectBoard.txt");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(list);
			System.out.println("게시들이 수정되었습니다.\n");
			
		} catch(Exception e) {
			throw new IncorrectException("해당되는 글 번호를 찾을 수 없습니다.");
		} finally {
			FileClose.close(fos, oos);
			FileClose.close(fis, ois);
		}
	}
	
	public void delete(int num) throws IncorrectException {
		
		fis = null;
		ois = null;
		fos = null;
		oos = null;
		
		try {
			fis = new FileInputStream("iotest/selectBoard.txt");
			ois = new ObjectInputStream(fis);
			
			list = (List<Board>) ois.readObject();
			list.remove(num-1);
	
			for (int i = num; i <= list.size(); i++) {
				list.get(i-1).setNum(i);
			}
			
			fos = new FileOutputStream("iotest/selectBoard.txt");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(list);
			System.out.println("게시물이 삭제되었습니다.\n");
			
		} catch(Exception e) {
			throw new IncorrectException("해당되는 글 번호를 찾을 수 없습니다.");
			
		} finally {
			FileClose.close(fos, oos);
			FileClose.close(fis, ois);
		}
	}
}
