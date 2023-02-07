package 조건문;

import javax.swing.JOptionPane;

public class if문7 {
	public static void main(String[] args) {
		// 1번
		String a = "pass";
		String b = JOptionPane.showInputDialog("암호를 대시오");

		if (a.equals(b) == true) { // 그냥 a.equals(b)해도 결과값이 boolean이기 때문에 작동
			System.out.println("들어오세요");
		} else {
			System.out.println("나가세요");
		}

		// 2번
		String food = JOptionPane.showInputDialog("먹고싶은 메뉴 (자장면, 라면, 회 중 택1)");
		switch (food) {
		case "자장면":
			System.out.println("중국집으로 가요");
			break;
		case "회":
			System.out.println("횟집으로 가요");
			break;
		case "라면":
			System.out.println("분식집으로 가요");
			break;
		default:
			System.out.println("안먹어요");
			break;
		}

		// 3번
		String x = JOptionPane.showInputDialog("정수1");
		String y = JOptionPane.showInputDialog("정수2");
		int x1 = Integer.parseInt(x);
		int y1 = Integer.parseInt(y);
		if (x1 > y1) {
			System.out.println("정수1(" + x + ")가 더 큼");
		} else if (x1 < y1) {
			System.out.println("정수2(" + y + ")가 더 큼");
		} else {
			System.out.println("같다");
		}

		// 4번
		String num1 = "A100EX";
		// String num1 = JOptionPane.showInputDialog("사원 번호 입력");
		char n = num1.charAt(0);
		switch (n) {
		case 'A':
			System.out.println("기획부");
			break;
		case 'B':
			System.out.println("총무부");
			break;
		case 'C':
			System.out.println("개발부");
			break;
		default:
			System.out.println("해당부서없음");
			break;
		}

		// 추가 1번
		String c = JOptionPane.showInputDialog("실수1");
		double c1 = Double.parseDouble(c);
		String d = JOptionPane.showInputDialog("실수2");
		double d1 = Double.parseDouble(d);
		String e = JOptionPane.showInputDialog("연산자 입력");

		switch (e) {
		case "+":
			System.out.println(c1 + d1);
			break;
		case "-":
			System.out.println(c1 + d1);
			break;
		case "*":
			System.out.println(c1 + d1);
			break;
		case "/":
			System.out.println(c1 + d1);
			break;
		default:
			System.out.println("입력값 확인");
			break;
		}

		// 추가 2번
		String f = JOptionPane.showInputDialog("실수1");
		int f1 = Integer.parseInt(f);
		System.out.println(f1);
		String g = JOptionPane.showInputDialog("실수2");
		int g1 = Integer.parseInt(g);
		double h = f1 / g1;
		double h1 = (double) f1 / (double) g1;
		System.out.printf("%.2f\n", h);
		System.out.printf("%.2f", h1);

	}
}
