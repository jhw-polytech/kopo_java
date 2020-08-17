import java.util.Random;
import java.util.Scanner;

public class FigureMain {
   
	 public static void main(String[] args) {
         
	     Figure f = new Figure();
	    
	      Scanner scan = new Scanner (System.in);  //자리 생성
	      System.out.println("도형을 선택하세요(1.직사각형, 2.정사각형, 3.삼각형, 4.원)"); //선택문 출력
	      int num =scan.nextInt(); //위 1,2,3,4중 정수 입력

	      f.Fig(num);

	      
	      if(num==1) {  //직사각형 면적 추출 
	          System.out.println("가로"+f.ran1+" "+"세로"+f.ran2+"의 직사각형 면적은"+" "+f.data+"입니다.");         
	       }
	      else if(num==2) { //정사각형 면적 추출
	          System.out.println("가로"+f.ran1+"의 정사각형 면적은"+" " + f.data+"입니다.");
	          
	       }
	      else if(num==3) {//삼각형 면적 추출
	          System.out.println("밑변"+(f.ran1)+" "+"높이"+f.ran2+"의 삼각형 면적은"+" "+f.data+"입니다.");
	       }
	      else if(num==4) {//원의 면적 추출 
	          System.out.println("반지름"+f.ran1+"의 원의 면적은"+" "+f.data+"입니다.");
	       }
	   }
}