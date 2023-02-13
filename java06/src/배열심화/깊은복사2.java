package 배열심화;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 깊은복사2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		String a[] = { "x", "y", "z" };
		String b[][] = { { "a", "b", "c" }, { "d", "e", "f" }, { "g", "h", "i" } };
		JTable tab = new JTable(b,a);
		JScrollPane sc = new JScrollPane(tab);
		f.add(sc);
		f.setVisible(true);

	}

}
