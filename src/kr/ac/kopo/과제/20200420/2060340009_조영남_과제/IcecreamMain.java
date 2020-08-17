package kr.ac.yeongnam.day07.homework;


public class IcecreamMain {

	public static void main(String[] args) {

		IcecreamMarket market = new IcecreamMarket();
		market.buy();
			
		
		/* 이전 코드
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이스크림을 몇개 구입하시겠습니까? : ");
		int cnt = Integer.parseInt(sc.nextLine());  
		System.out.println();
		
		Icecream ice = new Icecream(); // Icecream 타입의 객체 생성
		ice.info(cnt); // ice 객체의 info 메소드 실행(아이스크림 개수를 인자로 전달)
		*/
		
		/* 이전 코드
		 * 
		 * Icecream[] iceArr = new Icecream[cnt]; // Iceream 타입의 배열을 생성한다.
		 * 
		 * for(int i = 0; i < iceArr.length; i++) { iceArr[i] = new Icecream(); // 배열에
		 * 객체를 할당한다.
		 * 
		 * System.out.println("*** " + (i+1) + "번째 아이스크림 구매 정보 ***");
		 * System.out.print("아이스크림명 : "); iceArr[i].name = sc.nextLine();
		 * 
		 * System.out.print("아이스크림 가격 : "); iceArr[i].price =
		 * Integer.parseInt(sc.nextLine()); }
		 * 
		 * System.out.println("< 총 " + cnt + "개의 아이스크림 구매정보 출력 >");
		 * 
		 * System.out.print("번호   " + "아이스크림명   " + "아이스크림가격\n");
		 * //System.out.printf("%s\t %s\t %s\n", "번호", "아이스크림명", "아이스크림가격"); for(int i =
		 * 1; i <= cnt; i++) { System.out.printf("%3d  %7s  %15d\n", i,
		 * iceArr[i-1].name, iceArr[i-1].price); }
		 */
	}
}
