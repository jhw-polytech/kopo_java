package kr.ac.kopo.day12.homework.lotto;
// 로또 번호를 보여주는 기능클래스 
public class View {
	
	public void viewLottoNum(int[] lottoNum) {
	
		System.out.printf("%s", "[");
		for(int num : lottoNum) {
			System.out.printf(" %d", num);
		}
		System.out.printf("%s\n", " ]");
	}
		
	
}
