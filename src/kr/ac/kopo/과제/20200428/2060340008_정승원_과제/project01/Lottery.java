package kr.ac.kopo.day12.project01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.Stack;

/**
 * 보너스 번호까지 해서 총 7개의 로또 번호를 출력하는 클래스 
 * @author seung
 *
 */
public class Lottery {
	private Random random;
	private int numOfGame;
	private int number;
	
	public Lottery(int numOfGame) {
		this.numOfGame = numOfGame;
		random = new Random();
	}
	
	public int getRandomNum() {
		return random.nextInt(45)+1;
	}
	
	public void print(String msg) {
		System.out.println(msg);
	}
	
	// 방식 1: 중복을 허용하지 않는 Set을 사용한다.
	public void getNumbersBySet(){
		print("\n방식 1: 중복을 허용하지 않는 Set을 사용한다.");
		Set<Integer> numberSet;
		for (int i = 0; i < numOfGame; i++ ) {
			numberSet = new HashSet<Integer>();
			while(numberSet.size() <= 6) {
				number = getRandomNum();
				numberSet.add(number);
			}
			print(numberSet.toString());
		}
	}
	
	// 방식 2: memory에 저장해두고, contains() 메소드를 활용하여 가져온 number가 없는 경우에만 List에 추가한다.
	public void getNumbersByArrayList() {
		print("\n방식 2: memory에 저장해두고, contains() 메소드를 활용하여 가져온 number가 없는 경우에만 List에 추가한다.");
		List<Integer> numberArrayList;
		for (int i = 0; i < numOfGame; i++ ) {
			numberArrayList = new ArrayList<Integer>();
			while(numberArrayList.size() <= 6) {
				number = getRandomNum();
				if (!numberArrayList.contains(number)) {
					numberArrayList.add(number);
				}
			}
			print(numberArrayList.toString());
		}
	}
	
	
	// 방식 3: Int[] 에서 차례대로 저장하되, 한 번 저장할때마다 앞의 값들과 비교하여 중복되는지 검사한다.
	public void getNumbersByIntArray() {
		print("\n방식 3: Int[] 에서 차례대로 저장하되, 한 번 저장할때마다 앞의 값들과 비교하여 중복되는지 검사한다.");
		int[] numberIntArray;
		for (int i = 0; i < numOfGame; i++) {
			numberIntArray = new int[7];
			
			for (int insertIdx = 0; insertIdx < numberIntArray.length; insertIdx++ ) {
				
				numberIntArray[insertIdx] = getRandomNum();
				
				for (int checkIdx = 0; checkIdx < insertIdx; checkIdx++ ) {
					// insertIdx 앞을 쭉 검사하다가, 같은게 앞에 있는 경우
					// insertIdx를 하나 앞으로 당겨서 다시 for문으로 들어갈때 새로운 숫자로 넣도록 한다.
					if (numberIntArray[insertIdx] == numberIntArray[checkIdx]) {
						insertIdx--;
						break;
					}
				}		
			}
			print(Arrays.toString(numberIntArray));
		}
	}
	
	
	// 방식 4: stack을 이용하여 중복을 제거한다.
	public void getNumbersByStack() {
		print("\n방식 4: stack을 이용하여 중복을 제거한다.");
		Stack<Integer> stack;
		for (int i = 0; i < numOfGame; i++ ) {
			stack = new Stack<Integer>();
			
			while(stack.size() <= 6) {
				stack.add(getRandomNum());
				
				for (int checkIdx = 0; checkIdx < stack.size()-1; checkIdx++ ) {
					if (stack.peek() == stack.get(checkIdx)) {
						stack.pop();
						break;
					}
				}		
			}
			print(stack.toString());
		}
	}
}
