package homework.day09;

public class Circle extends Figure {

    private int radius;

    public Circle() {
    }

    public Circle(int radius) {
        super();
        this.radius = radius;
    }

    @Override
    public double makeArea() {
        area = (double) radius * radius * Math.PI;
        return area;
    }

    public void info() {
        System.out.printf("반지름 %d의 원 면적은 %.2f입니다\n", radius, makeArea());
    }

}



