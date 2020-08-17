package kopo.ac.kr.day02;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class IotestList {
	
	static String path = "iotest"; //iotest는 최상위 폴더라서 static으로 선언
	private File fileObj;
	private SimpleDateFormat sdf;
	File[] list;
	
	public IotestList() {
		
	}

	public IotestList(File fileObj, SimpleDateFormat sdf, File[] list) {
		super();
		this.fileObj = fileObj;
		this.sdf = sdf;
		this.list = list;
	}

	public void getList() {
		
		fileObj = new File(path);
		sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		long lasttime = fileObj.lastModified();
		
		File[] list = fileObj.listFiles();
		for(File e : list) {
			System.out.println(e.getName() +"\t" + (e.isDirectory() ? "dir" : "파일") + "\t"
			+ (e.isFile() ? e.length() : " ") + "\t" + sdf.format(new Date(lasttime)));
		}
	}

}
