package homework.day12.Lotto.SentinelLinearSearch;

public class WinCnt {

    private int winCnt = 0;

    public int getWinCnt(int[] userNums, int[] lottoNums) {

        for (int i = 0; i < userNums.length; i++) {
            SentinelLinearSearch sls = new SentinelLinearSearch();
            boolean isWin = false;
            isWin = sls.sentinelLinearSearch(lottoNums, lottoNums.length-1, userNums[i]);
            if (isWin) {
                winCnt += 1;
            }
        }
        return winCnt;
    }
}
