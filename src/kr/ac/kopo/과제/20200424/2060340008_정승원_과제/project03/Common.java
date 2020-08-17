package kr.ac.kopo.day10.project.project03;

import java.util.Scanner;

/**
 * 
 * @author seung
 * 두 숫자의 최대 공약수를 구하는 프로그램을 작성
 */
public class Common {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1;
        int val2;
        int temp;
        
        System.out.print("첫번째 수를 입력하시오 : ");
        val1 = sc.nextInt();
        System.out.print("두번째 수를 입력하시오 : ");
        val2 = sc.nextInt();
        
        
        while (val1 != 0) { // val1이 0이 아닐때까지 실행한다.
        	if (val1 < val2) { // val1이 val2 미만인 경우,
        		temp = val1; // temp에 val1이 대입된다.
        		val1 = val2; // val2는 val1이 된다.
        		val2 = temp; // val2는 temp가 된다.
        	}
        	val1 = val1-val2; // val1-val2
        }

        System.out.println(val2);
        sc.close();
	}
}
