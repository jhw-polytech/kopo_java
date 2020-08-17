package kr.ac.kopo.day12.homework.lotto4;

import java.util.List;

// 로또 번호를 보여주는 기능클래스 
public class View {
	
	public void viewLottoNum(List<Integer> lottoNum) {
	
		System.out.printf("%s", "[");
		for(Integer num : lottoNum) {
			System.out.printf(" %d", num);
		}
		System.out.printf("%s\n", " ]");
	}
		
	
}
