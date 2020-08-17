package kr.ac.jinwoo.day10.homework2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Casino {
	
	private static int maxMoney = 10_000_000;
	private int totalMoney = maxMoney;
	private Dealer dealer;
	private Player player = new Player();
	private SlotMachine slotMachine = new SlotMachine();

	private Scanner sc = new Scanner(System.in);

	protected ArrayList<String> srpLogArr = new ArrayList<String>();
	protected ArrayList<String> diceLogArr = new ArrayList<String>();
	protected ArrayList<String> slotLogArr = new ArrayList<String>();
	
	public void open() {

		String cmd;

		int judge;
		int[] loseWinDraw = new int[3];

		openingMent();
		charge();

		System.out.println("당신의 돈 : \t" + convertMoneySign(player.getMoney()) + "원");
		System.out.println("카지노의 돈 : \t" + convertMoneySign(totalMoney) + "원");
		System.out.println();
		
		System.out.println("시작하시려면 Enter 키를 눌러주세요.");
		sc.nextLine();

		//while (!bankrupt) {
		while (totalMoney > 0) {

			System.out.println("게임을 선택하세요");
			System.out.println("\tA. 가위바위보 게임");
			System.out.println("\tB. 주사위 게임");
			System.out.println("\tC. 슬롯 머신");
			System.out.println("\tD. 설명 듣기");
			System.out.println("\tZ. 그만 두기");

			System.out.print("입력 : ");
			cmd = sc.nextLine();
			System.out.println();

			// 가위바위보
			if (cmd.equals("a") || cmd.equals("A") || cmd.equals("1")) {

				dealer = selectDealer();
				
				int bet = dealer.betting(player);
				totalMoney += bet;

				judge = dealer.srpGameStart();

				if (judge == 1) {
					player.setMoney(player.getMoney() + bet + bet * 2);
					System.out.println("축하합니다. " + convertMoneySign(bet) + "원의 배팅금액과 " + convertMoneySign(bet * 2)
							+ "원의 상금을 획득하셨습니다.");
					totalMoney -= (bet + bet * 2);
					
					loseWinDraw[1]++;
				} 
				else if (judge == 2) {
					player.setMoney(player.getMoney() + bet);
					System.out.println("비겼습니다. " + convertMoneySign(bet) + "원의 배팅금액을 돌려받으셨습니다.");
					totalMoney -= bet;
					loseWinDraw[2]++;
				}
				else if (judge == 0)
					loseWinDraw[0]++;
				
				srpLogArr.add(dealer.sendLog(new ScissorsRockPaper()));
				
				dealer = null;

			}
			// 주사위 게임
			else if (cmd.equals("b") || cmd.equals("B") || cmd.equals("2")) {

				dealer = selectDealer();
				
				int bet = dealer.betting(player);
				totalMoney += bet;

				judge = dealer.diceGameStart();

				if (judge == 1) {
					player.setMoney(player.getMoney() + bet + bet * 6);
					System.out.println("축하합니다. " + convertMoneySign(bet) + "원의 배팅금액과 " + convertMoneySign(bet * 6)
							+ "원의 상금을 획득하셨습니다.");
					totalMoney -= (bet + bet * 6);
					loseWinDraw[1]++;
				} else if (judge == 0)
					loseWinDraw[0]++;
				else if (judge == 2)
					loseWinDraw[2]++;

				diceLogArr.add(dealer.sendLog(new Dice()));
				
				dealer = null;
			}
			// 슬롯 머신
			else if (cmd.equals("c") || cmd.equals("C") || cmd.equals("3")) {

				int bet = slotMachine.slotMachineCharge(player);
				if (bet > 0) {
					totalMoney += bet;

					judge = slotMachine.startGame(0, null);
					int prize = slotMachine.getUserPrize();
					if (judge == 1) {
						player.setMoney(player.getMoney() + prize);
						System.out.println("축하합니다. " + convertMoneySign(prize) + "원의 상금을 획득하셨습니다.");
						totalMoney -= prize;
						loseWinDraw[1]++;
					} else if (judge == 0)
						loseWinDraw[0]++;
					else if (judge == 2)
						loseWinDraw[2]++;
				} else {
					System.out.println("슬롯 머신 참여 금액이 모자랍니다. 다른 게임을 선택해주세요.\n");
				}
				
				slotLogArr.add(slotMachine.getLastLog());

			} else if (cmd.equals("d") || cmd.equals("D") || cmd.equals("4")) {
				printRule();
			}
			// 종료
			else if (cmd.equals("z") || cmd.equals("Z") || cmd.equals("5")) {
				System.out.println("\n게임을 종료합니다.");

				break;
			} else
				System.out.println("다시 입력하세요.\n");

			System.out.println("당신의 돈 : \t" + convertMoneySign(player.getMoney()) + "원");
			System.out.println("카지노의 돈 : \t" + convertMoneySign(totalMoney) + "원");
			System.out.println();

			
//			if (totalMoney <= 0)
//				bankrupt = true;
			
			if (player.getMoney() <= 0)
				break;
		}
		System.out.println("");

		if (totalMoney <=0) {
			congratulationMent();
		} else if (player.getMoney() <= 0) {
			userBankruptMent();
		} else {
			closingMent();
		}
		System.out.println();
		System.out.printf("당신의 게임 전적은 %d승 %d패 %d무 입니다.\n\n", loseWinDraw[1], loseWinDraw[0], loseWinDraw[2]);

		totalGameLogPrint();
	}

	private void charge() {

		int money;

		Random r = new Random();
		money = r.nextInt(1_400_000) + 100_000;

		money = money / 10000 * 10000;
		totalMoney -= money;
		player.setMoney(money);

		System.out.println("\n" + convertMoneySign(player.getMoney()) + "원이 랜덤으로 충전되었습니다! 즐거운 시간 되십시오.\n");
	}
	
	private Dealer selectDealer() {
		
		Dealer retDeal = null;
		
		Random r = new Random();
		int n = r.nextInt(5);
		
		if(n == 0) 		retDeal = new Goni();
		else if(n == 1) retDeal = new Agwi();
		else if(n == 2) retDeal = new NormalDealer();
		else if(n == 3) retDeal = new CarDealer();
		else			retDeal = new KwakCheolYong();
		
		return retDeal;
	}

	public static String convertMoneySign(int money) {

		StringBuilder str = new StringBuilder();
		int decCnt = 0;

		if (money > 0) {
			if(money > maxMoney) 
				money = maxMoney;
			while (money > 0) {
				if (decCnt == 3) {
					str.insert(0, ",");
					decCnt = 0;
				}
				str.insert(0, money % 10);
				money /= 10;
				decCnt++;
			}
		} else if (money <= 0) {
//			money *= -1;
//			str.append("-");
//			while (money >= 0) {
//				if (decCnt == 3) {
//					str.insert(0, ",");
//					decCnt = 0;
//				}
//				str.insert(0, money % 10);
//				money /= 10;
//				decCnt++;
			str.append(0);
		}

//			}
//		} else
//			str.append(money);

		return str.toString();
	}
	
	public void totalGameLogPrint() {
		
		System.out.println("가위바위보 게임");
		System.out.println("===================================");
		System.out.println("게임 로그");
		
		for(int i = 0; i < srpLogArr.size(); i++) {
			System.out.println((String)srpLogArr.get(i));
		}
		
		if(srpLogArr.size() == 0) {
			System.out.println("로그 없음.");
		}
		
		System.out.println("===================================");
		System.out.println();
		System.out.println("주사위 게임");
		System.out.println("===================================");
		System.out.println("게임 로그");
		
		for(int i = 0; i < diceLogArr.size(); i++) {
			System.out.println((String)diceLogArr.get(i));
		}
		
		if(diceLogArr.size() == 0) {
			System.out.println("로그 없음.");
		}
		
		System.out.println("===================================");
		System.out.println();
		System.out.println("슬롯 머신");
		System.out.println("===================================");
		System.out.println("게임 로그");
		
		for(int i = 0; i < slotLogArr.size(); i++) {
			System.out.println((String)slotLogArr.get(i));
		}
		
		if(slotLogArr.size() == 0) {
			System.out.println("로그 없음.");
		}
		
		System.out.println("===================================");
	}

	public void printRule() {

		System.out.println();
		System.out.println("********** 카지노 게임 규칙 **********\n");
		System.out.println("1. 플레이어의 초기 금액은 랜덤으로 설정됩니다.\n");
		System.out.println("2. 게임은 총 3가지로 나뉩니다.");
		System.out.println("   - 가위바위보 게임");
		System.out.println("   - 주사위 게임");
		System.out.println("   - 슬롯 머신\n");
		System.out.println("3. 가위바위보 게임과 주사위 게임은 딜러를 통해 진행됩니다.");
		System.out.println("   - 게임 시작 시 원하는 만큼 배팅을 진행하게 됩니다.");
		System.out.println("   - 딜러는 게임 시작 시 랜덤으로 배정되며 5등급으로 나뉩니다.");
		System.out.println("   - 딜러에 따라 승리 확률이 다릅니다. 전략적인 배팅에 도움이 되셨으면 좋겠습니다.\n");
		System.out.println("   가위바위보 게임");
		System.out.println("      - 승리 시 배팅액 + 배팅액의 2배의 상금을 받을 수 있습니다.");
		System.out.println("      - 무승부 시 배팅액을 돌려받습니다.");		
		System.out.println("   주사위 게임");
		System.out.println("      - 승리 시 배팅액 + 배팅액의 6배의 상금을 받을 수 있습니다.\n");
		System.out.println("4. 슬롯머신은 기계를 통해 진행됩니다.");
		System.out.println("   - 슬롯머신에는 " + convertMoneySign(slotMachine.slotMoney) + "원을 투입하게 되며 결과화면에 따른 보상이 주어집니다.");
		System.out.println("   - 슬롯머신은 항상 똑같은 확률을 가집니다.\n");
		System.out.println("5. 이 게임의 궁극적인 목표는 저희 카지노의 돈을 모두 가져가 파산시키는 것입니다.\n");
		System.out.println("*******************************\n");
	}

	public void openingMent() {
		
		System.out.println("**********************************************");
		System.out.println("**********************************************");
		System.out.println("**********************************************");
		System.out.println();
		System.out.println("   ***     **     ***   ***  *    *    ***    ");
		System.out.println("  *   *   *  *   *   *   *   **   *   *   *   ");
		System.out.println("  *      *    *   **     *   * *  *  *     *  ");
		System.out.println("  *      ******     **   *   *  * *  *     *  ");
		System.out.println("  *   *  *    *  *   *   *   *   **   *   *   ");
		System.out.println("   ***   *    *   ***   ***  *    *    ***    ");
		System.out.println();
		System.out.println("**********************************************");
		System.out.println("**********************************************");
		System.out.println("**********************************************");
		System.out.println();
		System.out.println("진우 카지노에 온 것을 환영합니다. 저희 카지노를 파산 시켜보세요!");
		System.out.println();
	}

	public void userBankruptMent() {
		System.out.println("**********************************************");
		System.out.println("**********************************************");
		System.out.println("**********************************************");
		System.out.println();
		System.out.println("      *******               *******            ");
		System.out.println("             *                     *           ");
		System.out.println("             *                     *           ");
		System.out.println("       *******               *******           ");
		System.out.println("             *                     *           ");
		System.out.println("             *                     *           ");
		System.out.println("                   ********                    ");
		System.out.println();
		System.out.println("**********************************************");
		System.out.println("**********************************************");
		System.out.println("**********************************************");
		System.out.println();
	}

	public void closingMent() {
		System.out.println("**********************************************");
		System.out.println("**********************************************");
		System.out.println("**********************************************");
		System.out.println();
		System.out.println("      *******    *       *    *******         ");
		System.out.println("      *       *  *       *   *                ");
		System.out.println("      *       *   *     *    *                ");
		System.out.println("      ********     ** **     ********         ");
		System.out.println("      *       *      *       *                ");
		System.out.println("      *       *      *       *                ");
		System.out.println("      *******        *        *******         ");
		System.out.println();
		System.out.println("**********************************************");
		System.out.println("**********************************************");
		System.out.println("**********************************************");
		System.out.println();
	}

	public void congratulationMent() {
		System.out.println();
		System.out.println("********************************************************");
		System.out.println("********************************************************");
		System.out.println("********************************************************");
		System.out.println();
		System.out.println(" *     *  ***   ***   *****    ***     ****   *     *   ");
		System.out.println(" *     *   *   *   *    *     *   *   *    *  *     *   ");
		System.out.println(" *     *   *   *        *    *     *  *    *   *   *    ");
		System.out.println("  *   *    *   *        *    *     *  *****     * *     ");
		System.out.println("   * *     *   *   *    *     *   *   *    *     *      ");
		System.out.println("    *     ***   ***     *      ***    *    *     *      ");
		System.out.println();
		System.out.println("********************************************************");
		System.out.println("********************************************************");
		System.out.println("********************************************************");
		System.out.println();
	}
}
