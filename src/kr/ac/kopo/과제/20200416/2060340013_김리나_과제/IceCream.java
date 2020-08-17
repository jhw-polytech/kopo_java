package kr.ac.kopo.homework.classMethod;

/*
 * 다음의 결과를 보이는 프로그램을 작성하시오. 
 * 
 * 아이스크림 몇개 구입할래? 3 (입력)
 * 
 * *** 1 번째 아이스크림 구매정보 ***
 * 아이스크림명 : 메로나 (입력)
 * 아이스크림가격 : 1000 (입력)
 * 
 * *** 2 번째 아이스크림 구매정보 ***
 * 아이스크림명 : 월드콘 (입력)
 * 아이스크림가격 : 2000 (입력)
 * 
 * ...
 * 
 * < 총 3개의 아이스크림 구매정보 출력 >
 * 번호	아이스크림명	아이스크림가격
 * 1	메로나		1000
 * 2	월드콘		2000
 * 3	비비빅		800
 */
public class IceCream {
		String name; // 멤버변수를 생성해준다. 
		int price;
		
		/*
			리나씨 이렇게 코드를 작성하는 경우에는 static은 없어도 됩니다~~
			그리고 사실 printInfoEach() 메소드보다는 하나의 아이스크림객체를 출력하는 메소드의 기능이 더 올바를거 같아요
			하지만 메소드로 만들어보는 그 도전정신은 좋습니다!!!! ^^
		*/

		static void printInfoEach(int n, IceCream[] ic) { // 아이스크림 하나씩 출력할 메소드 생성 - 아이스크림개수 n과 아이스크림의 이름과 가격이 담긴 배열 ic를 매개변수로 받는다. 
			for(int i = 0; i < n; i++) {
				System.out.printf("%s %d %s", "*** ", i+1, "번째 아이스크림 구매정보 ***\n");
				System.out.println("아이스크림명 : " + ic[i].name); 
				System.out.println("아이스크림 가격 : " + ic[i].price); // 아이스크림 n개 각각의 이름과 가격을 출력한다. 
			}
		}
		static void printInfoAll(int n, IceCream[] ic) { // 아이스크림을 모두 출력할 메소드 생성 - 동일한 매개변수를 받는다. 
			System.out.println("< 총 " + n + "개의 아이스크림 구매정보 출력>");
			System.out.println("번호\t아이스크림명\t아이스크림가격");
			for(int i = 0; i < n; i++) {
				System.out.println(i+1 + "\t" + ic[i].name + "\t\t" + ic[i].price); // 아이스크림 n개의 이름과 가격을 모두 한번에 출력한다. 
			}
		}	
		 
}
