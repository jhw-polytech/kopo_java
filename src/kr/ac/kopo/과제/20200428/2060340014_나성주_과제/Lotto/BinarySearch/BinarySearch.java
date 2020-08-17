package homework.day12.Lotto.BinarySearch;

// 이분검색 방식을 이용한 당첨된 로또 개수 구하기

import java.util.Arrays;

public class BinarySearch {

    private boolean searchResult;

    public boolean binarySearch(int userNum, int[] lottoNums) {

        Arrays.sort(lottoNums); // 배열 내 값들을 오름차순으로 정리

        int low = 0;
        int high = lottoNums.length - 1;
        int mid;
//        searchResult = false;
        while (low <= high) {
            mid = (low + high) / 2;
            if (lottoNums[mid] == userNum) {
                searchResult = true;
                break;
            } else if (lottoNums[mid] > userNum) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return searchResult;
    }
}
