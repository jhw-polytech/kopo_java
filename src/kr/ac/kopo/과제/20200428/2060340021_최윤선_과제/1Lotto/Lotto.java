package homework12.Lotto;


import java.util.*;

public class Lotto {
	private int rnum;
	private boolean b;
	private int size=0;
	
	Lotto(){}
	
	public void Lotto(int ipt){
	}
	
	Random r = new Random();
	
	
	public void useList(int ipt){
		System.out.println("\n>> 리스트로 구하는 방법");
		for(int i=1 ; i<= ipt ; i++) {
			List<Integer> list = new ArrayList();
			//for(int j=0;  j<6  ; j++) {
			while(size!=6) {
				rnum=(r.nextInt(45) +1);
				b=list.contains(rnum); // 리스트는 중복을 허용하기 때문에
				if(b==false) {           // 이 부분에서 중복인지 확인
					list.add(  rnum );
				}
				size=list.size();
			}
			//}
			System.out.printf("%d번째 게임 결과 : [",i);
			for (int a : list) {
				System.out.printf(" %d ", a);
			}
			System.out.printf("]\n");
			list.clear();
			size=0;
		}
		System.out.println("\n\n");
	}
	
	
	
	
	
	
	
	public void useTreeSet(int ipt) {
		System.out.println(">> Treeset으로 구하는 방법");
		size=0;
		for(int i=1 ; i<=ipt  ; i++) {
			TreeSet<Integer> set = new TreeSet();
			while(size!=6) {
				rnum=(r.nextInt(45) +1);
				set.add(rnum); // set은 중복허용 없으니
				size=set.size(); // set의 원소들과 비교하지 않음.
			}
			System.out.printf("%d번째 게임 결과 : [",i);
			for (int a : set) {
				System.out.printf(" %d ", a);
			}
			System.out.printf("]\n");
			set.clear();
			size=0;
		}
		System.out.println("\n\n");
	}
	
	
	
	
	
	
	public void useHashSet(int ipt) {
		System.out.println(">> Hashset으로 구하는 방법");
		size=0;
		for(int i=1 ; i<=ipt  ; i++) {
			HashSet<Integer> set = new HashSet();
			while(size!=6) {
				rnum=(r.nextInt(45) +1);
				set.add(rnum); // set은 중복허용 없으니
				size=set.size(); // set의 원소들과 비교하지 않음.
			}
			System.out.printf("%d번째 게임 결과 : [",i);
			for (int a : set) {
				System.out.printf(" %d ", a);
			}
			System.out.printf("]\n");
			set.clear();
			size=0;
		}
		System.out.println("\n\n");
	}
	
	
	
	
	
	
	
	public void useArr(int ipt) {
		System.out.println(">>int형 arr로 구하기");
		size=0;
		//b=true;
		for(int i =1 ; i<=ipt ;i++) {
			int[] intarr = new int[6];
			while(size!=6) {
				rnum=(r.nextInt(45) +1);
				b=true;
				for (int y=0 ; y <size ; y++) { //중복제거
					if(intarr[y]==rnum) {         //흠 반복문이 3개라 맘에걸리네요ㅠ
						b=false;
					}
				}
				if (b==true) {
					intarr[size]=rnum;
					size++;
				}
			}
			System.out.printf("%d번째 게임 결과 : [",i);
			for (int a : intarr) {
				System.out.printf(" %d ", a);
			}
			System.out.printf("]\n");
			size=0;
		}
		System.out.println("\n\n");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
