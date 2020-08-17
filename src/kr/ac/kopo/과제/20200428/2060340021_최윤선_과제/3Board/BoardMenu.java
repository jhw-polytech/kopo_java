package homework12.Board;

public abstract class BoardMenu {
	
	public int no;
	public String title;
	public String writer;
	public String date;
	public String content;
	
	public abstract void process(int no, BoardPost[] bp);      //1. 전체게시물 조회   
	//public abstract void seeindex(int no, BoardPost[] bp); //2. 글번호 조회 
	//public abstract void regist(int no, BoardPost[] bp);      //3. 글등록 
	//public abstract void update(int no, BoardPost[] bp);    //4. 글수정 
	//public abstract void delete(int no, BoardPost[] bp);     //5. 글삭제   
}
