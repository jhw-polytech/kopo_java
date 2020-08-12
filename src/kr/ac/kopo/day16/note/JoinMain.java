package kr.ac.kopo.day16.note;

class BoyFriendThread extends Thread {

	@Override
	public void run() {
		GilrFriendThread gt = new GilrFriendThread();
		
		
		System.out.println("(남자친구) : 나는 남자친구 스레드입니다.");
		System.out.println("(남자친구) : 오늘 여자친구 스레드와 영화를 보기로 했습니다.");
		System.out.println("(남자친구) : 이런! 예매한 영화시간이 얼마남지 않았습니다.");
		System.out.println("(남자친구) : 여자친구가 올 때까지 기다리겠습니다.");
		System.out.println("(남자친구) : 드디어 여자친구가 왔습니다. 영화보러 갑니다.");
	}
}

class GilrFriendThread extends Thread {
	@Override
	public void run() {
		System.out.println("(여자친구) : 나는 여자친구 스레드입니다.");
		System.out.println("(여자친구) : 오늘 남자친구의 애정도를 테스트하겠습니다.");
		System.out.println("(여자친구) : 10초도 못기다리는 남자친구는 나를 좋아하는게 아니겠죠?");

		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("(여자친구): " + i + "초가 지났습니다."
														+ "남자친구가 계속 기다리고 있을까요?");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("(여자친구): 남자친구가 10초를 기다렸습니다. 저를 좋아하나봐요.");
	}
}

public class JoinMain {
	public static void main(String[] args) {
		BoyFriendThread bt = new BoyFriendThread();
		bt.start();
		
	}
}
