package homework.day12.BulletinBoard;

import java.util.Scanner;

public class BoardUtil {

    private Board[] boardList = new Board[100]; // 게시글을 100개 올릴수있는 배열 생성
    private int num;//게시글 번호

    Scanner sc = new Scanner(System.in);

    public void newWrite() {

        System.out.print("등록할 제목을 입력:\n");
        String title = sc.nextLine();
        System.out.print("등록할 글쓴이를 입력:\n");
        String writer = sc.nextLine();
        boardList[num] = new Board(num + 1, title, writer);
        System.out.println("게시물이 등록되었습니다.");
        num++;
    }

    public void edit() {
        System.out.println("수정할 글번호 입력:");
        int postNum = sc.nextInt();
        sc.nextLine();
        Board bd = boardList[postNum - 1];
        System.out.println("글제목을 수정하세요.");
        String title = sc.nextLine();
        bd.setTitle(title);
        System.out.println("수정되었습니다.");
    }

    public void delete() {
        System.out.println("삭제할 글번호 입력:");
        int postNum = sc.nextInt();
        sc.nextLine();
        boardList[postNum - 1] = null;
        System.out.println("삭제되었습니다.");
    }

    public void getPost() {
        System.out.println("조회할 글번호 입력:");
        int postNum = sc.nextInt();
        sc.nextLine();
        Board bd = boardList[postNum - 1];
        System.out.printf("%-3s %-10s %-10s %-10s\n","번호","제목","글쓴이","등록일");
        System.out.printf("%-3s %-10s %-10s %-10s\n", postNum, bd.getTitle(), bd.getWriter(), bd.getPostDate());//,boardList[postNum].getTitle(),boardList[postNum],getWriter(),boardList[postNum].getPostDate()
    }

    public void getAllPosts() {
        System.out.println("< 전체 게시글 조회 >");
        System.out.printf("%-3s %-7s %-8s %-10s\n","번호","제목","글쓴이","등록일");
        for (int i = 0; i < num; i++) {
            Board bd = boardList[i];
            if (boardList[i] == null) {
            } else {
                System.out.printf("%-3s %-10s %-10s %-10s\n", i + 1, bd.getTitle(), bd.getWriter(), bd.getPostDate());
            }
        }
        System.out.println();
    }

}
