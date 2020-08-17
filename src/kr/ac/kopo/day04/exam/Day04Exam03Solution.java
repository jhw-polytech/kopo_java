package kr.ac.kopo.day04.exam;

public class Day04Exam03Solution {
	
	
	
	public static void main(String[] args) {
		
		
		
		System.out.println("<  REVERSE  >");
		
		int nums[] = new int[5];
		
		// 일단 정수가 최대 2자리라는 가정하에 코드 작성
		for(int i = nums.length-1; i>=0; i--) {
			
			int n10 = nums[i] /10;
			int n1 = nums[i] % 10;
			System.out.println(n1*10 + n10 + "\t");
			
		}
		
		
	}

}
