package homework.day17.Fundraise;


public class FundraiseMain {

    public static void main(String[] args) throws InterruptedException {

        System.out.println(">방송국을 통해 성금을 모금합니다.\n" +
                ">방송중 콜센터 1-4번까지 전화를 걸어 성금을 해주시기를바랍니다.\n" +
                ">방송이 종료되면 모금된 성금 총액을 알려드리겠습니다.");

        System.out.println();


        CallCenter cc = new CallCenter();
        FundraiseThread ft1 = new FundraiseThread(1,cc);
        FundraiseThread ft2 = new FundraiseThread(2,cc);
        FundraiseThread ft3 = new FundraiseThread(3,cc);
        FundraiseThread ft4 = new FundraiseThread(4,cc);

//        ft1.setPriority(Thread.MAX_PRIORITY);
//        ft2.setPriority(Thread.MAX_PRIORITY);
//        ft3.setPriority(Thread.MAX_PRIORITY);
//        ft4.setPriority(Thread.MAX_PRIORITY);

        ft1.start();
        ft2.start();
        ft3.start();
        ft4.start();
//
//        ft1.join();
//        ft2.join();
//        ft3.join();
//        ft4.join();


        System.out.println();
        System.out.println(">모금이 마감되었습니다.");
        int totalDonation = ft1.getTotal() + ft2.getTotal() + ft3.getTotal() + ft4.getTotal();
        System.out.println(">총 모금액은 "+totalDonation+ "원 입니다.");

    }
}



