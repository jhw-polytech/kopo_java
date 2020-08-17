package kr.ac.kopo.day12.homework.lotto;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListMaker implements NumberMakable {
	
	private int[] row;
	private Random r;

	@Override
	public int[] makeNumber() {
		row = new int[6];
		r = new Random();
		
		List<Integer> list = new LinkedList<>();
		int index =0;

		while(list.size()<6) {
			int num = r.nextInt(45)+1;
			if(!list.contains(num)) {
				list.add(num);
				row[index] = list.get(index);
				index++;
			}
		}
		return row;
	}

}
