package kr.ac.kopo.day06.project.iceCream;

public class IceCream {
    private String name;
    private int price;

    IceCream(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}

