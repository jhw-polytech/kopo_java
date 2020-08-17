package homework.day14.IOManagement;

import java.io.File;
import java.util.Scanner;

public class RenameFile extends BasicFunction {

    Scanner sc = new Scanner(System.in);

    public void renameFile() {
        System.out.println("변경 대상인 폴더(파일)명을 입력해주세요.");
        String originFile = sc.nextLine();
        File file = new File(IOpath+originFile);
        try {
            if (file.exists()) {
                System.out.println("변경 예정인 이름을 입력해주세요.");
                String renameFile = sc.nextLine();
                File reFile = new File(IOpath + renameFile);

                if (!(IOpath + originFile).equals(IOpath + renameFile)) {
                    file.renameTo(reFile);
                }
            } else {
                System.out.println("존재하지 않는 폴더(파일)입니다. ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*public void renameFile() {
        System.out.println("변경 대상인 폴더(파일)명을 입력해주세요.");
        String originFile = sc.nextLine();
        System.out.println("변경 예정인 이름을 입력해주세요.");
        String renameFile = sc.nextLine();
        File file = new File(IOpath+originFile);
        File reFile = new File(IOpath+renameFile);
        if (file.exists() && !(IOpath + originFile).equals(IOpath + renameFile)) {
            file.renameTo(reFile);
        }
    }*/
}
