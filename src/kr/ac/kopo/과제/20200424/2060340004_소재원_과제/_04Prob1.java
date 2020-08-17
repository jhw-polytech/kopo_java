package exam0424.etc;

import java.util.ArrayList;
import java.util.Scanner;

public class _04Prob1 {

	public static void main(String[] args) {
		double sum = 0;
		
		Scanner sc = new Scanner(System.in);
		//아직 배우진 않았지만 써보려고 해봤습니다..
		ArrayList<Double> dArr = new ArrayList<Double>();
		double doubleNum = 0;
		while(doubleNum != -1) { 
			System.out.print("[더 입력할 점수가 없으면 -1을 입력] 점수를 입력하십시오 : ");
			doubleNum = sc.nextDouble();
			if (doubleNum == -1) {
				break;
			} else {
				dArr.add(doubleNum);
			}
		}
		sc.close();
		
		for (double k : dArr) {
			sum += k;
		}
		System.out.println("입력된 점수들의 수 : " + dArr.size());
		System.out.printf("점수들의 평균(double value) : %.3f\n", sum / dArr.size());
		System.out.printf("점수들의 평균 (int value) : %d", (int)( sum / dArr.size()));
		
	}
}
