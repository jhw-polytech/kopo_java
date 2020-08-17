package kr.ac.kopo.stackQueue;

/*
	우리 과제가 List로 stack, queue를 작성하는거였던거 같은디~~~ 배열이 아니라~~~ ^^
	한번 나중에 시간날때 다시 해보세요
*/

public class Stack implements IStackQueue {

	private int index = 0;
	int StackData[] = new int[30];

	// 데이터 저장
	public void pushData() {
		this.StackData[index] = index + 1;
		index++;
		System.out.println("STACK 방식으로 데이터 저장완료.");
	}

	// 데이터 삭제
	public void pullData() {
		if(index!=0) {
			this.StackData[index-1] = 0;			
			index++;
			System.out.println("STACK 방식으로 데이터 삭제완료.");
		} else {
			System.out.println("삭제할 데이터가 존재하지 않습니다.");
		}
	}

	// 데이터 조회 ([0] ~ [size()-1])
	public void showAllData() {
		System.out.println("<   STACK 데이터 조회   >");
		for (int i = 0; i < index; i++) {
			if (StackData[i] != 0) {
				System.out.print("|" + StackData[i] + "|");
			}
		}
		System.out.println();
	}

	// 종료
	public void exit() {
		System.out.println("데이터 입출력을 종료합니다.");
	}

}
