package 확인문제1;

public class Mask {
	String 색깔;
	int 가격;
	int 개수;

	public Mask(String 색깔, int 가격, int 개수) {
		this.색깔 = 색깔;
		this.가격 = 가격;
		this.개수 = 개수;
	}

	@Override
	public String toString() {
		return "Mask [색깔=" + 색깔 + ", 가격=" + 가격 + ", 개수=" + 개수 + "]";
	}

}
