package homework.day12.StackQueue.Stack;

/*
List<String>을 이용하여 STACK,  QUEUE 방식으로 동작하는 프로그램 각각 작성

        < STACK >
        1. 데이터 입력
        2. 데이터 삭제
        3. 전체 데이터 출력([0] ~ [size()-1])
        4. 가장 마지막 데이터 출력
        5. 스택이 비어있는 상태인지 확인
        6. 데이터의 위치 찾기 (뒤로가기 몇 번? (1번 = 마지막 데이터))
        7. 종료
*/

import java.util.Scanner;
import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<String> myStack = new Stack<>();
        StackUtil su = new StackUtil();

        System.out.println("====< STACK >===========================\n" +
                "1. 데이터 입력\n" +
                "2. 데이터 삭제\n" +
                "3. 전체 데이터 출력([0] ~ [size()-1])\n" +
                "4. 가장 마지막 데이터 출력\n" +
                "5. 스택이 비어있는 상태인지 확인\n" +
                "6. 데이터의 위치 찾기 (뒤로가기 몇 번? (1번 = 마지막 데이터))\n" +
                "7. 종료");

        while (true) {
            System.out.println(">실행할 명령 번호를 입력하세요.");
            int selectNum = sc.nextInt(); // 정수 외의 타입형을 입력했을때 예외처리 해주는거 한번 해보기
            sc.nextLine();
            if (selectNum == 1) {
                System.out.println("Stack에 넣을 문자열을 입력하세요.");
                String str = sc.nextLine();
                su.stackInput(myStack,str);
            } else if (selectNum == 2) {
                su.stackDelete("Stack의 마지막 문자열을 삭제합니다.", myStack);
            } else if (selectNum == 3) {
                System.out.println("Stack 내 모든 데이터를 출력합니다.");
                su.showStackData(myStack);
            } else if (selectNum == 4) {
                su.showLastData("가장 마지막 데이터를 출력합니다.", myStack);
            } else if (selectNum == 5) {
                su.isStackEmpty("Q. Stack이 비어있습니까? ",myStack);
            } else if (selectNum == 6) { // search 메소드는 LinkedList에서는 활용할 수 없었다...그래서 Stack클래스로 다시 코드를 구현해보았다.
                System.out.println("찾고 싶은 문자열");
                String str2 = sc.nextLine();
                System.out.println("Q. 해당 문자열을 찾기 위해 뒤로가기를 몇 번해야 합니까?");
                su.searchString(myStack,str2); // 웹사이트에서 뒤로가기 느낌으로...
            } else if (selectNum == 7) {
                break;
            } else {
                System.out.println("잘못된 입력입니다. 1부터 7까지의 숫자를 입력하세요. ");
            }
        }

    }

}
