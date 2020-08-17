package homework0519;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileInfo {
	public void print(String str) {
		System.out.println(str);
	}
	public void infoView(String str) {
		File dirobj = new File(str);
		File[] fileList = dirobj.listFiles();
		
		print("-------------");
		print("\tiotest");
		print("-------------");
		print("이름\t종류\t크기\t마지막 수정 날짜");
		print("-------------");
		
		for(int i=0;i<fileList.length; i++) {
			String name = fileList[i].getName();
			print(name+"\t");
			
			boolean bool = fileList[i].isFile();
			print(bool?"파일\t" : "디렉토리\t");
			//해당 record가 파일 형태일때만
			if(bool) {
				int length = (int)fileList[i].length();
				print(length+"bytes\t");
				
				long timer = fileList[i].lastModified();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd / hh-mm-ss");
				print(sdf.format(new Date(timer)));
			}
		}
	}
}
