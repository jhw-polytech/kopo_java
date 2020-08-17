package kr.ac.kopo.day10.project.project04;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		double userScore = 0;
		double temp = 0;
		int count = -1;
		Scanner sc = new Scanner(System.in);
		while (temp != -1) {
			System.out.println("[더  입력할 점수가 없으면 -1을 입력]");
			System.out.println("점수를 입력하십시오:");
			temp = sc.nextDouble();
			userScore += (temp == -1)?0:temp;
			count++;
		}
		count = (count == -1)?0:count;
		System.out.printf(" 입력된 점수들의 수 : %d \n 점수들의 평균(double value) : %.3f \n 점수들의 평균 (int value): %d"
				 ,count , userScore/count, (int) userScore/count);
		sc.close();
	}
	
}
