package homework.day10;

import java.util.Scanner;

public class GameMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int winCnt = 0, loseCnt = 0, tieCnt = 0; // 몇 승, 몇 패, 몇 무 했는지 카운트할 변수
        label:
        while (true) {
            System.out.print("게임을 선택하세요\n\tA. 가위바위보\n\tB. 주사위 값 맞추기\n\tC. 종료\n");
            String selectGame = sc.nextLine();

            switch (selectGame) {
                case "A": {
                    ScissorsRockPaper srpGame = new ScissorsRockPaper();
                    int you = sc.nextInt();
                    sc.nextLine();
                    int srpGameResult = srpGame.startGame(you); // 결과값이 1=승, -1=패, 0=무 이렇게 인식할 변수
                    if (srpGameResult == 1) {
                        winCnt += 1;
                    } else if (srpGameResult == -1) {
                        loseCnt += 1;
                    } else {
                        tieCnt += 1;
                    }
                    System.out.println();
                    break;
                }
                case "B": {
                    Dice diceGame = new Dice();
                    int you = sc.nextInt();
                    sc.nextLine();
                    int diceGameResult = diceGame.startGame(you); // 결과값이 1=승, -1=패 이렇게 인식할 변수
                    if (diceGameResult == 1) {
                        winCnt += 1;
                    } else if (diceGameResult == -1) {
                        loseCnt += 1;
                    }
                    System.out.println();
                    break;
                }
                case "C":
                    System.out.printf("게임을 종료합니다.\n당신의 게임 전적은 %d승 %d패 %d무 입니다.", winCnt, loseCnt, tieCnt);
                    break label;
                default:
                    System.out.print("잘못된 입력입니다. 다시 입력하세요.\n");
                    break;
            }
        }
    }
}
