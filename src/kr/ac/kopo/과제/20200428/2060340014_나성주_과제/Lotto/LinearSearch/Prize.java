package homework.day12.Lotto.LinearSearch;

/*      1등: 6개 일치 -- 2_000_000_000원
        2등: 5개 일치+보너스 번호 일치 - 50_000_000원
        3등: 5개 일치 -- 1_400_000원
        4등: 4개 일치 -- 50_000원
        5등: 3개 일치 -- 5000원*/

public class Prize {

    private int[] prize;


    public void showPrize(int winCnt, boolean isBonusWin) {

        prize = new int[]{5_000, 50_000, 14_000_000, 2000_000_000, 50_000_000}; // 마지막 인덱스값은 6개 맞췄는데 그 안에 보너스 번호가 있을때의 상금

        if (winCnt > 0) {
            System.out.printf("총 %d개의 번호가 일치합니다. ", winCnt);
            if (winCnt == 1 || winCnt == 2) {
                System.out.println("상금은 없습니다.");
            }
            int i;
            if (winCnt >= 3 && winCnt <= 5) {
                i = winCnt - 3;
                System.out.printf("\n축하합니다! 상금 %d원을 수령해 가세요.\n", prize[i]);
            } else if (winCnt == 6 && isBonusWin) {
                System.out.printf("그중에 보너스 번호가 포함되어 있습니다.\n축하합니다! 상금 %d원을 수령해 가세요.\n", prize[4]);
            } else if (winCnt == 6 || winCnt == 7) {
                System.out.printf("\n축하합니다! 상금 %d원을 수령해 가세요.\n", prize[3]);
            }
        } else {
            System.out.println("일치하는 번호가 없습니다. 상금은 없습니다.");
        }
    }
}

            /*}

                if (winCnt == 3) {
                    System.out.printf("\n축하합니다! 상금 %d원을 수령해 가세요.\n", prize[0]);
                } else if (winCnt == 4) {
                    System.out.printf("\n축하합니다! 상금 %d원을 수령해 가세요.\n", prize[1]);
                } else if (winCnt == 5) {
                    System.out.printf("\n축하합니다! 상금 %d원을 수령해 가세요.\n", prize[2]);
                } else if (winCnt == 6 && isBonusWin) {
                    System.out.printf("그중에 보너스 번호가 포함되어 있습니다.\n축하합니다! 상금 %d원을 수령해 가세요.\n", prize[4]);
                }  else if (winCnt == 6 || winCnt == 7) {
                System.out.printf("\n축하합니다! 상금 %d원을 수령해 가세요.\n", prize[3]);
                }
*/


/*
                if (winCnt == i + 3) {
                    System.out.printf("축하합니다! 상금 %d원을 수령해 가세요.\n", prize[i]);
                }

                break;
*/




