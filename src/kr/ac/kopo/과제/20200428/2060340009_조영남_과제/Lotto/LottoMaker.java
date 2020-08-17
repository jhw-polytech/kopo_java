package kr.ac.yeongnam.day12.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;


public class LottoMaker {

	public void maker(int algoNum, int gameNum) {
		
		switch(algoNum){
			case 1: 
				algo1(gameNum);
				break;
			case 2:
				algo2(gameNum);
				break;
			case 3:
				algo3(gameNum);
				break;
			case 4:
				algo4(gameNum);
				break;		
		}	
		
	}
	
	// for 반복문을 이용한 중복 제거
	public void algo1(int gameNum) {
		System.out.println("algo1");
		Random r = new Random();
		
		for(int cnt = 1; cnt <= gameNum; cnt++) {
			
			int[] list = new int[7];			
			for(int i = 0; i < 7; i++) {
				int randomNum = r.nextInt(45) + 1;
				list[i] = randomNum;
				
				if(i >= 1) {
					for(int j = 0; j < i; j++) {
						if(list[i] == list[j]) {
							i--;
							break;
						}
					}
				}			
			}			
			
			shuffleArray(list);
			
			System.out.print("게임 " + cnt + " : ");			
			String result = Arrays.toString(list);
			System.out.println(result);
			System.out.println();
		}
	}
	

	// ArrayList를 이용한 중복 제거
	public void algo2(int gameNum) {
		System.out.println("algo2");
		Random r = new Random();

		for(int cnt = 1; cnt <= gameNum; cnt++) {
			List<Integer> list = new ArrayList<>();
			
			for(int i = 0; i < 7; i++) {
				int randomNum = r.nextInt(45) + 1;
				if(list.contains(randomNum)) {
					i--;
				} else {
					list.add(randomNum);
				}
			}
			System.out.print("게임 " + cnt + " : ");		
			System.out.println(Arrays.toString(list.toArray()));
			System.out.println();				

		}
		
	}
	
	// Set을 이용한 중복 제거
	public void algo3(int gameNum) {
		System.out.println("algo3");
		Random r = new Random();
		for(int cnt = 1; cnt <= gameNum; cnt++) {
			Set<Integer> set = new TreeSet<>();
			for(int i = 0; i < 7; i++) {
				int randomNum = r.nextInt(45) + 1;
				set.add(randomNum);
				
				if(set.size() != i+1) {
					i--;
				}				
			}
			System.out.print("게임 " + cnt + " : ");		
			System.out.println(Arrays.toString(set.toArray()));
			System.out.println();				
		}
	}
	
	// Map을 이용한 중복 제거
	public void algo4(int gameNum) {
		System.out.println("algo4");
		Random r = new Random();
		for(int cnt = 1; cnt <= gameNum; cnt++) {
			Map<Integer, Integer> map = new HashMap<>();
			
			for(int i = 0; i < 7; i++) {
				int randomNum = r.nextInt(45) + 1;
				map.put(i, randomNum);

				if(i >= 1) {
					for(int j = 0; j < i; j++) {
						if(map.get(i) == map.get(j)) {
							i--;
							break;
						}
					}
				}									
			}
			System.out.print("게임 " + cnt + " : ");				
			System.out.println(map.values());
			System.out.println();				
		}
		
	}	
	
	private static void shuffleArray(int[] array){
	    int index;
	    Random r = new Random();
	    for (int i = array.length - 1; i > 0; i--)
	    {
	        index = r.nextInt(i + 1);	        
	        if (index != i)
	        {
	            array[index] ^= array[i];
	            array[i] ^= array[index];
	            array[index] ^= array[i];
	        }
	    }   	    
	}
}
