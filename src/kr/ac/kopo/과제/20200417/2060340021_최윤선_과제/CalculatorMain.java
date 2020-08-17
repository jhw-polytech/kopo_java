package homework07;
import java.util.*;
public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Calculator cal = new Calculator();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("두 정수를 입력하세요!");
		System.out.println("첫번째 정수 : ");
		int a =sc.nextInt();
		sc.nextLine();
		
		System.out.println("두번째 정수 : ");
		int b =sc.nextInt();
		sc.nextLine();
		
		cal.four_fundamental(a,b);
		
		boolean result_a=true;
		boolean result_b=true;
		result_a=cal.chk_prime(a);
		result_b=cal.chk_prime(b);
		
		System.out.printf("%3d 소수체크 : %b\n",a,result_a);
		System.out.printf("%3d 소수체크 : %b\n",b,result_b);

	}

}
