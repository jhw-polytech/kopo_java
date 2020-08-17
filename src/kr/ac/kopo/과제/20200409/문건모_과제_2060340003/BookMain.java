package Practice0409;

/*
  보유하고 있는 책권수를 입력 :1
 1 book
 
 보유하고 있는 책권수를 입력 : 2
 2 books
 
 보유하고 있는 책권수를 입력 : -4
 잘못입력하셨습니다
 */

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("책권수를 입력하세요");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num<1) {
			System.out.println("잘못입력했습니다");
		}else if(num == 1) {
			System.out.println(num + "book");
		}else {
			System.out.println(num + "books");
		}
		
	}
}
