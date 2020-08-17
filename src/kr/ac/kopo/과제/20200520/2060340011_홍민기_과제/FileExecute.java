package board;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.util.FileClose;

public class FileExecute {
	
	public static void load() {
		Board.users = new ArrayList();
		read();
		Board board = new Board();
		board.open();
	}
	public static void save() {
		write();
	}

	public static void write() {

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("iotest/post_user.txt");
			oos = new ObjectOutputStream(fos);

			
			for(int i=0;i<Board.users.size();i++) {
				oos.writeObject(Board.users.get(i));
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {

			FileClose.close(fos);
			FileClose.close(oos);
		}

		System.out.println("저장완료...");
	}

	public static void read() {

		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream("iotest/post_user.txt");
			ois = new ObjectInputStream(fis);
			while(true) {
				Post user = (Post)ois.readObject();
				Board.users.add(user);
			}
			
		} 
		catch(Exception e) {
		} finally {
			Board.rows = Board.users.size();
			System.out.println("로드 완료...");
			
			FileClose.close(fis);
			FileClose.close(ois);
			
		}
	}

}
