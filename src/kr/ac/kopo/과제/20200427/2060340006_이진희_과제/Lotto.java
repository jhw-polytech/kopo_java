import java.util.Scanner;

/*과제1>
좋아하는 로또 번호를 입력하세요: 34
34를 포함해서 로또번호들을 추출하겠습니다.

좋아하는 로또번호를 입력하세요:77
LottoNumberException:1-45사이만 가능합니다. 77은 올바르지 않습니다. 
*/
public class Lotto {
	
	public static void main(String[] args) {
		
		 Scanner sc= new Scanner(System.in); //자리생성
	try {	                                  //예외가 발생할 만한 코드를 기술하는 부분
		 System.out.println("좋아하는 로또 번호를 입력하세요:");
		 int num = sc.nextInt(); 
		 System.out.println(num+"를 포함해서 로또번호들을 추출하겠습니다.");
		 System.out.println();
	     
		 if(num>=45) {
			 throw new LottoException("LottoNumberException:1-45사이만 가능합니다."+num+"은 올바르지 않습니다.");
		 }		//메서드 내에서 발생된 예외를 직접 처리하지 않고 간접처리 
	}catch(LottoException e) {   //try블럭에서 예외가 발생하면 예외를 처리하는 부분 
		// System.out.println("예외발생!!!!"+e.getMessage() ); 	//예외발생+ throw 메세지 출력  
		e.printStackTrace(); //오류 발생장소 확인 
	     }
		
	}
	
}
