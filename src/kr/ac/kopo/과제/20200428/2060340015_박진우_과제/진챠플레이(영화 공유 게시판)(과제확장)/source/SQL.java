package kr.ac.jinwoo.day12.homework.BoardHomework;

public interface SQL {

	public String select(Data data);
	
	public boolean insert(Data data);
	
	public boolean delete(Data data);
	
	public boolean update(Data origin, Data change);
	
}
