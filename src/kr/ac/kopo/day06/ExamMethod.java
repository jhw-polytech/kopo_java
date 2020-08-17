package kr.ac.kopo.day06;

import java.util.Random;

public class ExamMethod {
	
	int[] getNums() {
		Random r = new Random();
		int[] nums = new int[10];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = r.nextInt(100) + 1;
			
		}
		
		return nums;
	}
	
	int[] getNums(int size) {
		int[] nums = new int[size];
		Random r = new Random();
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = r.nextInt(100)+1;
		}
				
	}

}
