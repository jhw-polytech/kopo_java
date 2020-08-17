package jaeheehomework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class LottoGame {

	private Scanner sc;
	private int num;
	private Random r = new Random();
	
	//게임 수 지정, 리턴하는 메소드
	public int gameNum() {
		
		while(true) {
			try {
				sc = new Scanner(System.in);
				System.out.print("게임수를 입력하세요 : ");
				num = sc.nextInt();
				sc.nextLine();
				break;
			} catch(Exception e) {
				System.out.println("숫자만 입력하세요!");
				sc = new Scanner(System.in);
			}
		}
		return num;
	}

	//메소드1 - ArrayList<Integer>t 이용
	public void lottoNum1() {
		for (int i = 1; i <= num; i++) {
			int rNum;
			ArrayList<Integer> lottoArrList = new ArrayList<>();

			while (lottoArrList.size() < 6) {
				rNum = r.nextInt(45) + 1;
				if (!lottoArrList.contains(rNum)) {   //새로 뽑은 숫자가 이미 contain 되어 있지 않은 경우만 add 
					lottoArrList.add(rNum);
				}
			}

			System.out.printf("게임 %d : ", i);
			System.out.println(Arrays.toString(lottoArrList.toArray()));
		}
		System.out.println();
	}
	
	
	//메소드2 - Set<Integer> 이용
	public void lottoNum2() {
		for(int i = 1; i <= num; i++) {
			int rNum;
			Set<Integer> lottoSet = new HashSet<>();
			
			while(lottoSet.size() < 6) {
				rNum = r.nextInt(45) + 1;
				lottoSet.add(rNum);           //중복된 숫자는 add되지 않음
			}
			
			System.out.printf("게임 %d : ", i);
			System.out.println(Arrays.toString(lottoSet.toArray()));
		}
		System.out.println();
	}
	
	//메소드3 - 배열 이용
	public void lottNum3() {
		for (int k = 1; k <= num; k++) {

			int[] arr = new int[6];

			for (int i = 0; i < arr.length; i++) {
				arr[i] = r.nextInt(45) + 1;
				for (int j = 0; j < i; j++) {
					if (arr[i] == arr[j]) {  //지금까지 만든 원소와 같은게 있으면 다시 뽑음
						i--;
					}
				}
			}

			System.out.printf("게임 %d : ", k);
			System.out.println(Arrays.toString(arr));
		}
		System.out.println();
	}
	
	//메소드4 - HasMap<Integer, Integer> 이용
	public void lottNum4() {
		HashMap<Integer, Integer> map;
		int rNum;
		
		for( int i = 1; i <= num; i++) {
			map = new HashMap<>();
			System.out.printf("게임%d : ", i);
			
			while(map.size() < 6) {
				rNum = r.nextInt(45) + 1;
				map.put(rNum, rNum); //중복 숫자가 나와도 같은 키값에 넣으면 됨. 같은 숫자 나오면 size는 그대로
			}
			System.out.println(map.keySet());
		}
	}
	
}

