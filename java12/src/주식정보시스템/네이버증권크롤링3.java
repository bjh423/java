package 주식정보시스템;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링3 {

	public void naver(String code2) {
		String url = "https://finance.naver.com/item/main.naver?code=" + code2;
		Connection con = Jsoup.connect(url);
		Document doc = null;

		try {
			doc = con.get();
			Elements name = doc.select("h2 a");
			System.out.println(name.text());

			Elements today = doc.select("span.blind");
			Element today1 = today.get(12);
			System.out.println("현재가 : " + today1.text());
			Element todayH = today.get(16);
			System.out.println("고가 : " + todayH.text());
			Element todayL = today.get(20);
			System.out.println("저가 : " + todayL.text());

			try {
				FileWriter fw = new FileWriter(code2 +"txt");
				fw.write(code2 + "\n");
				fw.write(today1 + "\n");
				fw.write(todayH + "\n");
				fw.write(todayL + "\n");
				fw.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
