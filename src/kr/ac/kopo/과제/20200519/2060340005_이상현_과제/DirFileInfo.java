package day0519.homework;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DirFileInfo {
	public void info(String path) {
		File dirObj = new File(path);
		File[] fileList = dirObj.listFiles();
		
		System.out.println("------------------");
		System.out.println("iotest 폴더정보");
		System.out.println("------------------");
		System.out.println("이름	종류	크기	마지막수정날짜");
		System.out.println("------------------");
		
		for (int i = 0; i < fileList.length; i++) {
			String name = fileList[i].getName();
			System.out.print(name + "\t");

			boolean bool = fileList[i].isFile();
			System.out.print(bool ? "파일\t" : "Dir\n");
			
			if (bool) {
				long length = fileList[i].length();
				System.out.print("파일크기 : " + length + " bytes\t");

				long lastTime = fileList[i].lastModified();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd:ss");
				System.out.println("마지막 수정 시간 : " + sdf.format(new Date(lastTime)));
			}
		}
	}

}
