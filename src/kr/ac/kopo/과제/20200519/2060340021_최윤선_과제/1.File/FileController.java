package hw.hw12.File;

import java.io.File;
import java.util.Scanner;

public abstract class FileController {
	Scanner sc = new Scanner(System.in);
	public abstract void process(File dirObj);

}
