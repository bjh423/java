package 조건문;

import java.util.Date;

public class if문6 {
	public static void main(String[] args) {
		
		Date day = new Date();
		
		if (day.getYear()>=100) {
			System.out.println("밀레니엄 세대");
		} else {
			System.out.println("밀레니엄 세대 x");
		}
		
		
		switch (day.getDate()) {
		case 0: case 6 :
			System.out.println("쉬자");	
			break;
		default:
			System.out.println("공부하자");
			break;
		}
		
		if((day.getMonth()+1)==2) {
			for (int i = 0; i < 28; i++) {
				System.out.println(i+1);
			}
		} else if(day.getMonth()==4 || day.getMonth()==6 ||
				day.getMonth()== 9 || day.getMonth()== 11) {
			for (int i = 0; i < 30; i++) {
				System.out.println(i+1);
			}
		} else {
			for (int i = 0; i < 31; i++) {
				System.out.println(i+1);
			}
		}
		
		
	}

}