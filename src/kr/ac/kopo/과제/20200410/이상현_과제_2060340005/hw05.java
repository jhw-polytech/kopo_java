package shlee1993.day03.homework;

/*
5. 다음의 설명을 보고 코드를 작성하세요.
달팽이가 100M 깊이의 우물을 빠졌습니다
달팽이는 1시간에 5M속도로 움직입니다
올라온 높이가 50M미만일땐 1시간에 1M씩 미끌어지고
50M이상일때 1시간에 2M씩 미끌어집니다
달팽이가 총 몇시간만에 탈출하는지를 코드로 작성하세요.

	< 출력결과 >
	[1시간후] 달팽이가 올라간 총 높이 : 4M
	[2시간후] 달팽이가 올라간 총 높이 : 8M
	...
	[XX시간후] 달팽이가 올라간 총 높이 : 100M or 101M or 102M 
*/

//무한 반복되는 for문을 이용해 인덱스값을 시간으로 이용하고 깊이가 50미만일 경우 -1, 50이상 -2가 되도록하며 출력한다,
//그후 100이 넘어가면 break로 for문을 탈출한다.

public class hw05 {
	public static void main(String[] args) {
		int depth = 0;

		for (int time = 1;; time++) { // 조건식이 없기 때문에 무한루프
			depth += 5;
			if (depth < 50) {
				depth -= 1;
				System.out.printf("[%d시간후] 달팽이가 올라간 총 높이 : %dM\n", time, depth);
			} else {
				depth -= 2;
				System.out.printf("[%d시간후] 달팽이가 올라간 총 높이 : %dM\n", time, depth);
			}
			if (depth >= 100) // depth가 100이상일 경우 탈출
				break;
		}
	}

}
