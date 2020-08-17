package kr.ac.kopo.day12.homework.lotto2;
// 로또 번호를 보여주는 기능클래스 
public class View {
	
	public void viewLottoNum(Object[] lottoNum) {
	
		System.out.printf("%s", "[");
		for(Object num : lottoNum) {
			System.out.printf(" %d", num);
		}
		System.out.printf("%s\n", " ]");
	}
		
	
}
