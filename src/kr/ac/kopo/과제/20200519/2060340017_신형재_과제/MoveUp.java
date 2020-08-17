package homework0519;

import java.io.File;

public class MoveUp {
	public String start(String str) {
		File obj = new File(str);
		str = obj.getParent();
		System.out.println("이동 성공");
		return str;
	}
}
