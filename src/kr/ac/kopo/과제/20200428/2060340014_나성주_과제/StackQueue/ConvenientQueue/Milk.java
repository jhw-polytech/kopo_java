package homework.day12.StackQueue.ConvenientQueue;

public class Milk {

    private String milk;

    Milk(){
    }

    Milk(String milk){
        this.milk = milk;
    }

    public String getMilk() {
        return milk;
    }

    public void setMilk(String milk) {
        this.milk = milk + "에 입고된 우유";
    }
}
