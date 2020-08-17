package homework.day14.IOManagement;

import java.io.File;
import java.util.Scanner;

public class CreateFile extends BasicFunction {
    Scanner sc = new Scanner(System.in);

    public void createFile() {

        System.out.println("새로 만들 폴더명을 입력해주세요.");
        String newFile  = sc.nextLine();
        String newPath = IOpath+newFile;
        File Folder = new File(newPath);
        if (!Folder.exists()) {
            try{
                Folder.mkdir(); //폴더 생성합니다.
                System.out.println("폴더가 생성되었습니다.");
            }
            catch(Exception e){
                e.getStackTrace();
            }
        }else {
            System.out.println("이미 폴더가 생성되어 있습니다.");
        }

    }
}
