package kr.ac.kopo.day14.note;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileIOMain04Noted {

	public static void write() {
		FileOutputStream fos = null;
		DataOutputStream dos = null; // 필터클래스!

		try {
			fos = new FileOutputStream("iotest/data_wirter.txt");
			dos = new DataOutputStream(fos);

			char c = 'A';
			c = '\u4142';

//			fos.write(c);

			dos.writeChar(c);
			dos.writeInt(125); // 125라는 애는 실제로는 }라고 저장될 것이다. 아스키코드 125가 }기 때문이다.
			// ' A' -> 2byte / ' }' ---> 아스키코드 126에 해당
			dos.writeDouble(23.456);

			// 하위가 빵빵빵빵... > ??
			System.out.println("저장완료. . . .");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void read() throws Exception {
		/*
		 * try { read(); } catch(Exception e) { e.printStackTrace(); }
		 */
		
		
		FileInputStream fis = new FileInputStream("iotest/data_writer.txt");
		DataInputStream dis = new DataInputStream(fis);
		
		char c = dis.readChar();
		
		System.out.println("읽어온 문자: " + c);
		
		dis.close();
		fis.close();
	}
	
	
	public static void main(String[] args) {
		write();
		
	}

}
