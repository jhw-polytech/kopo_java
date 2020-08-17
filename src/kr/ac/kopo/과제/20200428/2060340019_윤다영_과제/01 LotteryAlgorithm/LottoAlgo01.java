package kr.ac.kopo.assignment.day12;
import java.util.Arrays;
/*
 * 1번 알고리즘 : 배열, 이중 for문 이용
 */
import java.util.Random;

public class LottoAlgo01 {
	   
	   private int[] lotteryNums = new int[6];
	   private Random ran;
	     
	   public LottoAlgo01() {
	      ran = new Random();
	   }
	   
	   public void randomLottery() {
	      
	      for(int i = 0; i < lotteryNums.length; i++) {
	         lotteryNums[i] = ran.nextInt(45)+1;
	         for(int j = 0; j < i; j++) {            
	            if(lotteryNums[i] == lotteryNums[j]) {
	               i--;
	               break;
	            }
	         }
	      }
	   }
	   
	   public void print() {
		   System.out.println(Arrays.toString(lotteryNums));	   
	   }
	}
	   


