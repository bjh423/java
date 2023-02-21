package 형변환;

import java.util.ArrayList;

import javax.swing.JButton;

public class 참조형형변환 {
	public static void main(String[] args) {
		//클래스 형병환 = 참조형형변환
		//'상속'관계일 때만 형변환 가능
		
		ArrayList list = new ArrayList();
		list.add("gd");
		list.add(100);
		list.add(11.2);
		list.add(new JButton());
		
		String name = (String)list.get(0);
		System.out.println(name.charAt(0));
		System.out.println(name.length());
		
		int age = (Integer)list.get(1);
		System.out.println(age);
		
		double jun = (Double)list.get(2);
		System.out.println(jun);
		
		JButton b = (JButton)list.get(3);
		b.setText("버버튼튼");
		
		
	}
}
