package day03;

public class No9 {

    public static void main(String[] args) {

        // 각 열의 시작에 있어서 1열은 2단 -> 5단 -> 7단, 2열은 3 -> 6 -> 9, 3열은 4 -> 7 이라는 등차수열 규칙이 있다는 것을 이용했습니다.

        for (int j = 1; j <= 3; j++) {
            for (int i = 1; i <=9; i++) {
                System.out.printf("%d * %d = %d\t", (3*j-1), i, (3*j-1)*i); // 1열의 등차수열 공식: 3n-1 단
                System.out.printf("%d * %d = %d\t", (3*j), i, 3*j*i); // 2열의 등차수열 공식: 3n 단
                if ((3*j+1) != 10) { // 10단까지 나열하지 않기 위한 장치
                    System.out.printf("%d * %d = %d\t", (3*j+1), i, (3*j+1)*i); // 3열의 등차수열 공식: 3n+1 단
                }
                System.out.printf("\n");
            }

            System.out.printf("\n");
        }
    }
}

//To 이지유 교수님: 뭔가 어거지로 코드를 짠 느낌이 있는데 좀 더 효율적이거나 깔끔한 방법이 있으면 알려주시면 감사하겠습니다!