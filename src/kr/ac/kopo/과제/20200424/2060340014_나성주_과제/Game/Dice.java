package homework.day10;

public class Dice implements Game {

    public Dice(){
        System.out.print(">주사위 값 맞추기 게임입니다.\n주사위를 선택하세요. (1~6 값 중 하나)\n");
    }


    @Override
    public int startGame(int you) {

        int gameResult;  // 이기면 1, 지면 -1을 담을 변수이자 리턴값
        int me = (int) (Math.random()*6) +1;
        if (you == me) {
            gameResult = 1;
            System.out.printf("You win! (상대방 숫자: %d)\n",me);

        } else {
            gameResult = -1;
            System.out.printf("You lose... (상대방 숫자: %d)\n",me);
        }
        return gameResult;
    }
}
