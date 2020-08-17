package kr.ac.jinwoo.day12.homework.BoardHomework;

public class UserDB extends DB {

	// 유저 정보 저장소
	private static User userArr[] = new User[100];
	
	UserDB(){
		super("D:\\Lecture\\javaEE_workspace\\java\\myUserDB.txt");
		getDataToDB();
	}
	
	@Override
	public void getDataToDB() {
		
		for(int i = 0; i < super.getMaxCnt(); i++) {
			userArr[i] = null;
		}
		
		String line = "";
		
		for(int i = 0; i < super.getDataCnt(); i++) {
			
			line = super.dataArr[i].getDataLine();
			String[] arr = line.split(",", 3);
			userArr[i] = new User(arr[1], arr[2]);
			userArr[i].setDataLine(line);
		}
		System.out.println("User : " + super.getDataCnt());
		
	}
	
	@Override
	public boolean insertDataToDB(Data data) {
		
		boolean ret = false;
		
		User user = (User)data;
		
		String dataLine = user.getId() + "," + user.getPassword();
		
		user.setDataLine(super.makeDBFormat(dataLine));
		ret = insert(user);
		
		if(ret) {
			getDataToDB();
		}
		
		return ret;
	}
	
	public boolean selectDataToDB(String name) {

		boolean ret = false;
		String dataLine = null;
		
		for(int i = 0; i < super.getDataCnt(); i++) {
			
			if(userArr[i].getId().equals(name)) {
				String str = userArr[i].getId() + "," + userArr[i].getPassword();
				Data d = new Data();
				d.setDataLine(super.makeDBFormat(str));
				dataLine = super.select(d);
				if(dataLine != null) {
					ret = true;
					break;
				}
			}
		}
		
		return ret;
	}
	
	public boolean selectDataToDB(User user) {
		
		boolean ret = false;
		String retStr = null;
		
		String dataLine = user.getId() + "," + user.getPassword();
		
		user.setDataLine(super.makeDBFormat(dataLine));
		
		retStr = super.select(user);
		
		if(retStr != null)
			return true;
		
		return ret;

	}
	
	@Override
	public boolean deleteDataToDB(Data data) {
		
		boolean ret = false;
		
		User user = (User)data;
		
		String dataLine = user.getId() + "," + user.getPassword();
		
		user.setDataLine(super.makeDBFormat(dataLine));
		
		ret = super.delete(user);
		
		if(ret) {
			getDataToDB();
			userArr[super.getDataCnt()] = null;
		}
		
		return ret;
	}
	
}
