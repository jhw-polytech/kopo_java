package Assignment;

import java.util.Random;

class Account {
   private String name;
   private int money;
   private int dpmoney;
   private int wdmoney;
   
   
   Random ran = new Random();
   
   Account(String name, int money){
	   this.name=name;
	   this.money=money;
   }
   
   public synchronized void Deposit(String name){
	   try {
		   
		   dpmoney =ran.nextInt(10000);
		   money+=dpmoney;
		   
		   System.out.println(name+"고객님이 "+dpmoney+"원을 입금하셨습니다.");
		   System.out.println("현재 잔액은 "+money+"원 입니다.");
		   
	    } catch (Exception e) {
	    	e.printStackTrace();
	    	
		// TODO Auto-generated catch block
	    }
   }
   
  public synchronized void Withdraw(String name) {
	  try {
		
		wdmoney=ran.nextInt(10000);		
		if((money-wdmoney)<0) {
			System.out.println("출금 금액 :"+wdmoney+ " => 잔액이 부족하여 출금이 불가능합니다.");
			System.out.println("현재 잔액은"+money);
		}
		else {
			money-=wdmoney;
			System.out.println(name+"님이 "+wdmoney+"원을 출금하셨습니다.");
			System.out.println("현재 잔액은 "+money + "원 입니다.");
		}
		

		  
		  
	} catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}
	  
  }
   
}

class User extends Thread{
  String name;
  Account account;
  
  User(String name, Account account){
	  this.name=name;
	  this.account=account;
	  
  }

@Override
public void run() {
	// TODO Auto-generated method stub
	try {
		for (int i=0; i<2; i++) {
			account.Deposit(name);
		}

		for (int j=0; j<2; j++) {
			
			account.Withdraw(name);
		}
	} catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	
	}

}
  
  
}

  
  
public class HongHong {
	
	public static void main(String[] args) {
		Account ac = new Account("홍길동", 10000);
		User hong =new User("홍길동",ac);
		User mom =new User("어머니", ac);
		User dad =new User("아버지", ac);

		hong.start();
		mom.start();
		dad.start();
	}
}


