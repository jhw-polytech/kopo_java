package exam0409;

public class no1 {
	public static void main(String[] args) {
		
		/*
		 * String AEIOU english 변수에 담고,
		 * .charAt() 메소드를 통해서 반복문으로 english의 각 index의 해당하는 값들을
		 * temp 변수에 담고, int형으로 형변환하여 출력한다.
		 */
		String english = "AEIOU";
		
		for (int i = 0; i < 5; i++) {
			char temp = english.charAt(i);
			System.out.println(temp + " = " + (int) temp);
		}
	}
}
