package homework.day12.Lotto.SentinelLinearSearch;

// 보초법 선형검색 방식을 이용한 당첨된 로또 개수 구하기
// 선형 검색 알고리즘의 종료 조건을 검사하는 비용을 50% 줄일 수 있어 더욱 효율적


public class SentinelLinearSearch {

    private boolean searchResult;

    public boolean sentinelLinearSearch(int[] lottoNums, int num, int userNum) { // lottoNums: 검색할 배열, num: 검색할 배열 길이 +1(보초가 위치할 인덱스), userNum: 검색할 숫자

        int i = 0;
        lottoNums[num] = userNum;

        while (true) {
            if (lottoNums[i] == userNum)
                break;
            i += 1;
        }

        if (i == num) { // 마지막 보초를 만나서야 검색이 됐다면 찾는 대상이 없는 것이고
            searchResult = false;
        } else { // 보초 전에 검색이 됐다면 찾는 대상이 있는것
            searchResult = true;
        }
        return searchResult;
    }
}
