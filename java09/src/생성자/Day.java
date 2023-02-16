package 생성자;

public class Day {
	String 하는일;
	int 시간;
	String 지역;
	static int count;
	static int time;

	public Day(String 하는일, int 시간, String 지역) {
		count++;
		time += 시간;
		this.하는일 = 하는일;
		this.시간 = 시간;
		this.지역 = 지역;
	}

	@Override
	public String toString() {
		return "Day [하는일=" + 하는일 + ", 시간=" + 시간 + ", 지역=" + 지역 + "]";
	}

}
