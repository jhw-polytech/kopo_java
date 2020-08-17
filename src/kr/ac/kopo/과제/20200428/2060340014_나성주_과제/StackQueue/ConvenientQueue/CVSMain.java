package homework.day12.StackQueue.ConvenientQueue;

/*
<편의점 관리자는 선입선출을 원한다...!>
1. 편의점 입고
 5/1에 들어온 우유
 5/2에 들어온 우유
 5/3에 들어온 우유
 5/4에 들어온 우유

2. 관리자가 원하는 고객의 우유 구매 순서 (우유의 선입선출이 관리자가 바라는 바)
 5/1에 들어온 우유
 5/2에 들어온 우유
 5/3에 들어온 우유
 5/4에 들어온 우유

3. 남은 우유 재고조사
4. 가장 먼저 나가야하는 우유
5. 재고가 없으면 새로 주문
6. 5/2에 들어온 우유가 어디에 위치에 있지? (Queue에 search 기능이 없어서 생략...)
7. 오늘의 편의점 재고관리 종료

*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CVSMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CVSManagement cm = new CVSManagement();
        Queue<String> qu = new LinkedList<>();
        Milk mk = new Milk();

        System.out.println("=====편의점 내 우유 재고관리 시작====================");

        System.out.println("1. 새로운 우유 입고\n" +
                "2. 방금 판매된 우유(선입선출 기준으로 판매)\n" +
                "3. 가장 먼저 나가야하는 우유\n" +
                "4. 남은 우유 재고조사\n" +
                "5. 재고가 없으면 새로 주문\n"
                /*"6. 5/2에 들어온 우유가 어디에 위치에 있지?\n"*/ +
                "7. 오늘의 편의점 재고관리 종료\n");

        while (true) {
            System.out.println(">관리 항목을 선택하세요.");
            int n = sc.nextInt();
            sc.nextLine();

            if (n == 1) {
                System.out.println("[금일 입고된 새로운 우유 정보]");
                System.out.println("(입고된 일자를 입력하세요.)");
                mk.setMilk(sc.nextLine());
                cm.receiveMilk(qu, mk.getMilk());
            } else if (n == 2) {
                System.out.println("[방금 팔린 우유 정보]");
                cm.justSoldMilk(qu);
            } else if (n == 3) {
                cm.nextSellMilk("[가장 먼저 팔려야 하는 우유]", qu);
            } else if (n == 4) {
                cm.stockInfo("[남은 우유 재고 정보]", qu);
            } else if (n == 5) {
                cm.isNeedOrder("[우유 재고소진에 따른 새로운 오더 필요여부 확인]", qu);
            }/*else if (n==6) {
                cm.searchMilk("특정일에 들어온 우유의 위치 확인");
            }*/ else if (n == 7) {
                cm.endManage("[금일 편의점 재고관리 종료]");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 1부터 7까지(6 제외)의 숫자를 입력하세요.");
            }
        }

    }


}
