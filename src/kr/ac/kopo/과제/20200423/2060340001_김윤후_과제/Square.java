package Assignment08;
public class Square extends Rectangle {

    public Square(int width){
    	super.width=width;
    }

    public void Sqaure(){
    }

    @Override
    public void print(){
    	System.out.println("가로 "+width+" 인 정사각형 넓이"+(width*width));
    }

}
