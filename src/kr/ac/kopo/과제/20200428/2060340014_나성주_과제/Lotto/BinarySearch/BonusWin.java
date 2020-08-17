package homework.day12.Lotto.BinarySearch;

public class BonusWin {

    private boolean isBonusWin = false;

    public boolean getIsBonusWin(int[] lottoNums, int[] userNums) {
        int lastIndexNum = lottoNums.length-1;
        for (int i = 0; i < userNums.length; i++) {
            if (lottoNums[lastIndexNum] == userNums[i]) {
                this.isBonusWin = true;
                break;
            }
        }
        return this.isBonusWin;
    }
}