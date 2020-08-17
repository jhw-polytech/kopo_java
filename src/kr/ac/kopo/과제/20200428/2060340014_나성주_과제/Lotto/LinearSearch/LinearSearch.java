package homework.day12.Lotto.LinearSearch;

// 선형검색 방식을 이용한 당첨된 로또 개수 구하기

public class LinearSearch {

    private boolean searchResult;

    public boolean linearSearch(int userNum, int[] lottoNums) {

        for (int i = 0; i < lottoNums.length; i++) {
            if (userNum == lottoNums[i]) {
                searchResult = true;
            }
        }
        return searchResult;
    }


}
