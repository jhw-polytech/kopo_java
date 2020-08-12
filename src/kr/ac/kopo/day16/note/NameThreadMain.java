package kr.ac.kopo.day16.note;



class NameThread extends Thread {
	
	/*
	public public NameThread(String name) {
		setName(name);
	}
	*/
	
	
	
	public NameThread() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public NameThread(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void run() {
		System.out.println("스레드 이름 : " + getName());

		
		// NameThread-1 ===> ChangeThread-1
		// NameThread-2 ===> ChangeThread-2 이름변경
		
		int idx = getName().lastIndexOf("-");
		String no = getName().substring(idx);
		setName("ChangeThread" + no);
		
// 나의 시도
//		String changeName = getName();
//		changeName = changeName.replace("Name", "Change");		
		
		setName("ChangeThread" + no);
		System.out.println("변경된 스레드 이름 : " + getName());
		
	}

}

public class NameThreadMain {

	public static void main(String[] args) {
		
		NameThread nt = new NameThread();
		NameThread nt2 = new NameThread();
		NameThread nt3 = new NameThread("내가 생성한 스레드명"); // NameThread에 생성자가 없으면 에러남
		
		nt.start();
		nt2.start();
	}
	
}
