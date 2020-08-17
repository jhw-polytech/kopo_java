package homework.day12.Lotto.ListContainsSearch;

import java.util.List;

public class BonusWin {

    private boolean isBonusWin = false;

    public boolean getIsBonusWin(List<Integer> lottoNums, List<Integer> userNums) {

        int lastIndexNum = lottoNums.size()-1;
        if (userNums.contains(lottoNums.get(lastIndexNum))) {
            isBonusWin = true;
        }
        return isBonusWin;
    }
}