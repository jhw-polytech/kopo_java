package kr.ac.kopo.day12.homework.lotto;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class SetMaker implements NumberMakable {
	
	private int[] row;
	private Random r;

	@Override
	public int[] makeNumber() {
		row = new int[6];
		r = new Random();

		Set<Integer> set = new HashSet<>();
		while(set.size()<6) {
			set.add(r.nextInt(45)+1);
		}
		Iterator<Integer> it = set.iterator();
		int index =0;
		while(it.hasNext()) {
			row[index++]=it.next();
		}
		return row;
	}

}
