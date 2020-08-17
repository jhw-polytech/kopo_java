package kr.co.hana.homework14;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 시간이 오래걸려 우선 제출합니다 ㅠ
 */

public class IoFolderView {

	public static SimpleDateFormat sdf;

	public static void view() {
		System.out.println("----------------------------------------------------------------");
		System.out.println("\t \t" + "IoTest 폴더 정보" + "\t   \t");
		System.out.println("----------------------------------------------------------------");
		System.out.println("이름" + "\t \t" + "종류" + "\t\t" + "크기" + "\t \t" + "마지막 수정날짜");
		
		String path = "C:/Users/misch/eclipse-workspace/java/";
		File dir = new File(path);
		File[] files2 = dir.listFiles();
		for (File f : files2) {
			String str = f.getName();
			long leng = f.length();
			sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

			if (f.isDirectory()) {
				System.out.print(str + "\t \t");
				System.out.print("DIR \t \t");
				System.out.print(leng + "\t \t");
				System.out.println(sdf.format(new Date()) + "\t \t \n");
			}
		}
	}
}