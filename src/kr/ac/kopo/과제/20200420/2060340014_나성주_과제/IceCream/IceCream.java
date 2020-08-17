package homework.day07String;

public class IceCream {

    // 필드는 private, 메소드는 public 선언해주는 것이 좋다고 하셨다... (은닉성 차원에서)


    private String name; // 아이스크림명
    private int price; // 아이스크림 가격

    IceCream(String name, int price) {

        this.name = name;
        this.price = price;

    }

    public String getName () {  // 멤버변수가 private이기 때문에 변수를 pulic 해주는 메소드 필요
        return name;
    }

    public int getPrice () {  // 멤버변수가 private이기 때문에 변수를 pulic 해주는 메소드 필요
        return price;
    }











}
