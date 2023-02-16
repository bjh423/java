package 생성자;

public class 일지 {
	public static void main(String[] args) {
		Day day1 = new Day("자바공부", 8 , "우리집");
		System.out.println(Day.time);
		Day day2 = new Day("자바공부", 8 , "우리집");
		System.out.println(Day.time);
		Day day3 = new Day("자바공부", 8 , "우리집");
		System.out.println(Day.time);
		
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		
		
	}
}
