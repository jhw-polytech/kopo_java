package kr.ac.kopo.util;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

/*
	객체를 닫아주는 게 목적인 클래스
	> FileIOMain05Noted 클래스 참고
*/
public class FileClose {

	// 출력 클래스는 모두 Writer 클래스를 상속받으므로, Writer w를 인자로 쓸 수 있는...그런건가..?
	public static void close(Writer w) {
		if (w != null) {

			try {
				w.close();
			} catch (Exception e) {

				e.printStackTrace();
			}

		}

	}

	// Reader도 마찬가지
	public static void close(Reader r) {
		if (r != null) {
			try {
				r.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void close(FileWriter fw) {
		if (fw != null) {

			try {
				fw.close();
			} catch (Exception e) {

				e.printStackTrace();
			}

		}
	}

	public static void close(FileReader fr) {
		if (fr != null) {
			try {
				fr.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	
	// 메소드 오버로딩 . . .
	public static void close(Reader br, Reader r) {
		close(br);
		close(r);
	}
	
	public static void close(Writer bw, Writer w) {
		close(bw);
		close(w);
	}	
	
	public static void close(Reader r, Writer w) {
		close(r);
		close(w);
	}
	
}
