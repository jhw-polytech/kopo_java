package homework.day09;

public class Square extends Rectangle{

    public Square(){
    }

    public Square(int width) {
        this.width = width;
    }

    @Override
    public double makeArea() {
        area = width * width;
        return area;
    }

    public void info() {
        System.out.printf("가로 %d의 정사각형 면적은 %.2f입니다\n", width, makeArea());
    }
}
