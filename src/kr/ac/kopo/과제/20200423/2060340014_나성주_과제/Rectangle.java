package homework.day09;

public class Rectangle extends Figure{

    protected int width;
    private int length;

    public Rectangle() {
    }

    public Rectangle(int width, int length) {
        super();
        this.length = length;
        this.width = width;
    }

    @Override
    public double makeArea() {
        area = width * length;
        return area;
    }

    public void info() {
        System.out.printf("가로 %d, 세로 %d의 직사각형 면적은 %.2f입니다\n", width, length, makeArea());
    }
}
