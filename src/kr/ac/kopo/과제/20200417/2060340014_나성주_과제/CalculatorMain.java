package homework.day06Class;

/*8. 사칙연산을 수행하는 Calculator 클래스 작성
        정수 : 12
        정수 : 5
        12 + 5 = 17
        12 - 5 = 7
        12 * 5 = 60
        12 / 5 = 2.4
        12 소수체크 : false
        5 소수체크 : true*/

public class CalculatorMain {

    public static void main(String[] args) {

        Calculator cal = new Calculator();

        cal.numInput();
/*  printResult 메소드를 만들어 넣어주었기 때문에 메인 메소드에서 아래 메소드들을 딱히 실행시킬 필요가 없었다.
        cal.addFunction();
        cal.minusFunction();
        cal.multiplyFunction();
        cal.divideFunction();
*/

        cal.printResult();


    }
}
