package homework0518;

public class PasswordMain {
	public static void main(String[] args) {
		PassView view = new PassView();
		
		System.out.println("초기 계정 입력");
		System.out.println("{aaa,111},{bbb,222},{ccc,333},{ddd,444}");
		PassFactor f1 = new PassFactor("aaa","111");
		PassFactor f2 = new PassFactor("bbb","222");
		PassFactor f3 = new PassFactor("ccc","333");
		PassFactor f4 = new PassFactor("ddd","444");
		
		PassFactor ps = new PassFactor();
		ps.getList().add(f1);
		ps.getList().add(f2);
		ps.getList().add(f3);
		ps.getList().add(f4);
		
		view.view();
	}
}
