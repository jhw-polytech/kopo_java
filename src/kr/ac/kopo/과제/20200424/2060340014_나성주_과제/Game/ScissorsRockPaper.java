package homework.day10;


public class ScissorsRockPaper implements Game {

/*  이 필드를 어떻게 활용할지...
    final static int SCISSORS = 1;
    final static int ROCK = 2;
    final static int PAPER = 3;
    ==> 글게요.. 어떻게 사용할까요...
        컴퓨터나, 내가 낸 숫자를 기억해서 이 변수값을 가지게 해야할지~~
        한번 고민해보세요.
*/

    public ScissorsRockPaper() {
        System.out.print(">가위바위보 게임입니다.\n가위바위보 중 하나를 선택하세요.\n(1:가위, 2:바위, 3:보)\n");
    }

    @Override
    public int startGame(int you) {

        int me = (int)(Math.random()*3)+1;
        String meStr = (me == 1 ? "가위" : me == 2 ? "바위" : "보"); // 상대방이 낸 것을 출력하기 위한 문자열 변수
        int gameResult; // 비기면 0, 이기면 1, 지면 -1을 담을 변수이자 리턴값
        if (you == me) {
            System.out.printf("비겼습니다. (상대방이 낸 것: %s)\n",meStr);
            gameResult = 0;
        } else if (you == 1 && me == 3 || you == 2 && me == 1 || you == 3 && me == 2) {
            System.out.printf("이겼습니다! (상대방이 낸 것: %s)\n",meStr);
            gameResult = 1;
        } else {
            System.out.printf("졌습니다...(상대방이 낸 것: %s)\n",meStr);
            gameResult = -1;
        }
        return gameResult;
    }
}
