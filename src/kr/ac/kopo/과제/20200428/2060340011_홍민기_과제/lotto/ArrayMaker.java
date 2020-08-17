package kr.ac.kopo.day12.homework.lotto;

import java.util.Random;

public class ArrayMaker implements NumberMakable {
	
	private int[] row;
	private Random r;

	@Override
	public int[] makeNumber() {
		row = new int[6];
		r = new Random();
		
		int index =0;
		while(index<6) {
			int next = r.nextInt(45)+1;
			boolean overlap = false;
			for(int i=0;!overlap &&i<index;i++) {
				if(row[i]==next) {
					overlap = true;
				}
			}
			if(!overlap) {
				row[index]=next;
				index++;
			}
		}
		return row;
	}

}
