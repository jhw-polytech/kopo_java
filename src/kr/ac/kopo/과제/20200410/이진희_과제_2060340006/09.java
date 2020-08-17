package chap1;

public class pr9 {
	public static void main(String[] args){

	//구구단을 한라인에 3단씩 출력하는 코드를 작성하세요. "이때 9단은 나오면 안됩니다." 
	//반복문은 최대 3개만 사용합니다. 
	//2*1=2 3*1=3 4*1=4
	//for(int dan=2; dan<=9;){
		
	
			
		for(int dan=2; dan<=9; dan+=3) {// 3개의 단 출력 후 줄바꿈 
			for(int i=1; i<=9; i++) { // *9까지 구구단 출력 
				for(int j=dan; j<dan+3; j++) { //3개씩 구구단이 출력 
					if(j<=8)          //if조건문으로 9단은 나오지 않게 하기
				 System.out.print(j + "*" + i+ "=" +(j*i+"\t"));
				}
				System.out.println();
			}
				
         }
    } 
}
