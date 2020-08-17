package homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

/*
	윤후씨 주석이 깨져서 안보여요... ㅜㅜ
	그나저나 TreeSet으로 구성하나 HashSet으로 구성하나 알고리즘은 같은거 아닌가요???
*/

public class Lotto {
	private int rnum;
	private boolean b;
	private int size=0;
	
	Lotto(){}
	
	public void Lotto(int ipt){
	}
	
	Random r = new Random();
	
	
	public void useList(int ipt){
		System.out.println("\n>> ����Ʈ�� ���ϴ� ���");
		for(int i=1 ; i<= ipt ; i++) {
			List<Integer> list = new ArrayList();
			//for(int j=0;  j<6  ; j++) {
			while(size!=6) {
				rnum=(r.nextInt(45) +1);
				b=list.contains(rnum); // ����Ʈ�� �ߺ��� ����ϱ� ������
				if(b==false) {           // �� �κп��� �ߺ����� Ȯ��
					list.add(  rnum );
				}
				size=list.size();
			}
			//}
			System.out.printf("%d��° ���� ��� : [",i);
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
		System.out.println(">> Treeset���� ���ϴ� ���");
		size=0;
		for(int i=1 ; i<=ipt  ; i++) {
			TreeSet<Integer> set = new TreeSet();
			while(size!=6) {
				rnum=(r.nextInt(45) +1);
				set.add(rnum); // set�� �ߺ���� ������
				size=set.size(); // set�� ���ҵ�� ������ ����.
			}
			System.out.printf("%d��° ���� ��� : [",i);
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
		System.out.println(">> Hashset���� ���ϴ� ���");
		size=0;
		for(int i=1 ; i<=ipt  ; i++) {
			HashSet<Integer> set = new HashSet();
			while(size!=6) {
				rnum=(r.nextInt(45) +1);
				set.add(rnum); // set�� �ߺ���� ������
				size=set.size(); // set�� ���ҵ�� ������ ����.
			}
			System.out.printf("%d��° ���� ��� : [",i);
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
		System.out.println(">>int�� arr�� ���ϱ�");
		size=0;
		//b=true;
		for(int i =1 ; i<=ipt ;i++) {
			int[] intarr = new int[6];
			while(size!=6) {
				rnum=(r.nextInt(45) +1);
				b=true;
				for (int y=0 ; y <size ; y++) { //�ߺ�����
					if(intarr[y]==rnum) {         //�� �ݺ����� 3���� �����ɸ��׿��
						b=false;
					}
				}
				if (b==true) {
					intarr[size]=rnum;
					size++;
				}
			}
			System.out.printf("%d��° ���� ��� : [",i);
			for (int a : intarr) {
				System.out.printf(" %d ", a);
			}
			System.out.printf("]\n");
			size=0;
		}
		System.out.println("\n\n");
	}
}
