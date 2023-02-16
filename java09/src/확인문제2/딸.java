package 확인문제2;

public class 딸 {

	String 이름;
	char 성별;
	static int 아빠지갑;
	static int count;

	public 딸(String 이름, char 성별) {
		this.이름 = 이름;
		this.성별 = 성별;
		아빠지갑 -= 1000;
		count++;
	}

	public void tv보다() {
		System.out.println("TV를 보다");
	}

	@Override
	public String toString() {
		return "딸 [이름=" + 이름 + ", 성별=" + 성별 + "]";
	}

}
