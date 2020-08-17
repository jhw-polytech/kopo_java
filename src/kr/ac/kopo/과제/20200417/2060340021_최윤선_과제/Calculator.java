package homework07;

public class Calculator {
	int add (int a, int b) {
		return (a+b);
	}
	
	int sub(int a , int b) {
		return (a-b);
	}
	
	int mul(int a, int b) {
		return (a*b);
	}
	
	double div(int a, int b) {
		return (   (double)a/b   );
	}
	
	void four_fundamental(int a, int b) {
		System.out.printf("%d + %d = %d\n",a,b,  add(a,b) );
		System.out.printf("%d - %d = %d\n",a,b,  sub(a,b)  );
		System.out.printf("%d * %d = %d\n",a,b,   mul(a,b)   );
		System.out.printf("%d / %d = %f\n\n",a,b,   div(a,b)    );
	}
	
	boolean chk_prime(int a) {
		boolean result = true;
		int cnt=0;
		for(int i=1 ; i<=a ; i++) {
			if(a%i==0) {
				cnt++;
			}
		}
		if(cnt==2) {
			result=true;
		}
		else {
			result=false;		
		}
		return result;
	}


}
