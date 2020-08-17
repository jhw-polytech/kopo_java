package kr.ac.kopo.assignment.day11;

public class LottoNumberException extends Exception {
	/*
	 * 교수님! serialVersionUID 경고가 뜨는데, 이건 처리하지 않아도 실행이 되는 건가요??(되긴 합니당 ㅎㅎ)
	 	=> 네네 신경안쓰셔도 됩니다~~
	 */
	public LottoNumberException() {
		super();
	}
	
	public LottoNumberException(String message) {
		super(message);
	}

}
