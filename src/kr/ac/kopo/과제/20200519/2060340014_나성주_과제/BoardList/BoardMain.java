package homework.day14.BoardList;

// 죄송합니다 교수님...코드가 좀 많이 더럽습니다...나중에 같은 실수를 하지 않으려고 일부러 틀린 코드들에 대한 흔적을 남겨놨습니다.


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
        1. 전체 게시물 조회
        2. 특정 글 번호 조회
        3. 글 등록
        4. 특정 글 수정
        5. 특정 글 삭제
        6. 전체 글 삭제
        0. 종료
        --------------------------------------------------
        메뉴 중 처리할 항목을 선택하세요 : 1
< 전체 게시글 조회 >
        번호     제목     글쓴이    등록일
        1       하하하    닌자      2020-04-28

        메뉴 중 처리할 항목을 선택하세요 : 0
        게시판 프로그램을 종료합니다.*/


import homework.day14.BoardList.util.DeletePost;
import homework.day14.BoardList.util.EditPost;
import homework.day14.BoardList.util.GetPost;
import homework.day14.BoardList.util.WritePost;

import java.util.Scanner;

public class BoardMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------------------------------------\n" +
                "        1. 전체 게시물 조회\n" +
                "        2. 특정 글 번호 조회\n" +
                "        3. 글 등록\n" +
                "        4. 특정 글 수정\n" +
                "        5. 특정 글 삭제\n" +
                "        6. 전체 글 삭제\n" +
                "        0. 종료\n" +
                "        --------------------------------------------------\n");


        while (true) {
            System.out.println("메뉴 중 처리할 항목을 선택하세요 : ");
            int n = sc.nextInt();
            sc.nextLine();
            if (n == 1) {
                GetPost gp = new GetPost();
                gp.getAllPosts();
            } else if (n == 2) {
                GetPost gp = new GetPost();
                gp.getPost();
            } else if (n == 3) {
                WritePost wp = new WritePost();
                wp.writePost();
            } else if (n == 4) {
                EditPost ep = new EditPost();
                ep.editPost();
            } else if (n == 5) {
                DeletePost dp = new DeletePost();
                dp.deletePost();
            } else if (n == 6) {
                DeletePost dp = new DeletePost();
                dp.deleteAllPosts();
            } else if (n == 0) {
                System.out.println("게시판 관리 프로그램을 종료합니다. ");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 0~6까지의 숫자를 입력하세요.");
            }
        }


    }
}
