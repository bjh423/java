package 상속;

import java.io.FileWriter;
import java.io.IOException;

public class 예외처리2 {
	public static void main(String[] args) {

		try {
			FileWriter f = new FileWriter("text.txt");
			f.write("hi\n");
			f.write("bye");
			f.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
