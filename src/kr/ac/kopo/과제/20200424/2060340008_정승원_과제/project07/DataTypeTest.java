package kr.ac.kopo.day10.project.project07;

public class DataTypeTest {

	private int tom = -1;
	private char marry = '9';
	private boolean john;
	private String sarah = "Sarah Jang";
	
	public static void main(String[] args) {
		new DataTypeTest().printMyType();
	}
	
	public void printMyType() {
		 System.out.println( "our friends..\n"     + tom + ", " + marry + ", " + john + " and " + sarah);
	}
}
