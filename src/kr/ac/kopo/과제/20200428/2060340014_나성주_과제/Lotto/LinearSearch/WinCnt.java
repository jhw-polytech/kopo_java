package homework.day12.Lotto.LinearSearch;

public class WinCnt {

    private int winCnt = 0;

    public int getWinCnt(int[] userNums, int[] lottoNums) {


        for (int i = 0; i < userNums.length; i++) {
            LinearSearch ls = new LinearSearch();
            boolean isWin = false;
            isWin = ls.linearSearch(userNums[i], lottoNums);
            if (isWin) {
                winCnt += 1;
            }
        }
        return winCnt;
    }
}
