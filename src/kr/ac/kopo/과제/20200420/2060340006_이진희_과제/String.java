package test;
// 주어진 문자열에서 입력받은 문자의 개수를 return
import java.util.Scanner;

public class String {
	
	public static int checkChar(String str, char ch) {
		
		int count=0;
		int searchIdx = -1;
		while((searchIdx = str.indexOf(ch,searchIdx+1)) != -1) { 
			count++;
		}
		return count;
	}

	private int indexOf(char ch, int i) {
		return 0;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
                         System.out.print("문자를 입력하세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.println(str+" 문자열에는 "+ch+"문자가 "+checkChar(strData,ch)+"개 있습니다.");
	}

}
