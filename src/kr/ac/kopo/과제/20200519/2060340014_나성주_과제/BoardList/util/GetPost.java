package homework.BoardList.util;

import homework.BoardList.Board;
import homework.BoardList.Post;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GetPost extends Board{

    private Scanner sc;

    public GetPost() {
        sc = new Scanner(System.in);
    }

    public void getPost() {

//        ArrayList<Post> boardList = new ArrayList<>();
        if (getBoardList().size() != 0) {
            System.out.print("조회할 게시글 번호를 입력하세요 : ");
            int postNum = sc.nextInt();
            sc.nextLine();

            int idx = getBoardList().indexOf(new Post(postNum, null,null));

            System.out.printf("%-4s %-10s %-10s %-10s\n","번호","제목","글쓴이","등록일");
            if (getBoardList().get(idx) != null) {
                System.out.printf("%-4d %-10s %-10s %-10s\n",postNum, getBoardList().get(idx).getPostTitle(),getBoardList().get(idx).getPostWriter(),getBoardList().get(idx).getPostDate());
            } else {
                System.out.println("조회한 게시글이 존재하지 않습니다.");
            }
        } else {
            System.out.println("게시글이 존재하지 않습니다.");
        }
    }
    public void getAllPosts() {
//        ArrayList<Post> boardList = new ArrayList<>();
        if (getBoardList().size() != 0) {
            System.out.println("< 전체 게시글 조회 >");
            System.out.printf("%-4s %-10s %-10s %-10s\n","번호","제목","글쓴이","등록일");
            for (int i = 0; i < getBoardList().size(); i++) {
                System.out.printf("%-4d %-10s %-10s %-10s\n",getBoardList().get(i).getPostNum(), getBoardList().get(i).getPostTitle(),getBoardList().get(i).getPostWriter(),getBoardList().get(i).getPostDate());
            }


           /* Iterator<Post> it = getBoardList().iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }*/
        } else {
            System.out.println("게시글이 존재하지 않습니다.");
        }

//        if (Board.getBoardList() != null) {
//            for (int i = 0; i < Board.getBoardList().size(); i++) {
//                getPost(i);
//            }
//        } else {
//            System.out.println("게시글이 존재하지 않습니다.");
//        }

    }
}
