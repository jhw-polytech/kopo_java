package kr.ac.kopo.day12.homework.lotto;

import java.util.Random;

/*
 * 01 02 03 04 05
 * 06 07 08 09 10
 * 11 12 13 14 15
 * 16 17 18 19 20
 * 21 22 23 24 25
 * 26 27 28 29 30
 * 31 32 33 34 35
 * 36 37 38 39 40
 * 41 42 43 44 45
 * 
 * 2차원 배열에서 하나씩 뽑기
 */

public class GeometryMaker implements NumberMakable {
	
	private int[] row;
	private Random r;

	@Override
	public int[] makeNumber() {
		row = new int[6];
		r = new Random();
		
		boolean[][] visited = new boolean[9][5];
		int[][] map = new int[9][5];

		int num = 1;

		for(int i=0;i<map.length;i++) {
			for(int j=0;j<map[i].length;j++,num++) {
				map[i][j]=num;
			}
		}
		
		int curY = r.nextInt(9);
		int curX = r.nextInt(5);

		visited[curY][curX] = true;

		row[0]= map[curY][curX];
		int index = 1;

		while(index<6) {
			int disX = r.nextInt(5);
			int disY = r.nextInt(9);

			int nextY = curY + disY;
			int nextX = curX + disX;

			if(nextY>=9) {	// 배열 범위를 초과하면 0번지부터 증가
				nextY = curY+disY - 9;
			}
			if(nextX>=5) {
				nextX = curX+disX - 5;
			}

			if(!visited[nextY][nextX]) { // 방문한 적이 없는 숫자일 경우 로또배열에 추가
				row[index]=map[nextY][nextX];
				curY = nextY;
				curX = nextX;
				visited[nextY][nextX]=true;
				index++;
			}
		}
		return row;
	}

}
