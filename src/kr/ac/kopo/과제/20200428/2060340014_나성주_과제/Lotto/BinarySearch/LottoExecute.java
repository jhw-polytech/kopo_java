package homework.day12.Lotto.BinarySearch;

import java.util.Scanner;

public class LottoExecute {

    static void lottoExecute() {

        Scanner sc = new Scanner(System.in);

        System.out.println("게임 수를 입력하세요.");
        int n = sc.nextInt();

        // 로또를 n번 시행할 예정
        for (int times = 0; times < n; times++) {

            System.out.printf("[%d번째 시행]\n",times+1);

            // 6개 번호 고르고, 마지막 보너스 번호 하나 고르기 (총 7개 번호)
            UserNum p = new UserNum();
            int[] userNums = p.getUserNums("1-45 사이의 숫자를 입력해주세요.");
            System.out.println("당신이 선택한 7개의 로또번호는...!");
            for (int i : userNums) {
                System.out.print(i + " ");
            }

            System.out.println();
            System.out.println();


            // 6개 번호 추첨하고, 마지막 보너스 번호 하나 추첨하기 (총 7개 번호)
            LottoNum l = new LottoNum();
            int[] lottoNums = l.getLottoNums("금주의 6개 로또번호는...!");
            for (int i = 0; i < 6; i++) {
                System.out.print(lottoNums[i] + " ");
            }
//            int[] lottoNums = {1, 2, 3, 4, 5, 6, 7}; // 상금 주는 코드가 잘 짜였는지 확인...
            System.out.println();
            System.out.printf("금주의 보너스 번호는 %d입니다.", lottoNums[6]);

            System.out.println();
            System.out.println();


            // 보너스 번호를 맞췄는지 여부 확인
            BonusWin bw = new BonusWin();
            boolean isBonusWin = bw.getIsBonusWin(lottoNums, userNums);

            // 맞춘 번호 개수 가져오기
            WinCnt wc = new WinCnt();
            int winCnt = wc.getWinCnt(userNums, lottoNums);

            // 상금 가져오기
            Prize pr = new Prize();
            pr.showPrize(winCnt, isBonusWin);

            System.out.println();
            System.out.println("==================================================");

        }


    }
}

