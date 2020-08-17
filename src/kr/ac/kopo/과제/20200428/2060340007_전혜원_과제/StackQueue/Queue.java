package kr.ac.kopo.stackQueue;

public class Queue implements IStackQueue {
	int index;
	int QueueData[] = new int[30];
	int cnt = 0;

	// 데이터 저장
	public void pushData() {
		this.QueueData[index] = index + 1;
		index++;
		System.out.println("QUEUE 방식으로 데이터 저장완료.");
	}

	// 데이터 삭제
	public void pullData() {
		this.QueueData[cnt] = 0;
		cnt++;
		System.out.println("QUEUE 방식으로 데이터 삭제완료.");
	}

	// 데이터 조회 ([0] ~ [size()-1])
	public void showAllData() {
		System.out.println("<   QUEUE 데이터 조회    >");
		for (int i = 0; i < index; i++) {
			if(QueueData[i] != 0) {
				System.out.print("|"+QueueData[i]+"|");				
			}
		}
		System.out.println();
	}

	// 종료
	public void exit() {
		System.out.println("데이터 입출력을 종료합니다.");
	}

}
