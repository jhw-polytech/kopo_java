package homework0428;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

//�ǵ��Ͻ� �κ��� ���� ���� �����ϴ� ���� �ٸ� �˰��� 4���� ����� �ɷ� ������ �Ǵµ�,
//�˰����� �����ϰ� �����ϴ� ���, ���� ������ ��� ��Ű�� ���� ���� ������� �ۼ��߽��ϴ�...

public class LottoUtil {
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	
	int coin;
	
	
	public void execute() {
		coin = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		int[] lottoArr = new int[coin*7];
		
		System.out.println("��ȣ\t 1��\t2��\t3��\t4��\t5��"
								+ "\t6��\t+���ʽ� ��ȣ");
		
		/*���� ���� ��� #1 {Random.nextInt([])}
		for(int i = 1; i<=coin; i++) {
			System.out.printf("���� %d\t ", i);
			for(int j = 0; j<7; j++) {
				int lottoNum = r.nextInt(45)+1;
				lottoArr[j] = lottoNum;
				if(j==0) {
					System.out.print("[" + lottoArr[j]+",\t");
				}else if(j!=6) {
					System.out.print(lottoArr[j]+",\t");
				}else if(j==6){
					System.out.print(lottoArr[j]+"]");
				}	
			}
			System.out.println();
		}
		*/
		/* ���� ���� ��� #3 {(int)(Math.random()*[]+1)}
		for(int i = 1; i<=coin; i++) {
			System.out.printf("���� %d\t",i);
			for(int j=0;j<7;j++) {
				int lottoNum = (int) ((Math.random()*44)+1);
				lottoArr[j] = lottoNum;
				if(j==0) {
					System.out.print("["+lottoArr[j]+",\t");
				}else if(j!=6) {
					System.out.print(lottoArr[j]+",\t");
				}else if(j==6){
					System.out.print(lottoArr[j]+"]");
				}	
			}System.out.println();
		}
		*/
		
		/*���� ���� ���#2{Random.nextInt()���� �迭�� ���� �� ��ŭ ���� ����, ���� ���}
		for(int i = 0; i<coin*7; i++) {
			int lottoNum = r.nextInt(45)+1;
			lottoArr[i] = lottoNum;
		}
		int cnt=1;
		for(int j = 0; j<coin*7; j++){
			if(j%7==0){
				System.out.printf("���� %d\t ", cnt);
				System.out.print(lottoArr[j]+"\t");
				cnt++;
			}else if(j%7==6) {
				System.out.print(lottoArr[j]+"\n");
			}else {
				System.out.print(lottoArr[j]+"\t");
			}
		}
		*/
		/*���� ���� ��� #3{ArrayList�� Ȱ���� ���ǰ� ���� �� ���}
		ArrayList<Integer> list = new ArrayList<Integer>();
			for(int j=0; j<7*coin;j++) {
				list.add(r.nextInt(45)+1);
			}
			int cnt=1;
			for(int j=0;j<coin*7;j++) {
				
				if(j%7==0) {
				System.out.print("���� "+ (cnt) + "\t");
				System.out.print(list.get(j));
				}
				if(j%7==6) {
					System.out.print(list.get(j) + "\n");
					cnt++;
				}else {
					System.out.print(list.get(j)+"\t");
				}
			}
		*/
	}
}