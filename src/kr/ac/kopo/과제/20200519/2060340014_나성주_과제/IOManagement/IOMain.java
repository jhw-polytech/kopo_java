package homework.day14.IOManagement;

/*      ==========================================
        iotest
        ===========================================
        이름       종류      크기   마지막수정날짜
        ===========================================
        하마      DIR
        새폴더       DIR
        aaa.txt      파일      15byte   2020-05-19 11:59:22

        [C] 폴더 생성 [R] 이름수정 [D] 삭제 [.] 상위폴더이동 [m] 하위폴더 이동
        [Q] 종료

        선택 : m 새폴더 -> 새폴더로 이동함

        ==========================================
        iotest / 새폴더정보
        ===========================================
        이름       종류      크기   마지막수정날짜
        ===========================================
        고니      DIR
        ============================================

        [C] 폴더 생성 [R] 이름수정 [D] 삭제 [.] 상위폴더이동 [m] 하위폴더 이동
        [Q] 종료
        선택 : Q 종료
*/

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class IOMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BasicFunction.showHead();
        BasicFunction.showInsideFolder(BasicFunction.dir);
        BasicFunction.showSelection();

        while(true) {
            System.out.print("선택: ");
            String selection = sc.nextLine();
            char ch = selection.charAt(0);

            if (ch == 'c' || ch == 'C') {
                CreateFile cf = new CreateFile();
                cf.createFile();

            } else if (ch == 'r'|| ch == 'R') {
                RenameFile rf = new RenameFile();
                rf.renameFile();

            } else if (ch== 'd'|| ch == 'D') {
                DeleteFile df = new DeleteFile();
                df.deleteFile();

            } else if ( ch == '.') {
                MoveFile mf = new MoveFile();
                mf.moveUpperFile();

            } else if (ch == 'm' || ch == 'M') {
                MoveFile mf = new MoveFile();
                mf.moveLowerFile();

            } else if (ch== 'q'|| ch == 'Q') {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 선택입니다. 다시 선택해주세요.");

            }
        }



    }
}
