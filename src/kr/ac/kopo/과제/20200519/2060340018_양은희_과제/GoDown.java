package dirFile;

import java.io.File;

public class GoDown {
	
	static View v = new View();
	
	public static void godown(File f) {
		v.print(f.getPath());
	}

}
