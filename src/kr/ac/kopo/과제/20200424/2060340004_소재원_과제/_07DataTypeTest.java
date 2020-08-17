package exam0424.etc;

public class _07DataTypeTest {
	private int tom = -1;
	private char marry = '9';
	private boolean john;
	private String sarah = "Sarah Jang";
	
	public static void main(String[] args) {
		new _07DataTypeTest().printMyType();
	}
	
	private void printMyType() {
		System.out.println("our friends.\n" + tom + ", " + marry + ", " + john 
				+ " and " + sarah);
	}
}
