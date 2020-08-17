package test;
// 주어진 문자열에서 입력받은 문자를 제거한 문자열을 return
 
public class String2 {
	public static String removeChar(String oriStr, char delChar) {
		
		StringBuffer removeStr = new StringBuffer();     //delChar 문자를 제외할 문자열
		
		for(int i=0;i<oriStr.length();i++) {
		   if(oriStr.charAt(i)!=delChar) {		// oriStr문자열이 delChar와 일치하지 않으면 
			removeStr.append(oriStr.charAt(i));     //removeStr에 문자를 담는다.
			}
		}
		return removeStr.toString();	//  String타입으로 리턴
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		
                         String oriStr = sc.nextLine();
		System.out.print("문자를 입력하세요 : ");
		char delChar = sc.nextLine().charAt(0);
		
		System.out.println(oriStr+" 문자열에서 "+delChar+"을 제거한 문자열은 "+removeChar(oriStr,delChar)+"입니다.");
	}

}
