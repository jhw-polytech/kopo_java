package homework.day04;

public class No5_2 {
    public static void main(String[] args) {
        /*
                제가 생각했던 알고리즘 코드는 아니네요~~
                답은 잘나오지만 한번 제가 말한 코드와 맞는지 생각해주세요...^^

                => 수정했습니다!
         */

        int[] sosuArray = new int[99]; // 소수를 담을 배열

        for (int i = 0; i <= 98; i++) { // 2~100 까지 숫자 담기
            sosuArray[i] = i+2;
        }


        for (int i = 0; i <= 98; i++) { // 소수가 아닌 수는 모두 0으로 만들어주기
            for (int j = i+1; j <= 98; j++) {
                if (sosuArray[i] != 0 && sosuArray[j] % sosuArray[i] == 0) {
                    sosuArray[j] = 0;
                }
            }
        }

        System.out.println("< 2~100 사이의 소수 출력 >");
        for (int i : sosuArray) { //
            System.out.print(i != 0? i+" " : "");
        }
    }
}
