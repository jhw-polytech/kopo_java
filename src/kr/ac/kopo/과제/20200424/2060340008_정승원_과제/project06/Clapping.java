package kr.ac.kopo.day10.project.project06;

/**
 * 
 * @author seung
 *  반복문을 이용하여 369게임에서 박수를 쳐야 하는 경우의 수를 순서대로 화면에 출력
 *  1부터 99까지만 실행하는 클래스 
 */
public class Clapping {
	public static void main(String[] args) {
		// 일의 자리, 십의 자리를 나누어서 판단하면 쉽지않을까? 
		
		Boolean temp = false;
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < 101; i ++) {
			
			if (i > 10) {
				
				if ((i%10)%3 == 0 && (i%10) != 0){ // 일의 자리
					sb.append("짝");
					temp = true;
				}
				if ((i/10)%3 == 0) {
					sb.append("짝");
					temp = true;
				} 
				if (temp) {
					System.out.print(i+" "+sb);
					System.out.println();	
					sb = new StringBuilder();
				}
				
			} else {
				if ((i%10)%3 == 0 && (i%10) != 0) { // 일의 자리
					System.out.println(i+" 짝");
				}
			}
			temp = false;
		}
	}
}
