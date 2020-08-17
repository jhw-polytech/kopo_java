package exam0424.etc;

public class _03GCommonMeasure {

	public static int gcd(int num1, int num2) {
		int bigger, smaller;
		int result = 0;
		
		if (num1 > num2) {
			bigger = num1;
			smaller = num2;
		} else if (num1 == num2) {
			return num1;
		} else {
			bigger = num2; 
			smaller = num1;
		}
		
		for (int i = smaller; i >= 1; i-- ) {
			if ((bigger % i == 0) && (smaller % i == 0)) {
				result = i;
				break;
			}
		}
		System.out.print("최대공약수 : ");
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(gcd(2, 5));
		System.out.println(gcd(5, 15));
		System.out.println(gcd(250, 30));
		
	}
}
