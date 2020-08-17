package Assignmnet11;

import java.util.Scanner;

public class Lotto{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		
		try {
				System.out.print("좋아하는 로또 번호를 입력하세요 :");
				int num=sc.nextInt();
				if(num==0 || num>45 ) {
					throw new LottoNumberException("1~45의 값만 입력되야합니다. 현재 입력한 값: " + num);
				}
				System.out.print(num+"를 포함해서 로또번호들을 출력하겠습니다.");
			
			}catch(Exception e) {
				e.printStackTrace();
				
			}
		
	}

}

