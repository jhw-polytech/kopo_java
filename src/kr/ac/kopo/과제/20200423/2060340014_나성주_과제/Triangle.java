package homework.day09;

public class Triangle extends Figure{

    private int height;
    private int base;


    public Triangle(){
    }

    public Triangle(int height, int base) {
        super();
        this.height = height;
        this.base = base;
    }

    @Override
    public double makeArea() {
        area = (double) height * base / 2;
        return area;
    }

    public void info() {
        System.out.printf("높이 %d, 밑변 %d의 삼각형 면적은 %.2f입니다\n", height, base, makeArea());
    }
}
