package 네트워크프로그램;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClients {

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 1000; i++) {
			// 서버-클라이언트 전화기 역할 소켓 필요
			// 클라이언트에서 소켓을 만들어주면 서버소켓으로 승인 요청 보냄
			Socket socket = new Socket("localhost", 9100);
			System.out.println("클라이언트 승인요청 보냄");
		}

	}

}
