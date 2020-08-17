
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 리스트를 이용하여 게시판 관리하는 클래스 
 * @author seung
 *
 */
public class Board {

	private ArrayList<Post> boardList;
	private Scanner sc;
	private int number = 0;
		
	public Board() {
		boardList = new ArrayList<>();
	}
	
	public void write() {
		number++;
		print("등록할 제목을 입력 : ");
		String title = getStr();
		print("등록할 글쓴이를 입력 : ");
		String content = getStr();
		
		boardList.add(new Post(title, content, number));
		print("게시글이 등록되었습니다.\n");
	}

	public void getAllPosts() {
		print("\t< 전체 게시글 조회 >");
		print("번호\t제목\t\t글쓴이\t\t등록일");
		for (int i = 0; i < boardList.size(); i++) {
			if (boardList.get(i) != null ) {
				Post post = boardList.get(i);
				print(post.getNumber()+"\t"+post.getTitle()+"\t\t"+post.getWriter()+"\t\t"+post.getDate());
			}
		}
	}
	
	public void getPost() {
		print("조회할 글 번호를 입력하세요.");
		int idx = getNum();
		Post post = boardList.get(idx - 1);
		print("\t< 게시글 조회 >");
		print("번호\t제목\t\t글쓴이\t\t등록일");
		print(post.getNumber()+"\t"+post.getTitle()+"\t\t"+post.getWriter()+"\t\t"+post.getDate()+"\n");
	}
	
	public void delete() {
		print("삭제할 글 번호를 입력하세요.");
		int idx = getNum();
		boardList.remove(idx - 1);
		print("게시글이 삭제되었습니다.");
	}
		

	public void modify() {
		print("수정할 글 번호를 입력하세요.");
		int idx = getNum();		
		Post post = boardList.get(idx - 1);
		print("수정할 제목을 입력하세요.");
		String title = getStr();
		post.setTitle(title);
		print("수정되었습니다.");
	}
	
	public void print(String msg) {
		System.out.println(msg);
		sc = new Scanner(System.in);
	}

	public String getStr() {
		return sc.nextLine();
	} 
	
	public int getNum() {
		return Integer.parseInt(sc.nextLine());
	}

}
