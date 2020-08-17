package homework.day12.StackQueue.Stack;

import java.util.Scanner;
import java.util.Stack;

public class StackUtil {

    public void stackInput(Stack<String> st, String str) {
        st.push(str);
    }

    public void stackDelete(String msg, Stack<String> st) {
        System.out.println(msg);
        System.out.println("삭제된 데이터: " + st.pop());
    }

    public void showStackData(Stack<String> myStack) {
        System.out.println(myStack);
    }

    public void showLastData(String msg, Stack<String> st) {
        System.out.println(msg);
        System.out.println("마지막 데이터: " + st.peek());
    }

    public void isStackEmpty(String msg, Stack<String> myStack) {
        System.out.println(msg);
        if (myStack.isEmpty()) {
            System.out.println("A. 네, 비어있습니다.");
        } else {
            System.out.printf("A. 아니요, %d개 데이터가 있습니다.\n",myStack.size());
        }
    }

    public void searchString(Stack<String> myStack, String str2) {

        System.out.println("A. "+(myStack.search(str2)) + "번");
    }
}
