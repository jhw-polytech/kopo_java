package homework.day12.Lotto.ListContainsSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoExecute {

    static void lottoExecute() {

        Scanner sc = new Scanner(System.in);

        System.out.println("게임 수를 입력하세요.");
        int n = sc.nextInt();

        // 로또를 n번 시행할 예정
        for (int times = 0; times < n; times++) {

            System.out.printf("====%d번째 시행====================================\n",times+1);

            // 6개 번호 고르고, 마지막 보너스 번호 하나 고르기 (총 7개 번호)
            UserNum p = new UserNum();
            List<Integer> userNums;
            System.out.println("[사용자의 로또번호]");
            userNums = p.getUserNums("1-45 사이의 숫자를 입력해주세요.",sc);
            p.showUserNums("당신이 선택한 7개의 로또번호는...!");

            System.out.println();
            System.out.println();

            // 6개 번호 추첨하고, 마지막 보너스 번호 하나 추첨하기 (총 7개 번호)
            LottoNum ln = new LottoNum();
            List<Integer> lottoNums;
            lottoNums = ln.getLottoNums("[금주의 로또번호 추첨]");
            ln.show6LottoNums("금주의 6개 로또번호는...!");
            ln.showBonusLottoNum("금주의 보너스 번호는...!");

            System.out.println();
            System.out.println();

            // 보너스 번호를 맞췄는지 여부 확인
            BonusWin bw = new BonusWin();
            boolean isBonusWin = bw.getIsBonusWin(lottoNums, userNums);

            // 맞춘 번호 개수 불러오기
            WinCnt wc = new WinCnt();
            int winCnt = wc.getWinCnt(userNums, lottoNums);

            // 상금내역 불러오기
            System.out.println("[금주 나의 로또 결과]");
            Prize pr = new Prize();
            pr.showPrize(winCnt, isBonusWin);

            System.out.println();
            System.out.println("==================================================");
            System.out.println();

        }


    }
}

