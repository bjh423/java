package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링 {

	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930");
		System.out.println("1. 네트워크 연결 성공." + con);

		Document doc = null; // 로컬변수 초기화! 수동으로!
		try {
			doc = con.get();

			Elements List1 = doc.select(".code");
			Element tag1 = List1.get(0);
			String tag11 = tag1.text();
			System.out.println(tag11);

			Elements List2 = doc.select(".sptxt.sp_txt9");
			Element tag2 = List2.get(0);
			String text22 = tag2.text();
			System.out.println(text22);

			Elements List3 = doc.select(".sptxt.sp_txt10");
			Element tag3 = List3.get(0);
			String text33 = tag3.text();
			System.out.println(text33);

		} catch (IOException e) {
			e.printStackTrace();
		} // html코드를 다 가지고 와서 doc변수에 넣어놨음.
			// System.out.println(doc);
	}
}
