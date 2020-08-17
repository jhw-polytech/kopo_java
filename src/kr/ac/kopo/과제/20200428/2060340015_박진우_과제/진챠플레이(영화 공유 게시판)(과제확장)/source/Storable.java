package kr.ac.jinwoo.day12.homework.BoardHomework;

public interface Storable {

	public boolean open();
	
	public void getDataToDB();
	
	public boolean openReadBuf();
	
	public boolean closeReadBuf();
	
	public boolean openWriteBuf(boolean coverWrite);
	
	public boolean closeWriteBuf(boolean coverWrite);
}
