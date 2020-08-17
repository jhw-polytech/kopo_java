package homework.day14.IOManagement;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BasicFunction {

    public static String IOpath = "iotest\\"; // 기본 경로 설정
    public static File dir = new File(IOpath);

    public static void showHead() {
        System.out.println("===================================================================================================\n" +
                "                                      폴더 정보\n" +
                "===================================================================================================\n" +
                "이름                       종류                      크기(byte)                        마지막수정날짜\n" +
                "===================================================================================================\n");
    }

    public static void showInsideFolder(File file) {

        File[] fileList = file.listFiles();

        String fileName;
        String category;
        long fileSize;
        String lastTime;


        for (File f : fileList) {
            fileName = f.getName();

            if (f.isDirectory()) {
                category = "DIR";
            } else {
                category = "file";
            }
            fileSize = f.length();
            long modifiedTime = f.lastModified();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            lastTime = sdf.format(modifiedTime);

            System.out.printf("%-25s %-25s %-25d %-25s\n", fileName, category, fileSize, lastTime);
        }

    }
    public static void showSelection() {
        System.out.println("====================================================================================================");
        System.out.println("[C] 폴더생성  [R] 이름수정  [D] 삭제  [.] 상위폴더이동  [m] 하위폴더 이동  [Q] 종료\n");

    }


}
