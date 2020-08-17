package homework.day12.Lotto.ListContainsSearch;

import homework.day12.Lotto.LinearSearch.LinearSearch;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class UserNum {

    private List<Integer> userNums = new ArrayList<>();

    public List<Integer> getUserNums(String msg, Scanner sc) {

        System.out.println(msg);
        for (int i = 0; i < 7; i++) {
            if (i == 6) {
                System.out.println("보너스 번호를 입력하세요.");
            }
            loops:
            while (true) {
                userNums.add(sc.nextInt());
                for (int j = 0; j < i; j++) {
                    if (userNums.get(i) == userNums.get(j)) {
                        System.out.println("중복된 숫자입니다. 다시 입력하세요.");
                        userNums.remove(i);
                        continue loops;
                    }
                }
                if (userNums.get(i) < 1 || userNums.get(i)>45) {
                    System.out.println("범위를 벗어난 숫자입니다. 1~45 숫자를 입력해주세요.");
                    userNums.remove(i);
                    continue loops;
                }
                break loops;
            }
        }
        return userNums;
    }

    public void showUserNums(String msg) {
        System.out.println(msg);
        Iterator<Integer> it = userNums.iterator();

        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }

    }
}


 /*       int[] userNums = new int[7];
        for (int i = 0; i < 7; i++) {
            do {
                userNums[i] = sc.nextInt();
                sc.nextLine();
                for (int j = 0; j < i; j++) {
                    if (userNums[i] == userNums[j]) {
                        System.out.println("중복된 숫자입니다. 다시 입력하세요.");
                        continue;
                    }
                }
                break;
            } while (true);
        }
        return userNums;
    }


}*/
/*


*/
/*
        int[] userNums = new int[7];
        for (int i = 0; i < 7; i++) {
            do {
                userNums[i] = sc.nextInt();
                for (int j = 0; j < i; j++) {
                    if (userNums[i] == userNums[j]) {
                        System.out.println("중복된 숫자입니다. 다시 입력하세요.");
                        continue;
                    }
                }
                break;
            } while (true);
        }
        return userNums;
    }


}
*/

/*
        List<Integer> userNums = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            while (true) {
                userNums.add(sc.nextInt());
                if (userNums.contains(userNums.get(i))) {
                    System.out.println("중복된 숫자입니다 다시 입력하세요..");
                    userNums.remove(i);
                } else {
                    break;
                }
            }
        }
        return userNums;
    }
}
*/


/*
            if (usersNum.contains())
        }


        int[] userNums = new int[7];
        for (int i = 0; i < 7; i++) {
            do {
                userNums[i] = sc.nextInt();
                for (int j = 0; j < i; j++) {
                    if (userNums[i] == userNums[j]) {
                        System.out.println("중복된 숫자입니다. 다시 입력하세요.");
                        continue;
                    }
                }
                break;
            } while (true);
        }
*/
