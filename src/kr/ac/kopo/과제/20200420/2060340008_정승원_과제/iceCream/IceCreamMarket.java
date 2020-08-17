package kr.ac.kopo.day07.project.iceCream;

import java.util.Scanner;

// 아이스크림 객체를 관리하는 control class 생성
public class IceCreamMarket {

    private static int totalNumOfConsumer;
    private static int totalPrice;
    private static int totalNumOfIceCream;
    private IceCream[] iceArr; // 한명의 고객이 왔을때 판매 정보를 기억하는 배열
    private Scanner sc;

    // 기본 초기화하는 형태 생성
    public IceCreamMarket() {
        sc = new Scanner(System.in);
    }

    // String을 받는 메소드
    public String getStr(String msg) {
        System.out.println(msg);
        String name = sc.next();
        sc.nextLine();
        return name;
    }

    public int getInt(String msg) {
        System.out.println(msg);
        int num =  Integer.parseInt(sc.nextLine());
        return num;
    }

    public void open() {
        int cnt = getInt("아이스크림 몇개 구입할래?");

        IceCreamMarket.totalNumOfConsumer++; // 고객의 수를 누적한다.
        IceCreamMarket.totalNumOfIceCream += cnt; // 입력받은 아이스크림 개수를 저장한다.
        // 이만큼의 배열을 만들어 준다.
        iceArr = new IceCream[cnt];

        for(int i = 0; i < iceArr.length; i++) {
            System.out.println("*** "+ (i+1) +"번째 구매정보 입력 ***");
            String name = getStr("아이스크림명: ");
            int price = getInt("아이스크림 가격: ");
            IceCreamMarket.totalPrice += price; // price를 저장한다.
            iceArr[i] = new IceCream(name, price); // 입력받은 걸로 IceCream클래스의 객체를 생성한다.
        }

        print();

        stop: while (true) {
            String answer = getStr("계속 구매할래? (Y/N)");
            switch (answer) {
                case ("Y"):
                case ("y"):
                    // y가 입력되면 다시 입력할 수 있도록 한다.
                    open();
                    break stop;
                case ("N"):
                case ("n"):
                    // n이 입력되면 멈추게 된다.
                    printTotal();
                    break stop;
                default: // y/Y 혹은 n/N을 입력하지 않은 경우 다시 재입력하도록 예외처리
                    System.out.println(" Y 또는 N으로 다시 입력해주세요.");
            }
        }
    }

    public void print() {
        System.out.println("<총 "+ iceArr.length + "개 판매정보 출력>");
        System.out.println("번호\t아이스크림명\t가격");
        for (int i = 0 ; i < iceArr.length; i++) {
            IceCream ice = iceArr[i];
            System.out.printf("%3d\t%-10s\t%5d\n", (i+1), ice.getName(), ice.getPrice());
        }
    }

    public void printTotal() {
        System.out.printf("총 %d명의 고객이 아이스크림을 구매했습니다.\n", IceCreamMarket.totalNumOfConsumer);
        System.out.printf("판매된 아이스크림 총개수: %d개\n", IceCreamMarket.totalNumOfIceCream);
        System.out.printf("총 판매액: %d\n", IceCreamMarket.totalPrice);
    }
}
