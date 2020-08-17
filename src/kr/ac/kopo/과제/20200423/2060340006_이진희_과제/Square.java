package test;

public class Square extends Rectangle {
    
	private int width;

    public int Square(int width){
       return this.width=width;
    }

  @Override
    public void printArea(){
    	System.out.printf("한 변의 길이가 %d인 정사각형의 면적은 %d", width, width * width);
    }

}
