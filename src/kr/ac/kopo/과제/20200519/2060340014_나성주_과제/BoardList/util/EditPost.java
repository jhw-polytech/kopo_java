package homework.BoardList.util;

import homework.BoardList.Board;
import homework.BoardList.Post;

import java.util.ArrayList;
import java.util.Scanner;

public class EditPost extends Board{
    private Scanner sc;

    public EditPost() {
        sc = new Scanner(System.in);
    }

    public void editPost() {
//        ArrayList<Post> boardList = new ArrayList<>();

        if (getBoardList().size() != 0) {
            System.out.print("수정할 게시글 번호를 입력하세요 : ");
            int postNum = sc.nextInt();
            sc.nextLine();
            int idx = getBoardList().indexOf(new Post(postNum, null, null)); // indexOf 사용하려고 equals를 수정해주느라 밤을 꼴딱새웠네요...근데 뭔가 null을 사용해주는게 별로 마음에 안듭니다... equals를 오버라이딩하는것에 대해 수업때 다시 한번 여쭤보고싶습니다.
            if (getBoardList().get(idx) != null) {
                System.out.print("제목을 수정하세요 : ");
                String rewriteTitle = sc.nextLine();
                getBoardList().get(idx).setPostTitle(rewriteTitle);
                System.out.printf("%d번 게시글 제목이 수정되었습니다.\n", postNum);
            } else {
                System.out.println("선택한 게시글이 존재하지 않습니다.");
            }
        } else {
            System.out.println("게시글이 존재하지 않습니다.");
        }
//        boardList.set(num,boardList.get(num).setPostTitle(rewriteTitle));



    }
}
