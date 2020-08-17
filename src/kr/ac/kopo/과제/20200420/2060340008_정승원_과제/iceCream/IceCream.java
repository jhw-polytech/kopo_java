package kr.ac.kopo.day07.project.iceCream;

public class IceCream {

    // 아이스크림 자체가 아이스크림 배열을 갖고 있는건 의미가 없다.
    // 아이스크림가게가 있으면 어떨까?

    private String name;
    private int price;

    // 1. 기본 생성자
    IceCream() {}

    // 2. 생성자
    IceCream(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
