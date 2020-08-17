package day03;

public class No5 {
    public static void main(String[] args) {

        int height = 0; // 달팽이가 올라온 높이

        for (int hour = 1; true; hour++) {

            if (height < 50) { // 높이가 50M 미만일 때 4M씩 올라감
                height += 4*1;
                System.out.printf("[%d시간 후] 달팽이가 올라간 총 높이 : %dM\n",hour,height);
            } else { // 높이가 50M 이상일 때 3M씩 올라감
                height += 3*1;
                System.out.printf("[%d시간 후] 달팽이가 올라간 총 높이 : %dM\n",hour,height);
            }
            if (height>=100) { //높이가 100M를 넘어가면 탈출 성공!
                System.out.printf("%d시간 만에 탈출 합니다.",hour);
                break;
            }
        }
    }
}
