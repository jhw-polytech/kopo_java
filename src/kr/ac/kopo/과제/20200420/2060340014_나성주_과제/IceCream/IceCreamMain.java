package homework.day07String;

/*
아이스크림 몇개 구입할래? 1
        1번
        아이스크림명 :
        아이스크림가격:

        출력
        계속구매할래?(Y/N) =>  Y

        아이스크림 몇개 구입할래? 3
        1번
        아이스크림명 :
        아이스크림가격:
        2번
        아이스크림명 :
        아이스크림가격:
        3번
        아이스크림명 :
        아이스크림가격:
        출력
        계속구매할래?(Y/N) =>  y

        아이스크림 몇개 구입할래? 2
        1번
        아이스크림명 :
        아이스크림가격:
        2번
        아이스크림명 :
        아이스크림가격:
        출력
        계속구매할래?(Y/N) =>  y

        총 3명의 고객이 아이스크림을 구매했습니다
        판매된 아이스크림 총개수 : 5개
        총 판매액 : xxx
        */


public class IceCreamMain {

    public static void main(String[] args) {
        
        IceCreamMarket market = new IceCreamMarket();
        
        market.saleInfo();
    }
}
