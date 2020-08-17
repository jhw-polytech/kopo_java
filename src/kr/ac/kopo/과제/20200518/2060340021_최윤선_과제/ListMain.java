package hw12;

import java.util.*;

/*
	앗!!! 윤선씨..... 한글이 깨져요...
	인코딩 다시 봐주세요~~~
*/

class Member{
	private String id;
	private String pw;
	
	public Member(String id, String pw) {
		this.setId(id);
		this.setPw(pw);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
}

public class ListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean bool = new Boolean(true);
		
		List<Member> list = new ArrayList<>();          //����
		
		bool=list.add(new Member("id11id", "pw11pw"));
		bool=list.add(new Member("id22id", "pw22pw"));
		bool=list.add(new Member("id33id", "pw33pw"));  
		bool=list.add(new Member("id44id", "pw44pw")); //list�� �� �־��ֱ�!
		
		System.out.println("�н����� ���漭���Դϴ�. ���̵�� ��й�ȣ�� �Է��ϼ���");
		System.out.print("ID �Է� : ");
		String iptid = sc.nextLine();
		String iptpw="";
		String changepw="";
		
		System.out.println("PW �Է� : ");
		iptpw=sc.nextLine();
		bool=false;
		
		for(Member i : list){
			 if(iptid.equals(i.getId())) {
				 bool=true;
				 if(!iptpw.equals(i.getPw())) {
					 System.out.println("��й�ȣ�� Ʋ���̽��ϴ�. ���α׷��� �����մϴ�.");
					 System.exit(0);
				 }
				 System.out.println("�����ϰ����� ��й�ȣ�� �Է��ϼ���");
				 changepw = sc.nextLine();
				 i.setPw(changepw);
				 System.out.println("��й�ȣ�� �����Ͽ����ϴ�.");
			 }
	    }
		
		if(bool==false) {
			System.out.println("�ش� ���̵� ã�� �� �����ϴ�. ���α׷��������մϴ�.");
			System.exit(0);
		}
		
		for(Member i : list){
			System.out.println("ID : "+i.getId()+" PW : "+i.getPw());
		}
		

		

		
		

	}

}
