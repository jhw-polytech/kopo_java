package kr.ac.kopo.day12.homework.lotto;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoMarket {

	private Scanner sc;
	private NumberMakable nbm;
	private Random r;
	private LottoUtil lu;

	public LottoMarket() {
		sc = new Scanner(System.in);
	}

	public int scanInt(String msg) {
		System.out.print(msg);
		int num = sc.nextInt();
		sc.nextLine();

		return num;
	}

	public void open() {

		int rows = scanInt("로또 몇줄 사실래요? : ");
		if(rows>100) {
			System.out.println("한 회차에 10만원을 초과하여 구매할 수 없습니다.");
			return;
		}
		
		if(rows/10>0 && rows%10==0) {
			System.out.println("자동 "+rows/10 +"만원이요~");
		}
		else if(rows/10>0) {
			System.out.println("자동 "+rows/10 +"만 "+rows%10+"천원이요~");
		}
		else {
			System.out.println("자동 "+rows+"천원이요~\n");
		}

		r = new Random();
		lu = new LottoUtil();
		nbm = null;
		int cnt =0;

		while(cnt<rows) {

			if(cnt==0) {
				printHead();
			}
			int choice = r.nextInt(4);
			int[] row;

			if(choice == 0) {
				nbm = new ArrayMaker();
			}
			else if(choice == 1) {
				nbm = new GeometryMaker();
			}
			else if(choice == 2) {
				nbm = new SetMaker();
			}
			else {
				nbm = new ListMaker();
			}
			row = nbm.makeNumber();
			Arrays.sort(row);
			System.out.print("| "+(char)('A'+cnt)+" 자 동     ");
			for(int i=0;i<row.length;i++) {
				System.out.printf("%02d",row[i]);
				if(i== row.length-1) {
					System.out.print(" |\n");
				}
				else {
					System.out.print("  ");
				}

			}
			cnt++;
			if(cnt==rows || cnt==5) {
				printTail(cnt);
			}
			if(cnt==5) {
				rows-=5;
				cnt=0;
			}
		}

	}
	public void printHead() {

		System.out.println(" ___________________________________");
		System.out.println("|                                   |");
		System.out.println("|                                   |");
		System.out.println("|\tLotto6/45\t\t    |");
		System.out.println("|\t 제 "+lu.round()+" 회\t\t    |");
		System.out.println("| 발 행 일 : "+lu.today()+" |");
		System.out.println("| 추 첨 일 : "+lu.lottery()+"\t    |");
		System.out.println("| 지급 기한 : "+lu.dueDate()+"\t\t    |");
		System.out.println("| --------------------------------- |");

	}
	public void printTail(int rows) {
		System.out.println("| --------------------------------- |");
		System.out.printf("| 금액 \t\t\t     ₩%,4d |\n",rows*1000);
		System.out.println("|___________________________________|");
	}
}
