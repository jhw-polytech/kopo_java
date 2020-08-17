package homework0423;

/*
 * 2060340017 신형재 과제 1번
 * 
 * 
 */

public class Main {
	public static void main(String[] args) {
		Control cnt = new Control();
		Figuare fi;
		
		int answer = 0;
		
		
		answer = cnt.question();
		fi = new Figuare(answer);
		fi.choose(answer);
		cnt.print(answer);
	}
}
