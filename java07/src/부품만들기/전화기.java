package 부품만들기;

public class 전화기 {
	// 성질 : 멤버 변수 (가격, 모양)
	// public : 아무데서나 접근 가능 (접근제어자)
	public int price; // 0
	public String shape; // null
	// 멤버변수는 자동 초기화

	// 동작 : 멤버 메소드 (=함수), 동적인 기능
	// 인터넷,카톡
	public void 인터넷하다() {
		System.out.println("와이파티 연결");
		System.out.println("데이터 연결");
	}

	public void 카톡하다() {
		System.out.println("자바 단체톡");
		System.out.println("게시물 업로드");
	}
}
