package homework.day14.IOManagement;

import java.io.File;
import java.util.Scanner;

public class DeleteFile extends BasicFunction {

    public void deleteFile() {
        Scanner sc = new Scanner(System.in);

        System.out.println("삭제할 폴더명을 입력해주세요.");
        String deleteFile = sc.nextLine();
        String deletePath = IOpath + deleteFile;
        File folder = new File(deletePath);

        try {
            if (folder.exists()) {
                if (folder.isDirectory()) {
                    while (folder.exists()) {
                        File[] folder_list = folder.listFiles(); //파일리스트 얻어오기

                        for (int j = 0; j < folder_list.length; j++) {
                            folder_list[j].delete(); //파일 삭제
                            System.out.println("파일이 삭제되었습니다.");

                        }

                        if (folder_list.length == 0) {
                            folder.delete(); //대상폴더 삭제
                            System.out.println("폴더가 삭제되었습니다.");
                        }
                    }
                } else {
                    System.out.println("폴더 형식이 아닙니다.");
                }
            } else {
                System.out.println("존재하지 않는 폴더입니다");
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
