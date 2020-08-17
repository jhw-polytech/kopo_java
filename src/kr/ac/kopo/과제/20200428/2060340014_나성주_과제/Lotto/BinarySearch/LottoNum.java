package homework.day12.Lotto.BinarySearch;

import java.util.Random;

public class LottoNum {

    private int[] lottoNums = new int[7];

    public int[] getLottoNums(String msg) {

        Random r = new Random();

        System.out.println(msg);
        for (int i = 0; i < 7; i++) {
            loops:
            while (true) {
                lottoNums[i] = r.nextInt(45) + 1;
                for (int j = 0; j < i; j++) {
                    if (lottoNums[i] == lottoNums[j]) {
                        continue loops;
                    }
                }
                break;
            }
        }
        return lottoNums;
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
