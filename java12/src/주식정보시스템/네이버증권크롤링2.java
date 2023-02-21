package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링2 {

	public static void main(String[] args) {
		String[] url = { "005930", "035720", "035420" };
		for (int i = 0; i < url.length; i++) {
			String urlx = "https://finance.naver.com/item/main.naver?code=" + url[i];
			Connection con = Jsoup.connect(urlx);
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
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}
