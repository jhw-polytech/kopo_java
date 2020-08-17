package kr.ac.kopo.day12.assignment;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {

	Scanner sc;
	Random r;
	Lotto(){
		sc = new Scanner(System.in);
		r = new Random();
	}
	
	public void gameStart() {
		System.out.print("게임수를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		
		for(int i = 1; i <= 4; i++) {
			System.out.println("< " + i + "번째 알고리즘 이용 >");
			for(int j = 1; j <= num; j++) {
				System.out.print("게임 " + j + " : ");
				lottoNumber(i);
			}
		}
	}
	public void lottoNumber(int i) {
		if (i == 1){
			lottoNumber_1();
		}else if (i == 2){
			lottoNumber_2();
		}else if (i == 3){
			lottoNumber_3();
		}else if (i == 4){
			lottoNumber_4();
		}
	}
	
	//i)
	public void lottoNumber_1() {
		int[] intArr = new int[6];
	
		for(int i = 0; i < 6; i++) {
			int num = 0;
			while(num == 0) {
				num = r.nextInt(45) + 1;					
				for(int j = 0; j < i; j++) {
					if(num == intArr[j]) {
						num = 0;
						break;
					}
				}	
			}
			intArr[i] = num;
		}
		System.out.println(Arrays.toString(intArr));
	}
	
	
	//ii)
	public void lottoNumber_2() {
		int[] intArr = new int [45];
		
		for(int i = 0; i < intArr.length; i++) {
			intArr[i] = i + 1;
		}

		int cnt = 0;
		int num;
		while(cnt < 6) {
			num = r.nextInt(45) + 1;
			if(intArr[num-1] != 0) {
				intArr[num-1] = 0;
				cnt++;
			}
		}
		
		System.out.print("[");
		for(int i = 0; i < intArr.length; i++) {
			if(intArr[i] == 0) {
				System.out.print(i+1);
				cnt--;
				if(cnt >= 1) {
					System.out.print(", ");
				}
			}
		}
		System.out.print("]");
		System.out.println();		
	}
	
	
	//iii)
	public void lottoNumber_3() {
		int[] intArr = new int [6];
		int num;
		
		for(int i = 0; i < intArr.length;) {
			num = r.nextInt(45) + 1;
			for(int j = 0; j < i; j++) {
				if(intArr[j] == num) {
					intArr[i] = -1;
					break;
				}
			}
			if(intArr[i] != -1) {
				intArr[i] = num;
				i++;
			}
		}
		
		System.out.println(Arrays.toString(intArr));
	}
	
	/*
		미희씨.. 3번과 4번의 차이가 뭐에요???
	*/
	
	//iiii)
	public void lottoNumber_4() {
		int[] intArr = new int [6];
		int num;
		int sum = 0;
		
		for(int i = 0; i < intArr.length; i++) {
			num = r.nextInt(45) + 1;
			if(sum < num) {
				intArr[i] = num;
				sum += num;
			}else {
				for(int j = 0; i < j; j++) {
					if(intArr[j] == num) {
						intArr[i] = -1;
						break;
					}
				}
				if(intArr[i] != -1) {
					intArr[i] = num;
					sum += num;
				}else {
					i--;
				}
			}
		}
		
		System.out.println(Arrays.toString(intArr));
	}
	
	
}



//public void lottoNumber_2() {
//	int[] intArr = new int [45];
//	int cnt = 0;
//	
//	for(int i = 1; i <= intArr.length; i++) {
//		intArr[i] = i;
//	}
//	
//	for(int i = 1; i <= 6; i++) {
//		int num = r.nextInt(45) + 1;
//		while(intArr[num] == 0)
//		if(intArr[num] != 0) {
//			intArr[num] = 0;
//			cnt++;
//		}
//	}
//	
//	while(cnt <=6) {
//		int num = r.nextInt(45) + 1;
//		if(intArr[num] != 0) {
//			intArr[num] = 0;
//			cnt++;
//		}
//	}
//	
//	for(int i = 1; i <= intArr.length; i++) {
//		if(intArr[i] == 0) {
//			cnt++;
//		}
//	}
	
	
