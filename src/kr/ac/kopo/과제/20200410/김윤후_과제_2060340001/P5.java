package Assignment02;

public class P5 {
	public static void main(String[] args) {
		
		/*
			코드를 볼 떄마다 느끼는 건데... 수학과 관련된 학과라는 느낌이 팍팍 옵니다~~ ^^
			과제하느라 고생하셨어요~~ ^^
		*/
		
		
		for (int x=0; x<=100; x++) {
			if(x*4<50){
				System.out.printf("[%d시간 후] 달팽이가 올라간 총 높이: %d",x,x*4);
				System.out.println();
			}
			if (50<=x*3 && x*3<=103) {
				System.out.printf("[%d시간 후] 달팽이가 올라간 총 높이: %d",x,x*3);
				System.out.println();
			}
				
			}
		}
}

//반복문으로 100미터까지 x값이 증가하게 하였음
// if문을 사용하여 50미터 미만일 때, 50미터 이상일때 한시간동안 이동 거리를 계산하여 4x, 3x으로 나누어 계산하였음.