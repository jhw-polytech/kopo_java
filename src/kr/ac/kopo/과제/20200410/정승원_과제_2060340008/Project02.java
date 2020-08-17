package kr.ac.kopo.day03.project;

import java.util.Scanner;

/**
 * 
 * @author tess
4개의 정수를 입력받아 가장 큰수를 구하는 클래스  
정수는 각각 입력받아도 상관없습니다.
정수 4개를 입력하세요 : 89 4 222 6 
89,4,222,6 중 가장 큰수 :222
 */

public class Project02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
			이런 경우에는 myMax를 -1로 초기화하기 보다는 for문안에 if문을 넣어서 처음데이터를 myMax에 대입하는 코드가 더 좋아보입니다
			음수를 입력할 수도 있으니깐요
		*/

		int myMax = -1; // 양수인 정수가 들어온다는 가정을하고 -1로 최소값을 설정한다. 
		int a; // 들어올때마다 저장해줄 변수 선언 
		
		System.out.print("정수 4개를 입력하세요 : ");
		for (int i=0; i < 4; i++) { // 총 네 번을 돌면서 가장 큰 수로 갱신하는 식으로 한다. 
			a = sc.nextInt();
			if (a > myMax) { // a 보다 myMax가 작다면, 
				myMax = a; // 갱신한다. 
			}
			System.out.printf("%d ", a);
		}
		System.out.printf("중 가장 큰수: %d", myMax); // 가장 큰 값을 갱신하기 때문에 가장큰 값이 저장되어 최종출력된다. 

	}
}
