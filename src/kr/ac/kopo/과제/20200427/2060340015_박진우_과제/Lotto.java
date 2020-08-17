package kr.ac.jinwoo.day11.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * 이번 수업시간에 배운 것을 토대로 
 * 
 * 1. 범위를 넘어가면 발생하는 예외처리
 * 
 * 2. 정수를 입력해야할 때에 문자열이 입력되는 경우 발생하는 예외처리
 * 
 * 를 해결해보았습니다.
 * 
 */

public class Lotto {
	
	private static Random r = new Random();
	private static Scanner sc = new Scanner(System.in);
	
	// 1 ~ 45 사이의 난수를 생성하는 메소드
	private static int makeLotNum() {
		
		int num = r.nextInt(44) + 1;	
		return num;
	}
	
	// 사용자에게 원하는 번호를 입력받는 메소드
	public static int chooseLotNum() {
		
		int ret = 0;
		
		while(true) {
			
			// chk isInteger
			try {
				ret = Integer.parseInt(sc.nextLine());
			}  catch(Exception NumberFormatException) {
				System.out.println("정수의 값이 아닙니다.\n");
				System.out.print("1 - 45 사이의 정수를 입력해주세요 : ");
				continue;
			}
			
			// chk range
			try {
				if(ret <= 0 || 45 <= ret) {
					throw new LottoNumberException("1 - 45 사이만 가능합니다. " + ret + "은 올바르지 않습니다.\n");
				}
			} catch(LottoNumberException le) {
				System.out.println(le.getMessage());
				System.out.print("1 - 45 사이의 정수를 입력해주세요 : ");
				continue;
			}
			
			break;
		}
		return ret;	
	}
	
	// 사용자의 입력포함 6가지 로또번호를 생성하는 메소드
	public static int[] makeLotArr(int num) {
		
		int[] lotArr = new int[6];
		
		lotArr[0] = num;
		
		for(int i = 1; i < 6; i++) {
			
			int lotNum = makeLotNum();
			for(int j = 0; j < i; j++) {	
				while(lotNum == lotArr[j]) {
					lotNum = makeLotNum();
				}
			}
			lotArr[i] = lotNum;
		}
		
		Arrays.sort(lotArr);
		
		return lotArr;
	}
}
