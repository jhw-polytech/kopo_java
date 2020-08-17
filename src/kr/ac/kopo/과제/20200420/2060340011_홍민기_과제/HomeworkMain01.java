package kr.ac.kopo.day07.homework;

import java.util.Scanner;

/*
	민기씨 checkChar(), removChar()를 StringUtil클래스에 작성해놓고 main()에서 호출하지 그러셨어요?
	호출하는 방법을 적용시켜 볼라했던거였는데.. ㅎㅎㅎ
	잘하시니깐 상관은 없겠지만 그래도요~~ ^^
*/

public class HomeworkMain01 {
	
	public static int checkChar(String strData, char ch) {
		int count=0;
		int searchIdx = -1;
		while((searchIdx = strData.indexOf(ch,searchIdx+1)) != -1) { // 수업시간에 배운 내용으로...
			count++;
		}
		return count;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String strData = sc.nextLine();
		System.out.print("문자를 입력하세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.println(strData+" 문자열에는 "+ch+"가 "+checkChar(strData,ch)+"개 있습니다.");
	}

}
