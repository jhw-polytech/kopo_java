package exam0424.etc;

public class _06ThreeSixNine {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 99; i++) {
			
			String str = i+"";
			if ((str.contains("3") || (str.contains("6")) || (str.contains("9")))) {
				System.out.println(str + " 짝");
				
			}

		}
	}
}
