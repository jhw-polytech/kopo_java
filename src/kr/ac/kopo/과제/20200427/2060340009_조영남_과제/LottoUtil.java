package kr.ac.yeongnam.day11.homework;

import java.util.Random;
import java.util.Scanner;

public class LottoUtil {
	
	public static void getNum(){
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("좋아하는 로또 번호를 입력하세요 : ");		
		try {			
			int num = sc.nextInt();
			sc.nextLine();
			
			if(num < 1 || num > 45) {
				throw new NumException("1 - 45 사이만 입력이 가능합니다. " + num + "은(는) 올바르지 않습니다.");				
			}
			
			System.out.println(num + "을(를) 포함해서 로또 번호들을 추출하겠습니다.");
			
			int[] list = new int[7];
			list[0] = num;
			
			Random r = new Random();
			for(int i = 1; i < 7; i++) {
				int randomNum = r.nextInt(45) + 1;
				list[i] = randomNum;
			}			
						
			shuffleArray(list);

			for(int item : list) {				
				System.out.print(item + " ");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}				
		
	}
	
	private static void shuffleArray(int[] array)
	{
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
