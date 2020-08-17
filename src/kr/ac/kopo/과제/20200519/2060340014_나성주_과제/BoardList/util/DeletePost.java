package homework.BoardList.util;

import homework.BoardList.Board;
import homework.BoardList.Post;

import java.util.ArrayList;
import java.util.Scanner;

public class DeletePost extends Board{

    private Scanner sc;

    public DeletePost() {
        sc = new Scanner(System.in);
    }

    public void deletePost(){ //해당 인덱스의 객체 삭제하고

//        Board bd = new Board();
        if(getBoardList().size() != 0) {
            System.out.print("삭제할 글번호를 입력하세요 : ");
            int postNum = sc.nextInt();
            int idx = getBoardList().indexOf(new Post(postNum,null,null));
            if (getBoardList().get(idx) != null) {
                getBoardList().remove(idx);
                System.out.printf("%d번 게시글이 삭제되었습니다.\n", postNum);
            } else {
                System.out.println("조회한 게시글이 존재하지 않습니다.");
            }
        } else {
            System.out.println("게시글이 존재하지 않습니다.");
        }

    }
    public void deleteAllPosts(){
//        ArrayList<Post> boardList = new ArrayList<>();

        if (getBoardList().size() != 0) {
            getBoardList().clear();
            System.out.println("게시글이 전부 삭제되었습니다.");
        } else {
            System.out.println("게시글이 존재하지 않습니다.");
        }

    }

}
