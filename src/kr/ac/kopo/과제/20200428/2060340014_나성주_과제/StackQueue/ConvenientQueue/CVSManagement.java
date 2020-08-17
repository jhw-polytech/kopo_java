package homework.day12.StackQueue.ConvenientQueue;

import java.util.Queue;

public class CVSManagement {


    public void receiveMilk(Queue<String> qu, String milk) {
        qu.add(milk);
    }

    public void justSoldMilk(Queue<String> qu) {
        System.out.println(qu.poll());
    }

    public void nextSellMilk(String msg, Queue<String> qu) {
        System.out.println(msg);
        System.out.println(qu.peek());
    }

    public void stockInfo(String msg, Queue<String> qu) {
        System.out.println(msg);
        System.out.println(qu);
    }

    public void isNeedOrder(String msg, Queue<String> qu) {
        System.out.println(msg);

        if (qu.isEmpty()) {
            System.out.println("새 오더가 필요합니다.");
        } else {
            System.out.println("다음과 같이 재고가 존재합니다.");
            System.out.println(qu);
        }
    }

    /*public void searchMilk(String msg, Queue<String> qu, Milk milk) {
        System.out.println(msg);
        System.out.printf("%s는 앞에서 %d번째에 있습니다.",milk, qu.);
    }*/

    public void endManage(String msg) {
        System.out.println(msg);
        System.out.println("=====================================================");
    }

/*
        cm.receiveMilk("금일 입고된 새로운 우유 정보");
        cm.justSoldMilk("방금 팔린 우유 정보");
        cm.nextSellMilk("가장 먼저 팔려야 하는 우유");
        cm.stockInfo("남은 우유 재고 정보");
        cm.isNeedOrder("우유 재고소진에 따른 새로운 오더 필요여부 확인");
        cm.searchMilk("특정일에 들어온 우유의 위치 확인");
        cm.endManage("금일 편의점 재고관리 종료");
*/


}
