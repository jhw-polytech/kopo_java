package kr.ac.kopo.board.service;

import kr.ac.kopo.board.dao.BoardDAO;

//UI 인스턴스 객체가 -> 서비스 호출 ,  서비스가 -> DAO 호출

/*
	DAO 여러개를 호출하는 것을 서비스가 한다!!!
*/

public class BoardService {
	
	private BoardDAO boardDAO;
	
	
	public BoardService() {
		boardDAO = new BoardDAO();
	}

}
