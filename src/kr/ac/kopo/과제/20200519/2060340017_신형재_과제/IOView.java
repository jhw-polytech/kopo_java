package homework0519;

import java.util.Scanner;

public class IOView {
	
	public void print(String msg) {
		System.out.println(msg);
	}
	public void start() {
		Scanner sc = new Scanner(System.in);
		String path1 ="iotest";
		FileInfo info = new FileInfo();
	
		while(true){
			info.infoView(path1);
			print("[C]폴더생성  [R]이름수정  [D]삭제  [.]상위폴더이동  [M]하위폴더이동  [Q]종료");
			String select = sc.nextLine();
			if(select=="C"||select=="c") {
				Create c = new Create();
				c.start(path1);
				break;
			}else if(select=="r"||select=="R") {
				Change ch = new Change();
				ch.start(path1);
				break;
			}else if(select=="D"||select=="d") {
				Delete d = new Delete();
				d.start(path1);
				break;
			}else if(select==".") {
				MoveUp up = new MoveUp();
				path1=up.start(path1);
				break;
			}else if(select=="M"||select=="m") {
				MakeDown down=new MakeDown();
				down.start(path1);
				break;
			}else if(select=="Q"||select=="q") {
				print("종료합니다.")
				System.exit(0);
			}else {
				print("잘못된 입력입니다. 다시 입력해 주세요");
				start();
			}
		}
	}
}
