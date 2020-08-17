package kopo.ac.kr.day02;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileIO {
	
	public void getFileIO(String input) {
		
		File dirobj = new File(input);
		File[] filist = dirobj.listFiles();
		
		System.out.println("==================================");
		System.out.println("\tiotest");
		System.out.println("==================================");
		System.out.println("이름\t종류\t크기\t마지막 수정 날짜");
		System.out.println("==================================");
		
		for(File f : filist) {
			
			if(f.isDirectory()) {
				
				long adjusttime = f.lastModified();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
				System.out.println(f.getName() + "\tDIR\t\t" + sdf.format(new Date(adjusttime)));
			}
			
			if(f.isFile()) {
				
				long adjusttime = f.lastModified();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
				System.out.println(f.getName() + "\t파일\t" + f.length() +"\t" + sdf.format(new Date(adjusttime)));
			}
			
		}
		
	}

}
