package homework.day12.Lotto.ListContainsSearch;

import java.util.*;

public class LottoNum {

    private List<Integer> lottoNums = new ArrayList<>();

    public List<Integer> getLottoNums(String msg) {

        Random r = new Random();

        System.out.println(msg);
        for (int i = 0; i < 7; i++) {
            loops:
            while (true) {
                lottoNums.add(r.nextInt(45) + 1);
                for (int j = 0; j < i; j++) {
                    if (lottoNums.get(i) == lottoNums.get(j)) {
                        lottoNums.remove(i);
                        continue loops;
                    }
                }
                break;
            }
        }
        return lottoNums;
    }


    public void show6LottoNums(String msg) {

        System.out.println(msg);

        for (int i = 0; i < lottoNums.size() - 1; i++) {
            System.out.print(lottoNums.get(i) + " ");
        }
        System.out.println();
    }

    public void showBonusLottoNum(String msg) {

        System.out.println(msg);

        int lastIndex = lottoNums.size() - 1;
        System.out.print(lottoNums.get(lastIndex));
    }
}


/*
                for (int j = 0; i > 0 && j < i; j++) {
                    if (lottoNums7[i] == lottoNums7[j]) {
                        System.out.println("기존에 골랐던 숫자입니다. 다시 고르세요.");
*/
//                        throw new DuplicateLottoNumException("기존에 골랐던 숫자입니다. 다시 고르세요.");
//                    }
//                }
//            } catch (DuplicateLottoNumException dlne) {
//                System.out.println("DuplicateLottoNum: " + dlne.getMessage());
//            }
