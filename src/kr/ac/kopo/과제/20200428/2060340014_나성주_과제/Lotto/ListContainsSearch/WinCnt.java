package homework.day12.Lotto.ListContainsSearch;

import java.util.List;

public class WinCnt {

    private int winCnt = 0;

    public int getWinCnt(List<Integer> userNums, List<Integer> lottoNums) {

        for (int i = 0; i < lottoNums.size(); i++) {
            if (userNums.contains(lottoNums.get(i))) {
                winCnt += 1;
            }
        }
        return winCnt;
    }
}
