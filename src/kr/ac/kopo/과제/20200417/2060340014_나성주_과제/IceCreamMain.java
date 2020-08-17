package homework.day06Class;

/*
9. 어제 과제 아이스크림구하는 코드에 메소드를 추가해서 작성해보세요
*/

/*
1. 다음의 결과를 보이는 프로그램을 작성하시오.
        아이스크림을 몇개 구입할래? 3 (입력)

        *** 1번째 아이스크림 구매정보 ***
        아이스크림명 : 메로나 (입력)
        아이스크림가격 : 1000 (입력)

        *** 2번째 아이스크림 구매정보 ***
        아이스크림명 : 월드콘 (입력)
        아이스크림가격 : 2000 (입력)

        *** 3번째 아이스크림 구매정보 ***
        아이스크림명 : 비비빅 (입력)
        아이스크림가격 : 800 (입력)

< 총 3개의 아이스크림 구매정보 출력 >
        번호 아이스크림명 아이스크림가격
        1 메로나 1000
        2 월드콘 2000
        3 비비빅 800
*/



public class IceCreamMain {
    public static void main(String[] args) {

        IceCream ice = new IceCream();


        ice.howManyInput();
        System.out.println();
        IceCream[] iceArr = new IceCream[ice.n];

        ice.infoInput(iceArr);

        // infoInput() 메소드 구현해서 대체
        /*for (int i = 0; i< ice.n; i++) {
            iceArr[i] = new IceCream();
            ice.titleInput(i);
            ice.nameInput();
            iceArr[i].name = ice.name;
            ice.priceInput();
            iceArr[i].price = ice.price;
        }*/

        System.out.println();

        ice.titleOutput(ice.n);
        System.out.println();

        ice.infoOutput(iceArr);

        // infoOutput() 메소드 구현해서 대체
        /*for (int i = 1; i <= ice.n; i++ ) {
            System.out.printf("%-5d%-15s%-15d\n", i, iceArr[i-1].name, iceArr[i-1].price);
        }
*/
    }
}
