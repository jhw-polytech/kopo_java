package Assignment05;

/*
	윤후씨 만일 여러번 정수 일벽받고 소수체크하면 그때마다 cnt, cnt2, bool 변수 초기화 할꺼에요????
	소수를 위해서만 존재하는 변수는 굳이 멤버변수보다는 지역변수가 좋을 수 있어요.. 
	인스턴스객체가 사라지기전까지 값은 유지시켜야하는 값만 멤버변수로 정의하는게 좋을거 같습니다 ^^
*/
public class Calc {

	int num1;
	int num2;
	int cnt=0;
	int cnt2=0;
	boolean bool;
	
	void add(int num1,int num2) {
		
		System.out.printf("%d + %d = %d",num1,num2,num1+num2);
		System.out.println();
	}
	
	void minus(int num3,int num4) {
		
		System.out.printf("%d - %d = %d",num3,num4,num3-num4);
		System.out.println();
	}

	void multiple(int num5,int num6) {
		
		System.out.printf("%d * %d = %d",num5,num6,num5*num6);
		System.out.println();
	}
	
	void divide(int num7,int num8) {
		
		System.out.printf("%d / %d = %d",num7,num8,num7/num8);
		System.out.println();
	}
	
	void prime(int num9,int num10) {
		
		for(int i=2; i<=num9; i++) {
			if(num9%i==0) {
				cnt+=1;
			}
		}
		if (cnt==1) {
			bool=true;
			System.out.println(num9 +"소수 체크 : "+bool);
		}
		else {
			bool=false;
			System.out.println(num9 +"소수 체크 : "+bool);
		}
		
		for(int i=2; i<=num10; i++) {
			if(num10%i==0) {
				cnt2+=1;
			}
		}
		if (cnt2==1) {
			bool=true;
			System.out.println(num10 +" 소수 체크 : "+bool);
		}
		else {
			bool=false;
			System.out.println(num10 +" 소수 체크 : "+bool);
		}
	}
	
}
