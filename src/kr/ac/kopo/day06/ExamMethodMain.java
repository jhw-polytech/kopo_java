package kr.ac.kopo.day06;

import java.util.Arrays;

public class ExamMethodMain {
	
	public static void main(String[] args) {
		
		
		ExamMethod exam = new ExamMethod();
		
		int[] nums = exam.getNums();
		System.out.println("추출된 난수 : " + Arrays.toString(nums));
		
		
		
	}

}
