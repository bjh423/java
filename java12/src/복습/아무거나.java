package 복습;

import java.util.ArrayList;

import javax.swing.JButton;

public class 아무거나 {
public static void main(String[] args) {
	ArrayList list = new ArrayList();
	list.add("q");
	list.add(100);
	list.add(11.22);
	list.add(new JButton());
	
	String x = (String)list.get(0);
	
}
}
