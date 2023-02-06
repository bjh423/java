package 제어문;


public class 문제풀이2 {
	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 40;
		
		int plus = num1 + num2;
		int quotient = num1 / num2;
		double quotient2 = (double)num1 / (double)num2;
		int remainder = num1 % num2;
		
		System.out.println("두 수를 더한 값은 " + plus);
		System.out.println("num1에서 num2를 나누면 몫은 " + quotient);
		System.out.println("num1에서 num2를 나누면 몫은 " + remainder);

		System.out.println("num1에서 num2를 나누면 몫은 " + quotient2);
		
	}
}
