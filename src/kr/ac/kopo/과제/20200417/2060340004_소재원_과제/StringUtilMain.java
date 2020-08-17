package exam0417;

public class StringUtilMain {

	public static void main(String[] args) {
		
		StringUtil strUtil = new StringUtil();
		System.out.println(strUtil.isUpperChar('C'));
		System.out.println(strUtil.isUpperChar('c'));
		System.out.println(strUtil.isLowerChar('C'));
		System.out.println(strUtil.isLowerChar('c'));
		System.out.println(strUtil.max(10, 5));
		System.out.println(strUtil.min(9, 5));
		System.out.println(strUtil.reverseString("GoodBye"));
		System.out.println(strUtil.toUpperCase("Hello"));
		System.out.println(strUtil.toLowerCase("hELLO"));
	}
}
