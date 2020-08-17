package homework.BoardList;

// 죄송합니다 교수님...코드가 좀 많이 더럽습니다...나중에 같은 실수를 하지 않으려고 일부러 틀린 코드들에 대한 흔적을 남겨놨습니다.


import java.util.ArrayList;

public class Board {
    private static ArrayList<Post> boardList = new ArrayList<>();
    private static int postNum = 1;

    public Board() {

    }

    public Board(Post p) {
    }

    public int getPostNum() {
        return postNum++;
    }

    public void setPostNum(int postNum) {
        this.postNum = postNum;
    }

    public ArrayList<Post> getBoardList() {
        return boardList;
    }

    public void setBoardList(ArrayList<Post> boardList) {
        this.boardList = boardList;
    }
}
