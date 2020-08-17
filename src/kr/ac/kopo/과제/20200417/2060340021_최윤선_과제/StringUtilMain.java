package homework07;
import java.util.*;
public class StringUtilMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringUtil su = new StringUtil();
		Scanner sc = new Scanner(System.in);
		
		
		//1번과제
		System.out.println("문자를 입력하세요. 대문자인지 알아봅시다.");
		char char01=sc.next().charAt(0);
		boolean char_result_01 = su.isUpperChar(char01);
		System.out.printf("%c는 대문자인가요? %b\n\n",char01,char_result_01);
		
		
		
		
		//2번과제
		System.out.println("문자를 입력하세요. 소문자인지 알아봅시다.");
		char char02=sc.next().charAt(0);
		boolean char_result_02 = su.isLowerChar(char02);
		System.out.printf("%c는 소문자인가요? %b\n\n",char02,char_result_02);
		
		
		
		
		
		//3번과제
		System.out.println("두 정수를 입력하세요. 큰 수를 찾아봅시다.\n");
		System.out.println("첫번째 정수 : ");
		int i =sc.nextInt();
		sc.nextLine();
		
		System.out.println("두번째 정수 : ");
		int j =sc.nextInt();
		sc.nextLine();
		int max = su.max(i, j);
		System.out.printf("%d 와 %d 중 큰수는? %d\n",i,j,max);
		
		
		
		
		
		
		//4번과제
		System.out.println("두 정수를 입력하세요. 작은 수를 찾아봅시다.\n");
		System.out.println("첫번째 정수 : ");
		int a =sc.nextInt();
		sc.nextLine();
		
		System.out.println("두번째 정수 : ");
		int b =sc.nextInt();
		sc.nextLine();
		int min = su.min(a, b);
		System.out.printf("%d 와 %d 중 작은수는? %d\n",a,b,min);
		
		
		
		
		
		
		//5번
		System.out.println("거꾸로 입력받고싶은 문자열 입력 : ");
		String input01 = sc.nextLine();
		String input01_rev = su.reverseString(input01);
		System.out.println(input01_rev);
		
		
		
		
		
		
		//6번
		System.out.println("대문자로 바꾸고 싶은 문자열 입력 : ");
		String input02 = sc.nextLine();
		String input02_upp = su.toUpperString(input02);
		System.out.println(input02_upp);
		
		
		
		
		
		
		
		//7번
		System.out.println("소문자로 바꾸고 싶은 문자열 입력 : ");
		String input03 = sc.nextLine();
		String input03_low = su.toLowerString(input03);
		System.out.println(input03_low);
		
		
		
	}

}
