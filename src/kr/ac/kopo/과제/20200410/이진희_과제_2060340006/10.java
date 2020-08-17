package day0410;
//다음의 결과를 보이는 코드를 작성하시오.(단 출력메소드에 하나의 문자만 가능)
//반복문 5개, 조건문 1개 이용가능
//반복문3개, 조건문3개
//반복문3개, 조건문1개
//반복문2개, 조건문2개 
//*****
//_****
//__***
//___**
//____*
//___**
//__***
//_****
//*****
public class practice10 {
	public static void main(String[] args){
		
	for(int i=1; i<=9; i++) {          //9행 반복문 입력 
        if(i<=5) {                     //5행까지 조건문설정 
           for(int j=1 ; j<=5 ; j++) {       //각 줄마다 5칸씩 입력하므로 5번 실행
              if(j<i)                    //줄넘버가 칸넘버보다 작으면 실행 
                 System.out.print("_");    //왼쪽->오른쪽, 위->아래 -입력  (2345,1)(345,2)(45,3)(5,4)
              else                          
                 System.out.print("*");  //그외 * 입력
              
              
           }
           
        }
        else {
           for(int k=10 ; k>=6 ;k--) { //5번 반복 
              if(k>i+1)
                 System.out.print("_");
              else
                 System.out.print("*");
              
           }          
        }
        System.out.println();  //한 줄 스페이스 

	}
  }
}