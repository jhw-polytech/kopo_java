package homework.day14.IOManagement;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class MoveFile extends BasicFunction {
    Scanner sc = new Scanner(System.in);

    public void moveLowerFile() {
        System.out.println("이동할 파일(폴더)를 입력해주세요. ");
        String moveFile = sc.nextLine();
        File file = new File(IOpath + moveFile); // 이동할 폴더(파일)
        try {
            if (file.exists()) {
                showHead();
                showInsideFolder(file);
            } else {
                System.out.println("존재하지 않는 파일(폴더)입니다.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void moveUpperFile() {

        System.out.println("현 폴더명을 입력해주세요. ");
        String moveFile = sc.nextLine();
        File file = new File(IOpath + moveFile); // 이동할 폴더(파일)
        try {
            if (file.exists()) {
                String parentPath = file.getParent();

                file = new File(parentPath);
                showHead();
                showInsideFolder(file);

                System.out.println("상위폴더인 " + parentPath + "로 이동되었습니다.");

            } else {
                System.out.println("존재하지 않는 파일(폴더)입니다.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
