import java.util.Scanner;

public class icecreamMain {
	
	
	/*
		진희씨 요번과제는 쉬었지요??? ^^
		근데.. 클래스를 생성하실때는 명명규칙에 의해서 대문자로 시작하셔야해요~~
		잘보시면 이클립스에서 warning이 발생되었을거에요... 
		수정해주시면 될거 같아요
	*/

	public static void main(String[]args) {
	Scanner sc= new Scanner(System.in);	 //자리 생성
	

	System.out.println("아이스크림을 몇개 구입할래?");  //아이스크림 개수 입력
	int cnt= sc.nextInt();                      
	
	icecream[] ic = new icecream[cnt];  //cnt만큼 icecream 배열 생성
	
	for(int i = 0; i <cnt; i++) {
		ic[i] = new icecream();   //객체 인스턴스화,아이스크림 구매정보 저장 
	
		System.out.printf("***  %d번째 아이스크림 구매정보   ***", i + 1); //i+1번째(i=0부터 이므로) 
		 System.out.println(); 
		 System.out.print("아이스크림명 : "); //아이스크림명 출력
         ic[i].name = sc.next();  
         
         System.out.print("아이스크림가격 : "); //아이스크림 가격 출력 
         ic[i].price = sc.nextInt();
	}
	 System.out.printf("< 총 %d개의 아이스크림 구매정보 출력 >", cnt); 
	 System.out.println();  //엔터
	 System.out.println("번호    아이스크림명    아이스크림가격");
	 for (int i = 0; i <cnt; i++) { //생성한 cnt만큼 구매정보 출력 
		 System.out.println((i+1) +"\t"+ic[i].name+"\t"+ic[i].price); //줄맞춤 
	    }
	 }
   }