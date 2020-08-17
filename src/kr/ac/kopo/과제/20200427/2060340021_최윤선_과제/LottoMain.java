package homework11;

import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ipt=0;
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("로또 번호 입력 : ");
		ipt=sc.nextInt();
		sc.nextLine();
		if ( (ipt <= 0) || (ipt>46) ) {
			throw new LottoException("입력하신 수는 1이상 45이하의 조건을 충족하지 않습니다.");
		}
		} catch(LottoException e){
			e.printStackTrace();
		} finally {
			System.out.println("로또를 종료합니다.");
		}
		
		
	}

}
