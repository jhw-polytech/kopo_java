package homework.day12.Lotto.LinearSearch;

// Linear 탐색 방식으로 당첨된 로또번호 개수 세기
/*1. 로또 게임
//        게임수를 입력하세요 : 3
        게임 1 : [2, 6, 13, 25, 20, 7]
        게임 2 : [2, 9, 3, 7, 38, 13]
        게임 3 : [40, 10, 38, 39, 42, 18]

        1등: 6개 일치 -- 2_000_000_000원
        2등: 5개 일치+보너스 번호 일치 - 50_000_000원
        3등: 5개 일치 -- 1_400_000원
        4등: 4개 일치 -- 50_000원
        5등: 3개 일치 -- 5000원

        알고리즘 4개이상...
        */

public class LottoMain {

    public static void main(String[] args) {
        LottoExecute.lottoExecute();
    }
}