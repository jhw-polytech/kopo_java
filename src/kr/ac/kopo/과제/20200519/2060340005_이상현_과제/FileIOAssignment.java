package day0519.homework;

import java.io.File;
import java.util.Scanner;

public class FileIOAssignment {
	public void exe() {
		String nowPath = "iotest";
		DirFileInfo dfi = new DirFileInfo();
		stop: while (true) {
			dfi.info(nowPath);

			System.out.println("[C]폴더생성  [R]이름수정  [D]삭제  [.]상위폴더이동  [M]하위이동폴더이동  [Q]종료");
			Scanner sc = new Scanner(System.in);
			String select = sc.nextLine();
			switch (select) {
			case "c":	//create를 객체로 따로 만들었고 나머지 기능은 짧아서 따로 클래스로 구현하지 않았습니다. 같은 방법으로 하면 될 것 같습니다.
			case "C":
				CreateDir c = new CreateDir();
				c.cDir(nowPath);
				break;

			case "r":
			case "R":
				System.out.print("바꾸고 싶은 파일의 이름을 입력하세요 : ");
				String before = sc.nextLine();

				File changeObj = new File(nowPath + "/" + before);
				if (!changeObj.exists()) {	//존재하지 않을 경우 while문으로 돌아감
					System.out.println("존재하지 않습니다");
					break;
				}

				System.out.print("새로운 이름을 입력하세요 : ");
				String after = sc.nextLine();	
				changeObj.renameTo(new File(nowPath + "/" + after));
				System.out.println("변경 완료");
				break;

			case "d":
			case "D":
				System.out.print("삭제할 이름을 입력하세요 : ");
				String dDir = sc.nextLine();
				File delDirObj = new File(nowPath + "/" + dDir);
				boolean bool = delDirObj.delete();
				System.out.println(bool ? "삭제 성공" : "삭제 실패");
				break;

			case ".":
				File moveDir = new File(nowPath);
				nowPath = moveDir.getParent();
				System.out.println("상위 디렉토리로 이동 완료");
				break;

			case "m":
			case "M":
				System.out.print("이동하고 싶은 디렉토리 이름 입력 : ");
				dDir = sc.nextLine();
				nowPath += "/" + dDir;
				System.out.println(dDir + " 디렉토리로 이동 완료");
				break;

			default:
				System.out.println("종료합니다.");
				break stop;
			}
			sc.close();
		}
	}

}
