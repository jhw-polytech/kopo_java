package homework.day12.BulletinBoard;

/*3. 게시판 관리 프로그램 (배열 작성)
        --------------------------------------------------
        1. 전체게시물 조회
        2. 글번호 조회
        3. 글등록
        4. 글수정
        5. 글삭제
        0. 종료
        --------------------------------------------------
        메뉴 중 처리할 항목을 선택하세요 : 3
        등록할 제목을 입력 : 하하하....
        등록할 글쓴이를 입력 : 닌자
        게시글이 등록되었습니다
        --------------------------------------------------
        1. 전체게시물 조회
        2. 글번호 조회
        3. 글등록
        4. 글수정
        5. 글삭제
        0. 종료
        --------------------------------------------------
        메뉴 중 처리할 항목을 선택하세요 : 1
< 전체 게시글 조회 >
        번호     제목     글쓴이    등록일
        1       하하하    닌자      2020-04-28

        메뉴 중 처리할 항목을 선택하세요 : 0
        게시판 프로그램을 종료합니다.*/

import java.util.Scanner;

public class BoardMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BoardUtil bu = new BoardUtil();

        System.out.println("--------------------------------------------------\n" +
                "        1. 전체게시물 조회\n" +
                "        2. 글번호 조회\n" +
                "        3. 글등록\n" +
                "        4. 글수정\n" +
                "        5. 글삭제\n" +
                "        0. 종료\n" +
                "        --------------------------------------------------\n");


        while (true) {
            System.out.println("메뉴 중 처리할 항목을 선택하세요 : ");
            int n = sc.nextInt();
            sc.nextLine();
            if (n == 1) {
                bu.getAllPosts();
            } else if (n == 2) {
                bu.getPost();
            } else if (n == 3) {
                bu.newWrite();
            } else if (n == 4) {
                bu.edit();
            } else if (n == 5) {
                bu.delete();
            } else if (n == 0) {
                System.out.println("게시판 프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 0~5까지의 숫자를 입력하세요.");
            }
        }


    }
}
