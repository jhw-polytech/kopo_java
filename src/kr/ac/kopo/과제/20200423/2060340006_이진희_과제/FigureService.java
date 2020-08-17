package test;

import java.util.Random;
import java.util.Scanner;


public class FigureService {
   
	Random r;	
	Scanner sc;
    Figure f;
    private int ran1;
    private int ran2;
    int num;
    double data;

    public void execute(){
    	 System.out.println("도형을 선택하세요(1.직사각형, 2.정사각형, 3.삼각형, 4.원)"); //선택문 출력
	      int num =sc.nextInt(); //위 1,2,3,4중 정수 입력
          sc.close();
	      
	  ran1 = ranNum();
	  ran2 = ranNum();
	      
	      if(num==1) {
	         this.ran1=r.nextInt(9)+2; //2-10사이의 난수 추출
	         this.ran2=r.nextInt(9)+2;
	         this.data=ran1*ran2;
	      }
	      if(num==2) {
	         this.ran1=r.nextInt(9)+2;
	         this.data=ran1*ran1;
	         
	      }
	      if(num==3) {
	         this.ran1=r.nextInt(9)+2;
	         this.ran2=r.nextInt(9)+2;
	         this.data=ran1*ran2*0.5;
	      }
	      if(num==4) {
	         this.ran1=r.nextInt(9)+2;
	         this.data=(3.14)*ran1*ran1;
	      }
    }
	   
    public int ranNum(){
    	r = new Random();
    	int ranNum = r.nextInt(9)+2;
        return ranNum;
    }
    }

