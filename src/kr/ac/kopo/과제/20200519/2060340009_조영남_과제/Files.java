package kr.ac.yeongnam.day14.homework;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Files {
	private SimpleDateFormat sdf;
	private String name;
	private String type;
	private long size;
	private String modifiedInfo;
	
	
	Files(){		
	}
		
	Files(String name, String type, long size, long modifiedInfo){		
		sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");	
		
		this.name = name;
		this.type = type;
		this.size = size;
		this.modifiedInfo = sdf.format(new Date(modifiedInfo));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public String getModifiedInfo() {
		return modifiedInfo;
	}

	public void setModifiedInfo(String modifiedInfo) {
		this.modifiedInfo = modifiedInfo;
	}

	
}
