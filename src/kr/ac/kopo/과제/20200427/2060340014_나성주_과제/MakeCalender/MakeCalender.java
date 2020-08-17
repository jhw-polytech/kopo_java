package homework.day11ExceptionDateAPI.MakeCalender;

import java.util.Calendar;

public class MakeCalender {

    static void printCalender(int year, int month) {

        Calendar c = Calendar.getInstance();


        // 년 월 요일 타이틀
        System.out.printf("<< %d년 %d월 >>\n", year, month);
        System.out.printf("%-2s%-2s%-2s%-2s%-2s%-2s%-2s","일", "월", "화", "수", "목", "금", "토");
        System.out.println();
        // 년 월 날짜 세팅
        c.set(year, month - 1, 1);

        // 각 달의 1일 요일 구하기
        int startDate = c.get(Calendar.DAY_OF_WEEK);

        // 각 달의 마지막 일 구하기
        int lastDay = c.getActualMaximum(Calendar.DATE);

        // 각 달의 첫째주 출력문 구사하기
        for (int i = 1; i < startDate; i++) {
            System.out.printf("%3s","");
        }
        for (int i = 1; i <= 7 - startDate + 1; i++) {
            System.out.printf("%-3s", i);
        }
        System.out.println();

        // 둘째주 이상의 주 출력문 구사하기
        int cnt = 0;
        for (int i = 7 - startDate + 2; i <= lastDay; i++) {
            System.out.printf("%-3s", i);
            cnt += 1;
            if (cnt % 7 == 0) { // 일주일은 7일이므로 일곱번 출력해줬으면 다음줄로 넘어가기
                System.out.println();
            }
        }
        System.out.println();



    }
}
