package homework.day07String;

import java.util.Scanner;

public class IceCreamMarket {

    private Scanner sc = new Scanner(System.in);
    private int iceCreamNum;    // 한 고객의 아이스크림 구입 개수
    private IceCream[] iceArr;  // 아이스크림 이름, 가격을 담고있는 배열
    private int cnt; // 고객 수
    private int iceCreamSum; // 아이스크림 충 판매 개수
    private int priceSum;  // 아이스크림 총 판매액



    public int getNum(String msg) {
        System.out.print(msg);
        int num = sc.nextInt();
        sc.nextLine();

        return num;
    }

    public String getStr(String msg) {
        System.out.print(msg);
        String str = sc.nextLine();

        return str;
    }

    // 아이스크림 구매(판매)정보
    public void saleInfo() {
        iceCreamNum = getNum("아이스크림 몇 개 구입할래? : ");
        iceCreamSum += iceCreamNum;

        iceArr = new IceCream[iceCreamNum];
        for (int i = 0; i < iceArr.length; i++) {

            System.out.printf("*** %d번째 아이스크림 구매정보 ***\n", i+1);
            String name = getStr("아이스크림명 : ");
            int price = getNum("아이스크림 가격 : ");
            priceSum += price;

            iceArr[i] = new IceCream(name, price);
        }

        print();
        cnt += 1;

        nextCustomer();
    }

    // 구매(판매)정보 출력
    public void print() {

        System.out.printf("< 총 %d개의 아이스크림 구매정보 출력 >\n",iceArr.length);
        System.out.print("번호\t아이스크림명\t아이스크림가격\n");

        for (int i = 0; i < iceArr.length; i++) {
            System.out.printf("%-5d %-15s %-15d\n", i+1, iceArr[i].getName() , iceArr[i].getPrice());
        }
    }

    // 다음 손님 체크 및 종합 구매(판매)정보 출력
    public void nextCustomer() {

        System.out.print("다음 고객이 있습니까? (Y/N) : ");
        String yesOrNo = sc.nextLine();

        if (yesOrNo.equals("Y")) {
            saleInfo();
        } else if (yesOrNo.equals("N")) {
            System.out.printf("총 %d명의 고객이 아이스크림을 구매했습니다.\n",cnt);
            System.out.printf("판매된 아이스크림 총 개수 : %d\n", iceCreamSum);
            System.out.printf("총 판매액 : %d\n", priceSum);
        } else {
            System.out.println("잘못된 입력입니다.");
        }
    }




}
