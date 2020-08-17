package dirFile;

import java.io.File;
import java.util.Scanner;

public class Delete {
	
	public static void delete(File f) {
		f.delete();
		System.out.println("삭제 완료");
	}
}
