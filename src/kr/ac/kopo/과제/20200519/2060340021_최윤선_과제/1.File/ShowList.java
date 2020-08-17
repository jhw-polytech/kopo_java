package hw.hw12.File;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ShowList {

	public void listall(File dirObj) {
		System.out.println("----------------------------------------------------------");
		System.out.println(FileView.pwd+" 폴더정보");
		System.out.println("----------------------------------------------------------");
		dirObj = new File(FileView.pwd);
		File f_list[] = dirObj.listFiles();
		for (File e : f_list) {
			if (e.getName().contains(".")) {
				SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				Date d = new Date(e.lastModified());
				String datee = format1.format(d);
				System.out.println(
						"[File] : " + e.getName() + "       파일크기 : " + e.length() + "        수정시간 : " + datee);
			} else {
				System.out.println("[ Dir]   : " + e.getName());
			}

		}
	}
}
