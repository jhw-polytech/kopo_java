package homework.day12.Lotto.BinarySearch;

import java.util.Arrays;

public class WinCnt {

    private int winCnt = 0;

    public int getWinCnt(int[] userNums, int[] lottoNums) {


        for (int i = 0; i < userNums.length; i++) {
            BinarySearch bs = new BinarySearch();
            boolean isWin = false;
            isWin = bs.binarySearch(userNums[i],lottoNums);
            if (isWin) {
                winCnt += 1;
            }
        }
        return winCnt;
    }
}
