package dirFile;

import java.io.File;

public class GoUp {

	static View v = new View();

	public static void goup(File f) {
		v.print(f.getParent());
	}
}