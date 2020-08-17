package test0423;

import java.util.Random; 

public class NumChoice {
	
    int num;
    
    NumChoice(){
    	
    }
    
    NumChoice(int num){
    	this.num = num;
    }
    
	
	
	public int getNumRandom() {
		
		Random r = new Random();
		this.num = r.nextInt(9) + 2;
		return num;
	}

}
