package kr.co.hana.homework14;

import java.util.Scanner;

public class IoController {

	public static void controller() {
		Scanner sc = new Scanner(System.in);
		boolean flag = false;

		for (;;) {
			System.out.println("----------------------------------------------------------------");
			System.out.println("[C]폴더생성  [R]이름수정  [D]삭제  [.]상위폴더이동  [m]하위이동폴더이동  [Q]종료");
			
			String str = "A";
			str = sc.nextLine();

			switch (str.toUpperCase()) {

			// 폴더생성
			case "C":
				CreateDir.createDir();
				break;

			// 이름수정
			case "R":
				RenameDir.renameDir();
				break;

			// 삭제
			case "D":
				DeleteDir.deleteDir();
				break;

			// 상위폴더
			case ".":
				break;

			// 하위폴더
			case "m":
				break;

			// 종료
			case "Q":
				CloseIo.close();
			default:
				System.out.println("[" + str + "] 은 잘못된 내부 명령입니다.");

			}
			if (flag == true) {
				break;
			}
		}
	}
}
