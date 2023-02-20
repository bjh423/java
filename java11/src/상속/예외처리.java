package 상속;

public class 예외처리 {
public static void main(String[] args) {
	System.out.println("1.");
	try {
		System.out.println("2." + 10 / 0);
	} catch (Exception e) {
		System.out.println("error");
		System.out.println(e.getMessage());
	}
	System.out.println("3.");
}
}
