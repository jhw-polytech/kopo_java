package kr.ac.kopo.day03.project;
/**
 * 
 * @author tess
구구단을 반복문은 2*1=2
한라인에 3단씩 출력하는 코드를 작성하세요. 이때 9단은 나오면 안됩니다. 최대 3개만 사용합니다.
2*2=4
...
5*1=5
... 8 9

3 * 1= 3 3 * 2= 6
6

4 * 1= 4 4 * 2= 8
7

for(int dan = 2; dan <= 9; ) { }

 */
 /*
	아까 수업시간의 결과와 같게 나오지 않지요?
	다시한번 해보세요 ^^ 과제하느라 고생하셨어요~~
 */
public class Project09 {
	public static void main(String[] args) {
		for (int j = 2; j < 9; j++) {
		
			System.out.printf("*** %d단 ***\n", j); // 앞으로 출력할 구구단을 명시 
			
			int num = 0;
			for (int i = 1; i < 10; i++) { // 반복문을 돌면서 구구단을 출력해준다. 
				System.out.printf("%d * %d = %d \t", j, i, (j*i));
				num++;
				
				if (num >= 3) {
					System.out.println();
					num = 0;
				}
			}
			System.out.println();
		}
	}
}
