package homework.day12.Lotto.SentinelLinearSearch;

public class BonusWin {

    private boolean isBonusWin = false;

    public boolean getIsBonusWin(int[] lottoNums, int[] userNums) {
        int lastIndexNum = lottoNums.length-2; // 보초법 사용하려고 lottoNums의 배열크기를 8로 해줬기에 -1이 아닌 -2를 해줘야함
        for (int i = 0; i < userNums.length; i++) {
            if (lottoNums[lastIndexNum] == userNums[i]) {
                this.isBonusWin = true;
                break;
            }
        }
        return this.isBonusWin;
    }
}