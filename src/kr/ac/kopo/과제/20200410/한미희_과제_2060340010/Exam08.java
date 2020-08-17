package kr.ac.kopo.day3.assignment;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
	//시작단과 종료단을 입력받아 구구단 출력
		
		//시작단 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("시작단을 입력 : ");
		int startTimesTable = sc.nextInt();
		//종료단 입력받기
		System.out.println("종료단을 입력 : ");
		int endTimesTable = sc.nextInt();
		
		/*
			미희씨 시작단 9, 종료단 3 입력하면 결과 안나오져??
			조금만 더 생각하시면 될거 같아요 ^^			=>수정완료
		*/
		

		//시작단이 종료단보다 클 때 오류 발생하기 때문에 시작단과 종료단의 크기를 비교해서 두가지 갈래로 나눠야함 
		int sdan = startTimesTable;
		int edan = endTimesTable;
		
		if(startTimesTable > endTimesTable) {
			sdan = endTimesTable;
			edan = startTimesTable;	
		}
						
		for(int i = sdan; i <= edan; i++) {
			System.out.println("*** "+i+"단 ***");
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d", i, j, i*j);
				System.out.println();
			}
			System.out.println();
		}
		 
		
	}
}
