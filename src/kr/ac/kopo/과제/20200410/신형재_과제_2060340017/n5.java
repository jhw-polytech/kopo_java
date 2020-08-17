package homework0410;

/*
 * 2060340017 신형재 과제 5번
 * 
 * 개구리가 올라가는 속도에 따라 n시간 후 위치 확인
 * for문을 2개 겹쳐서 2가지 상황(50m 미민, 50m 이상)을 입력 
 * 
 */


public class n5 {
	public static void main(String[] args) {
		
		System.out.println("달팽이가 100M 깊이의 우물에 빠졌습니다");
		System.out.println("달팽이는 1시간에 5m의 속도로 움직입니다");
		System.out.println("올라온 높이가 50M미만일 때 1시간에 1M씩 미끌어지고");
		System.out.println("         50M이상일 때 1시간에 2M씩 미끌어집니다");
		System.out.println("달팽이가 총 몇시간만에 탈출하는지 코드로 작성하세요.");
		
/*
 * 높이 h, 시간 t = 반복 횟수, 달팽이의 현재 위치 p, 달팽이는 5*t로 올라가며 h<50일때는 1m씩 -
 * h>=50일때는 2m씩 미끄러진다.
 * 
 * (0m<h<50m), p는 4의 배수
 * (50m<=h), p는 3의 배수만큼 올라감
 * 
 */
 /*
	형재씨 12라는 숫자는 직접 계산하신거죠??
	우물의 깊이나, 미끌어지는 길이가 바뀌면 수정을 해야하는 코드 같아요...
	규칙을 생각해봅시당!!!
 */
		for(int i = 1; i<=12; i++) {
			System.out.printf("[%d 시간 후] 달팽이가 올라간 총 높이 : %d\n", i, i*4);
		}
		System.out.println("50M 이상 달성, 앞으로는 2m씩 미끌어집니다.");
		
		for(int j = 13; j<=30; j++) {
			System.out.printf("[%d 시간 후] 달팽이가 올라간 총 높이 : %d\n", j, (48+((j-12)*3)));
		}
	}
}
