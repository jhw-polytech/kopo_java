package exam0420;

public class SearchStringMain {

	public static void main(String[] args) {
		
		String str = "Hello World Java";
		System.out.println(SearchString.checkChar(str, 'o'));
		System.out.println(SearchString.checkChar(str, 'W'));
		System.out.println(SearchString.removeChar(str, 'l'));
		System.out.println(SearchString.removeChar(str, 'o'));

	}
}
