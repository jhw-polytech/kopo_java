package chap1;

public class pr12 {
	//코드 작성 
	
	public static void main(String[] args){
		
		 for(int i=1; i<=9 ; i++) {                //9행 반복문 입력 
	        
	        if(i<=5) {                           //5행까지 조건문설정 
	           for(int j=1 ; j<=9 ; j++) {    
	              if(j<=5) {
	                 if(i<j)
	                    System.out.print("_");
	                 else
	                    System.out.print("*");
	                 
	              }
	              else {
	                 if(i+j>=10)
	                    System.out.print("*");
	                 else
	                    System.out.print("_");               
	              }	              
	           }
	        }
	        
	        else {
	           for(int j=1 ; j<=9; j++) {
	              if(j<=5) {
	                 if(i+j>10)
	                    System.out.print("_");
	                 else
	                    System.out.print("*");
	              }
	              
	              else {
	                 if(j>=i)
	                    System.out.print("*");
	                 else
	                    System.out.print("_");
	              }  
	           }
	           
	        }	        
	        System.out.println();        
	     }           
	 }
	}

