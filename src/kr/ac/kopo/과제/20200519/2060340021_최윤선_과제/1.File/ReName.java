package hw.hw12.File;

import java.io.File;
//파일이름 수정
public class ReName extends FileController {
	public void process(File dirObj) {
		System.out.println("수정하고 싶은파일이름 입력");
		String ipt=sc.nextLine();
		System.out.println("수정할 파일 명 입력");
		String ipt2 = sc.nextLine();
		File fi= new File(FileView.pwd+"\\"+ipt);
		File fi2= new File(FileView.pwd+"\\"+ipt2);
		boolean bool=true;
		//boolean bool =dirObj.renameTo(new File(FileView.pwd+"\\"+ipt,FileView.pwd+"\\"+ipt2));
		//bool = fi.renameTo(fi2);
		System.out.println(fi.renameTo(fi2) ? " 파일 이름 변경 성공" : " 파일 이름 변경 실패");
	}

}
