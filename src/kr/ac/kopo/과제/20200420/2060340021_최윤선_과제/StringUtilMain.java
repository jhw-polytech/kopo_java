package homework08;

import java.util.*;

public class StringUtilMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("과제 1번!!");
		System.out.println("문자열에서 특정 문자의 갯수 알아보기!");
		System.out.println("문자열을 입력하세요");
		String strData1 = sc.nextLine();
		System.out.println("갯수를 알고 싶은 특정 문자 입력");
		char ch = sc.nextLine().charAt(0);
		int num =StringUtil.checkChar(strData1, ch);	
		System.out.println(strData1+"에 포함된 "+ch+"의 갯수는? "+num+"\n\n\n");
		

		System.out.println("과제 2번!!");
		System.out.println("문자열에서 특정 문자를 제거해보자!");
		System.out.println("문자열을 입력하세요");
		String strData2 = sc.nextLine();
		System.out.println("문자열에서 제거하고 싶은 특정 문자 입력");
		char ch2 = sc.nextLine().charAt(0);
		String return_str = StringUtil.removeChar(strData2, ch2);
		System.out.println(strData2+"에서 "+ch2+"를 제거한 결과");
		System.out.println(return_str);
		
	}

}
