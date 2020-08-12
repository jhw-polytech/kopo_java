package kr.ac.kopo.board.dao;


import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.board.vo.BoardVO;

public class BoardDAO {

	private List<BoardVO> list;

	public BoardDAO() {
		list = new ArrayList<>();
	}
	
	/**
	 * 새로운 게시글 등록하는 기능
	 */
	public void insertBoard(BoardVO newBoard) {
		list.add(newBoard);
		System.out.println("dao.... insertBorard.... : " + list.size());
	}
	
	/**
	 * 전체게시글을 조회하는 기능
	 */
	
	/**
	 * 게시물 번호에 해당하는 게시물을 조회하는 기능
	 */
	
	/**
	 * 번호에 해당하는 게시물을 수정하는 기능
	 */
	
	/**
	 * 번호에 해당하는 게시물을 삭제하는 기능
	 */
}









