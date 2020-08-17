package Assignment08;

import java.util.Random;
import java.util.Scanner;

public class FigureMain {

    Random r= new Random();
    Scanner sc=new Scanner(System.in);
    Figure figure;
    
    int num1;
    int num2;
    
    public int ran() {
    	int num=r.nextInt(9)+1;
    
    	return num;
    }
    
    int getInt(String msg) {
		System.out.print(msg);
		int num= sc.nextInt();
		sc.nextLine();
		
		return num;
	}
    
    void StartFigure() {
		
    	num1=ran();
    	num2=ran();
    	
		int cnt= getInt("도형을 선택하시오 (1.직사각형, 2.정사각형,"
				+ " 3.삼각형, 4.원)");
		
		if(cnt==1) {
			figure = new Rectangle(num1,num2); 
			
		}
		else if(cnt==2) {
			figure = new Square(num1);
		}
		else if(cnt==3) {
			figure = new Triangle(num1,num2);
		}
		else if(cnt==4) {
			figure = new Circle(num1);
		}
		figure.print();
	}
    
    
   
}
